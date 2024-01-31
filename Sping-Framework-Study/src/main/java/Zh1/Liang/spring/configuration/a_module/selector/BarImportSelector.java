package Zh1.Liang.spring.configuration.a_module.selector;


import Zh1.Liang.spring.configuration.a_module.component.Bar;
import Zh1.Liang.spring.configuration.a_module.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
