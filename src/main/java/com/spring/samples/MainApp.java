
package com.spring.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class
 * 
 * @author Malaiappan.K
 * @since 15-Sep-2013
 * @version 1.0
 */
public class MainApp {

    /**
     * The main method.
     * 
     * @param args the arguments
     */
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

      /*  HelloSpring helloSpring = obj.getHelloSpring();

        helloSpring.getMessage();*/

    }
}
