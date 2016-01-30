package com.example.vedkey.Tutorial;

import java.util.Random;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vedkey.ListFragment;
import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;
import com.example.vedkey.SharedPref;
import com.example.vedkey.Tryityourself.FifthTRyItyourself;
import com.example.vedkey.Tryityourself.SixTRyItyourself;

public class SixthTutorial extends Fragment {





	TextView headetxt;
	TextView step1,step2;




	View footer;
	Button previous,tryityourself,next;

	TextView sixthtutorialexampletxt;

	TextView sixthtutorialsteps1,sixthtutorialsteps2,sixthtutorialsteps3;

	View sixthtutoriallayoutsteps1,sixthtutoriallayoutsteps2,sixthtutoriallayout3;

	TextView step1txt1,step1txt2,step1txt3,step1txt4,step1txt5,step1txt6,step1txt7,step1txt8;

	TextView step2txt11,step2txt12,step2txt13,step2txt14,step2txt15,step2txt16,step2txt17,step2txt18,step2txt19,step2txt20,step2txt21;

	TextView step3txt22,step3txt23,step3txt24,step3txt25,step3txt26,step3txt27,step3txt28,step3txt29,step3txt30,step3txt31,step3txt32;


	Button sixthtutorialanotherexamplebtn;


	Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;
	public boolean step2pressed=false;

	int nu=0;
	int [] num1=new int[2];
	int [] num2=new int[2];

