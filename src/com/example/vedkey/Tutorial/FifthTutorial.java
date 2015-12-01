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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vedkey.ListFragment;
import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;
import com.example.vedkey.SharedPref;

public class FifthTutorial extends Fragment {


	ImageView settingicon;

	View HeaderView;
	SharedPref  pref;
	TextView headetxt;
	TextView step1,step2;

	View layoutone,layout2;

	Button anotherexamplebtn,step1nextstepbtn;
	View footer;
	Button previous,tryityourself,next;

	TextView multitutorialtxt,optiontxt,exampletxt,stepstxt,descriptontxt,steptxt1,steptxt2;
	int x=0;
	int y=0;
	int sub=100;

int nu=0;


	TextView layoutonetxt2,layoutonetxt3,layoutonetxt4;
	TextView layout2number1,layout2number2,layout2number3;
	//TextView layout3number1,layout3number2,layout3number3,layout3number4,layout3number5,layout3number6,layout3number7,layout3number8,layout3txtfinalresult;

    Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fifthutorial, container, false);

		getActivity().setTitle(NavigationActivity.header);
		
		Random r = new Random();
		x = r.nextInt(100 - 10) + 10;
		y = 11;
		
		
		
		anotherexamplebtn=(Button)rootView.findViewById(R.id.fifthtutorialanotherexamplebtn);

	
		exampletxt=(TextView)rootView.findViewById(R.id.fifthtutorialexampletxt);

		exampletxt.setText(x+" X "+y);

		layoutonetxt2=(TextView)rootView.findViewById(R.id.txt2);
		layoutonetxt3=(TextView)rootView.findViewById(R.id.txt3);
		layoutonetxt4=(TextView)rootView.findViewById(R.id.txt4);
		
		layout2number1=(TextView)rootView.findViewById(R.id.number1);
		layout2number2=(TextView)rootView.findViewById(R.id.number2);
		layout2number3=(TextView)rootView.findViewById(R.id.number3);
		



		layoutone=(View)rootView.findViewById(R.id.fifthtutoriallayoutsteps1);
		layout2=(View)rootView.findViewById(R.id.fifthtutoriallayoutsteps2);
		
		anotherexamplebtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				layoutone.setVisibility(View.GONE);
				layout2.setVisibility(View.GONE);
				
				Random r = new Random();
				x = r.nextInt(100 - 10) + 10;
				y = 11;
				exampletxt.setText(x+" X "+y);
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
		        		fragment = new FourtTutorial();
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
	/*			FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
		       
		        	fragment = new ListFragment();
		        	if(fragment!=null)
					{
		        		NavigationActivity.header="Try it yourself";
						ft.replace(R.id.container, fragment);
						ft.commit();
		        		NavigationActivity.header="Try it yourself";
		        		fragment = new OptionThirdtryyourself();
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
		       
		        	fragment = new ListFragment();
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
	


		
		
		step1=(TextView)rootView.findViewById(R.id.fifthtutorialsteps1);

		SpannableString content = new SpannableString(step1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, step1.getText().toString().length(), 0);
		step1.setText(content);
		step1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				int quot=x/10;
				int rem=x%10;

				layoutonetxt2.setText("i.e   "+ quot +" + "+rem+" = "+(quot+rem));
				int m=quot+rem;
				if(String.valueOf(m).length()>1)
				{
					
					layoutonetxt3.setText("Here "+m%10+"  is the result of step 1");
					layoutonetxt4.setText("And we will carry "+ m/10+" for next step");
				}
				else
				{
					layoutonetxt3.setText("Here "+m%10+" is the result of step 1");
					layoutonetxt4.setVisibility(View.GONE);
				}
				
				
				
				
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
				layoutone.startAnimation(RightSwipe1);
				layoutone.setVisibility(View.VISIBLE);
				layout2.setVisibility(View.GONE);
				

				
				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);

			}
		});


		SpannableString content2 = new SpannableString(step2.getText().toString());
		content2.setSpan(new UnderlineSpan(), 0, step2.getText().toString().length(), 0);
		step2.setText(content2);
		step2.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe2;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			if(step1pressed)
			{
				int quot=x/10;
				int rem=x%10;
				
				int m=quot+rem;
				if(String.valueOf(m).length()>1)
				{
					layout2number1.setText("Here we have "+m/10+" carry");

					layout2number2.setText("  i.e.  "+quot+"  +|"+m/10+"  |"+m%10+"   "+rem);
					layout2number3.setText("So, the final answer is    "+(quot+m/10)+""+m%10+""+rem);
				}
				else
				{
					layout2number1.setText("  i.e.  "+"| "+quot+"  |"+m+"   "+rem);
					layout2number2.setText("So, the final answer is    "+quot+""+m+""+rem);
					layout2number3.setVisibility(View.GONE);
				}
				
				

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
				layout2.startAnimation(RightSwipe2);
				layoutone.setVisibility(View.GONE);
				layout2.setVisibility(View.VISIBLE);
				
				

				
				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
				step1pressed=false;
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
