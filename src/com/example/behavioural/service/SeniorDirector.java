package com.example.behavioural.service;

public class SeniorDirector extends RequestHandler {

	public SeniorDirector() {
		super("Senior Director");
	}

	@Override
	public void setNext(RequestHandler nextHandler) {
		this.nextHandler = nextHandler;

	}
	
	  
    @Override
    public void approve(int id){
        if(id>=81 && id<=100)
        {
            System.out.println("Request Approved by Senior Director");
        }
        else{
            super.approve(id);
        }
    }

}
