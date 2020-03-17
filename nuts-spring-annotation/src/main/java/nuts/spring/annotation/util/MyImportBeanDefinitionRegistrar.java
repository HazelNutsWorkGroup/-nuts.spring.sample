package nuts.spring.annotation.util;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if (registry.containsBeanDefinition("nuts.spring.annotation.model.Classic")) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition("nuts.spring.annotation.model.School");
            registry.registerBeanDefinition("school", rootBeanDefinition);
        }
    }
}
