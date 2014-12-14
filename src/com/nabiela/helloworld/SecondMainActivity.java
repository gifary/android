package com.nabiela.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
//import android.widget.EditText;
import android.widget.TextView;

public class SecondMainActivity extends Activity {
	
	TextView edit;
	EditText alamat;
	public final static String EXTRA_DATA_NAME = "com.nabiela.helloworld";
	public final static String EXTRA_DATA_ALAMAT="com.nabiela.helloworld.b";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
		
		Intent intent = getIntent();
		String pass= intent.getStringExtra(EXTRA_DATA_NAME);
		edit=(TextView) findViewById(R.id.hasilNama);
		edit.setText(pass);
	}
	
	public void akhir(View v)
	{
		
		//TODO : Siapkan data untuk jawaban, ambil jawaban dari UI
		alamat=(EditText)findViewById(R.id.address);
		String jawaban=alamat.getText().toString();
		
		Intent intent = new Intent();
		intent.putExtra(EXTRA_DATA_ALAMAT, jawaban);
		setResult(RESULT_OK,intent);
		
		super.finish();
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
