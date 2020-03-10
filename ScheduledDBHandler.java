package com.yashwanth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class ScheduledDBHandler {
	public Connection connection;
	String url;
	String password;
	String uname;

	public ScheduledDBHandler(String url, String uname, String password) {
		this.url = url;
		this.uname = uname;
		this.password = password;
//		intialiseConnection();
	}
	public HashMap<String,String> fectchData(){
		System.out.println(Calendar.getInstance().getTime()+" Fetch called");
		return null;
	}

	private void intialiseConnection() {
		int failedCount = 0;
		try {
			while (failedCount++ < 3 && connection == null) {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			}
			if (failedCount == 3) {
				throw new RuntimeException("Error while connecting to DB after 3 failure times!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	}
}
