package com.monkey.duda.service;

import com.monkey.control.MonkeyStarter;
import com.monkey.control.MonkeyThread;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MonkeyService extends Service {

	static MonkeyStarter mstart=new MonkeyStarter();
	static Thread mthread=new Thread(new MonkeyThread());
	@Override
	public void onCreate() {
		super.onCreate();
		Log.d("MonkeyService", "activity started ");
		Log.d("MonkeyService", "Starting Monkey HTTP Server thread  ");
		mthread.start();
		Log.d("MonkeyService", "Started Monkey HTTP Server thread  ");
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		Log.d("MonkeyService", "first connectsdfion recieved :  ");
		return binder;
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	private final IMonkeyService.Stub binder = new IMonkeyService.Stub() {
		
		@Override
		public String sendAndRecieveHello(String text) throws RemoteException {
			Log.d("MonkeyService", text);
			String ret="ola from Monkasdasdey Service : "+
					mstart.test();
			return ret;
		}
	};

}