	String x="0";
	String y="0";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.sixthtutorial, container, false);

		getActivity().setTitle(NavigationActivity.header);

		num1=RandomGrn();

		x=(num1[0]+""+num1[1]);

		num2=RandomGrn();

		y=(num2[0]+""+num2[1]);


		sixthtutorialexampletxt=(TextView)rootView.findViewById(R.id.sixthtutorialexampletxt);

		sixthtutorialexampletxt.setText(x+" X "+y);



		sixthtutorialanotherexamplebtn=(Button)rootView.findViewById(R.id.sixthtutorialanotherexamplebtn);



		//	exampletxt.setText(x+" X "+y);


		sixthtutorialsteps1=(TextView)rootView.findViewById(R.id.sixthtutorialsteps1);
		sixthtutorialsteps2=(TextView)rootView.findViewById(R.id.sixthtutorialsteps2);
		sixthtutorialsteps3=(TextView)rootView.findViewById(R.id.sixthtutorialsteps3);


		sixthtutoriallayoutsteps1=(View)rootView.findViewById(R.id.sixthtutoriallayoutsteps1);
		sixthtutoriallayoutsteps2=(View)rootView.findViewById(R.id.sixthtutoriallayoutsteps2);
		sixthtutoriallayout3=(View)rootView.findViewById(R.id.sixthtutoriallayoutsteps3);


		step1txt1=(TextView)rootView.findViewById(R.id.txt1);
		step1txt2=(TextView)rootView.findViewById(R.id.txt2);
		step1txt3=(TextView)rootView.findViewById(R.id.txt3);
		step1txt4=(TextView)rootView.findViewById(R.id.txt4);
		step1txt5=(TextView)rootView.findViewById(R.id.txt5);
		step1txt6=(TextView)rootView.findViewById(R.id.txt6);
		step1txt7=(TextView)rootView.findViewById(R.id.txt7);
		step1txt8=(TextView)rootView.findViewById(R.id.txt8);


		step2txt11=(TextView)rootView.findViewById(R.id.txt11);
		step2txt12=(TextView)rootView.findViewById(R.id.txt12);
		step2txt13=(TextView)rootView.findViewById(R.id.txt13);
		step2txt14=(TextView)rootView.findViewById(R.id.txt14);
		step2txt15=(TextView)rootView.findViewById(R.id.txt15);
		step2txt16=(TextView)rootView.findViewById(R.id.txt16);
		step2txt17=(TextView)rootView.findViewById(R.id.txt17);
		step2txt18=(TextView)rootView.findViewById(R.id.txt18);
		step2txt19=(TextView)rootView.findViewById(R.id.txt19);
		step2txt20=(TextView)rootView.findViewById(R.id.txt20);
		step2txt21=(TextView)rootView.findViewById(R.id.txt21);



		step3txt22=(TextView)rootView.findViewById(R.id.txt22);
		step3txt23=(TextView)rootView.findViewById(R.id.txt23);
		step3txt24=(TextView)rootView.findViewById(R.id.txt24);
		step3txt25=(TextView)rootView.findViewById(R.id.txt25);
		step3txt26=(TextView)rootView.findViewById(R.id.txt26);
		step3txt27=(TextView)rootView.findViewById(R.id.txt27);
		step3txt28=(TextView)rootView.findViewById(R.id.txt28);
		step3txt29=(TextView)rootView.findViewById(R.id.txt29);
		step3txt30=(TextView)rootView.findViewById(R.id.txt30);
		step3txt31=(TextView)rootView.findViewById(R.id.txt31);
		step3txt32=(TextView)rootView.findViewById(R.id.txt32);


		sixthtutorialanotherexamplebtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sixthtutoriallayoutsteps1.setVisibility(View.GONE);
				sixthtutoriallayoutsteps2.setVisibility(View.GONE);
				sixthtutoriallayout3.setVisibility(View.GONE);

				num1=RandomGrn();

				x=(num1[0]+""+num1[1]);

				num2=RandomGrn();

				y=(num2[0]+""+num2[1]);
				sixthtutorialexampletxt.setText(x+" X "+y);
			}
		});



		footer=(View)rootView.findViewById(R.id.footer);
		previous=(Button)footer.findViewById(R.id.button1);
		tryityourself=(Button)footer.findViewById(R.id.button2);
		next=(Button)footer.findViewById(R.id.button3);

		previous.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();

				fragment = new ListFragment();
				if(fragment!=null)
				{
					/*NavigationActivity.header="Try it yourself";
						ft.replace(R.id.container, fragment);
						ft.commit();*/
					NavigationActivity.header="Tutorial";
					fragment = new FifthTutorial();
					if(fragment!=null)
					{
						ft.replace(R.id.container, fragment);
						ft.commit();
					}
				}
			}
		});


		tryityourself.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();

				fragment = new ListFragment();
				if(fragment!=null)
				{

					NavigationActivity.header="Try it yourself";
					fragment = new SixTRyItyourself();
					if(fragment!=null)
					{
						ft.replace(R.id.container, fragment);
						ft.commit();
					}
				}


			}
		});

		next.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/*FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();

				fragment = new SevenTutorial();
				if(fragment!=null)
				{
					NavigationActivity.header="Try it yourself";
						ft.replace(R.id.container, fragment);
						ft.commit();
					NavigationActivity.header="Tutorial";
					fragment = new SevenTutorial();
					if(fragment!=null)
					{
						ft.replace(R.id.container, fragment);
						ft.commit();
					}
				}*/
			}
		});

		step2=(TextView)rootView.findViewById(R.id.seventhtutorialsteps2);







		SpannableString content = new SpannableString(sixthtutorialsteps1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, sixthtutorialsteps1.getText().toString().length(), 0);
		sixthtutorialsteps1.setText(content);
		sixthtutorialsteps1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				step1txt2.setText(String.valueOf(num1[0]));
				step1txt3.setText(String.valueOf(num1[1]));
				step1txt4.setText(String.valueOf(num2[0]));
				step1txt5.setText(String.valueOf(num2[1]));

				step1txt7.setText(String.valueOf(num1[1])+" X "+String.valueOf(num2[1])+" = "+String.valueOf((num1[1]*num2[1])));
				step1txt8.setText("Result of step 1 is-----> "+String.valueOf((num1[1]*num2[1])));






				/*if(x>100&&y>100)
				{

					layoutonetxt2.setText("Here "+x+" is "+String.valueOf(x-sub)+" greater than 100, so write the difference  as    "+"+"+String.valueOf(x-sub)+"      "+x+"   "+"+"+String.valueOf(x-sub));
					layoutonetxt3.setText("Here "+y+" is "+String.valueOf(y-sub)+" greater than 100, so write the difference  as    "+"+"+String.valueOf(y-sub)+"      "+y+"   "+"+"+String.valueOf(y-sub));
				}
				else if(x>100&&y<100)
				{
					layoutonetxt2.setText("Here "+x+" is "+String.valueOf(x-sub)+" greater than 100, so write the difference  as    "+"+"+String.valueOf(x-sub)+"      "+x+"   "+"+"+String.valueOf(x-sub));
					layoutonetxt3.setText("Here "+y+" is "+String.valueOf(sub-y)+" less than 100, so write the difference  as    "+"-"+String.valueOf(sub-y)+"      "+y+"   "+"-"+String.valueOf(sub-y));
				}
				else if(x<100&&y>100)
				{
					layoutonetxt2.setText("Here "+x+" is "+String.valueOf(sub-x)+" less than 100, so write the difference  as    "+"-"+String.valueOf(sub-x)+"      "+x+"   "+"-"+String.valueOf(sub-x));
					layoutonetxt3.setText("Here "+y+" is "+String.valueOf(y-sub)+" greater than 100, so write the difference  as    "+"+"+String.valueOf(y-sub)+"      "+y+"   "+"+"+String.valueOf(y-sub));
				}
				if(x<100&&y<100)
				{

					layoutonetxt2.setText("Difference of "+sub+" & "+x+" i.e   " +String.valueOf(sub-x));
					layoutonetxt3.setText("Difference of "+sub+" & "+y+" i.e   " +String.valueOf(sub-y));
				}*/


				step1pressed=true;

				RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
				sixthtutoriallayoutsteps1.startAnimation(RightSwipe1);
				sixthtutoriallayoutsteps1.setVisibility(View.VISIBLE);
				sixthtutoriallayoutsteps2.setVisibility(View.GONE);
				sixthtutoriallayout3.setVisibility(View.GONE);



				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);

			}
		});


		SpannableString content2 = new SpannableString(sixthtutorialsteps2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, sixthtutorialsteps2.getText().toString().length(), 0);
		sixthtutorialsteps2.setText(content2);
		sixthtutorialsteps2.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step1pressed)
				{
					step2txt12.setText(String.valueOf(num1[0]));
					step2txt13.setText(String.valueOf(num1[1]));
					step2txt14.setText(String.valueOf(num2[0]));
					step2txt15.setText(String.valueOf(num2[1]));

					step2txt17.setText("Cross multoplication of-----> "+String.valueOf(num1[0])+" X "+String.valueOf(num2[1])+" = "+String.valueOf((num1[0]*num2[1])));
					step2txt18.setText("And Cross multiplication of---> "+String.valueOf(num1[1])+" X "+String.valueOf(num2[0])+" = "+String.valueOf((num1[1]*num2[0])));


					step2txt20.setText(String.valueOf(String.valueOf((num1[0]*num2[1]))+" + "+String.valueOf((num1[1]*num2[0]))+" = "+String.valueOf((num1[0]*num2[1])+(num1[1])*num2[0])));

					int a=num1[0]*num2[1];
					int b=num1[1]*num2[0];
					int c=(a+b)/10;
					int d=(a+b)%10;

					step2txt21.setText("Here "+String.valueOf(d)+" is result of step 2  and we will carry "+String.valueOf(c)+" for next step.");






					/*if(x>100&&y>100)
				{
					layout2number2.setText("+"+String.valueOf(x-sub));
					layout2number4.setText("+"+String.valueOf(y-sub));
					layout2number5.setText(x+"("+"+"+String.valueOf(y-sub)+")"+" OR "+y+"("+"+"+String.valueOf(x-sub)+")"+" which gives us "+String.valueOf(x+(y-sub))+" in both the cases.");
					layout2number6.setText("Simply write 00 at the last of "+String.valueOf(x+(y-sub)));
					layout2number7.setText("i.e. "+String.valueOf(x+(y-sub))+"00");
					layout2number8.setText("This is the result of step 2.");

				}
				else if(x>100&&y<100)
				{
					layout2number2.setText("+"+String.valueOf(x-sub));
					layout2number4.setText("-"+String.valueOf(sub-y));
					layout2number5.setText(x+"("+"-"+String.valueOf(sub-y)+")"+" OR "+y+"("+"+"+String.valueOf(x-sub)+")"+" which gives us "+String.valueOf(x-(sub-y))+" in both the cases.");
					layout2number6.setText("Simply write 00 at the last of "+String.valueOf(x-(sub-y)));
					layout2number7.setText("i.e. "+String.valueOf(x-(sub-y))+"00");
					layout2number8.setText("This is the result of step 2.");
				}
				else if(x<100&&y>100)
				{	
					layout2number2.setText("-"+String.valueOf(sub-x));
					layout2number4.setText("+"+String.valueOf(y-sub));
					layout2number5.setText(x+"("+"+"+String.valueOf(y-sub)+")"+" OR "+y+"("+"-"+String.valueOf(sub-x)+")"+" which gives us "+String.valueOf(x+(y-sub))+" in both the cases.");
					layout2number6.setText("Simply write 00 at the last of "+String.valueOf(x+(y-sub)));
					layout2number7.setText("i.e. "+String.valueOf(x+(y-sub))+"00");
					layout2number8.setText("This is the result of step 2.");
				}

					layout2number2.setText(String.valueOf(sub-x));
					layout2number4.setText(String.valueOf(sub-y));
					layout2number5.setText(String.valueOf(x)+" - "+String.valueOf(sub-y));
					layout2number6.setText("OR");
					layout2number7.setText(String.valueOf(y)+" - "+String.valueOf(sub-x));
					layout2number8.setText(String.valueOf((x-(sub-y))));
					if(String.valueOf((sub-x)*(sub-y)).length()==1)
					{
						layout2number9.setText(String.valueOf(((sub-x))+" X "+String.valueOf(sub-y)+" =0"+String.valueOf((sub-x)*(sub-y))));
						layout2finaltxt.setText("So the final answer is "+String.valueOf((x-(sub-y))+"0"+String.valueOf((sub-x)*(sub-y))));
					}
					else
					{
						layout2number9.setText(String.valueOf(((sub-x))+" X "+String.valueOf(sub-y)+" ="+String.valueOf((sub-x)*(sub-y))));
						layout2finaltxt.setText("So the final answer is "+String.valueOf((x-(sub-y))+String.valueOf((sub-x)*(sub-y))));
					}*/




					step2pressed=true;				
					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					sixthtutoriallayoutsteps2.startAnimation(RightSwipe2);
					sixthtutoriallayoutsteps1.setVisibility(View.GONE);
					sixthtutoriallayout3.setVisibility(View.GONE);
					sixthtutoriallayoutsteps2.setVisibility(View.VISIBLE);




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step1pressed=false;
				}




			}
		});



		SpannableString content3 = new SpannableString(sixthtutorialsteps3.getText().toString());
		content3.setSpan(new UnderlineSpan(), 0, sixthtutorialsteps3.getText().toString().length(), 0);
		sixthtutorialsteps3.setText(content3);
		sixthtutorialsteps3.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step2pressed)
				{
					step3txt23.setText(String.valueOf(num1[0]));
					step3txt24.setText(String.valueOf(num1[1]));
					step3txt25.setText(String.valueOf(num2[0]));
					step3txt26.setText(String.valueOf(num2[1]));


					int a=num1[0]*num2[1];
					int b=num1[1]*num2[0];
					int c=(a+b)/10;
					int d=(a+b)%10;

					step3txt28.setText(String.valueOf(num1[0])+" X "+String.valueOf(num2[0])+" = "+String.valueOf((num1[0]*num2[0])));
					step3txt29.setText("And carry of step 2 (i.e."+String.valueOf(c)+") into above result---> ");


					step3txt30.setText(String.valueOf(String.valueOf((num1[0]*num2[0]))+" + "+String.valueOf((c))+" = "+String.valueOf((num1[0]*num2[0])+(c)))+" (This is the result of step3 )");



					step3txt31.setText("Now write results of step3, step2 and step1 respectively --->  "+String.valueOf((num1[0]*num2[0])+(c))+" "+String.valueOf(d)+" "+String.valueOf((num1[1]*num2[1])));


					step3txt32.setText("So the Final Answer of "+String.valueOf(x)+" X "+String.valueOf(y)+" = "+String.valueOf((num1[0]*num2[0])+(c))+String.valueOf(d)+String.valueOf((num1[1]*num2[1])));


					/*if(x>100&&y>100)
				{
					layout2number2.setText("+"+String.valueOf(x-sub));
					layout2number4.setText("+"+String.valueOf(y-sub));
					layout2number5.setText(x+"("+"+"+String.valueOf(y-sub)+")"+" OR "+y+"("+"+"+String.valueOf(x-sub)+")"+" which gives us "+String.valueOf(x+(y-sub))+" in both the cases.");
					layout2number6.setText("Simply write 00 at the last of "+String.valueOf(x+(y-sub)));
					layout2number7.setText("i.e. "+String.valueOf(x+(y-sub))+"00");
					layout2number8.setText("This is the result of step 2.");

				}
				else if(x>100&&y<100)
				{
					layout2number2.setText("+"+String.valueOf(x-sub));
					layout2number4.setText("-"+String.valueOf(sub-y));
					layout2number5.setText(x+"("+"-"+String.valueOf(sub-y)+")"+" OR "+y+"("+"+"+String.valueOf(x-sub)+")"+" which gives us "+String.valueOf(x-(sub-y))+" in both the cases.");
					layout2number6.setText("Simply write 00 at the last of "+String.valueOf(x-(sub-y)));
					layout2number7.setText("i.e. "+String.valueOf(x-(sub-y))+"00");
					layout2number8.setText("This is the result of step 2.");
				}
				else if(x<100&&y>100)
				{	
					layout2number2.setText("-"+String.valueOf(sub-x));
					layout2number4.setText("+"+String.valueOf(y-sub));
					layout2number5.setText(x+"("+"+"+String.valueOf(y-sub)+")"+" OR "+y+"("+"-"+String.valueOf(sub-x)+")"+" which gives us "+String.valueOf(x+(y-sub))+" in both the cases.");
					layout2number6.setText("Simply write 00 at the last of "+String.valueOf(x+(y-sub)));
					layout2number7.setText("i.e. "+String.valueOf(x+(y-sub))+"00");
					layout2number8.setText("This is the result of step 2.");
				}

					layout2number2.setText(String.valueOf(sub-x));
					layout2number4.setText(String.valueOf(sub-y));
					layout2number5.setText(String.valueOf(x)+" - "+String.valueOf(sub-y));
					layout2number6.setText("OR");
					layout2number7.setText(String.valueOf(y)+" - "+String.valueOf(sub-x));
					layout2number8.setText(String.valueOf((x-(sub-y))));
					if(String.valueOf((sub-x)*(sub-y)).length()==1)
					{
						layout2number9.setText(String.valueOf(((sub-x))+" X "+String.valueOf(sub-y)+" =0"+String.valueOf((sub-x)*(sub-y))));
						layout2finaltxt.setText("So the final answer is "+String.valueOf((x-(sub-y))+"0"+String.valueOf((sub-x)*(sub-y))));
					}
					else
					{
						layout2number9.setText(String.valueOf(((sub-x))+" X "+String.valueOf(sub-y)+" ="+String.valueOf((sub-x)*(sub-y))));
						layout2finaltxt.setText("So the final answer is "+String.valueOf((x-(sub-y))+String.valueOf((sub-x)*(sub-y))));
					}*/





					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					sixthtutoriallayout3.startAnimation(RightSwipe2);
					sixthtutoriallayoutsteps1.setVisibility(View.GONE);
					sixthtutoriallayoutsteps2.setVisibility(View.GONE);
					sixthtutoriallayout3.setVisibility(View.VISIBLE);




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step2pressed=false;
				}




			}
		});


		/*step3.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe3;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				step1.setClickable(true);
				step2.setClickable(true);
				step3.setClickable(false);
				if(x>100&&y>100)
				{

					layout3number1.setText(String.valueOf(x));
					layout3number2.setText("+"+String.valueOf(x-sub));
					layout3number3.setText(String.valueOf(y));
					layout3number4.setText("+"+String.valueOf(y-sub));
					layout3number5.setText("Here "+"("+'+'+String.valueOf(x-sub)+")"+"X"+"("+"+"+String.valueOf(y-sub)+")"+"= "+"("+"+"+((x-sub)*(y-sub))+")");
					layout3number6.setText("this is the result of step3.");
					layout3number7.setText("Now add the results of Step2 and Step3");
					nu=Integer.valueOf(x+(y-sub))+00;
					layout3number8.setText(String.valueOf(x+(y-sub))+"00"+"+"+"("+"+"+((x-sub)*(y-sub))+")"+"=+"+nu+((x-sub)*(y-sub)));
					layout3txtfinalresult.setText("So the Final Answer of "+x+" X "+y+" ="+nu+((x-sub)*(y-sub)));
				}
				else if(x>100&&y<100)
				{

					layout3number1.setText(String.valueOf(x));
					layout3number2.setText("+"+String.valueOf(x-sub));
					layout3number3.setText(String.valueOf(y));
					layout3number4.setText("+"+String.valueOf(y-sub));
					layout3number5.setText("Here "+"("+'+'+String.valueOf(x-sub)+")"+"X"+"("+"-"+String.valueOf(sub-y)+")"+"= "+"("+"-"+((x-sub)*(sub-y))+")");
					layout3number6.setText("this is the result of step3.");
					layout3number7.setText("Now add the results of Step2 and Step3");
					nu=Integer.valueOf(x-(sub-y))+00;
					layout3number8.setText(String.valueOf(+y+(x-sub))+"00"+"+"+"("+"-"+((x-sub)*(sub-y))+")"+"=+"+nu+((x-sub)*(sub-y)));
					layout3txtfinalresult.setText("So the Final Answer of "+x+" X "+y+" ="+nu+((x-sub)*(sub-y)));
				}
				else if(x<100&&y>100)
				{

					layout3number1.setText(String.valueOf(x));
					layout3number2.setText("-"+String.valueOf(sub-x));
					layout3number3.setText(String.valueOf(y));
					layout3number4.setText("+"+String.valueOf(y-sub));
					layout3number5.setText("Here "+"("+"-"+String.valueOf(sub-x)+")"+"X"+"("+"+"+String.valueOf(y-sub)+")"+"= "+"("+"-"+((sub-x)*(y-sub))+")");
					layout3number6.setText("this is the result of step3.");
					layout3number7.setText("Now add the results of Step2 and Step3");
					nu=Integer.valueOf(x-(sub-y))+00;
					layout3number8.setText(String.valueOf(x-(sub-y))+"00"+"+"+"("+"+"+((sub-x)*(y-sub))+")"+"=+"+nu+((sub-x)*(y-sub)));
					layout3txtfinalresult.setText("So the Final Answer of "+x+" X "+y+" ="+nu+((sub-x)*(y-sub)));
				}
				else if(x<100&&y<100)
				{

					layout3number1.setText(String.valueOf(x));
					layout3number2.setText("-"+String.valueOf(sub-x));
					layout3number3.setText(String.valueOf(y));
					layout3number4.setText("-"+String.valueOf(sub-y));
					layout3number5.setText("Here "+"("+"-"+String.valueOf(sub-x)+")"+"X"+"("+"-"+String.valueOf(sub-y)+")"+"= "+"("+"-"+((sub-x)*(sub-y))+")");
					layout3number6.setText("this is the result of step3.");
					layout3number7.setText("Now add the results of Step2 and Step3");
					nu=Integer.valueOf(x-(sub-y))+00;
					layout3number8.setText(String.valueOf(x-(sub-y))+"00"+"+"+"("+"+"+((sub-x)*(sub-y))+")"+"=+"+nu+((sub-x)*(sub-y)));
					layout3txtfinalresult.setText("So the Final Answer of "+x+" X "+y+" ="+nu+((sub-x)*(sub-y)));
				}


				RightSwipe3 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);

				layoutone.setVisibility(View.GONE);
				layout2.setVisibility(View.GONE);





				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
			}
		});*/



		return rootView;
	}

	private static int[] RandomGrn() {
		int [] num=new int[2];
		Random r =new Random();
		num[0]=(r.nextInt(100 - 10) + 10)/10;
		num[1]=(r.nextInt(100 - 10) + 10)/10;

		return num;

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
