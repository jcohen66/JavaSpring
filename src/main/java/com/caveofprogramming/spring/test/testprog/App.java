package com.caveofprogramming.spring.test.testprog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/caveofprogramming/spring/test/testprog/beans/beans.xml");
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/testprog/beans/beans.xml");
    	
        Person person = (Person)context.getBean("person");
        person.speak();
        
        System.out.println(person);
        
        // ((FileSystemXmlApplicationContext)context).close();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
