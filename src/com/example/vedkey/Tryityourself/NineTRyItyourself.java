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

public class NineTRyItyourself extends Fragment {





	TextView step1,step2,step3;

	View tryone,trytwo,trythree;

	EditText editText1;
	Button button1;
	Button button2;


	int x=0;

	int sub=100;

	int nu=0;


	EditText tryonetxt2;
	Button tryonebtn1;


	EditText trytwotxt2;
	Button trytwobtn1;

	EditText trythreetxt2,trythreetxt4;
	Button trythreebtn1,trythreebtn2;






	//TextView layout3number1,layout3number2,layout3number3,layout3number4,layout3number5,layout3number6,layout3number7,layout3number8,layout3txtfinalresult;

	Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;

	int n1=0;
	int n2=0;

	Button okBtn,clearBtn;

	private KeyListener listener1,listener2,listenercross,listenervertical;

	int y;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.ninetrylayout, container, false);

		getActivity().setTitle(NavigationActivity.header);










		okBtn=(Button)rootView.findViewById(R.id.button1);
		clearBtn=(Button)rootView.findViewById(R.id.button2);


		editText1=(EditText)rootView.findViewById(R.id.editText1);
		listener1 = editText1.getKeyListener();




		editText1.setText("");
		



		tryone=(View)rootView.findViewById(R.id.tryone);
		trytwo=(View)rootView.findViewById(R.id.trytwo);
		trythree=(View)rootView.findViewById(R.id.trythree);


		tryonetxt2=(EditText)tryone.findViewById(R.id.txt2);
		tryonebtn1=(Button)tryone.findViewById(R.id.btn1);


		trytwotxt2=(EditText)trytwo.findViewById(R.id.txt2);
		trytwobtn1=(Button)trytwo.findViewById(R.id.btn1);
	



		trythreetxt2=(EditText)trythree.findViewById(R.id.txt2);
		trythreetxt4=(EditText)trythree.findViewById(R.id.txt4);
	

		trythreebtn1=(Button)trythree.findViewById(R.id.btn1);
		trythreebtn2=(Button)trythree.findViewById(R.id.btn2);

		step2=(TextView)rootView.findViewById(R.id.textView2);
		step1=(TextView)rootView.findViewById(R.id.textView3);
		step3=(TextView)rootView.findViewById(R.id.textView4);

		clearBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				editText1.setText("");


				editText1.setKeyListener(listener1);


				


				hideSoftKeyboard() ;

				tryone.setVisibility(View.GONE);
				trytwo.setVisibility(View.GONE);
				trythree.setVisibility(View.GONE);




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
					trythree.setVisibility(View.GONE);


				
				


					tryonetxt2.setText("");
					tryonetxt2.requestFocus();
					tryonetxt2.setCursorVisible(true);
					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					hideSoftKeyboard() ;


				}


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

				int quot=x%10;
				int rem=y%10;
				hideSoftKeyboard();

				hideSoftKeyboard() ;

				if(!tryonetxt2.getText().toString().equalsIgnoreCase(""))
				{
					if(Integer.valueOf(tryonetxt2.getText().toString())==x%10)
					{
						RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
						trytwo.startAnimation(RightSwipe1);
						trytwo.setVisibility(View.VISIBLE);
						tryone.setVisibility(View.GONE);
						trythree.setVisibility(View.GONE);




					

						trytwotxt2.setText("");
					
					

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
		trytwobtn1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				hideSoftKeyboard() ;
				if(!trytwotxt2.getText().toString().equalsIgnoreCase(""))
				{
					int quot=x%10;
					int rem=(x/10)%10;
					int rem2=(x/100)%10;

					int m=quot+rem;

					int a=quot+rem;
					int b=rem+rem2;
					int c=(b*10)+a;
					
					
					

					if(trytwotxt2.getText().toString().equalsIgnoreCase(String.valueOf(Integer.valueOf(c))))
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
								
								RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
								trythree.startAnimation(RightSwipe2);
								trythree.setVisibility(View.VISIBLE);
								trytwo.setVisibility(View.GONE);
								tryone.setVisibility(View.GONE);


							
							


								trythreetxt2.setText("");
								trythreetxt2.requestFocus();
								trythreetxt2.setCursorVisible(true);
								getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
								hideSoftKeyboard() ;
								
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
		
		
		SpannableString content3 = new SpannableString(step3.getText().toString());
		content3.setSpan(new UnderlineSpan(), 0, step3.getText().toString().length(), 0);
		step3.setText(content2);
		
		trythreebtn1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				hideSoftKeyboard() ;
				if(!trytwotxt2.getText().toString().equalsIgnoreCase(""))
				{
					int quot=x%10;
					int rem=(x/10)%10;
					int rem2=(x/100)%10;

					int m=quot+rem;

					int a=quot+rem;
					int b=rem+rem2;
					int c=(b*10)+a;
					
					
					

					if(trytwotxt2.getText().toString().equalsIgnoreCase(String.valueOf(Integer.valueOf(c))))
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
								
								RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
								trythree.startAnimation(RightSwipe2);
								trythree.setVisibility(View.VISIBLE);
								trytwo.setVisibility(View.GONE);
								tryone.setVisibility(View.GONE);


							
							


								trythreetxt2.setText("");
								trythreetxt2.requestFocus();
								trythreetxt2.setCursorVisible(true);
								getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
								hideSoftKeyboard() ;
								
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
		
		
		
		
		trythreebtn2.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				hideSoftKeyboard() ;
				if(!trytwotxt2.getText().toString().equalsIgnoreCase(""))
				{
					int quot=x%10;
					int rem=(x/10)%10;
					int rem2=(x/100)%10;

					int m=quot+rem;

					int a=quot+rem;
					int b=rem+rem2;
					int c=(b*10)+a;
					
					
					

					if(trytwotxt2.getText().toString().equalsIgnoreCase(String.valueOf(Integer.valueOf(c))))
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
								
								RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
								trythree.startAnimation(RightSwipe2);
								trythree.setVisibility(View.VISIBLE);
								trytwo.setVisibility(View.GONE);
								tryone.setVisibility(View.GONE);


							
							


								trythreetxt2.setText("");
								trythreetxt2.requestFocus();
								trythreetxt2.setCursorVisible(true);
								getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
								hideSoftKeyboard() ;
								
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
