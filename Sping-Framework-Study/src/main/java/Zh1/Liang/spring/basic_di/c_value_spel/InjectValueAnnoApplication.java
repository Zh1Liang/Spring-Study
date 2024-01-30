package Zh1.Liang.spring.basic_di.c_value_spel;


import Zh1.Liang.spring.basic_di.c_value_spel.bean.Black;
import Zh1.Liang.spring.basic_di.c_value_spel.bean.Blue;
import Zh1.Liang.spring.basic_di.c_value_spel.bean.Red;
import Zh1.Liang.spring.basic_di.c_value_spel.config.InjectValueConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Black black = ctx.getBean(Black.class);
        System.out.println("simple value : " + black);
    
        Red red = ctx.getBean(Red.class);
        System.out.println("properties value : " + red);
    
        Blue blue = ctx.getBean(Blue.class);
        System.out.println("use spel : " + blue);
    }
}
