package com.example.behavioural.service;

public class Director extends RequestHandler {

	public Director(){
        super("Director");
    }
	
    @Override
    public void setNext(RequestHandler nextHandler){
        this.nextHandler=nextHandler;
    }
    
    
    @Override
    public void approve(int id){
        if(id>=41 && id<=80)
        {
            System.out.println("Request Approved by Director");
        }
        else{
            super.approve(id);
        }
    }

}
