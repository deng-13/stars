package com.star.conc.java9.chapter11.recipe07.util;

public class DBConnection {

	private static DBConnection connection;
	
	private DBConnection() {
		
	}
	
	public static DBConnection getConnection(){
		if (connection==null) {
			connection=new DBConnection();
		}
		return connection;
	}
}
