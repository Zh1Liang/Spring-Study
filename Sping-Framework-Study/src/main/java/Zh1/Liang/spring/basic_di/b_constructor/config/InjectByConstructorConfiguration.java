package Zh1.Liang.spring.basic_di.b_constructor.config;


import Zh1.Liang.spring.basic_di.b_constructor.bean.Cat;
import Zh1.Liang.spring.basic_di.b_constructor.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectByConstructorConfiguration {
    
    @Bean
    public Person person() {
        return new Person("test-person-anno-byconstructor", 18);
    }
    
    @Bean
    public Cat cat() {
        return new Cat("test-son-anno", person());
    }
    
}
