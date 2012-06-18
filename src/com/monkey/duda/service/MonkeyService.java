package com.monkey.duda.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MonkeyService extends Service {

	@Override
	public void onCreate() {
		super.onCreate();
		Log.d("MonkeyService", "activity started ");
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		Log.d("MonkeyService", "first connection recieved :  ");
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
			String ret="ola from Monkey Service";
			return ret;
		}
	};

}
