package com.example.structural.service;

/**
 * 
 * The 'Implementor' interface defines the operations that need to be
 * implemented by platform-specific classes.
 */

public interface IMessageSender {

	void sendMessage(String message);
}
