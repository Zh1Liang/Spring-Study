package Zh1.Liang.spring.basic_dl.b_bytype;

import Zh1.Liang.spring.basic_dl.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhe.liang
 * @create: 2024-01-29 23:46
 */
public class QuickStartByTypeApplication {
    public static void main(String[] args){
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);
    }
}
