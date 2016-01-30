package com.example.vedkey.Tutorial;

import java.util.Random;

import android.os.Bundle;
import android.os.TransactionTooLargeException;
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
import android.widget.Toast;

import com.example.vedkey.ListFragment;
import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;
import com.example.vedkey.Tryityourself.FifthTRyItyourself;

public class SevenTutorial extends Fragment {





	TextView headetxt;
	TextView step1,step2;




	View footer;
	Button previous,tryityourself,next;

	TextView seventhtutorialexampletxt;

	TextView seventhtutorialsteps1,seventhtutorialsteps2,seventhtutorialsteps3;

	View seventhtutoriallayoutsteps1,seventhtutoriallayoutsteps2,seventhtutoriallayout3;

	TextView step1txt1,step1txt2,step1txt3,step1txt4,step1txt5,step1txt6,step1txt7;

	TextView step2txt11,step2txt12,step2txt13,step2txt14,step2txt15,step2txt16,step2txt17,step2txt18;

	TextView step3txt22,step3txt23,step3txt24,step3txt25,step3txt26,step3txt27,step3txt28;


	Button seventhtutorialanotherexamplebtn;


	Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;
	public boolean step2pressed=false;

	int nu=0;
	int [] num1=new int[2];
	int [] num2=new int[2];

