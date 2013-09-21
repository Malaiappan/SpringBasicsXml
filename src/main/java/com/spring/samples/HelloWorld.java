package com.spring.samples;

/**
 * The class HelloWorld
 * 
 * @author Malaiappan.K
 * @since 15-Sep-2013
 * @version 1.0
 */
public class HelloWorld {

    private String message;

    private HelloSpring helloSpring;
    
    /**
     * Instantiates a new hello world.
     */
    public HelloWorld() {
        // intentionally empty
    	// mandatory for setter based injection
    }

    /**
     * Instantiates a new hello world.
     *
     * @param helloSpring the hello spring
     */
    public HelloWorld(HelloSpring helloSpring) {
        this.helloSpring = helloSpring;
    }

    /**
     * Sets the message.
     * 
     * @param message the new message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the message.
     * 
     * @return the message
     */
    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    /**
     * Gets the hello spring.
     * 
     * @return the helloSpring
     */
    public HelloSpring getHelloSpring() {
        return helloSpring;
    }

    /**
     * Sets the hello spring.
     * 
     * @param helloSpring the helloSpring to set
     */

    public void setHelloSpring(HelloSpring helloSpring) {
        this.helloSpring = helloSpring;
    }

}
