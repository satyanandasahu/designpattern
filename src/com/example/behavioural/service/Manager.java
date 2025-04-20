package com.example.behavioural.service;

public class Manager extends RequestHandler {

	public Manager() {
		super("manager");
	}

	@Override
	public void setNext(RequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void approve(int id) {
		if (id >= 1 && id <= 20) {
			System.out.println("Request Approved by Manager");
		} else {
			super.approve(id);
		}
	}

}
