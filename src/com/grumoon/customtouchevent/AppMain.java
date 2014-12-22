package com.grumoon.customtouchevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

import com.grumoon.customtouchevent.util.EventUtil;

public class AppMain extends Activity {

	private static final String TAG = AppMain.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_main);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		EventUtil.logEventInfo(TAG + "-->onTouchEvent", event);

		return super.onTouchEvent(event);
	}

}
