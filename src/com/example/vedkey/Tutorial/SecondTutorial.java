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
import com.example.vedkey.Tryityourself.SecondTryityourself;
import com.example.vedkey.Tryityourself.ThirdTryityourself;

public class SecondTutorial extends Fragment {


	TextView step1,step2;

	View layoutone,layout2;

	Button anotherexamplebtn,step1nextstepbtn;
	View footer;
	Button previous,tryityourself,next;

	TextView multitutorialtxt,optiontxt,exampletxt,stepstxt,descriptontxt,steptxt1,steptxt2;
	static int x=0;
	static int y=0;
	int sub=100;

	int nu=0;
	int [] num=new int[2];

	TextView layoutonetxt2,layoutonetxt3;
	TextView layout2number1,layout2number2,layout2number3,layout2number4;
	//TextView layout3number1,layout3number2,layout3number3,layout3number4,layout3number5,layout3number6,layout3number7,layout3number8,layout3txtfinalresult;

    Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public boolean step1pressed=false;
	static int sp=0;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.secondtutorial, container, false);

		getActivity().setTitle(NavigationActivity.header);
		
	
		Random r = new Random();
		x = r.nextInt(100 - 10) + 10;
		y = 9;
		
		
		
		
		
		anotherexamplebtn=(Button)rootView.findViewById(R.id.secondtutorialanotherexamplebtn);

	
		exampletxt=(TextView)rootView.findViewById(R.id.secondtutorialexampletxt);

		exampletxt.setText(x+" X "+y);

		layoutonetxt2=(TextView)rootView.findViewById(R.id.txt2);
		layoutonetxt3=(TextView)rootView.findViewById(R.id.txt3);

		layout2number1=(TextView)rootView.findViewById(R.id.number1);
		layout2number2=(TextView)rootView.findViewById(R.id.number2);
		layout2number3=(TextView)rootView.findViewById(R.id.number3);
		layout2number4=(TextView)rootView.findViewById(R.id.number4);
		

		



		layoutone=(View)rootView.findViewById(R.id.secondtutoriallayoutsteps1);
		layout2=(View)rootView.findViewById(R.id.secondtutoriallayoutsteps2);
		
		anotherexamplebtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				layoutone.setVisibility(View.GONE);
				layout2.setVisibility(View.GONE);
				
	
				Random r = new Random();
				x = r.nextInt(100 - 10) + 10;
				y = 9;
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
		        		fragment = new FirstTutorial();
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
		        		/*NavigationActivity.header="Try it yourself";
						ft.replace(R.id.container, fragment);
						ft.commit();*/
		        		NavigationActivity.header="Try it yourself";
		        		fragment = new ThirdTutorial();
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
		       
		        	fragment = new ListFragment();
		        	if(fragment!=null)
					{
		        		/*NavigationActivity.header="Try it yourself";
						ft.replace(R.id.container, fragment);
						ft.commit();*/
		        		NavigationActivity.header="Tutorial";
		        		fragment = new ThirdTutorial();
						if(fragment!=null)
						{
							ft.replace(R.id.container, fragment);
							ft.commit();
						}
					}
			}
		});

		step2=(TextView)rootView.findViewById(R.id.secondtutorialsteps2);
	


		
		
		step1=(TextView)rootView.findViewById(R.id.secondtutorialsteps1);

		SpannableString content = new SpannableString(step1.getText().toString());
		content.setSpan(new UnderlineSpan(), 0, step1.getText().toString().length(), 0);
		step1.setText(content);
		step1.setOnClickListener(new View.OnClickListener() {

			private Animation RightSwipe1;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			
				//layoutonetxt2.setText("Simply add a 0 (zero) with the number");
				layoutonetxt2.setText("i.e.    "+(x*10));
				
				
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
				
				layout2number1.setText("i.e.    "+(x*10));
				layout2number2.setText("    -"+x);
				layout2number3.setText(String.valueOf((x*10)-x));
				layout2number4.setText("So, the final answer is "+String.valueOf((x*10)-x));
				


				
				RightSwipe2 = AnimationUtils.loadAnimation(getActivity(), R.anim.leftside);
				layout2.startAnimation(RightSwipe2);
				layoutone.setVisibility(View.GONE);
				layout2.setVisibility(View.VISIBLE);
				
				

				
				getActivity().overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
				step1pressed=false;
			}
			
				
				

			}
		});

		
/*		step3.setOnClickListener(new View.OnClickListener() {

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
					layout3number2.setTe10xt("-"+String.valueOf(sub-x));
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

	private static int[] RandomGrn() {
		int [] num=new int[2];
		Random r =new Random();
		num[0]=(r.nextInt(9-1)+1)*10;
		num[1]=(r.nextInt(9-1)+1);
		
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
