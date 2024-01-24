package Zh1.Liang.srpng.demo.configuration;

import Zh1.Liang.srpng.demo.config.ConfigmapLocator;
import Zh1.Liang.srpng.demo.config.FilePropertiesSource;
import Zh1.Liang.srpng.demo.config.SimplePropertiesSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: zhe.liang
 * @create: 2024-01-24 12:38
 *
 * 通过继承MapPropertySource来实现自定义配置源，注册到Envrionment可供@Value使用
 */
@Configuration
public class AutoConfig {

    @Bean
    public SimplePropertiesSource simplePropertiesSource(ConfigurableEnvironment environment){
        SimplePropertiesSource simplePropertiesSource = new SimplePropertiesSource();
        environment.getPropertySources().addLast(simplePropertiesSource);
        return simplePropertiesSource;
    }

//    @Bean
//    public FilePropertiesSource filePropertiesSource(ConfigurableEnvironment environment){
//        FilePropertiesSource filePropertiesSource = new FilePropertiesSource();
//        environment.getPropertySources().addLast(filePropertiesSource);
//        return filePropertiesSource;
//    }
//    @Bean
//    public ConfigmapLocator configmapLocator(){
//        return new ConfigmapLocator();
//    }
}
