package com.vm.helloworldndkcpp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	static {
		System.loadLibrary("hello-jni");
	}

	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		String s = stringFromJNI();
		tv.setText(s);
	}

	public native String stringFromJNI();

}
