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

public class TenTRyItyourself extends Fragment {





	TextView tentutorialsteps1,tentutorialsteps2,tentutorialsteps3,tentutorialsteps4,tentutorialsteps5;

	View tentutoriallayoutsteps1,tentutoriallayoutsteps2,tentutoriallayoutsteps3,tentutoriallayoutsteps4,tentutoriallayoutsteps5;

	EditText editText1,editText2;
	Button button1;
	Button button2;


	int x;
	int y;


	TextView txt102,txt103,txt104,txt105,txt106,txt107;
	EditText txt109;
	Button btn110;


	TextView txt202,txt203,txt204,txt205,txt206,txt207;
	EditText txt209,txt212,txt215;
	Button btn210,btn213,btn216;


	TextView txt302,txt303,txt304,txt305,txt306,txt307;
	EditText txt309,txt312,txt315,txt318;
	Button btn310,btn313,btn316,btn319;



	TextView txt402,txt403,txt404,txt405,txt406,txt407;
	EditText txt409,txt412,txt415;
	Button btn410,btn413,btn416;


	TextView txt502,txt503,txt504,txt505,txt506,txt507;
	EditText txt509,txt512;
	Button btn510,btn513;




	//TextView layout3number1,layout3number2,layout3number3,layout3number4,layout3number5,layout3number6,layout3number7,layout3number8,layout3txtfinalresult;

	Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;





