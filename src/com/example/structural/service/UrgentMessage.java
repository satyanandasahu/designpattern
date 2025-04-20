package com.example.structural.service;


/**
 * A 'RefinedAbstraction' for sending a urgent message.
 */

public class UrgentMessage extends ACMessage {

	public UrgentMessage(IMessageSender messageSender) {
		super(messageSender);

	}

	public void Send(String content) {
		System.out.println("Sending Urgent Message:");
		messageSender.sendMessage("[URGENT] " + content);
	}
}
