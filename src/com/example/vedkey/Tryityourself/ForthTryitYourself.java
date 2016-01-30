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

public class ForthTryitYourself extends Fragment {


	ImageView settingicon;
	

	SharedPref  pref;
	TextView headetxt;

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

	EditText layoutsteps1edttxt2,layoutsteps1edttxt4;
	Button layoutsteps1btn2;


	TextView layout2number1,layout2number2,layout2number3,layout2number4,layout2number5,layout2number9,layout2finaltxt;
	EditText layout2number10;

TextView finaltxts;

	int number1,number2;


	Button btn2t,btn3t;

TextView diff1,diff2;
private KeyListener listener1,listener2,listenercross,listenervertical;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View tryview = inflater.inflate(R.layout.forthtrylayout, container, false);



		getActivity().setTitle(NavigationActivity.header);




		edt1=(EditText)tryview.findViewById(R.id.editText1);
		listener1 = edt1.getKeyListener();
		edt2=(EditText)tryview.findViewById(R.id.editText2);
		listener2 = edt2.getKeyListener();

		edt1.setText("");
		edt2.setText("");

		stepstr1=(TextView)tryview.findViewById(R.id.textView3);
		stepstr2=(TextView)tryview.findViewById(R.id.textView2);

		
		btn2t=(Button)tryview.findViewById(R.id.btn2t);

		btn3t=(Button)tryview.findViewById(R.id.btn3t);

		finaltxts=(TextView)tryview.findViewById(R.id.finaltxts);
		finaltxts.setText("So the final answer is ");

		layoutsteps1edttxt2=(EditText)tryview.findViewById(R.id.edttxt2);
		layoutsteps1edttxt4=(EditText)tryview.findViewById(R.id.edttxt4);
		
		
		diff1=(TextView)tryview.findViewById(R.id.diff1);
		diff2=(TextView)tryview.findViewById(R.id.diff2);
		
