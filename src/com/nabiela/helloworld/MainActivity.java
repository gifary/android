package com.nabiela.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends Activity{
	Button btn;
	EditText nama;
	TextView alamat,outputAlamat;
	
	public final static String EXTRA_DATA_NAME = "com.nabiela.helloworld.a";
	public final static String EXTRA_DATA_ALAMAT="com.nabiela.helloworld.address";
	private final int REQUEST_ALAMAT_B=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn=(Button) findViewById(R.id.button1);
		outputAlamat=(TextView) findViewById(R.id.outputAlamat);

		
	}
	
	public void hasil (View v)
	{
		nama=(EditText) findViewById(R.id.Name);
	//	String name = String.valueOf(nama.getText().toString());		
	//	outputNama.setText("Nama Anda Adalah : "+name);
		Intent intent = new Intent (getApplicationContext(), SecondMainActivity.class);
		
		String passingValue1 = nama.getText().toString();
		intent.putExtra(SecondMainActivity.EXTRA_DATA_NAME,passingValue1);

		startActivityForResult(intent, REQUEST_ALAMAT_B);
		
		
//		alamat=(EditText) findViewById(R.id.address);
//		String address = String.valueOf(alamat.getText().toString());
//		outputAlamat.setText("Alamat Anda Adalah : "+address);
	}
	
	@Override
	public void onActivityResult (int reqC,int ResC, Intent intent){

				String MESS= intent.getStringExtra(SecondMainActivity.EXTRA_DATA_ALAMAT);
				alamat=(TextView) findViewById(R.id.outputAlamat);
				alamat.setText(MESS);
			
	}
	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		
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
