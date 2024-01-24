package Zh1.Liang.srpng.demo.config;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

/**
 * @author: zhe.liang
 * @create: 2024-01-24 18:08
 */
public class ConfigmapLocator implements PropertySourceLocator {

    @Override
    public PropertySource<?> locate(Environment environment) {
        return new FilePropertiesSource();
    }
}