		bttn7=(Button)tryview.findViewById(R.id.button1);
		bttn7.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				hideSoftKeyboard() ;
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
						Integer.valueOf(edt1.getText().toString())<100||
						Integer.valueOf(edt2.getText().toString())<100||
						Integer.valueOf(edt1.getText().toString())>110||
						Integer.valueOf(edt2.getText().toString())>110)
				{
					
					stepstr1.setClickable(false);
					stepstr2.setClickable(false);
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
							getActivity());

					// set title
					alertDialogBuilder.setTitle("Message");

					// set dialog message
					alertDialogBuilder
					.setMessage("Please enter numbers i.e. between 100 to 110")
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
				else if(!edt1.getText().toString().equalsIgnoreCase("")&&
						!edt2.getText().toString().equalsIgnoreCase("")
						||Integer.valueOf(edt1.getText().toString())>=100||
						Integer.valueOf(edt2.getText().toString())>=100||
						Integer.valueOf(edt1.getText().toString())<=110||
						Integer.valueOf(edt2.getText().toString())<=110)
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
					diff1.setText("Difference of 100 & "+x+"    i.e.  ");

					diff2.setText("Difference of 100 & "+y+"    i.e.  ");

				}


			}
		});




		layoutsteps1=(View)tryview.findViewById(R.id.tryone);
		layoutsteps2=(View)tryview.findViewById(R.id.trytwo);

		bttn8=(Button)tryview.findViewById(R.id.button2);
		bttn8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				hideSoftKeyboard() ;

				edt1.setText("");
				edt2.setText("");
			
				edt1.setKeyListener(listener1);
				edt2.setKeyListener(listener2);
				
				layout2number5.setKeyListener(listenercross);
				layout2number9.setKeyListener(listenervertical);
				layoutsteps1.setVisibility(View.GONE);
				layoutsteps2.setVisibility(View.GONE);
			}
		});


		layout2number1=(TextView)tryview.findViewById(R.id.number1);
		layout2number2=(TextView)tryview.findViewById(R.id.number2);
		layout2number3=(TextView)tryview.findViewById(R.id.number3);
		layout2number4=(TextView)tryview.findViewById(R.id.number4);
		layout2number5=(EditText)tryview.findViewById(R.id.number5);
		listenercross = layout2number5.getKeyListener();
		layout2number9=(EditText)tryview.findViewById(R.id.number9);
		listenervertical = layout2number9.getKeyListener();
		layout2finaltxt=(TextView)tryview.findViewById(R.id.finaltxt);
		layout2number10=(EditText)tryview.findViewById(R.id.number10);


		

		


		layoutsteps1btn2=(Button)tryview.findViewById(R.id.btn2);
		layoutsteps1btn2.setOnClickListener(new View .OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				hideSoftKeyboard() ;

				if(!layoutsteps1edttxt4.getText().toString().equalsIgnoreCase("")&&!layoutsteps1edttxt2.getText().toString().equalsIgnoreCase(""))
				{

					if(Integer.valueOf(layoutsteps1edttxt4.getText().toString())==Integer.valueOf(y-sub)&&Integer.valueOf(layoutsteps1edttxt2.getText().toString())==Integer.valueOf(x-sub))
					{

						hideSoftKeyboard() ;
						layout2number1.setText(String.valueOf(x));
						layout2number3.setText(String.valueOf(y));



						RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
						layoutsteps2.startAnimation(RightSwipe1);
						layoutsteps2.setVisibility(View.VISIBLE);
						layoutsteps1.setVisibility(View.GONE);


						getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);

						
							layout2number2.setText(String.valueOf(x-sub));
							layout2number4.setText(String.valueOf(y-sub));
							//layout2number5.setText(String.valueOf(x)+" - "+String.valueOf(sub-y));
							/*layout2number6.setText("OR");
							layout2number7.setText(String.valueOf(y)+" - "+String.valueOf(sub-x));
							layout2number8.setText(String.valueOf((x-(sub-y))));*/
							//layout2number9.setText(String.valueOf(((sub-x))+" X "+String.valueOf(sub-y)+" ="+String.valueOf((sub-x)*(sub-y))));
							///layout2finaltxt.setText("So the final answer is "+String.valueOf((sub-x)*(sub-y)));
						

					}
					else
					{

						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
								getActivity());

						// set title
						alertDialogBuilder.setTitle("Message");

						// set dialog message
						alertDialogBuilder
						.setMessage("Please enter correct difference")
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
				hideSoftKeyboard() ;
				

				if(!layout2number9.getText().toString().equalsIgnoreCase("")&&!layout2number5.getText().toString().equalsIgnoreCase(""))
				{

					if(Integer.valueOf(layout2number9.getText().toString())==((x-sub)*(y-sub))&&Integer.valueOf(layout2number5.getText().toString())==(x+(y-sub)))
					{
						
						layout2number9.setKeyListener(null);
						layout2number5.setKeyListener(null);
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
						.setMessage("Please enter correct number")
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
				hideSoftKeyboard() ;
				if(!layout2number9.getText().toString().equalsIgnoreCase("")&&!layout2number5.getText().toString().equalsIgnoreCase(""))
				{
					if(!layout2number10.getText().toString().equalsIgnoreCase(""))
					{
					/*	
						if(String.valueOf((x-sub)*(y-sub)).length()==1)
						{
							layout2number9.setText(String.valueOf(((x-sub))+" X "+String.valueOf(y-sub)+" =0"+String.valueOf((x-sub)*(y-sub))));
							layout2finaltxt.setText("So the final answer is "+String.valueOf((x+(y-sub))+"0"+String.valueOf((x-sub)*(y-sub))));
						}
						else
						{
							layout2number9.setText(String.valueOf(((x-sub))+" X "+String.valueOf(y-sub)+" ="+String.valueOf((x-sub)*(y-sub))));
							layout2finaltxt.setText("So the final answer is "+String.valueOf((x+(y-sub))+String.valueOf((x-sub)*(y-sub))));
						}*/
						
						
						int n=(x+(y-sub))*100;
						
						if(Integer.valueOf(layout2number10.getText().toString())==n+(x-sub)*(y-sub))
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
