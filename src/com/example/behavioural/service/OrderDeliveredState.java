package com.example.behavioural.service;

public class OrderDeliveredState implements IOrderState {

	@Override
	public void next(OrderContext context) {
		System.out.println("Order is already delivered.");
	}

	@Override
	public void cancel(OrderContext context) {
		System.out.println("Cannot cancel. Order is already delivered.");
	}
}
