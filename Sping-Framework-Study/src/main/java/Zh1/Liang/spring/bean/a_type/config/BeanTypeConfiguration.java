package Zh1.Liang.spring.bean.a_type.config;


import Zh1.Liang.spring.bean.a_type.bean.Child;
import Zh1.Liang.spring.bean.a_type.bean.ToyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTypeConfiguration {
    
    @Bean
    public Child child() {
        return new Child();
    }
    
//    @Bean
//    public Toy ball() {
//        return new Ball("ball");
//    }
    
    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        toyFactory.setChild(child());
        return toyFactory;
    }


}
