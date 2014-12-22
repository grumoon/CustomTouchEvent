package com.grumoon.customtouchevent.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.grumoon.customtouchevent.util.EventUtil;

public class CustomView extends View {

	private static final String TAG = CustomView.class.getSimpleName();

	public CustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		EventUtil.logEventInfo(TAG + "-->onTouchEvent", event);

//		if (event.getAction() == MotionEvent.ACTION_DOWN) {
//			return true;
//		}
//		else {
//			return false;
//		}

		return true;
		//return super.onTouchEvent(event);
	}

}
