package com.example.vedkey.Tryityourself;

import java.util.Random;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vedkey.ListFragment;
import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;
import com.example.vedkey.SharedPref;
import com.example.vedkey.Tutorial.FifthTutorial;
import com.example.vedkey.Tutorial.FirstTutorial;
import com.example.vedkey.Tutorial.FourtTutorial;
import com.example.vedkey.Tutorial.ThirdTutorial;

public class FifthTRyItyourself extends Fragment {




	
	TextView step1,step2;

	View layoutone,layout2;

	EditText edt1;
	int x=0;

	int sub=100;

int nu=0;


	EditText layoutoneedt1;
	EditText layoutwoedt1;

	Button layoutonebtn;
	Button layouttwobtn;
	
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

		View rootView = inflater.inflate(R.layout.fifthtrylayout, container, false);

		getActivity().setTitle(NavigationActivity.header);
		
		
	
		
		
		
		

	
	
		okBtn=(Button)rootView.findViewById(R.id.button1);
		clearBtn=(Button)rootView.findViewById(R.id.button2);
		

		edt1=(EditText)rootView.findViewById(R.id.editText1);
		listener1 = edt1.getKeyListener();
		edt1.setText("");
		
		
		layoutoneedt1=(EditText)rootView.findViewById(R.id.edttxt2);
		layoutwoedt1=(EditText)rootView.findViewById(R.id.number10);
		
		layoutonebtn=(Button)rootView.findViewById(R.id.btn2);
		layouttwobtn=(Button)rootView.findViewById(R.id.btn3t);
	

		



		layoutone=(View)rootView.findViewById(R.id.tryone);
		layout2=(View)rootView.findViewById(R.id.trytwo);
		
		
		
		
		
	
		step2=(TextView)rootView.findViewById(R.id.textView2);
		step1=(TextView)rootView.findViewById(R.id.textView3);
		
		clearBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				edt1.setText("");
				
			
				edt1.setKeyListener(listener1);
			
				
				hideSoftKeyboard() ;
				
				layoutone.setVisibility(View.GONE);
				layout2.setVisibility(View.GONE);
				
				layoutoneedt1.setText("");
				layoutwoedt1.setText("");
			}
		});
		
		
		okBtn.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(edt1.getText().toString().equalsIgnoreCase(""))
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
				
				else if(!edt1.getText().toString().equalsIgnoreCase(""))
						
				{

					edt1.setKeyListener(null);
					
				
					x=Integer.valueOf(edt1.getText().toString());
					
					step1.setClickable(true);

					RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					layoutone.startAnimation(RightSwipe1);
					layoutone.setVisibility(View.VISIBLE);
					layout2.setVisibility(View.GONE);

					layoutoneedt1.setText("");
					layoutoneedt1.requestFocus();
					layoutoneedt1.setCursorVisible(true);
					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					hideSoftKeyboard() ;
					

				}


			}
		});
		
		
		

		SpannableString content = new SpannableString(step1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, step1.getText().toString().length(), 0);
		step1.setText(content);
		layoutonebtn.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stubs

				int quot=x/10;
				int rem=x%10;
				hideSoftKeyboard();
				
				hideSoftKeyboard() ;
		
			if(!layoutoneedt1.getText().toString().equalsIgnoreCase(""))
			{
				if(Integer.valueOf(layoutoneedt1.getText().toString())==quot+rem)
				{
					RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					layout2.startAnimation(RightSwipe1);
					layout2.setVisibility(View.VISIBLE);
					layoutone.setVisibility(View.GONE);
					

					
					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
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
		layouttwobtn.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				hideSoftKeyboard() ;
				if(!layoutwoedt1.getText().toString().equalsIgnoreCase(""))
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
					
					
					if(String.valueOf(m).length()>1)
					{
						if(layoutwoedt1.getText().toString().equalsIgnoreCase(String.valueOf(Integer.valueOf(quot+m/10))+String.valueOf(m%10)+String.valueOf(rem)))
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
						if(layoutwoedt1.getText().toString().equalsIgnoreCase(String.valueOf(quot)+String.valueOf(m)+String.valueOf(rem)))
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
