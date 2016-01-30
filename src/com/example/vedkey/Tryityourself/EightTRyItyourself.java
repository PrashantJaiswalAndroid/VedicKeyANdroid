package com.example.vedkey.Tryityourself;

import java.util.Random;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.example.vedkey.ListFragment;
import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;
import com.example.vedkey.SharedPref;
import com.example.vedkey.Service.MusicService;
import com.example.vedkey.Tutorial.FifthTutorial;
import com.example.vedkey.Tutorial.FirstTutorial;
import com.example.vedkey.Tutorial.FourtTutorial;
import com.example.vedkey.Tutorial.ThirdTutorial;

public class EightTRyItyourself extends Fragment {




	TextView step2,step1;
	EditText editText1;
	
	Button button1,button2;
	
	TextView textView2,textView3;

	View tryone,trytwo;
	EditText tryonetxt2,tryonetxt4;
	Button tryonebtn1,tryonebtn2;

	EditText trytwotxt2;
	Button trytwobtn1;

	Button btnsolutionone,btnsolutiontwo;
	
	int x=0;

	int sub=100;

	int nu=0;



	
	//TextView layout3number1,layout3number2,layout3number3,layout3number4,layout3number5,layout3number6,layout3number7,layout3number8,layout3txtfinalresult;

    Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;
	
	int n1=0;
	int n2=0;
	
	Button okBtn,clearBtn;
	