	private KeyListener listener1,listener2,listenercross,listenervertical;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.tentryityourself, container, false);

		getActivity().setTitle(NavigationActivity.header);










		button1=(Button)rootView.findViewById(R.id.button1);
		button2=(Button)rootView.findViewById(R.id.button2);


		editText1=(EditText)rootView.findViewById(R.id.editText1);
		listener1 = editText1.getKeyListener();

		editText2=(EditText)rootView.findViewById(R.id.editText2);
		listener2 = editText2.getKeyListener();




		editText1.setText("");
		editText2.setText("");




		tentutorialsteps1=(TextView)rootView.findViewById(R.id.tentutorialsteps1);
		tentutorialsteps2=(TextView)rootView.findViewById(R.id.tentutorialsteps2);
		tentutorialsteps3=(TextView)rootView.findViewById(R.id.tentutorialsteps3);
		tentutorialsteps4=(TextView)rootView.findViewById(R.id.tentutorialsteps4);
		tentutorialsteps5=(TextView)rootView.findViewById(R.id.tentutorialsteps5);
		
		SpannableString content1 = new SpannableString(tentutorialsteps1.getText().toString());
		content1.setSpan(new UnderlineSpan(), 0, tentutorialsteps1.getText().toString().length(), 0);
		tentutorialsteps1.setText(content1);
		
		SpannableString content2 = new SpannableString(tentutorialsteps2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, tentutorialsteps2.getText().toString().length(), 0);
		tentutorialsteps2.setText(content2);
		
		
		SpannableString content3 = new SpannableString(tentutorialsteps3.getText().toString());
		content3.setSpan(new UnderlineSpan(), 0, tentutorialsteps3.getText().toString().length(), 0);
		tentutorialsteps3.setText(content3);
		
		SpannableString content4 = new SpannableString(tentutorialsteps4.getText().toString());
		content4.setSpan(new UnderlineSpan(), 0, tentutorialsteps4.getText().toString().length(), 0);
		tentutorialsteps4.setText(content4);
		
		SpannableString content5 = new SpannableString(tentutorialsteps5.getText().toString());
		content5.setSpan(new UnderlineSpan(), 0, tentutorialsteps5.getText().toString().length(), 0);
		tentutorialsteps5.setText(content5);

		tentutoriallayoutsteps1=(View)rootView.findViewById(R.id.tentutoriallayoutsteps1);
		tentutoriallayoutsteps2=(View)rootView.findViewById(R.id.tentutoriallayoutsteps2);
		tentutoriallayoutsteps3=(View)rootView.findViewById(R.id.tentutoriallayoutsteps3);
		tentutoriallayoutsteps4=(View)rootView.findViewById(R.id.tentutoriallayoutsteps4);
		tentutoriallayoutsteps5=(View)rootView.findViewById(R.id.tentutoriallayoutsteps5);



		txt102=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt102);
		txt103=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt103);
		txt104=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt104);
		txt105=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt105);
		txt106=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt106);
		txt107=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt107);
		txt109=(EditText)tentutoriallayoutsteps1.findViewById(R.id.txt109);
		btn110=(Button)tentutoriallayoutsteps1.findViewById(R.id.btn110);


		txt202=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt202);
		txt203=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt203);
		txt204=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt204);
		txt205=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt205);
		txt206=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt206);
		txt207=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt207);
		txt209=(EditText)tentutoriallayoutsteps2.findViewById(R.id.txt209);
		txt212=(EditText)tentutoriallayoutsteps2.findViewById(R.id.txt212);
		txt215=(EditText)tentutoriallayoutsteps2.findViewById(R.id.txt215);
		btn210=(Button)tentutoriallayoutsteps2.findViewById(R.id.btn210);
		btn213=(Button)tentutoriallayoutsteps2.findViewById(R.id.btn213);
		btn216=(Button)tentutoriallayoutsteps2.findViewById(R.id.btn216);




		txt302=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt302);
		txt303=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt303);
		txt304=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt304);
		txt305=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt305);
		txt306=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt306);
		txt307=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt307);
		txt309=(EditText)tentutoriallayoutsteps3.findViewById(R.id.txt309);

		btn310=(Button)tentutoriallayoutsteps3.findViewById(R.id.btn310);

		txt312=(EditText)tentutoriallayoutsteps3.findViewById(R.id.txt312);
		btn313=(Button)tentutoriallayoutsteps3.findViewById(R.id.btn313);

		txt315=(EditText)tentutoriallayoutsteps3.findViewById(R.id.txt315);
		btn316=(Button)tentutoriallayoutsteps3.findViewById(R.id.btn316);

		txt318=(EditText)tentutoriallayoutsteps3.findViewById(R.id.txt318);
		btn319=(Button)tentutoriallayoutsteps3.findViewById(R.id.btn319);






		txt402=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt402);
		txt403=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt403);
		txt404=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt404);
		txt405=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt405);
		txt406=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt406);
		txt407=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt407);
		txt409=(EditText)tentutoriallayoutsteps4.findViewById(R.id.txt409);
		btn410=(Button)tentutoriallayoutsteps4.findViewById(R.id.btn410);
		txt412=(EditText)tentutoriallayoutsteps4.findViewById(R.id.txt412);
		btn413=(Button)tentutoriallayoutsteps4.findViewById(R.id.btn413);

		txt415=(EditText)tentutoriallayoutsteps4.findViewById(R.id.txt415);
		btn416=(Button)tentutoriallayoutsteps4.findViewById(R.id.btn416);



		txt502=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt502);
		txt503=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt503);
		txt504=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt504);
		txt505=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt505);
		txt506=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt506);
		txt507=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt507);
		txt509=(EditText)tentutoriallayoutsteps5.findViewById(R.id.txt509);
		txt512=(EditText)tentutoriallayoutsteps5.findViewById(R.id.txt512);

		btn510=(Button)tentutoriallayoutsteps5.findViewById(R.id.btn510);
		btn513=(Button)tentutoriallayoutsteps5.findViewById(R.id.btn513);



		button2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				editText1.setText("");


				editText1.setKeyListener(listener1);

				editText2.setText("");


				editText2.setKeyListener(listener2);





				hideSoftKeyboard() ;


				tentutoriallayoutsteps1.setVisibility(View.GONE);
				tentutoriallayoutsteps2.setVisibility(View.GONE);
				tentutoriallayoutsteps3.setVisibility(View.GONE);
				tentutoriallayoutsteps4.setVisibility(View.GONE);
				tentutoriallayoutsteps5.setVisibility(View.GONE);




			}
		});


		button1.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(editText1.getText().toString().equalsIgnoreCase("")||editText1.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!editText1.getText().toString().equalsIgnoreCase("")&&!editText2.getText().toString().equalsIgnoreCase(""))

				{

					if(editText1.getText().toString().length()==3 && editText2.getText().toString().length()==3)
					{
						editText1.setKeyListener(null);
						editText2.setKeyListener(null);



						x=Integer.valueOf(editText1.getText().toString());
						y=Integer.valueOf(editText2.getText().toString());

						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);

						RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
						tentutoriallayoutsteps1.startAnimation(RightSwipe1);
						tentutoriallayoutsteps1.setVisibility(View.VISIBLE);
						tentutoriallayoutsteps2.setVisibility(View.GONE);
						tentutoriallayoutsteps3.setVisibility(View.GONE);
						tentutoriallayoutsteps4.setVisibility(View.GONE);
						tentutoriallayoutsteps5.setVisibility(View.GONE);
				



						txt102.setText(String.valueOf(a1));
						txt103.setText(String.valueOf(b1));
						txt104.setText(String.valueOf(c1));
						txt105.setText(String.valueOf(a2));
						txt106.setText(String.valueOf(b2));
						txt107.setText(String.valueOf(c2));
						txt109.setText("");
				
					
						
						
						getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
						hideSoftKeyboard() ;
					}
					else
					{
						hideSoftKeyboard() ;


						AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
								getActivity());

						// set title
						alertDialogBuilder.setTitle("Message");

						// set dialog message
						alertDialogBuilder
						.setMessage("Please enter three digit numbers")
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
		});

		btn110.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt109.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt109.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
						int result =((c1*c2)%10);
						
						if(txt109.getText().toString().equalsIgnoreCase(String.valueOf(result)))
						{
							txt109.setKeyListener(null);
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
									int a1=x/100,b1=(x/10)%10,c1=x%10;
									int a2=y/100,b2=(y/10)%10,c2=y%10;
									
									System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
									System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
									RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
									tentutoriallayoutsteps2.startAnimation(RightSwipe1);
									tentutoriallayoutsteps2.setVisibility(View.VISIBLE);
									tentutoriallayoutsteps1.setVisibility(View.GONE);
									tentutoriallayoutsteps3.setVisibility(View.GONE);
									tentutoriallayoutsteps4.setVisibility(View.GONE);
									tentutoriallayoutsteps5.setVisibility(View.GONE);
							



									txt202.setText(String.valueOf(a1));
									txt203.setText(String.valueOf(b1));
									txt204.setText(String.valueOf(c1));
									txt205.setText(String.valueOf(a2));
									txt206.setText(String.valueOf(b2));
									txt207.setText(String.valueOf(c2));
									txt209.setText("");
									txt212.setText("");
									txt215.setText("");
								
									
									
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


			}
		});
		
		
		btn210.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt209.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt209.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						
						if(txt209.getText().toString().equalsIgnoreCase(String.valueOf(b1*c2)))
						{
							txt209.setKeyListener(null);
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
		});
		
		
		btn213.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt212.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt212.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						
						if(txt212.getText().toString().equalsIgnoreCase(String.valueOf(b2*c1)))
						{
							txt212.setKeyListener(null);
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
		});
		
		
		
		btn216.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt215.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt215.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result=(b1*c2)+(b2*c1)+((c1*c2)/10);
						if(txt215.getText().toString().equalsIgnoreCase(String.valueOf(result%10)))
						{
							txt215.setKeyListener(null);
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
									
									int a1=x/100,b1=(x/10)%10,c1=x%10;
									int a2=y/100,b2=(y/10)%10,c2=y%10;
									RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
									tentutoriallayoutsteps3.startAnimation(RightSwipe1);
									tentutoriallayoutsteps3.setVisibility(View.VISIBLE);
									tentutoriallayoutsteps1.setVisibility(View.GONE);
									tentutoriallayoutsteps2.setVisibility(View.GONE);
									tentutoriallayoutsteps4.setVisibility(View.GONE);
									tentutoriallayoutsteps5.setVisibility(View.GONE);
							

									

									txt302.setText(String.valueOf(a1));
									txt303.setText(String.valueOf(b1));
									txt304.setText(String.valueOf(c1));
									txt305.setText(String.valueOf(a2));
									txt306.setText(String.valueOf(b2));
									txt307.setText(String.valueOf(c2));
									txt309.setText("");
									txt312.setText("");
									txt315.setText("");
									txt318.setText("");
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
		});

