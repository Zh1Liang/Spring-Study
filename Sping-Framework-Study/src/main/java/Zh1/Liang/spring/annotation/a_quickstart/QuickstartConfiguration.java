package Zh1.Liang.spring.annotation.a_quickstart;

import Zh1.Liang.spring.annotation.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhe.liang
 * @create: 2024-01-30 21:56
 */
@Configuration
public class QuickstartConfiguration {
    @Bean(name = "aaa") // 4.3.3之后可以直接写value
    public Person person() {
        Person person = new Person();
        person.setName("person");
        person.setAge(123);
        return person;
    }
}
