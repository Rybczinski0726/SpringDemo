package org.ryb.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Drawing {
    public static void main(String[] args) {
        // Triangle triangle = new Triangle();
        // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}