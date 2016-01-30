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
import android.widget.Button;
import android.widget.TextView;

import com.example.vedkey.ListFragment;
import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;
import com.example.vedkey.Tryityourself.FifthTRyItyourself;
import com.example.vedkey.Tryityourself.NineTRyItyourself;

public class NineTutorial extends Fragment {





	TextView headetxt;
	TextView step1,step2;




	View footer;
	Button previous,tryityourself,next;

	TextView ninetutorialexampletxt;

	TextView ninetutorialsteps1,ninetutorialsteps2,ninetutorialsteps3;

	View ninetutoriallayoutsteps1,ninetutoriallayoutsteps2,ninetutoriallayout3;

	TextView step1txt1,step1txt2,step1txt3;

	TextView step2txt11,step2txt12,step2txt13,step2txt14,step2txt15,step2txt16;

	TextView step3txt22,step3txt23,step3txt24,step3txt25;


	Button ninetutorialanotherexamplebtn;


	Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;
	public boolean step2pressed=false;

	int nu=0;
	

	int  x;
	int  y=11;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.ninehtutorial
				, container, false);

		getActivity().setTitle(NavigationActivity.header);

		Random r = new Random();
		x = r.nextInt(1000 - 100) + 100;

		

		ninetutorialexampletxt=(TextView)rootView.findViewById(R.id.ninethtutorialexampletxt);

		ninetutorialexampletxt.setText(x+" X "+y);



		ninetutorialanotherexamplebtn=(Button)rootView.findViewById(R.id.ninethtutorialanotherexamplebtn);



		//	exampletxt.setText(x+" X "+y);


		ninetutorialsteps1=(TextView)rootView.findViewById(R.id.ninethtutorialsteps1);
		ninetutorialsteps2=(TextView)rootView.findViewById(R.id.ninethtutorialsteps2);
		ninetutorialsteps3=(TextView)rootView.findViewById(R.id.ninethtutorialsteps3);


		ninetutoriallayoutsteps1=(View)rootView.findViewById(R.id.ninethtutoriallayoutsteps1);
		ninetutoriallayoutsteps2=(View)rootView.findViewById(R.id.ninethtutoriallayoutsteps2);
		ninetutoriallayout3=(View)rootView.findViewById(R.id.ninethtutoriallayoutsteps3);


		step1txt1=(TextView)rootView.findViewById(R.id.txt1);
		step1txt2=(TextView)rootView.findViewById(R.id.txt2);
		step1txt3=(TextView)rootView.findViewById(R.id.txt3);
	



		step2txt11=(TextView)rootView.findViewById(R.id.txt11);
		step2txt12=(TextView)rootView.findViewById(R.id.txt12);
		step2txt13=(TextView)rootView.findViewById(R.id.txt13);
		step2txt14=(TextView)rootView.findViewById(R.id.txt14);
		step2txt15=(TextView)rootView.findViewById(R.id.txt15);
		step2txt16=(TextView)rootView.findViewById(R.id.txt16);
	



		step3txt22=(TextView)rootView.findViewById(R.id.txt22);
		step3txt23=(TextView)rootView.findViewById(R.id.txt23);
		step3txt24=(TextView)rootView.findViewById(R.id.txt24);
		step3txt25=(TextView)rootView.findViewById(R.id.txt25);
	



		ninetutorialanotherexamplebtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ninetutoriallayoutsteps1.setVisibility(View.GONE);
				ninetutoriallayoutsteps2.setVisibility(View.GONE);
				ninetutoriallayout3.setVisibility(View.GONE);

				step1pressed=false;
				step2pressed=false;		
				Random r = new Random();
				x = r.nextInt(1000 - 100) + 100;

				ninetutorialexampletxt.setText(x+" X "+y);
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

				fragment = new EightTutorial();
				if(fragment!=null)
				{
					/*NavigationActivity.header="Try it yourself";
						ft.replace(R.id.container, fragment);
						ft.commit();*/
					NavigationActivity.header="Tutorial";
					fragment = new EightTutorial();
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

				fragment = new NineTRyItyourself();
				if(fragment!=null)
				{

					NavigationActivity.header="Try it yourself";
					fragment = new NineTRyItyourself();
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
				FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();

				fragment = new FirstTutorial();
				if(fragment!=null)
				{
					/*NavigationActivity.header="Try it yourself";
						ft.replace(R.id.container, fragment);
						ft.commit();*/
					NavigationActivity.header="Tutorial";
					fragment = new FirstTutorial();
					if(fragment!=null)
					{
						ft.replace(R.id.container, fragment);
						ft.commit();
					}
				}
			}
		});

		step2=(TextView)rootView.findViewById(R.id.fifthtutorialsteps2);







		SpannableString content = new SpannableString(ninetutorialsteps1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, ninetutorialsteps1.getText().toString().length(), 0);
		ninetutorialsteps1.setText(content);
		ninetutorialsteps1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				step1txt2.setText("Here last digit of "+x+" is "+x%10);
				step1txt3.setText("So "+x%10+" is last digit of the Final Answer");
				
				



				step1pressed=true;

				RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
				ninetutoriallayoutsteps1.startAnimation(RightSwipe1);
				ninetutoriallayoutsteps1.setVisibility(View.VISIBLE);
				ninetutoriallayoutsteps2.setVisibility(View.GONE);
				ninetutoriallayout3.setVisibility(View.GONE);



				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);

			}
		});


		SpannableString content2 = new SpannableString(ninetutorialsteps2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, ninetutorialsteps2.getText().toString().length(), 0);
		ninetutorialsteps2.setText(content2);
		ninetutorialsteps2.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step1pressed)
				{
					
					int a1=x%10;
					int a2=(x/10)%10;
					int a3=x/100;
					
					step2txt13.setText(String.valueOf(a1)+"+"+String.valueOf(a2)+"="+String.valueOf((a1)+(a2)));

					step2txt15.setText(String.valueOf(a2)+"+"+String.valueOf(a3)+"="+String.valueOf((a2)+(a3)));
					
					if(String.valueOf((a1+a2)).length()>=2&&String.valueOf((a2+a3)).length()>=2)
					{
						int a4=(a1+a2)%10;
						int a5=(a2+a3)%10;
						
						step2txt16.setText("Write above results from right to left---> "+String.valueOf((a5))+String.valueOf((a4)));
					}
					else if(String.valueOf((a1+a2)).length()>=2)
					{
						int a4=(a1+a2)%10;
						//step2txt16.setText("Write above results from right to left---> "+String.valueOf((a2+a3))+String.valueOf((a1+a2)));\
						step2txt16.setText("Write above results from right to left---> "+String.valueOf((a2+a3))+String.valueOf((a4)));
					}
					
					else if(String.valueOf((a2+a3)).length()>=2)
					{
						int a5=(a2+a3)%10;
						//step2txt16.setText("Write above results from right to left---> "+String.valueOf((a2+a3))+String.valueOf((a1+a2)));\
						step2txt16.setText("Write above results from right to left---> "+String.valueOf((a5))+String.valueOf((a1+a2)));
					}
					else if(String.valueOf((a1+a2)).length()<2&&String.valueOf((a2+a3)).length()<2)
					{
						
						step2txt16.setText("Write above results from right to left---> "+String.valueOf((a2+a3))+String.valueOf((a1+a2)));
						//step2txt16.setText("Write above results from right to left---> "+String.valueOf((a5))+String.valueOf((a1+a2)));
					}
					
				

					

					/*int a=num1[0]*num2[1];
					int b=num1[1]*num2[0];
					int c=(a+b)/10;
					int d=(a+b)%10;*/

	






				

					step2pressed=true;				
					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					ninetutoriallayoutsteps2.startAnimation(RightSwipe2);
					ninetutoriallayoutsteps1.setVisibility(View.GONE);
					ninetutoriallayout3.setVisibility(View.GONE);
					ninetutoriallayoutsteps2.setVisibility(View.VISIBLE);




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step1pressed=false;
				}




			}
		});



		SpannableString content3 = new SpannableString(ninetutorialsteps3.getText().toString());
		content3.setSpan(new UnderlineSpan(), 0, ninetutorialsteps3.getText().toString().length(), 0);
		ninetutorialsteps3.setText(content3);
		ninetutorialsteps3.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step2pressed)
				{
					int a1=x%10;
					int a2=(x/10)%10;
					int a3=x/100;
					int b1=x/100;
					/*
					if(String.valueOf((a1+a2)).length()>=2&&String.valueOf((a2+a3)).length()>=2)
					{
						int a4=(a1+a2)%10;
						int a5=(a2+a3)%10;
						
						int b2=b1+(a4/10)+(a5/10);
						
						//step2txt16.setText("Write above results from right to left---> "+String.valueOf((a5))+String.valueOf((a4)));
						
						step3txt23.setText("Here first digit of "+x+" is "+String.valueOf(b2));
						step3txt24.setText("So "+b2+" is first digit of the Final Answer. Simply write results of step3, step2, step1 respectively--> "+b2+"    "+a5+a4+"     "+a1);
						step3txt25.setText("So the Final Answer of---> "+x+" X 11= "+b2+a5+a4+a1);
					}
					else if(String.valueOf((a1+a2)).length()>=2)
					{
						int a4=(a1+a2)%10;
						//step2txt16.setText("Write above results from right to left---> "+String.valueOf((a2+a3))+String.valueOf((a1+a2)));\
						step2txt16.setText("Write above results from right to left---> "+String.valueOf((a2+a3))+String.valueOf((a4)));
						
						step3txt23.setText("Here first digit of "+x+" is "+String.valueOf(b1));
						step3txt24.setText("So "+b1+" is first digit of the Final Answer. Simply write results of step3, step2, step1 respectively--> "+b1+    62    2"String.valueOf(num1[1]));
						step3txt25.setText(String.valueOf(num2[0]));
					}
					
					else if(String.valueOf((a2+a3)).length()>=2)
					{
						int a5=(a2+a3)%10;
						//step2txt16.setText("Write above results from right to left---> "+String.valueOf((a2+a3))+String.valueOf((a1+a2)));\
						step2txt16.setText("Write above results from right to left---> "+String.valueOf((a5))+String.valueOf((a1+a2)));
						
						step3txt23.setText("Here first digit of "+x+" is "+String.valueOf(b1));
						step3txt24.setText("So "+b1+" is first digit of the Final Answer. Simply write results of step3, step2, step1 respectively--> "+b1+    62    2"String.valueOf(num1[1]));
						step3txt25.setText(String.valueOf(num2[0]));
					}
					else if(String.valueOf((a1+a2)).length()<2&&String.valueOf((a2+a3)).length()<2)
					{
						
						step2txt16.setText("Write above results from right to left---> "+String.valueOf((a2+a3))+String.valueOf((a1+a2)));
						//step2txt16.setText("Write above results from right to left---> "+String.valueOf((a5))+String.valueOf((a1+a2)));
						
						step3txt23.setText("Here first digit of "+x+" is "+String.valueOf(b1));
						step3txt24.setText("So "+b1+" is first digit of the Final Answer. Simply write results of step3, step2, step1 respectively--> "+b1+    62    2"String.valueOf(num1[1]));
						step3txt25.setText(String.valueOf(num2[0]));
					}*/
					
					
				
					
					


			/*		int a=num1[0]*num2[1];
					int b=num1[1]*num2[0];
					int c=(a+b)/10;
					int d=(a+b)%10;*/

					
					//step3txt29.setText("And carry of step 2 (i.e."+String.valueOf(c)+") into above result---> ");


					//step3txt30.setText(String.valueOf(String.valueOf((num1[0]*num2[0]))+" + "+String.valueOf((c))+" = "+String.valueOf((num1[0]*num2[0])+(c)))+" (This is the result of step3 )");



					//step3txt31.setText("Now write results of step3, step2 and step1 respectively --->  "+String.valueOf((num1[0]*num2[0])+(c))+" "+String.valueOf(d)+" "+String.valueOf((num1[1]*num2[1])));


					//step3txt32.setText("So the Final Answer of "+String.valueOf(x)+" X "+String.valueOf(y)+" = "+String.valueOf((num1[0]*num2[0])+(c))+String.valueOf(d)+String.valueOf((num1[1]*num2[1])));


				





					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					ninetutoriallayout3.startAnimation(RightSwipe2);
					ninetutoriallayoutsteps1.setVisibility(View.GONE);
					ninetutoriallayoutsteps2.setVisibility(View.GONE);
					ninetutoriallayout3.setVisibility(View.VISIBLE);




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

