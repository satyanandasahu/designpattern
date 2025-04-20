package com.example.structural.service;

/**
 * The 'ConcreteImplementor' for sending messages via SMS
 */
public class EmailSender implements IMessageSender {

	@Override
	public void sendMessage(String message) {
		 System.out.println("Sending Email: "+ message);
	}

}
