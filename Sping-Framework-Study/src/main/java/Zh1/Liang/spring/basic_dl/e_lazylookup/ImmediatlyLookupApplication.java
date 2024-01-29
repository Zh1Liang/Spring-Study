package Zh1.Liang.spring.basic_dl.e_lazylookup;

import Zh1.Liang.spring.basic_dl.e_lazylookup.bean.Cat;
import Zh1.Liang.spring.basic_dl.e_lazylookup.bean.Dog;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhe.liang
 * @create: 2024-01-30 00:11
 */
public class ImmediatlyLookupApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

//        Dog dog;
//        try {
//            dog = ctx.getBean(Dog.class);
//        } catch (NoSuchBeanDefinitionException e) {
//            // 找不到Dog时手动创建
//            dog = new Dog();
//        }
        ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);
        Dog dog = dogProvider.getIfAvailable(() -> new Dog());
        System.out.println(dog);
    }
}
