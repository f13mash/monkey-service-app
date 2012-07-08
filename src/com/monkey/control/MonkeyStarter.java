package com.monkey.control;

import android.os.Environment;
import android.util.Log;

public class MonkeyStarter {
	
	public static boolean monkeyRunning = false;
	
	public static final int MK_RESULT_OK=1;
	//fail due to unknown reasons
	public static final int MK_RESULT_FAIL=-1;
	public static final int MK_RESULT_MISSING_CONFIG=-2;
	
	public native int startMonkey();
	
	public native int stopMonkey();
	
	static{
		Log.d("PAPP", "Loading monkey46 : ");
		System.loadLibrary("monkey");
		Log.d("PAPP", "Loading  done");
	}

	public String test() {
		Log.d("PAPP", "thinfo : "+Thread.currentThread().getId()+" : "+System.getProperty("pid"));
		return ""+this.startMonkey();
	}
}
