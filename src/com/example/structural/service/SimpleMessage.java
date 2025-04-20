package com.example.structural.service;


/**
 * A 'RefinedAbstraction' for sending a simple message.
 */
public class SimpleMessage extends ACMessage {

	public SimpleMessage(IMessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void Send(String content) {
		System.out.println("Sending Simple Message:");
		messageSender.sendMessage(content);

	}

}
