package com.example.eventtransfertext;

import android.app.Activity;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mybutton mybutton=(mybutton)findViewById(R.id.myBth);
		mybutton.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v,MotionEvent event){
				System.out.println("�������еĴ����¼������ˣ�");
				return false;
			}
		});
	}
	public boolean onTouchEvent(MotionEvent event){
		System.out.println("MainActivity�еĴ����¼������ˣ�");
		return false;
	}
}

	