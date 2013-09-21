
package com.spring.samples;

/**
 * HelloSpring class
 * 
 * @author Malaiappan.K
 * @since 15-Sep-2013
 * @version 1.0
 */
public class HelloSpring {

    private String message;

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

}
