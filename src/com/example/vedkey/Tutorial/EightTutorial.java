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
import com.example.vedkey.Tryityourself.EightTRyItyourself;
import com.example.vedkey.Tryityourself.FifthTRyItyourself;

public class EightTutorial extends Fragment {


	

	
	TextView headetxt;
	TextView step1,step2;

	


	View footer;
	Button previous,tryityourself,next;

TextView eightthtutorialexampletxt;

TextView eightthtutorialsteps1,eightthtutorialsteps2;

View eightthtutoriallayoutsteps1,eightthtutoriallayoutsteps2;

TextView step1txt1,step1txt2,step1txt3,step1txt4,step1txt5,step1txt6,step1txt7,step1txt8,step1txt9;

TextView step2txt11,step2txt12,step2txt13,step2txt14,step2txt15,step2txt16,step2txt17,step2txt18;


	

Button eightthtutorialanotherexamplebtn;
	

    Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;
	public boolean step2pressed=false;
	
	int nu=0;

	
	int  x;
	int  y;
	int i=0;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.eightthtutorial, container, false);

		getActivity().setTitle(NavigationActivity.header);
		
		
		
		Random r = new Random();
		
		if(i==0)
		{
			x = r.nextInt(100 - 10) + 10;
			y = 99;
			i++;
		}
		
		
		
	
		

		eightthtutorialexampletxt=(TextView)rootView.findViewById(R.id.eightthtutorialexampletxt);
	
		eightthtutorialexampletxt.setText(x+" X "+y);
		
			
		
		eightthtutorialanotherexamplebtn=(Button)rootView.findViewById(R.id.eightthtutorialanotherexamplebtn);

	

	//	exampletxt.setText(x+" X "+y);

		
		eightthtutorialsteps1=(TextView)rootView.findViewById(R.id.eightthtutorialsteps1);
		eightthtutorialsteps2=(TextView)rootView.findViewById(R.id.eightthtutorialsteps2);
		
		
		
		eightthtutoriallayoutsteps1=(View)rootView.findViewById(R.id.eightthtutoriallayoutsteps1);
		eightthtutoriallayoutsteps2=(View)rootView.findViewById(R.id.eightthtutoriallayoutsteps2);
		


		step1txt1=(TextView)rootView.findViewById(R.id.txt1);
		step1txt2=(TextView)rootView.findViewById(R.id.txt2);
		step1txt3=(TextView)rootView.findViewById(R.id.txt3);
		step1txt4=(TextView)rootView.findViewById(R.id.txt4);
		step1txt5=(TextView)rootView.findViewById(R.id.txt5);
		step1txt6=(TextView)rootView.findViewById(R.id.txt6);
		step1txt7=(TextView)rootView.findViewById(R.id.txt7);
		step1txt8=(TextView)rootView.findViewById(R.id.txt8);
		step1txt9=(TextView)rootView.findViewById(R.id.txt9);
		
		

		step2txt11=(TextView)rootView.findViewById(R.id.txt11);
		step2txt12=(TextView)rootView.findViewById(R.id.txt12);
		step2txt13=(TextView)rootView.findViewById(R.id.txt13);
		step2txt14=(TextView)rootView.findViewById(R.id.txt14);
		step2txt15=(TextView)rootView.findViewById(R.id.txt15);
		step2txt16=(TextView)rootView.findViewById(R.id.txt16);
		step2txt17=(TextView)rootView.findViewById(R.id.txt17);
		step2txt18=(TextView)rootView.findViewById(R.id.txt18);
		
		
		
		
		
		
		eightthtutorialanotherexamplebtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				eightthtutoriallayoutsteps1.setVisibility(View.GONE);
				eightthtutoriallayoutsteps2.setVisibility(View.GONE);
				
				step1pressed=false;
				Random r = new Random();
				
				if(i==0)
				{
					x = r.nextInt(100 - 10) + 10;
					y = 99;
					i++;
				}
				else if(i==1)
				{
					x = r.nextInt(1000 - 100) + 100;
					y = 999;
					i++;
				}
				else if(i==2)
				{
					x = r.nextInt(10000 - 1000) + 1000;
					y = 9999;
					i=0;
				}
				
				eightthtutorialexampletxt.setText(x+" X "+y);
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


		tryityourself.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
		       
		        	fragment = new EightTRyItyourself();
		        	if(fragment!=null)
					{
		        		
		        		NavigationActivity.header="Try it yourself";
		        		fragment = new EightTRyItyourself();
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

		step2=(TextView)rootView.findViewById(R.id.fifthtutorialsteps2);
	


		
		
	

		SpannableString content = new SpannableString(eightthtutorialsteps1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, eightthtutorialsteps1.getText().toString().length(), 0);
		eightthtutorialsteps1.setText(content);
		eightthtutorialsteps1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			
				step1txt3.setText(String.valueOf(y)+"+"+String.valueOf(1)+"="+String.valueOf(y+1));
				step1txt5.setText("i.e.   "+String.valueOf(x));
				step1txt6.setText("X "+String.valueOf(y+1));
				step1txt8.setText(String.valueOf(x*100));
				step1txt9.setText("Here "+String.valueOf(x*100)+" is the result of step1");
				
				step1pressed=true;
				
				RightSwipe1 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
				eightthtutoriallayoutsteps1.startAnimation(RightSwipe1);
				eightthtutoriallayoutsteps1.setVisibility(View.VISIBLE);
				eightthtutoriallayoutsteps2.setVisibility(View.GONE);
			
				

				
				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);

			}
		});


		SpannableString content2 = new SpannableString(eightthtutorialsteps2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, eightthtutorialsteps2.getText().toString().length(), 0);
		eightthtutorialsteps2.setText(content2);
		eightthtutorialsteps2.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			if(step1pressed)
			{
				step2txt12.setText("Result of step 1 is----> "+String.valueOf(x*100));
				step2txt13.setText("First Number is-----> "+String.valueOf(x) );
				step2txt14.setText(String.valueOf("So    "+String.valueOf(x*100)));
				step2txt15.setText(String.valueOf("     -"+String.valueOf(x)));
				
				
				int s=x*100;
				int a=s-x;
				step2txt17.setText(String.valueOf((x*100)-x));
				step2txt18.setText("So the Final Answer of ---> "+x +" X "+y+"="+String.valueOf(a));
				
				
			
				
				
				
				

				


				step2pressed=true;				
				RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
				eightthtutoriallayoutsteps2.startAnimation(RightSwipe2);
				eightthtutoriallayoutsteps1.setVisibility(View.GONE);
				//seventhtutoriallayout3.setVisibility(View.GONE);
				eightthtutoriallayoutsteps2.setVisibility(View.VISIBLE);
				
				

				
				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
				step1pressed=false;
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
