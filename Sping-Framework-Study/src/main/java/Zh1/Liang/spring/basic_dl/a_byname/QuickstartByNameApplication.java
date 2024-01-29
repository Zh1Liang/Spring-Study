package Zh1.Liang.spring.basic_dl.a_byname;

import Zh1.Liang.spring.basic_dl.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhe.liang
 * @create: 2024-01-29 23:41
 */
public class QuickstartByNameApplication {
    public static void main(String[] args){
        //依赖查找
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person) factory.getBean("person");
        System.out.println(person);
    }
}
