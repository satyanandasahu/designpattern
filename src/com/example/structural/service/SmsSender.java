package com.example.structural.service;

/**
 * The 'ConcreteImplementor' for sending messages via SMS.
 */

public class SmsSender implements IMessageSender  {

	
	public void sendMessage(String message)
    {
        System.out.println("Sending SMS: "+ message);
    }
	
}
