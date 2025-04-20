package com.example.behavioural.service;

public interface IOrderState {

	void next(OrderContext context);
    void cancel(OrderContext context);
}
