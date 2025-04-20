package com.example.factory;

import com.example.vo.SQLConnection;

public class EmployeeSingleton {

	//private static Employee employee = new Employee();

	private EmployeeSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static  SQLConnection getEmployee() {
	
		synchronized(SQLConnection.class) {
			return employee;
		}
	}

}
