package com.example.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TicTacToe extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(TicTacToe.this,MainActivity.class);
				startActivity(i);
			
				
			}
		});
		Button b2=(Button)findViewById(R.id.button2);
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(TicTacToe.this,Player.class);
				startActivity(i);
			
				
			}
		});
	}

	
	}
