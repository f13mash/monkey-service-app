package com.monkey.control;

public class MonkeyStarter {
	
	public static boolean monkeyRunning = false;
	
	public static final int MK_RESULT_OK=1;
	//fail due to unknown reasons
	public static final int MK_RESULT_FAIL=-1;
	public static final int MK_RESULT_MISSING_CONFIg=-2;
	
	public static native int startMonkey();
	
	public static native int stopMonkey();
	
}
