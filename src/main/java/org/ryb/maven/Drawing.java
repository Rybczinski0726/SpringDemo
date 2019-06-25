package org.ryb.maven;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
    public static void main(String[] args) {
        // Triangle triangle = new Triangle();
        // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Triangle triangle = (Triangle) context.getBean("triangle1");
        triangle.draw();
    }
}
