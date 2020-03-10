package com.yashwanth;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class RecurringTaskMain {
	public static HashMap<String,String> map=new HashMap<>();
	static Timer timer;
	public static void main(String[] args) throws InterruptedException {
		timer=new Timer();
		TimerTask worker = new WorkerTask("");
		timer.scheduleAtFixedRate(worker, 0, 60000);
		System.out.println("Finished all threads");
	}
	public void shutdown() {
		timer.cancel();
	}
}
