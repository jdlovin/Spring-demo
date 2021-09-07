package org.lovin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();

        Student student = (Student) context.getBean("student1");
        System.out.println(student);
    }
}
