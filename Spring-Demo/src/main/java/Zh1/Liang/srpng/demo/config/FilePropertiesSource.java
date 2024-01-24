package Zh1.Liang.srpng.demo.config;

import org.springframework.core.env.MapPropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author: zhe.liang
 * @create: 2024-01-23 14:14
 */
public class FilePropertiesSource extends MapPropertySource {

    public FilePropertiesSource(String name, Map<String, Object> source) {
        super(name, source);
    }

    public FilePropertiesSource() {
        this("filePropertiesSource", new HashMap<>());
        try {
            refreshSource();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostConstruct
    public void refreshSource() throws IOException {
        String ans =
                FileCopyUtils.copyToString(
                        new InputStreamReader(
                                Objects.requireNonNull(FilePropertiesSource.class
                                        .getClassLoader()
                                        .getResourceAsStream("kv.properties"))));

        Map<String,Object> map = new HashMap<>();
        for (String sub : ans.split("\n")) {
            if (sub.isEmpty()) {
                continue;
            }
            String[] kv = StringUtils.split(sub, "=");
            if (kv.length != 2) {
                continue;
            }

            map.put(kv[0].trim(), kv[1].trim());
        }

//        source.clear();
        source.putAll(map);
    }
}
