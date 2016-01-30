package com.example.vedkey;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.example.vedkey.Nvigations.NavigationDrawerCallbacks;
import com.example.vedkey.Nvigations.NavigationDrawerFragment;
import com.example.vedkey.Service.MusicService;
import com.example.vedkey.Tryityourself.EightTRyItyourself;


public class NavigationActivity extends ActionBarActivity implements NavigationDrawerCallbacks {

	private Toolbar mToolbar;
	private NavigationDrawerFragment mNavigationDrawerFragment;
	Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public static String header="";
	private MenuItem mItem = null;
	 private SeekBar volumeSeekbar = null;
	    private AudioManager audioManager = null; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_topdrawer);
		mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
		setSupportActionBar(mToolbar);
		getSupportActionBar().setDisplayShowHomeEnabled(true);

		  setVolumeControlStream(AudioManager.STREAM_MUSIC);


		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.fragment_drawer);
		mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);

		// Add FragmentMain as the initial fragment       
		/*FragmentManager fm = NavigationActivity.this.getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();


		fragment = new ListFragment();
		ft.add(R.id.container, fragment);
		ft.commit();
		 */

		System.out.println("OpionsActivity.option: "+OpionsActivity.option);

		if(OpionsActivity.option.equalsIgnoreCase("Tutorial"))
		{
			mNavigationDrawerFragment.closeDrawer();
			FragmentManager fm = NavigationActivity.this.getSupportFragmentManager();
			FragmentTransaction ft = fm.beginTransaction();

			fragment = new ListFragment();
			if(fragment!=null)
			{
				header="Tutorial";
				ft.replace(R.id.container, fragment);
				ft.commit();
			}
		}
		else if(OpionsActivity.option.equalsIgnoreCase("Try it yourself"))
		{
			mNavigationDrawerFragment.closeDrawer();
			FragmentManager fm = NavigationActivity.this.getSupportFragmentManager();
			FragmentTransaction ft = fm.beginTransaction();

			fragment = new ListFragment();
			if(fragment!=null)
			{
				header="Try it yourself";
				ft.replace(R.id.container, fragment);
				ft.commit();
			}
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.action_settings:
	    	settingdialog();
	        return true;
	  
	   
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	

	

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		//Toast.makeText(this, "Menu item selected -> " + position, Toast.LENGTH_SHORT).show();
		FragmentManager fm = NavigationActivity.this.getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();



		if(position==0)
		{
			fragment = new ListFragment();
			if(fragment!=null)
			{
				header="Tutorial";
				ft.replace(R.id.container, fragment);
				ft.commit();
			}

		}
		else if(position==1)
		{
			fragment = new ListFragment();
			if(fragment!=null)
			{
				header="Try it yourself";
				ft.replace(R.id.container, fragment);
				ft.commit();
			}
		}
		else if(position==4)
		{
			
			Intent ial = new Intent(this, MusicService.class);
			stopService(ial);
			NavigationActivity.this.finish();
			
		}




	}

	@Override
	public void onBackPressed() {
		if (mNavigationDrawerFragment.isDrawerOpen())
			mNavigationDrawerFragment.closeDrawer();
		else{
			// super.onBackPressed();
			//NavigationActivity.this.finish();
		}

	}
	
	protected void settingdialog() {
	// TODO Auto-generated method stub
	Dialog dialog = new Dialog(NavigationActivity.this);
	dialog.setContentView(R.layout.settingdialog);
	dialog.setTitle("Setting");

	final ImageView musicoff = (ImageView) dialog.findViewById(R.id.musiconoff);
	volumeSeekbar=(SeekBar)dialog.findViewById(R.id.seekBar1);

	musicoff.setOnClickListener(new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			AudioManager manager = (AudioManager)NavigationActivity.this.getSystemService(Context.AUDIO_SERVICE);
			if(manager.isMusicActive())
			 {
			     // do something - or do it not
				Intent stop = new Intent(NavigationActivity.this, MusicService.class);
				stopService(stop);
				musicoff.setImageResource(R.drawable.switch_off);
			 }
			else
			{
				Intent start = new Intent(NavigationActivity.this, MusicService.class);
				startService(start);
				musicoff.setImageResource(R.drawable.switch_on);
			}
		}
	});
	
	try
    {
        
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        volumeSeekbar.setMax(audioManager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        volumeSeekbar.setProgress(audioManager
                .getStreamVolume(AudioManager.STREAM_MUSIC));   


        volumeSeekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() 
        {
            @Override
            public void onStopTrackingTouch(SeekBar arg0) 
            {
            }

            @Override
            public void onStartTrackingTouch(SeekBar arg0) 
            {
            }

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) 
            {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
                        progress, 0);
            }
        });
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
	dialog.show();
}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

	}
}