/******************************************************************************************/
	
		
		btn310.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt309.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt309.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result=(a1*c2);
						if(txt309.getText().toString().equalsIgnoreCase(String.valueOf(result)))
						{
							txt309.setKeyListener(null);
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
		});
		
		btn313.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt312.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt312.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result=(c1*a2);
						if(txt312.getText().toString().equalsIgnoreCase(String.valueOf(result)))
						{
							txt312.setKeyListener(null);
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
		});
		
		
		btn316.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt315.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt315.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result=(b1*b2);
						if(txt315.getText().toString().equalsIgnoreCase(String.valueOf(result)))
						{
							txt315.setKeyListener(null);
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
		});
		
		
		btn319.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt318.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt318.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						
						int result=(a1*c2)+(c1*a2)+(b1*b2);
						int result2=(b1*c2)+(b2*c1)+((c1*c2)/10);
						int finalresult=result+(result2/10);
					
						if(txt318.getText().toString().equalsIgnoreCase(String.valueOf(finalresult%10)))
						{
							txt318.setKeyListener(null);
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
									
									
									int a1=x/100,b1=(x/10)%10,c1=x%10;
									int a2=y/100,b2=(y/10)%10,c2=y%10;
									RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
									tentutoriallayoutsteps4.startAnimation(RightSwipe1);
									tentutoriallayoutsteps4.setVisibility(View.VISIBLE);
									tentutoriallayoutsteps1.setVisibility(View.GONE);
									tentutoriallayoutsteps2.setVisibility(View.GONE);
									tentutoriallayoutsteps3.setVisibility(View.GONE);
									tentutoriallayoutsteps5.setVisibility(View.GONE);
							

									

									txt402.setText(String.valueOf(a1));
									txt403.setText(String.valueOf(b1));
									txt404.setText(String.valueOf(c1));
									txt405.setText(String.valueOf(a2));
									txt406.setText(String.valueOf(b2));
									txt407.setText(String.valueOf(c2));
									txt409.setText("");
									txt412.setText("");
									txt415.setText("");
							
									

									
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
		});
		
		
		/**********************************************************************************************/
		
		
		/******************************************************************/
		btn410.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt409.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt409.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result=(a1*b2);
						if(txt409.getText().toString().equalsIgnoreCase(String.valueOf(result)))
						{
							txt409.setKeyListener(null);
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
		});
		
		btn413.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt412.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt412.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result=(b1*a2);
						if(txt412.getText().toString().equalsIgnoreCase(String.valueOf(result)))
						{
							txt412.setKeyListener(null);
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
		});
		
		
		btn416.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt415.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt415.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result1=(a1*b2)+(b1*a2);
						int result2=(a1*c2)+(c1*a2)+(b1*b2);
						int result3=(b1*c2)+(b2*c1)+((c1*c2)/10);
						
						int result4=result2+(result3/10);
						int finalresult=result1+(result4/10);
						if(txt415.getText().toString().equalsIgnoreCase(String.valueOf(finalresult%10)))
						{
							txt415.setKeyListener(null);
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
									
									
							
									int a1=x/100,b1=(x/10)%10,c1=x%10;
									int a2=y/100,b2=(y/10)%10,c2=y%10;
									RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
									tentutoriallayoutsteps5.startAnimation(RightSwipe1);
									tentutoriallayoutsteps5.setVisibility(View.VISIBLE);
									tentutoriallayoutsteps1.setVisibility(View.GONE);
									tentutoriallayoutsteps2.setVisibility(View.GONE);
									tentutoriallayoutsteps3.setVisibility(View.GONE);
									tentutoriallayoutsteps4.setVisibility(View.GONE);
							

									
									txt502.setText(String.valueOf(a1));
									txt503.setText(String.valueOf(b1));
									txt504.setText(String.valueOf(c1));
									txt505.setText(String.valueOf(a2));
									txt506.setText(String.valueOf(b2));
									txt507.setText(String.valueOf(c2));
									txt509.setText("");
									txt512.setText("");
									
									
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
		});
		
		
		/************************************************************/

		
		/***********************************************************/
		
		btn510.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt509.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt509.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result=(a1*a2);
						if(txt509.getText().toString().equalsIgnoreCase(String.valueOf(result)))
						{
							txt509.setKeyListener(null);
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
		});
		
		btn513.setOnClickListener(new View.OnClickListener() {
			private Animation RightSwipe1;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(txt512.getText().toString().equalsIgnoreCase(""))
				{

					hideSoftKeyboard() ;


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


				else if(!txt512.getText().toString().equalsIgnoreCase(""))

				{

						
						int a1=x/100,b1=(x/10)%10,c1=x%10;
						int a2=y/100,b2=(y/10)%10,c2=y%10;
						
						System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
						System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
						int result1=(a1*a2);
						/***************************************/
						int result2=(a1*b2)+(b1*a2);
						
						
						int result3=(a1*c2)+(c1*a2)+(b1*b2);
						int result4=(b1*c2)+(b2*c1)+((c1*c2)/10);
						
						int result5=result3+(result4/10);
						int finalresult=result2+(result5/10);
						
						/***********************************/
						
						
						/*************************************/
						int step1result=(c1*c2)%10;
						/************************************/
						
						/*************************************/
						int result21=(b1*c2)+(b2*c1)+((c1*c2)/10);
						int step2result=result21%10;
						/************************************/
						
						
						/*************************************/
						int result31=(a1*c2)+(c1*a2)+(b1*b2);
						int result32=(b1*c2)+(b2*c1)+((c1*c2)/10);
						int finalresult33=result31+(result32/10);
						int step3result=(finalresult33)%10;
						/************************************/
						
						
						/*************************************/
						
						
						int result41=(a1*b2)+(b1*a2);
						int result42=(a1*c2)+(c1*a2)+(b1*b2);
						int result43=(b1*c2)+(b2*c1)+((c1*c2)/10);
						
						int result44=result42+(result43/10);
						int finalresult4=result41+(result44/10);
						
						int step4result=(finalresult4)%10;
						/************************************/
						
						
						int result6=result1+(finalresult/10);
						
						String resultfinal=result6+""+step4result+""+step3result+""+step2result+""+step1result;
						
						if(txt512.getText().toString().equalsIgnoreCase(String.valueOf(resultfinal)))
						{
							txt512.setKeyListener(null);
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
		});
		
		/**********************************************************/
		
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
