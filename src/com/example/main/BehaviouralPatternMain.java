package com.example.main;

import com.example.behavioural.service.Director;
import com.example.behavioural.service.Manager;
import com.example.behavioural.service.OrderContext;
import com.example.behavioural.service.RequestHandler;
import com.example.behavioural.service.SeniorDirector;
import com.example.behavioural.service.SeniorManager;

public class BehaviouralPatternMain {

	public static void main(String[] args) {

		/*
		System.out.println("Order Workflow:");
		OrderContext orderContext = new OrderContext();
		orderContext.proceedToNext(); // Move to Shipped
		orderContext.proceedToNext();
		orderContext.proceedToNext();
		
		
		// Move to Delivered
		orderContext.cancelOrder(); // Try to cancel after delivery
		
		System.out.println("\nNew Order Workflow:");
		OrderContext newOrder = new OrderContext();
		newOrder.cancelOrder(); // Cancel immediately after placement
		
		

		System.out.println("\nOrder Workflow:");
		orderContext = new OrderContext();
		orderContext.proceedToNext(); // Move to Shipped
		orderContext.cancelOrder();
		orderContext.proceedToNext(); // Move to Delivered
	//	orderContext.cancelOrder(); // Try to cancel after delivery
		
		*/
		
		RequestHandler manager = new Manager();
        RequestHandler seniorManager = new SeniorManager();
        RequestHandler director = new Director();
        manager.setNext(seniorManager);
        seniorManager.setNext(director);
        director.setNext(new SeniorDirector());
      
        
        
        manager.approve(81);
        //manager.approve(90);
        
        	
	}
}
