//package Zh1.Liang.srpng.demo.processor;
//
//import com.alibaba.fastjson.JSONObject;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
//import org.springframework.context.EnvironmentAware;
//import org.springframework.context.event.EventListener;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//import org.springframework.util.CollectionUtils;
//import org.springframework.util.PropertyPlaceholderHelper;
//
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
//*
//* @author: zhe.liang
//*
//* @create: 2024-01-24 16:03
//**/
//@Component
//public class AnoValueRefreshPostProcessor extends InstantiationAwareBeanPostProcessorAdapter implements EnvironmentAware {
//    // 缓存的 key，配置名
//    // 缓存的 value，自定义类，主要用于反射修改配置值
//    private Map<String, List<FieldPair>> mapper = new HashMap<>();
//    private Environment environment;
//
//    @Override
//    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
//        processMetaValue(bean);
//        return super.postProcessAfterInstantiation(bean, beanName);
//    }
//
//
//    private void processMetaValue(Object bean) {
//        Class<?> clz = bean.getClass();
//        if(!clz.isAnnotationPresent(RefreshValue.class)){
//            return;
//        }
//
//        for (Field field : clz.getDeclaredFields()) {
//            if(!field.isAnnotationPresent(Value.class)){
//                continue;
//            }
//            Value val = field.getAnnotation(Value.class);
//            List<String> keyList = pickPropertyKey(val.value(), 0);
//
//            for (String key : keyList) {
//                mapper.computeIfAbsent(key, (k) -> new ArrayList<>())
//                        .add(new FieldPair(bean, field, val.value()));
//            }
//        }
//    }
//
//    /***
//     * 解析@Value注解中表达式，挑出变量名，用于缓存
//     *      如: @value("hello ${name:xhh} ${now:111}
//     *      解析之后，有两个变量，一个 name 一个 now
//     * @param value
//     * @return 提取key列表
//     */
//    private List<String> pickPropertyKey(String value, int begin) {
//        int start = value.indexOf("${", begin) + 2;
//        if (start < 2) {
//            return new ArrayList<>();
//        }
//
//        int middle = value.indexOf(":", start);
//        int end = value.indexOf("}", start);
//
//        String key;
//        if (middle > 0 && middle < end) {
//            // 包含默认值
//            key = value.substring(start, middle);
//        } else {
//            // 不包含默认值
//            key = value.substring(start, end);
//        }
//
//        List<String> keys = pickPropertyKey(value, end);
//        keys.add(key);
//        return keys;
//    }
//
//    @Override
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }
//
//    @EventListener
//    public void updateConfig(ConfigUpdateEvent configUpdateEvent){
//        List<FieldPair> list = mapper.get(configUpdateEvent.key);
//        if (!CollectionUtils.isEmpty(list)) {
//            list.forEach(f -> f.updateValue(environment));
//        }
//    }
//
//    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
//    public static class FieldPair {
//        private static PropertyPlaceholderHelper propertyPlaceholderHelper =
//                new PropertyPlaceholderHelper("${", "}", ":", true);
//
//        Object bean;
//        Field field;
//        String value;
//
//        public void updateValue(Environment environment) {
//            boolean access = field.isAccessible();
//            if (!access) {
//                field.setAccessible(true);
//            }
//
//            String updateVal = propertyPlaceholderHelper.replacePlaceholders(value, environment::getProperty);
//            try {
//                if (field.getType() == String.class) {
//                    field.set(bean, updateVal);
//                } else {
//                    field.set(bean, JSONObject.parseObject(updateVal, field.getType()));
//                }
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//            field.setAccessible(access);
//        }
//    }
//
//
//}
