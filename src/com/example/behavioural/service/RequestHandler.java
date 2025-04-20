package com.example.behavioural.service;

public abstract class RequestHandler {

	    String name;
	    RequestHandler nextHandler;
	  
	    private RequestHandler(){

	    }
	    
	    public RequestHandler(String name){
	        this.name=name;
	    }
	    
	    public abstract void setNext(RequestHandler nextHandler);

	    public void approve (int id)
	    {
	        if(this.nextHandler != null)
	            this.nextHandler.approve(id);
	        else
	            System.out.println("request cannot be approved");
	    }
}
