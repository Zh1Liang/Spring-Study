package Zh1.Liang.spring.configuration.a_module;

import Zh1.Liang.spring.configuration.a_module.anno.EnableTavern;
import Zh1.Liang.spring.configuration.a_module.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------------------------");
//        Boss boss = ctx.getBean(Boss.class);
//        System.out.println(boss);
//        Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
//        bartenders.forEach((name, bartender) -> System.out.println(bartender));
    }
}
