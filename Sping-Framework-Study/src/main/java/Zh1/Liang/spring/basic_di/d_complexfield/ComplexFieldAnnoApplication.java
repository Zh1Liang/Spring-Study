package Zh1.Liang.spring.basic_di.d_complexfield;


import Zh1.Liang.spring.basic_di.d_complexfield.bean.Person2;
import Zh1.Liang.spring.basic_di.d_complexfield.config.InjectComplexFieldConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComplexFieldAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        Person2 person = ctx.getBean(Person2.class);
        System.out.println(person);
    }
}
