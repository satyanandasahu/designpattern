package com.example.behavioural.service;

public class OrderPlacedState implements IOrderState {

	@Override
	public void next(OrderContext context) {
		System.out.println("Moving to Shipped state.");
		context.setState(new OrderShippedState());
	}

	@Override
	public void cancel(OrderContext context) {
		System.out.println("Order has been cancelled.");
		context.setState(new OrderCancelledState());
	}
}
