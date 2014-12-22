package com.grumoon.customtouchevent.util;

import android.util.Log;
import android.view.MotionEvent;

public class EventUtil {

	public static void logEventInfo(String tag, MotionEvent event) {
		String action = "";

		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			action = "ACTION_DOWN";
			break;

		case MotionEvent.ACTION_MOVE:
			action = "ACTION_MOVE";
			break;

		case MotionEvent.ACTION_UP:
			action = "ACTION_UP";
			break;

		case MotionEvent.ACTION_CANCEL:
			action = "ACTION_CANCEL";
			break;
		default:
			break;
		}

		Log.i(tag, action);
	}

}
