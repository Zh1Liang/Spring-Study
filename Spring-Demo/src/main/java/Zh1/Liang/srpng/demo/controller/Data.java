package Zh1.Liang.srpng.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: zhe.liang
 * @create: 2024-01-24 15:12
 */
@Component
@ConfigurationProperties(prefix = "aaa")
public class Data {
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
