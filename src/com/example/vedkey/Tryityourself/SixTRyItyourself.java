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

public class SixTRyItyourself extends Fragment {




	
	TextView step1,step2,step3;

	View tryone,trytwo,trythree;

	EditText editText1,editText2;
	Button button1;
	Button button2;
	
	
	int x=0;

	int sub=100;

	int nu=0;


TextView tryonetxt2,tryonetxt3,tryonetxt4,tryonetxt5;
EditText tryonetxt7;
Button tryonebtn1;

TextView trytwotxt12,txt13,txt14,txt15;
EditText trytwotxt17,trytwotxt20,trytwotry2;
Button trytwobtn1,trytwotxt21,trytwotry3;



TextView trythreetxt23,trythretxt24,trythretxt25,trythretxt26;
EditText trythretxt28,trythretxt30;
Button trythrebtn1,trythrebtn2;

	
	
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
	
	int m5;
	int m8;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.sixtrylayout, container, false);

		getActivity().setTitle(NavigationActivity.header);
		
		
	
		
		
		
		

	
	
		okBtn=(Button)rootView.findViewById(R.id.button1);
		clearBtn=(Button)rootView.findViewById(R.id.button2);
		

		editText1=(EditText)rootView.findViewById(R.id.editText1);
		listener1 = editText1.getKeyListener();
		
		editText2=(EditText)rootView.findViewById(R.id.editText2);
		listener2 = editText2.getKeyListener();
		
		
		editText1.setText("");
		editText2.setText("");
	

		
	tryone=(View)rootView.findViewById(R.id.tryone);
	trytwo=(View)rootView.findViewById(R.id.trytwo);
	trythree=(View)rootView.findViewById(R.id.trythree);
		
		
	tryonetxt2=(TextView)tryone.findViewById(R.id.txt2);
	tryonetxt3=(TextView)tryone.findViewById(R.id.txt3);
	tryonetxt4=(TextView)tryone.findViewById(R.id.txt4);
	tryonetxt5=(TextView)tryone.findViewById(R.id.txt5);	
	
	
	 tryonetxt7=(EditText)tryone.findViewById(R.id.txt7);
	 tryonebtn1=(Button)tryone.findViewById(R.id.btn1);
	 
	 
	  trytwotxt12=(TextView)trytwo.findViewById(R.id.txt12);
	 txt13=(TextView)trytwo.findViewById(R.id.txt13);
	 txt14=(TextView)trytwo.findViewById(R.id.txt14);
	 txt15=(TextView)trytwo.findViewById(R.id.txt15);
	 
	 
	trytwotxt17=(EditText)trytwo.findViewById(R.id.txt17);
	 trytwotxt20=(EditText)trytwo.findViewById(R.id.txt20);
	 trytwotry2=(EditText)trytwo.findViewById(R.id.try2);
	 
	 trytwobtn1=(Button)trytwo.findViewById(R.id.btn1);
	 trytwotxt21=(Button)trytwo.findViewById(R.id.txt21);
	 trytwotry3=(Button)trytwo.findViewById(R.id.try3);
		
		
	 
	 trythreetxt23=(TextView)trythree.findViewById(R.id.txt23);
	 trythretxt24=(TextView)trythree.findViewById(R.id.txt24);
	 trythretxt25=(TextView)trythree.findViewById(R.id.txt25);
	 trythretxt26=(TextView)trythree.findViewById(R.id.txt26);
	 
	 
	 trythretxt28=(EditText)trythree.findViewById(R.id.txt28);
	 trythretxt30=(EditText)trythree.findViewById(R.id.txt30);
	 
	 
	 trythrebtn1=(Button)trythree.findViewById(R.id.btn1);
	 trythrebtn2=(Button)trythree.findViewById(R.id.btn2);
	
		step2=(TextView)rootView.findViewById(R.id.textView2);
		step1=(TextView)rootView.findViewById(R.id.textView3);
		step3=(TextView)rootView.findViewById(R.id.textView4);
		
		clearBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				editText1.setText("");
				
			
				editText1.setKeyListener(listener1);
				
				
				editText2.setText("");
				
				
				editText2.setKeyListener(listener1);
			
				
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
				if(editText1.getText().toString().equalsIgnoreCase("")||editText2.getText().toString().equalsIgnoreCase(""))
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
				
				
				else if(!editText1.getText().toString().equalsIgnoreCase("")&&!editText2.getText().toString().equalsIgnoreCase(""))
						
				{

					editText1.setKeyListener(null);
					editText2.setKeyListener(null);
					
				
					x=Integer.valueOf(editText1.getText().toString());
					y=Integer.valueOf(editText2.getText().toString());
					
					step1.setClickable(true);

					RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					tryone.startAnimation(RightSwipe1);
					tryone.setVisibility(View.VISIBLE);
					trytwo.setVisibility(View.GONE);
					trythree.setVisibility(View.GONE);

					
					tryonetxt2.setText(String.valueOf(x/10));
					tryonetxt3.setText(String.valueOf(x%10));
					tryonetxt4.setText(String.valueOf(y/10));
					tryonetxt5.setText(String.valueOf(y%10));
					
					
					tryonetxt7.setText("");
					tryonetxt7.requestFocus();
					tryonetxt7.setCursorVisible(true);
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
		
				
			if(!tryonetxt7.getText().toString().equalsIgnoreCase(""))
			{
				if(Integer.valueOf(tryonetxt7.getText().toString())==quot*rem)
				{
					RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					trytwo.startAnimation(RightSwipe1);
					trytwo.setVisibility(View.VISIBLE);
					tryone.setVisibility(View.GONE);
					trythree.setVisibility(View.GONE);
					

					
				
					  	trytwotxt12.setText(String.valueOf(x/10));
						 txt13.setText(String.valueOf(x%10));
						 txt14.setText(String.valueOf(y/10));
						 txt15.setText(String.valueOf(y%10));
						 
						 trytwotxt17.setText("");
						 trytwotxt20.setText("");
						 trytwotry2.setText("");
					
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

		
		 trytwobtn1.setOnClickListener(new View.OnClickListener() {

				private Animation RightSwipe2;

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					hideSoftKeyboard() ;
					if(!trytwotxt17.getText().toString().equalsIgnoreCase(""))
					{
						int quot=x/10;
						int rem=y%10;
						
						int m=quot+rem;
						
						
							if(trytwotxt17.getText().toString().equalsIgnoreCase(String.valueOf(quot*rem)))
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

			
		 trytwotxt21.setOnClickListener(new View.OnClickListener() {

				private Animation RightSwipe2;

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					hideSoftKeyboard() ;
					if(!trytwotxt20.getText().toString().equalsIgnoreCase(""))
					{
						int quot=x%10;
						int rem=y/10;
						
						int m=quot+rem;
						
						
						
							if(trytwotxt20.getText().toString().equalsIgnoreCase(String.valueOf(quot*rem)))
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

			
		 
		

		SpannableString content2 = new SpannableString(step2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, step2.getText().toString().length(), 0);
		step2.setText(content2);
		 trytwotry3.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe3;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				hideSoftKeyboard() ;
				if(!trytwotry2.getText().toString().equalsIgnoreCase(""))
				{
					int quot1=x/10;
					int rem1=x%10;
					
					int m1=quot1*rem1;
					
					
					int quot2=x/10;
					int rem2=y%10;
					
					int m2=quot2*rem2;
					
					
					int quot3=x%10;
					int rem3=y%10;
					
					int m3=quot3*rem3;
					
					System.out.println("m1:  "+m1+"   m2:  "+m2+"  m3:  "+m3);
					
					if(String.valueOf(m3).length()>=2)
					{
						
						int m4=m3/10;
						
						if(trytwotry2.getText().toString().equalsIgnoreCase(String.valueOf(Integer.valueOf(m1+m2+m4))))
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
									
									m5=Integer.valueOf(trytwotry2.getText().toString());
									
									RightSwipe3 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
									trythree.startAnimation(RightSwipe3);
									trythree.setVisibility(View.VISIBLE);
									tryone.setVisibility(View.GONE);
									trytwo.setVisibility(View.GONE);
									

									trythreetxt23.setText(String.valueOf(x/10));
									trythretxt24.setText(String.valueOf(x%10));
									trythretxt25.setText(String.valueOf(y/10));
									trythretxt26.setText(String.valueOf(y%10));
								
									
										 
										 trythretxt28.setText("");
										 trythretxt30.setText("");
										 
									
									getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
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
						if(trytwotry2.getText().toString().equalsIgnoreCase(String.valueOf(Integer.valueOf(m1+m2+m3))))
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
									m5=Integer.valueOf(trytwotry2.getText().toString());
									
									RightSwipe3 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
									trythree.startAnimation(RightSwipe3);
									trythree.setVisibility(View.VISIBLE);
									tryone.setVisibility(View.GONE);
									trytwo.setVisibility(View.GONE);
									

									trythreetxt23.setText(String.valueOf(x/10));
									trythretxt24.setText(String.valueOf(x%10));
									trythretxt25.setText(String.valueOf(y/10));
									trythretxt26.setText(String.valueOf(y%10));
								
									
										 
										 trythretxt28.setText("");
										 trythretxt30.setText("");
										 
									
									getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
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

			SpannableString content3 = new SpannableString(step3.getText().toString());
			content3.setSpan(new UnderlineSpan(), 0, step3.getText().toString().length(), 0);
			step3.setText(content3);
			
			trythrebtn1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					hideSoftKeyboard() ;
					if(!trythretxt28.getText().toString().equalsIgnoreCase(""))
					{
						int quot1=x/10;
						int rem1=x%10;
						
						int m1=quot1*rem1;
						
						
						int quot2=x/10;
						int rem2=y%10;
						
						int m2=quot2*rem2;
						
						
						int quot3=x%10;
						int rem3=y%10;
						
						int m3=quot3*rem3;
						
						System.out.println("m1:  "+m1+"   m2:  "+m2+"  m3:  "+m3);
						
						System.out.println("m1:  "+m1+"   m2:  "+m2+"  m3:  "+m3);
						
						int quot5=x/10;
						int rem5=y/10;
						
						int m7=quot5*rem5;
						
						System.out.println("m1:  "+m1+"   m2:  "+m2+"  m3:  "+m3+"    m7: "+ m7);
						
						if(String.valueOf(m5).length()>=2)
						{
							
							int m6=m5/10;
							System.out.println("m1:  "+m1+"   m2:  "+m2+"  m3:  "+m3+"    m7: "+ m7+"  m6: "+m6);
							if(trythretxt28.getText().toString().equalsIgnoreCase(String.valueOf(Integer.valueOf(m7+m6))))
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
										
										m8=Integer.valueOf(trythretxt28.getText().toString());
										
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
							if(trythretxt28.getText().toString().equalsIgnoreCase(String.valueOf(Integer.valueOf(m7+m5))))
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
										m8=Integer.valueOf(trythretxt28.getText().toString());
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
			
			
	trythrebtn2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					hideSoftKeyboard() ;
					if(!trythretxt30.getText().toString().equalsIgnoreCase(""))
					{
						 
						
						
						int quot3=x%10;
						int rem3=y%10;
						
						int m3=quot3*rem3;
						
						int m4=m3%10;
						
						System.out.println("m8:  "+m8+"   m5:  "+m5%10+"  m4:  "+m4);
						
						
						
					
						
				
						
						
						
						
						
							if(trythretxt30.getText().toString().equalsIgnoreCase(String.valueOf(m8+(m5%10)+m4)))
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
