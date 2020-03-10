package com.cdar;

import java.util.TimerTask;

public class WorkerTask extends TimerTask{

	private ScheduledDBHandler scheduledDBHandler;
	WorkerTask(String str){
		scheduledDBHandler=new ScheduledDBHandler("", "", "");
	}
	@Override
	public void run() {
		scheduledDBHandler.fectchData();
	}

}
