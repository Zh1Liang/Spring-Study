package Zh1.Liang.spring.configuration.a_module.anno;


import Zh1.Liang.spring.configuration.a_module.component.Boss;
import Zh1.Liang.spring.configuration.a_module.config.BartenderConfiguration;
import Zh1.Liang.spring.configuration.a_module.registrar.WaiterRegistrar;
import Zh1.Liang.spring.configuration.a_module.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
    
}
