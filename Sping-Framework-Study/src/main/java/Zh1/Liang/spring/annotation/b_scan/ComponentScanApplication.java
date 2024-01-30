package Zh1.Liang.spring.annotation.b_scan;

import Zh1.Liang.spring.annotation.b_scan.bean.Person;
import Zh1.Liang.spring.annotation.b_scan.config.ComponentScanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class ComponentScanApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
//        ApplicationContext ctx = new AnnotationConfigApplicationContext("Zh1.Liang.spring.annotation.b_scan");
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    
        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
    }
}
