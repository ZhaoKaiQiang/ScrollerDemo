package com.socks.scrollerdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends ActionBarActivity {

	private JellyTextView textView;
	public static int distance = 30;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (JellyTextView) findViewById(R.id.tv);
	}

	public void click(View view) {

		switch (view.getId()) {
			case R.id.btn_scroll_to:
				textView.scrollTo(distance, 0);
				distance += 10;
				break;
			case R.id.btn_scroll_by:
				textView.scrollBy(30, 0);
				break;
			case R.id.btn_sping_back:
				//不知道为什么第一次调用会贴墙，即到达x=0的位置
				textView.spingBack();
				break;
		}

	}


}