	private KeyListener listener1,listener2,listenercross,listenervertical;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.eighttry, container, false);

		getActivity().setTitle(NavigationActivity.header);
		
		
	
		
		
		
		

	
	
		okBtn=(Button)rootView.findViewById(R.id.button1);
		clearBtn=(Button)rootView.findViewById(R.id.button2);
		

		editText1=(EditText)rootView.findViewById(R.id.editText1);
		listener1 = editText1.getKeyListener();
		
		editText1.setText("");
	
		
		step2=(TextView)rootView.findViewById(R.id.textView2);
		step1=(TextView)rootView.findViewById(R.id.textView3);
		
		
		tryone=(View)rootView.findViewById(R.id.tryone);
		trytwo=(View)rootView.findViewById(R.id.trytwo);
		
		tryonetxt2=(EditText)tryone.findViewById(R.id.txt2);
		tryonetxt4=(EditText)tryone.findViewById(R.id.txt4);
		
		tryonebtn1=(Button)tryone.findViewById(R.id.btn1);
		tryonebtn2=(Button)tryone.findViewById(R.id.btn2);
	

		

		trytwotxt2=(EditText)trytwo.findViewById(R.id.txt2);
		trytwobtn1=(Button)trytwo.findViewById(R.id.btn1);
		
		
		
		
		
	
	
		
		clearBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				editText1.setText("");
				
			
				editText1.setKeyListener(listener1);
			
				
				hideSoftKeyboard() ;
				
				tryone.setVisibility(View.GONE);
				trytwo.setVisibility(View.GONE);
				
				tryonetxt2.setText("");
				tryonetxt4.setText("");
			}
		});
		
		
		okBtn.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(editText1.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;
					
					step2.setClickable(false);
					step1.setClickable(false);
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
							getActivity());

					// set title
					alertDialogBuilder.setTitle("Message");

					// set dialog message
					alertDialogBuilder
					.setMessage("Please enter numbers")
					.setCancelable(false)
					.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,int id) {
							// if this button is clicked, close
							// current activity
							dialog.cancel();
						}
					});

					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();

					// show it
					alertDialog.show();
				}
				
				else if(!editText1.getText().toString().equalsIgnoreCase(""))
						
				{

					editText1.setKeyListener(null);
					
				
					x=Integer.valueOf(editText1.getText().toString());
					
					step1.setClickable(true);

					RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					tryone.startAnimation(RightSwipe1);
					tryone.setVisibility(View.VISIBLE);
					trytwo.setVisibility(View.GONE);

					tryonetxt2.setText("");
					tryonetxt2.requestFocus();
					tryonetxt2.setCursorVisible(true);
					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					hideSoftKeyboard() ;
					

				}


			}
		});
		
		
		btnsolutionone=(Button)rootView.findViewById(R.id.btnsolutionone);
		btnsolutionone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Dialog dialog = new Dialog(getActivity());
				dialog.setContentView(R.layout.eightthsolutionone);
				dialog.setTitle("Solution");

				final TextView txt2 = (TextView) dialog.findViewById(R.id.txt2);
				final TextView txt4 = (TextView) dialog.findViewById(R.id.txt4);
				final TextView txt7 = (TextView) dialog.findViewById(R.id.txt7);
				
				txt2.setText(String.valueOf(99)+"+"+String.valueOf(1)+"="+String.valueOf(99+1));
				txt4.setText("i.e.   "+String.valueOf(x));
				
				txt7.setText(String.valueOf(x*100));
				
				
				
				dialog.show();
				
			}
		});
		btnsolutiontwo=(Button)rootView.findViewById(R.id.btnsolutiontwo);
		btnsolutiontwo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Dialog dialog = new Dialog(getActivity());
				dialog.setContentView(R.layout.eightthsolutiontwo);
				dialog.setTitle("Solution");

				final TextView txt2 = (TextView) dialog.findViewById(R.id.txt2);
				final TextView txt3 = (TextView) dialog.findViewById(R.id.txt3);
				final TextView txt5 = (TextView) dialog.findViewById(R.id.txt5);
				
				
				
				txt2.setText(String.valueOf("So    "+String.valueOf(x*100)));
				txt3.setText(String.valueOf("     -"+String.valueOf(x)));
				
				
				int s=x*100;
				int a=s-x;
				txt5.setText(String.valueOf((x*100)-x));
				
				dialog.show();
			}
		});

		SpannableString content = new SpannableString(step1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, step1.getText().toString().length(), 0);
		step1.setText(content);
		tryonebtn1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stubs

				int quot=x/10;
				int rem=x%10;
				hideSoftKeyboard();
				
				hideSoftKeyboard() ;
		
			if(!tryonetxt2.getText().toString().equalsIgnoreCase(""))
			{
				if(Integer.valueOf(tryonetxt2.getText().toString())==99+1)
				{
					tryonetxt4.setText("");
					tryonetxt4.requestFocus();
					tryonetxt4.setCursorVisible(true);
					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					hideSoftKeyboard() ;
					

					
					
				}
				else
				{
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
							getActivity());

					// set title
					alertDialogBuilder.setTitle("Message");

					// set dialog message
					alertDialogBuilder
					.setMessage("Please enter correct answer")
					.setCancelable(false)
					.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,int id) {
							// if this button is clicked, close
							// current activity
							dialog.cancel();
						}
					});

					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();

					// show it
					alertDialog.show();
				}
			}
			else
			{
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						getActivity());

				// set title
				alertDialogBuilder.setTitle("Message");

				// set dialog message
				alertDialogBuilder
				.setMessage("Please enter number")
				.setCancelable(false)
				.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
						dialog.cancel();
					}
				});

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
			}
				
			
				
				
		
				

			}
		});
		
		tryonebtn2.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stubs

				int quot=x/10;
				int rem=x%10;
				hideSoftKeyboard();
				
				hideSoftKeyboard() ;
		
			if(!tryonetxt4.getText().toString().equalsIgnoreCase(""))
			{
				if(Integer.valueOf(tryonetxt4.getText().toString())==x*100)
				{
					RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					trytwo.startAnimation(RightSwipe1);
					trytwo.setVisibility(View.VISIBLE);
					tryone.setVisibility(View.GONE);
					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					hideSoftKeyboard() ;

					
					
				}
				else
				{
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
							getActivity());

					// set title
					alertDialogBuilder.setTitle("Message");

					// set dialog message
					alertDialogBuilder
					.setMessage("Please enter correct answer")
					.setCancelable(false)
					.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,int id) {
							// if this button is clicked, close
							// current activity
							dialog.cancel();
						}
					});

					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();

					// show it
					alertDialog.show();
				}
			}
			else
			{
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						getActivity());

				// set title
				alertDialogBuilder.setTitle("Message");

				// set dialog message
				alertDialogBuilder
				.setMessage("Please enter number")
				.setCancelable(false)
				.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
						dialog.cancel();
					}
				});

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
			}
				
			
				
				
		
				

			}
		});


		SpannableString content2 = new SpannableString(step2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, step2.getText().toString().length(), 0);
		step2.setText(content2);
		trytwobtn1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				hideSoftKeyboard() ;
				if(!trytwotxt2.getText().toString().equalsIgnoreCase(""))
				{
					int quot=x/10;
					int rem=x%10;
					
					int m=quot+rem;
					/*if(String.valueOf(m).length()>1)
					{
						layout2number1.setText("Here we have "+m/10+" carry");

						layout2number2.setText("  i.e.  "+quot+"  +|"+m/10+"  |"+m%10+"   "+rem);
						layout2number3.setText("So, the final answer is    "+(quot+m/10)+""+m%10+""+rem);
					}
					else
					{
						layout2number1.setText("  i.e.  "+"| "+quot+"  |"+m+"   "+rem);
						layout2number2.setText("So, the final answer is    "+quot+""+m+""+rem);
						layout2number3.setVisibility(View.GONE);
					}*/
					
					int s=x*100;
					int a=s-x;
				
						if(trytwotxt2.getText().toString().equalsIgnoreCase(String.valueOf(a)))
						{
							AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
									getActivity());

							// set title
							alertDialogBuilder.setTitle("Message");

							// set dialog message
							alertDialogBuilder
							.setMessage("Correct Answer")
							.setCancelable(false)
							.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,int id) {
									// if this button is clicked, close
									// current activity
									dialog.cancel();
								}
							});

							// create alert dialog
							AlertDialog alertDialog = alertDialogBuilder.create();

							// show it
							alertDialog.show();
						}
						else
						{
							AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
									getActivity());

							// set title
							alertDialogBuilder.setTitle("Message");

							// set dialog message
							alertDialogBuilder
							.setMessage("Please enter correct answer")
							.setCancelable(false)
							.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,int id) {
									// if this button is clicked, close
									// current activity
									dialog.cancel();
								}
							});

							// create alert dialog
							AlertDialog alertDialog = alertDialogBuilder.create();

							// show it
							alertDialog.show();
						}
					
					
				}
				else
				{
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
							getActivity());

					// set title
					alertDialogBuilder.setTitle("Message");

					// set dialog message
					alertDialogBuilder
					.setMessage("Please enter number")
					.setCancelable(false)
					.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,int id) {
							// if this button is clicked, close
							// current activity
							dialog.cancel();
						}
					});

					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();

					// show it
					alertDialog.show();
				}

			}
		});

		
	

		return rootView;
	}


	public void  hideSoftKeyboard() {
		if(getActivity().getCurrentFocus()!=null) {
			InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
			inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
		}
	}


	@Override
	public void onDestroy() {
		
		super.onDestroy();
	}


	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

		
	}




	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		



	}
}
