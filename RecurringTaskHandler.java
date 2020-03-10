package com.yashwanth;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class RecurringTaskHandler {
	static Timer timer;
	public static void intialise() {
		timer=new Timer();
	}
	public static boolean addTask(TimerTask task,long period,TimeUnit unit) {
		if(timer==null) return false;
		return true;
	}
}
