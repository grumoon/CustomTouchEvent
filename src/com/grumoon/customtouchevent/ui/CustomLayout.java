package com.grumoon.customtouchevent.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.grumoon.customtouchevent.util.EventUtil;

public class CustomLayout extends RelativeLayout {

	private static final String TAG = CustomLayout.class.getSimpleName();

	public CustomLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
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