	static int x=0;
	static int y=0;
	static int sp=0;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.seventhtutorial
				, container, false);

		getActivity().setTitle(NavigationActivity.header);

		num1=RandomGrn();
		checkNum(num1[0],num1[1]);
		

		num2=RandomGrn();
		checkNum(num2[0],num2[1]);
		


		seventhtutorialexampletxt=(TextView)rootView.findViewById(R.id.seventhtutorialexampletxt);

		seventhtutorialexampletxt.setText(x+" X "+y);



		seventhtutorialanotherexamplebtn=(Button)rootView.findViewById(R.id.seventhtutorialanotherexamplebtn);



		//	exampletxt.setText(x+" X "+y);


		seventhtutorialsteps1=(TextView)rootView.findViewById(R.id.seventhtutorialsteps1);
		seventhtutorialsteps2=(TextView)rootView.findViewById(R.id.seventhtutorialsteps2);
		seventhtutorialsteps3=(TextView)rootView.findViewById(R.id.seventhtutorialsteps3);


		seventhtutoriallayoutsteps1=(View)rootView.findViewById(R.id.seventhtutoriallayoutsteps1);
		seventhtutoriallayoutsteps2=(View)rootView.findViewById(R.id.seventhtutoriallayoutsteps2);
		seventhtutoriallayout3=(View)rootView.findViewById(R.id.seventhtutoriallayoutsteps3);


		step1txt1=(TextView)seventhtutoriallayoutsteps1.findViewById(R.id.txt1);
		step1txt2=(TextView)seventhtutoriallayoutsteps1.findViewById(R.id.txt2);
		step1txt3=(TextView)seventhtutoriallayoutsteps1.findViewById(R.id.txt3);
		step1txt4=(TextView)seventhtutoriallayoutsteps1.findViewById(R.id.txt4);
		step1txt5=(TextView)seventhtutoriallayoutsteps1.findViewById(R.id.txt5);
		step1txt6=(TextView)seventhtutoriallayoutsteps1.findViewById(R.id.txt6);
		step1txt7=(TextView)seventhtutoriallayoutsteps1.findViewById(R.id.txt7);



		step2txt11=(TextView)seventhtutoriallayoutsteps2.findViewById(R.id.txt11);
		step2txt12=(TextView)seventhtutoriallayoutsteps2.findViewById(R.id.txt12);
		step2txt13=(TextView)seventhtutoriallayoutsteps2.findViewById(R.id.txt13);
		step2txt14=(TextView)seventhtutoriallayoutsteps2.findViewById(R.id.txt14);
		step2txt15=(TextView)seventhtutoriallayoutsteps2.findViewById(R.id.txt15);
		step2txt16=(TextView)seventhtutoriallayoutsteps2.findViewById(R.id.txt16);
		step2txt17=(TextView)seventhtutoriallayoutsteps2.findViewById(R.id.txt17);
		step2txt18=(TextView)seventhtutoriallayoutsteps2.findViewById(R.id.txt18);




		step3txt22=(TextView)seventhtutoriallayout3.findViewById(R.id.txt22);
		step3txt23=(TextView)seventhtutoriallayout3.findViewById(R.id.txt23);
		step3txt24=(TextView)seventhtutoriallayout3.findViewById(R.id.txt24);
		step3txt25=(TextView)seventhtutoriallayout3.findViewById(R.id.txt25);
		step3txt26=(TextView)seventhtutoriallayout3.findViewById(R.id.txt26);
		step3txt27=(TextView)seventhtutoriallayout3.findViewById(R.id.txt27);
		step3txt28=(TextView)seventhtutoriallayout3.findViewById(R.id.txt28);



		seventhtutorialanotherexamplebtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				seventhtutoriallayoutsteps1.setVisibility(View.GONE);
				seventhtutoriallayoutsteps2.setVisibility(View.GONE);
				seventhtutoriallayout3.setVisibility(View.GONE);

				
				
				
					num1=RandomGrn();
					checkNum(num1[0],num1[1]);
					seventhtutorialexampletxt.setText(x+" X "+y);

					num2=RandomGrn();
					checkNum(num2[0],num2[1]);
					
					seventhtutorialexampletxt.setText(x+" X "+y);
				
				
				
			
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
					fragment = new SixthTutorial();
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
				/*FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();

				fragment = new ListFragment();
				if(fragment!=null)
				{

					NavigationActivity.header="Try it yourself";
					fragment = new SevenTutorial();
					if(fragment!=null)
					{
						ft.replace(R.id.container, fragment);
						ft.commit();
					}
				}*/


			}
		});

		next.setOnClickListener(new View.OnClickListener() {

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
					fragment = new FirstTutorial();
					if(fragment!=null)
					{
						ft.replace(R.id.container, fragment);
						ft.commit();
					}
				}
			}
		});

		step2=(TextView)rootView.findViewById(R.id.seventhtutorialsteps2);







		SpannableString content = new SpannableString(seventhtutorialsteps1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, seventhtutorialsteps1.getText().toString().length(), 0);
		seventhtutorialsteps1.setText(content);
		seventhtutorialsteps1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				step1txt2.setText(String.valueOf("First digit of both numbers is "+String.valueOf(num1[0])));
				step1txt3.setText(String.valueOf("So multiply "+String.valueOf(num1[0]))+" X "+String.valueOf((num1[0]+1))+" (One more)"+" = "+String.valueOf("0"+(num1[0]*(num1[0]+1))));
			
				step1txt5.setText(String.valueOf(num1[1])+" X "+String.valueOf(num2[1])+"= "+String.valueOf((num1[1])*num2[1]));
				step1txt6.setText("Combine both results--->"+String.valueOf((num1[0]*(num1[0]+1)))+""+String.valueOf((num1[1]*num2[1])));

		int z=Integer.valueOf(String.valueOf((num1[0]*(num1[0]+1)))+""+String.valueOf((num1[1]*num2[1])))/10;
		int c=Integer.valueOf(String.valueOf((num1[0]*(num1[0]+1)))+""+String.valueOf((num1[1]*num2[1])))%10;
		
				step1txt7.setText("Separate last digit of above result--->"+z+"   "+c);//step1txt8.setText("Result of step 1 is-----> "+String.valueOf((num1[1]*num2[1])));








				step1pressed=true;

				RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
				seventhtutoriallayoutsteps1.startAnimation(RightSwipe1);
				seventhtutoriallayoutsteps1.setVisibility(View.VISIBLE);
				seventhtutoriallayoutsteps2.setVisibility(View.GONE);
				seventhtutoriallayout3.setVisibility(View.GONE);



				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);

			}
		});


		SpannableString content2 = new SpannableString(seventhtutorialsteps2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, seventhtutorialsteps2.getText().toString().length(), 0);
		seventhtutorialsteps2.setText(content2);
		seventhtutorialsteps2.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step1pressed)
				{
					
					step2txt13.setText(String.valueOf(num1[1])+" + "+String.valueOf(num2[1])+"="+String.valueOf((num1[1]+num2[1])));
					
					int n=num1[1]+num2[1];
					step2txt15.setText(String.valueOf(n)+" - "+10+" = "+String.valueOf(n-10));

					step2txt16.setText("Multiply firts digit ("+(num1[0])+") into this difference and get step2 result--->");
					
					step2txt17.setText(String.valueOf(num1[0])+" X "+String.valueOf(n-10)+"="+String.valueOf((num1[0]*(n-10))));
					step2txt18.setText("Here "+String.valueOf((num1[0]*(n-10))+"is the result of step2"));


				

					/*int a=num1[0]*num2[1];
					int b=num1[1]*num2[0];
					int c=(a+b)/10;
					int d=(a+b)%10;*/

					



					step2pressed=true;				
					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					seventhtutoriallayoutsteps2.startAnimation(RightSwipe2);
					seventhtutoriallayoutsteps1.setVisibility(View.GONE);
					seventhtutoriallayout3.setVisibility(View.GONE);
					seventhtutoriallayoutsteps2.setVisibility(View.VISIBLE);




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step1pressed=false;
				}




			}
		});



		SpannableString content3 = new SpannableString(seventhtutorialsteps3.getText().toString());
		content3.setSpan(new UnderlineSpan(), 0, seventhtutorialsteps3.getText().toString().length(), 0);
		seventhtutorialsteps3.setText(content3);
		seventhtutorialsteps3.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(step2pressed)
				{
					
					int n=num1[1]+num2[1];
					int z=Integer.valueOf(String.valueOf((num1[0]*(num1[0]+1)))+""+String.valueOf((num1[1]*num2[1])))/10;
					int c=Integer.valueOf(String.valueOf((num1[0]*(num1[0]+1)))+""+String.valueOf((num1[1]*num2[1])))%10;
					step3txt23.setText("Result of step 1 is---> "+z+"   "+c);
					step3txt24.setText("Result of stpe 2 is---> "+String.valueOf((num1[0]*(n-10))));
				
					step3txt26.setText(String.valueOf(z)+" X "+" ("+num1[0]*(n-10)+")"+"="+String.valueOf((z+(num1[0]*(n-10)))));
					step3txt27.setText("write above result with Separated digit of step 1 result---> "+String.valueOf((z+(num1[0]*(n-10))))+"    "+c);

					/*int a=num1[0]*num2[1];
					int b=num1[1]*num2[0];
					int c=(a+b)/10;
					int d=(a+b)%10;*/

					step3txt28.setText("So final answer of "+x+"X"+y+"="+String.valueOf((z+(num1[0]*(n-10))))+""+c);
					

					RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
					seventhtutoriallayout3.startAnimation(RightSwipe2);
					seventhtutoriallayoutsteps1.setVisibility(View.GONE);
					seventhtutoriallayoutsteps1.setVisibility(View.GONE);
					seventhtutoriallayout3.setVisibility(View.VISIBLE);




					getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
					step2pressed=false;
				}




			}
		});


		

		return rootView;
	}

	private static int[] RandomGrn() {
		int [] num=new int[2];
		Random r =new Random();
		num[0]=(r.nextInt(9-1)+1)*10;
		num[1]=(r.nextInt(9-1)+1);
		return num;

	}
	
private static void checkNum(int i, int j) {
		
		int [] z=new int[2];
		z=RandomGrn();
		if(z[0]==i){
			if((z[1]+j)==10){
				x=(z[0]+z[1]);
				String s=String.valueOf(z[0]);
				String s1[]=s.split("0");
				sp=Integer.valueOf(s1[0]);
				y=(i+j);
				//System.out.print("first matach"+(y[0]+y[1])+","+(i+j));	
			}else{
				checkNum(i,j);
			}
			
		}else{
			checkNum(i,j);
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
