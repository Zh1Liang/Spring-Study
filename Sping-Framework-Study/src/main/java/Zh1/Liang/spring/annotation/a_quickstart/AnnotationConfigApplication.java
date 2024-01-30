package Zh1.Liang.spring.annotation.a_quickstart;

import Zh1.Liang.spring.annotation.a_quickstart.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhe.liang
 * @create: 2024-01-30 22:57
 */
public class AnnotationConfigApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
