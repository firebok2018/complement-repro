package com.example.playmusic;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;


public class Seekbar extends Activity {
	SeekBar seekbar;
	TextView textView;
	int progress = 24;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seekbar);
		
		
		
		seekbar = (SeekBar) findViewById(R.id.seekbar);

		seekbar.setMax(1000);
		
		seekbar.setProgress(progress);
		
		textView = (TextView) findViewById(R.id.listView);
		textView.setText(" "+progress);
		textView.setTextSize(progress);
		
		seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				progress = 1;
				textView.setText(" "+progress);
				textView.setTextSize(progress);
			}
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	
}
