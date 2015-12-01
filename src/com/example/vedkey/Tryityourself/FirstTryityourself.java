package com.example.vedkey.Tryityourself;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.KeyListener;
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

import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;
import com.example.vedkey.SharedPref;

public class FirstTryityourself extends Fragment {


	



	View layoutsteps1,layoutsteps2;

	Button step1anotherexamplebtn,step1nextstepbtn;

	View footer;
	Button previous,tryityourself,next;

	TextView multitutorialtxt,optiontxt,exampletxt,stepstxt,descriptontxt,steptxt1,steptxt2;
	int x=0;
	int y=0;
	int sub=100;

	int nu=0;


	EditText edt1,edt2;
	Button bttn7,bttn8;


	TextView stepstr1,stepstr2;

	EditText layoutsteps1edttxt2;
	Button layoutsteps1btn2;


	
	EditText layout2number10,layouteditext2,layout2number9;

	TextView finaltxts;

	int number1,number2;


	Button btn2t,btn3t;

TextView diff1,diff2;
private KeyListener listener1,listener2,listenercross,listenervertical;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View tryview = inflater.inflate(R.layout.firsttrylayout, container, false);



		getActivity().setTitle(NavigationActivity.header);




		edt1=(EditText)tryview.findViewById(R.id.editText1);
		listener1 = edt1.getKeyListener();
		edt2=(EditText)tryview.findViewById(R.id.editText2);
		listener2 = edt2.getKeyListener();


		stepstr1=(TextView)tryview.findViewById(R.id.textView3);
		stepstr2=(TextView)tryview.findViewById(R.id.textView2);

		
		btn2t=(Button)tryview.findViewById(R.id.btn2t);

		btn3t=(Button)tryview.findViewById(R.id.btn3t);

		finaltxts=(TextView)tryview.findViewById(R.id.finaltxts);
		finaltxts.setText("So the final answer is ");

		layoutsteps1edttxt2=(EditText)tryview.findViewById(R.id.edttxt2);
		
		
		
		diff1=(TextView)tryview.findViewById(R.id.diff1);
		diff2=(TextView)tryview.findViewById(R.id.diff2);
		
		bttn7=(Button)tryview.findViewById(R.id.button1);
		bttn7.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(edt1.getText().toString().equalsIgnoreCase("")||
						edt2.getText().toString().equalsIgnoreCase(""))
				{

					
					
					stepstr1.setClickable(false);
					stepstr2.setClickable(false);
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
				else if(
						Integer.valueOf(edt1.getText().toString())/10!=
						Integer.valueOf(edt2.getText().toString())/10)
				{
					
					stepstr1.setClickable(false);
					stepstr2.setClickable(false);
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
							getActivity());

					// set title
					alertDialogBuilder.setTitle("Message");

					// set dialog message
					alertDialogBuilder
					.setMessage("First Digit of both numbers are same")
					.setCancelable(false)
					.setPositiveButton("OK",new DialogInterface.OnClickListener() {
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
				else if(
						Integer.valueOf(edt1.getText().toString())%10+
						Integer.valueOf(edt2.getText().toString())%10!=10)
				{

					stepstr1.setClickable(false);
					stepstr2.setClickable(false);
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
							getActivity());

					// set title
					alertDialogBuilder.setTitle("Message");

					// set dialog message
					alertDialogBuilder
					.setMessage("Addition of second digit is equal to 10")
					.setCancelable(false)
					.setPositiveButton("OK",new DialogInterface.OnClickListener() {
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
				else if(
						Integer.valueOf(edt1.getText().toString())/10==
						Integer.valueOf(edt2.getText().toString())/10&&Integer.valueOf(edt1.getText().toString())%10+
						Integer.valueOf(edt2.getText().toString())%10==10)
				{

					edt1.setKeyListener(null);
					edt2.setKeyListener(null);
				
					x=Integer.valueOf(edt1.getText().toString());
					y=Integer.valueOf(edt2.getText().toString());
					stepstr1.setClickable(true);

					RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					layoutsteps1.startAnimation(RightSwipe1);
					layoutsteps1.setVisibility(View.VISIBLE);
					layoutsteps2.setVisibility(View.GONE);

					layoutsteps1edttxt2.requestFocus();
					layoutsteps1edttxt2.setCursorVisible(true);
					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					hideSoftKeyboard() ;
			

				}


			}
		});




		layoutsteps1=(View)tryview.findViewById(R.id.tryone);
		layoutsteps2=(View)tryview.findViewById(R.id.trytwo);
		
		layout2number9=(EditText)tryview.findViewById(R.id.number9);
		listenervertical = layout2number9.getKeyListener();
		
		layout2number10=(EditText)tryview.findViewById(R.id.number10);

		bttn8=(Button)tryview.findViewById(R.id.button2);
		bttn8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub


				edt1.setText("");
				edt2.setText("");
			
				edt1.setKeyListener(listener1);
				edt2.setKeyListener(listener2);
				
				
				layout2number9.setKeyListener(listenervertical);
				layoutsteps1.setVisibility(View.GONE);
				layoutsteps2.setVisibility(View.GONE);
			}
		});


		
		
		


		

		


		layoutsteps1btn2=(Button)tryview.findViewById(R.id.btn2);
		layoutsteps1btn2.setOnClickListener(new View .OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
		

				if(!layoutsteps1edttxt2.getText().toString().equalsIgnoreCase(""))
				{

					if(Integer.valueOf(layoutsteps1edttxt2.getText().toString())==((x/10)*((x/10)+1)))
					{

						hideSoftKeyboard() ;
						



						RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
						layoutsteps2.startAnimation(RightSwipe1);
						layoutsteps2.setVisibility(View.VISIBLE);
						layoutsteps1.setVisibility(View.GONE);


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
						.setMessage("Please enter correct multiplication")
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

		

		btn2t.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				

				if(!layout2number9.getText().toString().equalsIgnoreCase(""))
				{

					if(Integer.valueOf(layout2number9.getText().toString())==((x%10)*(y%10)))
					{
						
						layout2number9.setKeyListener(null);
						
						layout2number10.requestFocus();


					}
					else
					{
						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
								getActivity());

						// set title
						alertDialogBuilder.setTitle("Message");

						// set dialog message
						alertDialogBuilder
						.setMessage("Please enter correct multiplication")
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


		btn3t.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if(!layout2number9.getText().toString().equalsIgnoreCase(""))
				{
					if(!layout2number10.getText().toString().equalsIgnoreCase(""))
					{
						
						int n=(x/10)*((x/10)+1);
						System.out.println("n__"+n);
						int m=(x%10)*(y%10);
						int r=(n*100)+m;
						System.out.println("r_____"+r);
						
						if(Integer.valueOf(layout2number10.getText().toString())==r)
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
							.setMessage("your answer is incorrect, please enter correct answer")
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
						.setMessage("Please enter your answer")
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
					.setMessage("Please enter your answer")
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






		return tryview;
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


	public void  hideSoftKeyboard() {
		if(getActivity().getCurrentFocus()!=null) {
			InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
			inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
		}
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();




	}
}
