package Zh1.Liang.srpng.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: zhe.liang
 * @create: 2024-01-24 14:54
 */
@RefreshScope
@Component
public class Values {

    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
