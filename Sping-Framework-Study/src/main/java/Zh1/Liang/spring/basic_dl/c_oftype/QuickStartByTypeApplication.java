package Zh1.Liang.spring.basic_dl.c_oftype;

import Zh1.Liang.spring.basic_dl.bean.Person;

import Zh1.Liang.spring.basic_dl.c_oftype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author: zhe.liang
 * @create: 2024-01-29 23:46
 */
public class QuickStartByTypeApplication {
    public static void main(String[] args){
        ApplicationContext factory = new ClassPathXmlApplicationContext("basic_dl/quickstart_oftype.xml");
        Map<String, DemoDao> beansOfType = factory.getBeansOfType(DemoDao.class);
        System.out.println(beansOfType);
    }
}
