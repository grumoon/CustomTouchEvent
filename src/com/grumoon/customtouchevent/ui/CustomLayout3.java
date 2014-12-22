package com.grumoon.customtouchevent.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.grumoon.customtouchevent.util.EventUtil;

public class CustomLayout3 extends RelativeLayout {

	private static final String TAG = CustomLayout3.class.getSimpleName();

	public CustomLayout3(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomLayout3(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		EventUtil.logEventInfo(TAG + "-->dispatchTouchEvent", event);

		return super.dispatchTouchEvent(event);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		EventUtil.logEventInfo(TAG + "-->onInterceptTouchEvent", ev);
		return super.onInterceptTouchEvent(ev);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		EventUtil.logEventInfo(TAG + "-->onTouchEvent", event);
		return super.onTouchEvent(event);
	}

}
