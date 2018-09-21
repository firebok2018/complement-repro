package com.example.playmusic;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	
	
	Button play_pause;
	MediaPlayer mp;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		play_pause = (Button) findViewById(R.id.play_pause);
		//mp = MediaPlayer.create(this, resid);
		play_pause.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (mp.isPlaying()) {
					mp.pause();
					play_pause.setBackgroundResource(R.drawable.play);
				}
				else {
					mp.start();
					play_pause.setBackgroundResource(R.drawable.pause);
				}
					
			}
		});
	}
}
