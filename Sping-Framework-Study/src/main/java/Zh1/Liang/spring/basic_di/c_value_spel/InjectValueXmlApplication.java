package Zh1.Liang.spring.basic_di.c_value_spel;

import Zh1.Liang.spring.basic_di.c_value_spel.bean.Black;
import Zh1.Liang.spring.basic_di.c_value_spel.bean.Green;
import Zh1.Liang.spring.basic_di.c_value_spel.bean.Red;
import Zh1.Liang.spring.basic_di.c_value_spel.bean.White;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectValueXmlApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_di/value/inject-value.xml");
        Black black = ctx.getBean(Black.class);
        System.out.println("simple value : " + black);
    
        Red red = ctx.getBean(Red.class);
        System.out.println("properties value : " + red);
    
        Green green = ctx.getBean(Green.class);
        System.out.println("use spel bean property : " + green);
    
        White white = ctx.getBean(White.class);
        System.out.println("use spel methods : " + white);
    }
}
