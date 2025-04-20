package com.example.structural.service;

/**
 * The ACMessage defines the high-level interface for sending messages. It
 * uses a platform-specific sender (IMessageSender) to send the message.
 */
public abstract class ACMessage {

	protected IMessageSender messageSender;

	protected ACMessage(IMessageSender messageSender) {
		this.messageSender = messageSender;
	}

	public abstract void Send(String content);

}
