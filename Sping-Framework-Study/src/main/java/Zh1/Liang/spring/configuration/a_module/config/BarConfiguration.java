package Zh1.Liang.spring.configuration.a_module.config;

import Zh1.Liang.spring.configuration.a_module.component.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    
    @Bean
    public Bar bbbar() {
        return new Bar();
    }
}
