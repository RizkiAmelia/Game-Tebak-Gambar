package com.example.amtebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UkuranMata extends Activity {
	EditText jawaban;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ukuran_mata);
		jawaban = (EditText)findViewById(R.id.editText1);
  		//setting input dalam huruf besar
  		jawaban.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
  		
  		
  	}
      //method untuk mengecek jawaban
  	public void cekjawaban(View v){
  	String jawabanBenar = "UKURAN MATA";
  	String jawabanUser = jawaban.getText().toString();
  	if(jawabanUser.equals(jawabanBenar)){
  		
  		//pesan Toast
  		Toast.makeText(getApplicationContext(), "JAWABAN TEPAT!", Toast.LENGTH_LONG).show();
  		
  		Intent trans = new Intent(getApplicationContext(),Berhasil.class);
  		startActivity(trans);

  	}else{
  		//pesan Toast
  		Toast.makeText(getApplicationContext(), "JAWABAN MASIH SALAH!", Toast.LENGTH_LONG).show();
  	}
  	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ukuran_mata, menu);
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
