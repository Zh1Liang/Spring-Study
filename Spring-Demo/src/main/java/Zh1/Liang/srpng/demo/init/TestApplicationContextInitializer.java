package Zh1.Liang.srpng.demo.init;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

/**
 * @author: zhe.liang
 * @create: 2024-01-25 15:18
 */
public class TestApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment ce=applicationContext.getEnvironment();
        for(PropertySource<?> propertySource:ce.getPropertySources()){
            System.out.println(propertySource);
        }
        System.out.println("--------end");
    }
}
