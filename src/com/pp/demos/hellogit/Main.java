package com.pp.demos.hellogit;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initLayout();

		// HELLO WORLD MY ASS
		// OK. (another comment)
		// Yet another comment that adds a lot of insight.

	}

	private void initLayout() {
		setContentView(R.layout.main);
		superPerotti();
	}

	public void superPerotti() {

	}
}
