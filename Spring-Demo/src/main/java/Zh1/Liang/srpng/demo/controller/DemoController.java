package Zh1.Liang.srpng.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhe.liang
 * @create: 2024-01-24 13:49
 */
@RestController
public class DemoController {
    @Autowired
    private ContextRefresher contextRefresher;

    @Autowired
    private Environment environment;

    @Autowired
    private Values values;

    @Autowired
    private Data data;


    // 获取配置
    @GetMapping(path = "get")
    public String getProperty(String key) {
        System.out.println("age is " + data.getAge());
        return values.getName() + "|" + environment.getProperty(key);
    }

    @GetMapping(path = "refresh")
    public String refresh() {
        Runnable runnable = ()-> contextRefresher.refresh();
        runnable.run();

//        new Thread(runnable).start();

        return "success";
    }


    @EventListener
    public void envListener(EnvironmentChangeEvent event) {
        System.out.println("conf change: " + event);
    }
}
