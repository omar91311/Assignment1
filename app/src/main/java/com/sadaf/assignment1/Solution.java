package com.sadaf.assignment1;

import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class Solution  extends AppCompatActivity {
	TextView tv;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solution);
    }
	@Override
    protected void onStart() {
		super.onStart();
		tv = findViewById(R.id.ans);
		String value = getIntent().getExtras().getString("value");
        int val = Integer.parseInt(value);
        int C = (val - 32) * 5/9;
	tv.setText("" + C + " Celcius");
	

}}
