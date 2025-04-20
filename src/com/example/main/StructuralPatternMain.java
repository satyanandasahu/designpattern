package com.example.main;

import com.example.structural.service.ACMessage;
import com.example.structural.service.BankingFacade;
import com.example.structural.service.EmailSender;
import com.example.structural.service.IMessageSender;
import com.example.structural.service.SimpleMessage;
import com.example.structural.service.SmsSender;
import com.example.structural.service.UrgentMessage;

public class StructuralPatternMain {
	
	    public static void main(String[] args) {
	    	
	    	  /*  	System.out.println("Facade Design Pattern");
	        BankingFacade bankingFacade = new BankingFacade();
	        bankingFacade.getAccountDetails("123456");
	        bankingFacade.transferFunds("123456", "654321", 100.0);
	        bankingFacade.payBill("123456", "BILL001", 50.0);
	        
	     */
	        System.out.println("\n\n\n\nBridge Design Pattern");
	        // Create platform-specific senders
            IMessageSender smsSender = new SmsSender();
            IMessageSender emailSender = new EmailSender();

            // Send a simple message via SMS
            ACMessage simpleSms = new SimpleMessage(smsSender);
            simpleSms.Send("Hello! This is a simple SMS.");

            // Send an urgent message via Email
            ACMessage urgentEmail = new UrgentMessage(emailSender);
            urgentEmail.Send("Project Escalation! Immediate attention needed."); 
	    }

}
