package com.example.behavioural.service;

public class OrderContext {
	
	private IOrderState currentState;

    public OrderContext() {
    	System.out.println("Initail State:  Order Placed");
        currentState = new OrderPlacedState();  // Default state
    }

    public void setState(IOrderState state) {
        this.currentState = state;
    }

    public void proceedToNext() {
        currentState.next(this);
    }

    public void cancelOrder() {
        currentState.cancel(this);
    }

}
