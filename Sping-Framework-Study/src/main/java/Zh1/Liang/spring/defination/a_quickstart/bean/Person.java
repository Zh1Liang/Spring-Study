package Zh1.Liang.spring.defination.a_quickstart.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {
    
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
