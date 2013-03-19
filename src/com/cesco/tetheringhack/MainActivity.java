package com.cesco.tetheringhack;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.cesco.tetheringhack.util.*;

public class MainActivity extends Activity {
	Button button1;
	TextView editInt;
	TextView editSub;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		button1 = (Button) findViewById(R.id.button1);
		final EditText Interface_text = (EditText) this.findViewById(R.id.editInt);
		final EditText Port_text = (EditText) this.findViewById(R.id.editSub);
		
		OnClickListener oclButton1 = new OnClickListener() {
			@SuppressWarnings("deprecation")
			@Override
		       public void onClick(View v) {
				
		    	   CMDProcessor cmd = new CMDProcessor();
		    	   cmd.su.runWaitFor("busybox iptables -tnat -A natctrl_nat_POSTROUTING -s 192.168.0.0/" + Port_text.getText().toString() + " -o " + Interface_text.getText().toString() + " -j MASQUERADE");	   
		    	   Toast.makeText(getApplicationContext(), "Hack Enabled!", Toast.LENGTH_LONG).show();
				
		    	   //debug with Toast messages LOL! :D
		    	   //Toast.makeText(getApplicationContext(),"busybox iptables -tnat -A natctrl_nat_POSTROUTING -s 192.168.0.0/" + Port_text.getText().toString() + " -o " + Interface_text.getText().toString() + " -j MASQUERADE" , Toast.LENGTH_LONG).show();
	}
		};
		button1.setOnClickListener(oclButton1);
	}
};


	
