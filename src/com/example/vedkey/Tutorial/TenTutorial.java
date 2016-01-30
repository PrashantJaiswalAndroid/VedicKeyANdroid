package com.example.vedkey.Tutorial;

import java.util.Random;

import android.os.Bundle;
import android.renderscript.RenderScript.RSErrorHandler;
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

import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;
import com.example.vedkey.Tryityourself.NineTRyItyourself;
import com.example.vedkey.Tryityourself.TenTRyItyourself;

public class TenTutorial extends Fragment {





	TextView headetxt;
	




	View footer;
	Button previous,tryityourself,next;

	TextView tentutorialexampletxt;

	TextView tentutorialsteps1,tentutorialsteps2,tentutorialsteps3,tentutorialsteps4,tentutorialsteps5;

	View tentutoriallayoutsteps1,tentutoriallayoutsteps2,tentutoriallayoutsteps3,tentutoriallayoutsteps4,tentutoriallayoutsteps5;

	TextView txt102,txt103,txt104,txt105,txt106,txt107,txt110,txt111,txt112,txt113;

	TextView txt202,txt203,txt204,txt205,txt206,txt207,txt210,txt211,txt212,txt213,txt214,txt215,txt216;

	TextView txt302,txt303,txt304,txt305,txt306,txt307,txt310,txt311,txt312,txt313,txt314,txt315,txt316,txt317,txt318,txt319;
	
	TextView txt402,txt403,txt404,txt405,txt406,txt407,txt410,txt411,txt412,txt413,txt414,txt415,txt416;
	
	TextView txt502,txt503,txt504,txt505,txt506,txt507,txt510,txt511,txt512,txt513,txt514,txt515;

	Button tentutorialanotherexamplebtn;


	Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;
	public boolean step2pressed=false;
	public boolean step3pressed=false;
	public boolean step4pressed=false;

	int nu=0;
	

