package com.example.behavioural.service;

public class OrderCancelledState implements IOrderState {

	@Override
	public void next(OrderContext context) {
		System.out.println("Cannot proceed. Order is cancelled.");
	}

	@Override
	public void cancel(OrderContext context) {
		System.out.println("Order is already cancelled.");
	}
}
