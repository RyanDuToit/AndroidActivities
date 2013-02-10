package edu.Drake.androidactvities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends Activity {
	Button finish;
	String display;
	TextView textView1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		textView1 = (TextView) findViewById(R.id.textView1);
		display = getIntent().getExtras().getString("valuePassed");
		display = "you passed" + " " + display;
		textView1.setText(display);
		finish = (Button) findViewById(R.id.button2);
		
		finish.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third, menu);
		return true;
	}

}
