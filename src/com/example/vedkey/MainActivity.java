package com.example.vedkey;


import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.SeekBar;

import com.example.vedkey.Service.MusicService;

public class MainActivity extends Activity {

    
	private long delayMillis = 3000;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainscreen);
/* mp=MediaPlayer.create(this, R.raw.vedickeymusic);
mp.start();*/
		
		Intent ial = new Intent(this, MusicService.class);
		startService(ial);
		
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
/*
				if(null!=mp){
					mp.release();
					
				}*/
				MainActivity.this.finish();
				Intent admin = new Intent(MainActivity.this, HomeScreen.class);
				startActivity(admin);
				overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);


			}
		}, delayMillis);






	}



@Override
protected void onDestroy() {
	// TODO Auto-generated method stub
/*if(null!=mp){
	mp.release();
	
}*/
	super.onDestroy();
}

}
