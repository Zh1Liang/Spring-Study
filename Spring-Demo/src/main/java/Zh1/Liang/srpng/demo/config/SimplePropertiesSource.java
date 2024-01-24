package Zh1.Liang.srpng.demo.config;

import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author: zhe.liang
 * @create: 2024-01-23 14:01
 **/
public class SimplePropertiesSource extends MapPropertySource {


    public SimplePropertiesSource(String name, Map<String, Object> source) {
        super(name, source);
    }

    public SimplePropertiesSource() {
        this("filePropertiesSource", new HashMap<>());
    }

    @Override
    public Object getProperty(String name) {
        if (name.startsWith("test.")) {
            return name + "_" + UUID.randomUUID();
        }
        return super.getProperty(name);
    }
}