	int  x;
	int  y;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.tentutorial
				, container, false);

		getActivity().setTitle(NavigationActivity.header);

		Random r = new Random();
		x = r.nextInt(1000 - 100) + 100;
		y = r.nextInt(1000 - 100) + 100;

		

		tentutorialexampletxt=(TextView)rootView.findViewById(R.id.tentutorialexampletxt);

		tentutorialexampletxt.setText(x+" X "+y);



		tentutorialanotherexamplebtn=(Button)rootView.findViewById(R.id.tentutorialanotherexamplebtn);



		//	exampletxt.setText(x+" X "+y);


		tentutorialsteps1=(TextView)rootView.findViewById(R.id.tentutorialsteps1);
		tentutorialsteps2=(TextView)rootView.findViewById(R.id.tentutorialsteps2);
		tentutorialsteps3=(TextView)rootView.findViewById(R.id.tentutorialsteps3);
		tentutorialsteps4=(TextView)rootView.findViewById(R.id.tentutorialsteps4);
		tentutorialsteps5=(TextView)rootView.findViewById(R.id.tentutorialsteps5);
	


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
		txt110=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt110);
		txt111=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt111);
		txt112=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt112);
		txt113=(TextView)tentutoriallayoutsteps1.findViewById(R.id.txt113);
		

	
		txt202=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt202);
		txt203=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt203);
		txt204=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt204);
		txt205=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt205);
		txt206=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt206);
		txt207=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt207);
		txt210=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt210);
		txt211=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt211);
		txt212=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt212);
		txt213=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt213);
		txt214=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt214);
		txt215=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt215);
		txt216=(TextView)tentutoriallayoutsteps2.findViewById(R.id.txt216);

		
		
		txt302=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt302);
		txt303=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt303);
		txt304=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt304);
		txt305=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt305);
		txt306=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt306);
		txt307=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt307);
		txt310=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt310);
		txt311=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt311);
		txt312=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt312);
		txt313=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt313);
		txt314=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt314);
		txt315=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt315);
		txt316=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt316);
		txt317=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt317);
		txt318=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt318);
		txt319=(TextView)tentutoriallayoutsteps3.findViewById(R.id.txt319);

		
		txt402=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt402);
		txt403=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt403);
		txt404=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt404);
		txt405=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt405);
		txt406=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt406);
		txt407=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt407);
		txt410=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt410);
		txt411=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt411);
		txt412=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt412);
		txt413=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt413);
		txt414=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt414);
		txt415=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt415);
		txt416=(TextView)tentutoriallayoutsteps4.findViewById(R.id.txt416);
		
		
		txt502=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt502);
		txt503=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt503);
		txt504=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt504);
		txt505=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt505);
		txt506=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt506);
		txt507=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt507);
		txt510=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt510);
		txt511=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt511);
		txt512=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt512);
		txt513=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt513);
		txt514=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt514);
		txt515=(TextView)tentutoriallayoutsteps5.findViewById(R.id.txt515);
	
	




		tentutorialanotherexamplebtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			
				
				tentutoriallayoutsteps1.setVisibility(View.GONE);
				tentutoriallayoutsteps2.setVisibility(View.GONE);
				tentutoriallayoutsteps3.setVisibility(View.GONE);
				tentutoriallayoutsteps4.setVisibility(View.GONE);
				tentutoriallayoutsteps5.setVisibility(View.GONE);

				step1pressed=false;
				step2pressed=false;	
				step3pressed=false;
				step4pressed=false;
				Random r = new Random();
				x = r.nextInt(1000 - 100) + 100;
				y = r.nextInt(1000 - 100) + 100;

				tentutorialexampletxt.setText(x+" X "+y);
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

				fragment = new NineTutorial();
				if(fragment!=null)
				{
					/*NavigationActivity.header="Try it yourself";
						ft.replace(R.id.container, fragment);
						ft.commit();*/
					NavigationActivity.header="Tutorial";
					fragment = new NineTutorial();
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
					fragment = new TenTRyItyourself();
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

		







		SpannableString content = new SpannableString(tentutorialsteps1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, tentutorialsteps1.getText().toString().length(), 0);
		tentutorialsteps1.setText(content);
		tentutorialsteps1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			
				int a1=x/100,b1=(x/10)%10,c1=x%10;
				int a2=y/100,b2=(y/10)%10,c2=y%10;
				
				System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
				System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
				
				
				txt102.setText(String.valueOf(a1));
				txt103.setText(String.valueOf(b1));
				txt104.setText(String.valueOf(c1));
				txt105.setText(String.valueOf(a2));
				txt106.setText(String.valueOf(b2));
				txt107.setText(String.valueOf(c2));
				txt110.setText("Last digit of the first number----> "+String.valueOf(c1));
				txt111.setText("Last digit of the Second number----> "+String.valueOf(c2));
				txt112.setText("So "+c1+" X "+c2+"="+(c1*c2));
				txt113.setText("Here "+((c1*c2)%10)+" is the result if step1 and we will carry "+((c1*c2)/10)+" for the next step");



				step1pressed=true;

				RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
				tentutoriallayoutsteps1.startAnimation(RightSwipe1);
				tentutoriallayoutsteps1.setVisibility(View.VISIBLE);
				tentutoriallayoutsteps2.setVisibility(View.GONE);
				tentutoriallayoutsteps3.setVisibility(View.GONE);
				tentutoriallayoutsteps4.setVisibility(View.GONE);
				tentutoriallayoutsteps5.setVisibility(View.GONE);



				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);

			}
		});


		SpannableString content2 = new SpannableString(tentutorialsteps2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, tentutorialsteps2.getText().toString().length(), 0);
		tentutorialsteps2.setText(content2);
		tentutorialsteps2.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step1pressed)
				{
					
					int a1=x/100,b1=(x/10)%10,c1=x%10;
					int a2=y/100,b2=(y/10)%10,c2=y%10;
					
					System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
					System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
					
	
					txt202.setText(String.valueOf(a1));
					txt203.setText(String.valueOf(b1));
					txt204.setText(String.valueOf(c1));
					txt205.setText(String.valueOf(a2));
					txt206.setText(String.valueOf(b2));
					txt207.setText(String.valueOf(c2));
					txt210.setText("Last 2 digit of the first number---->"+String.valueOf(b1)+" and "+String.valueOf(c1));
					txt211.setText("Last 2 digit of the Second number---->"+String.valueOf(b2)+" and "+String.valueOf(c2));
					txt212.setText("So "+b1+" X "+c2+"="+(b1*c2));
					txt213.setText("and "+b2+" X "+c1+"="+(b2*c1));
					txt214.setText("Then "+(b1*c2)+" + "+(b2*c1)+"= "+((b1*c2)+(b2*c1)));
					int result=(b1*c2)+(b2*c1)+((c1*c2)/10);
					txt215.setText(String.valueOf((((b1*c2)+(b2*c1)))+"+"+((c1*c2)/10)+"(Carry of step1)= "+result));
					txt216.setText("Here "+result%10+" is the result of step2 and we will carry "+result/10+" for the next step");





				

					step2pressed=true;				
					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					tentutoriallayoutsteps2.startAnimation(RightSwipe2);
					tentutoriallayoutsteps2.setVisibility(View.VISIBLE);
					tentutoriallayoutsteps1.setVisibility(View.GONE);
					tentutoriallayoutsteps3.setVisibility(View.GONE);
					tentutoriallayoutsteps4.setVisibility(View.GONE);
					tentutoriallayoutsteps5.setVisibility(View.GONE);
					




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step1pressed=false;
				}




			}
		});



		SpannableString content3 = new SpannableString(tentutorialsteps3.getText().toString());
		content3.setSpan(new UnderlineSpan(), 0, tentutorialsteps3.getText().toString().length(), 0);
		tentutorialsteps3.setText(content3);
		tentutorialsteps3.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step2pressed)
				{
					
					int a1=x/100,b1=(x/10)%10,c1=x%10;
					int a2=y/100,b2=(y/10)%10,c2=y%10;
					
					System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
					System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
					
					
					txt302.setText(String.valueOf(a1));
					txt303.setText(String.valueOf(b1));
					txt304.setText(String.valueOf(c1));
					txt305.setText(String.valueOf(a2));
					txt306.setText(String.valueOf(b2));
					txt307.setText(String.valueOf(c2));
					txt310.setText("First and third digit of first number is--->"+a1+" and "+c1);
					txt311.setText("First and third digit of Second number is--->"+a2+" and "+c2);
					txt312.setText("So "+a1+" X "+c2+"="+(a1*c2));
					txt313.setText("and "+c1+" X "+a2+"="+(c1*a2));
					txt314.setText("Second digit of first number--->"+b1);
					txt315.setText("Second digit of second number--->"+b2);
					txt316.setText("So "+b1+" X "+b2+"="+(b1*b2));
					int result=(a1*c2)+(c1*a2)+(b1*b2);
					int result2=(b1*c2)+(b2*c1)+((c1*c2)/10);
					txt317.setText("Then add all above result "+(a1*c2)+"+"+(c1*a2)+"+"+(b1*b2)+"="+result);
					int finalresult=result+(result2/10);
					txt318.setText(result+"+"+result2/10+"(Carry of step2)="+finalresult);
					txt319.setText("Here "+finalresult%10+" is the result of step3 and we will carry "+finalresult/10+" for next step");

					
					
					
	
				




				

					step3pressed=true;				
					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					tentutoriallayoutsteps3.startAnimation(RightSwipe2);
					tentutoriallayoutsteps3.setVisibility(View.VISIBLE);
					tentutoriallayoutsteps1.setVisibility(View.GONE);
					tentutoriallayoutsteps2.setVisibility(View.GONE);
					tentutoriallayoutsteps4.setVisibility(View.GONE);
					tentutoriallayoutsteps5.setVisibility(View.GONE);
					




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step1pressed=false;
					step2pressed=false;
				}

			}
		});
		
		
		SpannableString content4 = new SpannableString(tentutorialsteps4.getText().toString());
		content4.setSpan(new UnderlineSpan(), 0, tentutorialsteps4.getText().toString().length(), 0);
		tentutorialsteps4.setText(content4);
		tentutorialsteps4.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step3pressed)
				{
					
					int a1=x/100,b1=(x/10)%10,c1=x%10;
					int a2=y/100,b2=(y/10)%10,c2=y%10;
					
					System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
					System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
					
					
					
					txt402.setText(String.valueOf(a1));
					txt403.setText(String.valueOf(b1));
					txt404.setText(String.valueOf(c1));
					txt405.setText(String.valueOf(a2));
					txt406.setText(String.valueOf(b2));
					txt407.setText(String.valueOf(c2));
					txt410.setText("First 2 digit of the first number---->"+a1+" and "+b1);
					txt411.setText("First 2 digit of the Second number---->"+a2+" and "+b2);
					txt412.setText("So "+a1+" X "+b2+"="+(a1*b2));
					txt413.setText("and "+b1+" X "+a2+"="+(b1*a2));
					int result1=(a1*b2)+(b1*a2);
					txt414.setText("Then "+(a1*b2)+" + "+(b1*a2)+"="+result1);
					
					int result2=(a1*c2)+(c1*a2)+(b1*b2);
					int result3=(b1*c2)+(b2*c1)+((c1*c2)/10);
					
					int result4=result2+(result3/10);
					int finalresult=result1+(result4/10);
					txt415.setText(result1+"+"+(result4/10)+"(Carry of step3)="+finalresult);
					txt416.setText("Here "+finalresult%10+" is the result of step4 and we will carry "+finalresult/10+" for the next step");
					
					
					
				

					
					
					
	
				




				

					step4pressed=true;				
					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					tentutoriallayoutsteps4.startAnimation(RightSwipe2);
					tentutoriallayoutsteps4.setVisibility(View.VISIBLE);
					tentutoriallayoutsteps1.setVisibility(View.GONE);
					tentutoriallayoutsteps2.setVisibility(View.GONE);
					tentutoriallayoutsteps3.setVisibility(View.GONE);
					tentutoriallayoutsteps5.setVisibility(View.GONE);
					




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step1pressed=false;
					step2pressed=false;
					step3pressed=false;
				}

			}
		});
		
		
		
		SpannableString content5 = new SpannableString(tentutorialsteps5.getText().toString());
		content5.setSpan(new UnderlineSpan(), 0, tentutorialsteps5.getText().toString().length(), 0);
		tentutorialsteps5.setText(content5);
		tentutorialsteps5.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step4pressed)
				{
					
					int a1=x/100,b1=(x/10)%10,c1=x%10;
					int a2=y/100,b2=(y/10)%10,c2=y%10;
					
					System.out.println("a1: "+a1+"b1: "+b1+"c1: "+c1);
					System.out.println("a2: "+a2+"b2: "+b2+"c2: "+c2);
					
					
					
					
					
					txt502.setText(String.valueOf(a1));
					txt503.setText(String.valueOf(b1));
					txt504.setText(String.valueOf(c1));
					txt505.setText(String.valueOf(a2));
					txt506.setText(String.valueOf(b2));
					txt507.setText(String.valueOf(c2));
					txt510.setText("First digit of the first number---->"+a1);
					txt511.setText("First digit of the Second number---->"+a2);
					txt512.setText("So "+a1+" X "+a2+"="+(a1*a2));
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
					txt513.setText(result1+"+"+finalresult/10+"(Carry of step4)="+result6);
					
					String resultfinal=result6+""+step4result+""+step3result+""+step2result+""+step1result;
					txt514.setText("Then Write results of step5,step4,step3,step2 and ste1 respectively---->"+resultfinal);
					txt515.setText("So the final answer of "+x+" X "+y+"="+resultfinal);
				
					
					
					
					
					
					
					
					
				

					
					
					
	
				




				

							
					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					tentutoriallayoutsteps5.startAnimation(RightSwipe2);
					tentutoriallayoutsteps5.setVisibility(View.VISIBLE);
					tentutoriallayoutsteps1.setVisibility(View.GONE);
					tentutoriallayoutsteps2.setVisibility(View.GONE);
					tentutoriallayoutsteps3.setVisibility(View.GONE);
					tentutoriallayoutsteps4.setVisibility(View.GONE);
					




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step1pressed=false;
					step2pressed=false;
					step3pressed=false;
					step4pressed=false;
				}

			}
		});


		



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

