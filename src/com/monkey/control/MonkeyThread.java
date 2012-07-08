package com.monkey.control;

public class MonkeyThread implements Runnable{

	static MonkeyStarter monkStart=new MonkeyStarter();
	@Override
	public void run() {
		monkStart.startMonkey();
	}

}
