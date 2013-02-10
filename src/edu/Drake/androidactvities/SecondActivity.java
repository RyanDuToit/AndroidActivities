package edu.Drake.androidactvities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class SecondActivity extends Activity {

	Button button;
	Button pass1Button;
	Button pass2Button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		button = (Button) findViewById(R.id.button1);
		pass1Button = (Button) findViewById(R.id.button2);
		pass2Button = (Button) findViewById(R.id.button3);

		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		pass1Button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), ThirdActivity.class);
				intent.putExtra("valuePassed", "1");
				startActivity(intent);
			}
		});

		pass2Button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), ThirdActivity.class);
				intent.putExtra("valuePassed", "2");
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}


}
