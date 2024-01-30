package Zh1.Liang.spring.basic_di.a_quickstart_set;

import Zh1.Liang.spring.basic_di.a_quickstart_set.bean.Cat;
import Zh1.Liang.spring.basic_di.a_quickstart_set.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhe.liang
 * @create: 2024-01-29 23:50
 */
public class QuickstartInjectBySetXmlApplication {
    public static void main(String[] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
