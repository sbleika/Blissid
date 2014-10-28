package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class main_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
        // 2 takkar starfsmadur og nothafi
        Button mynothafibutton;
        Button mystarfsmadurbutton;
        mynothafibutton = (Button) findViewById(R.id.button2);
        mynothafibutton.setOnClickListener(gotonothafiClickListener);
        mystarfsmadurbutton = (Button) findViewById(R.id.button1);
        mystarfsmadurbutton.setOnClickListener(gotostarfsmadurClickListener);
    }
    OnClickListener gotonothafiClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            nothafibutton();
        }
    };
    private void nothafibutton(){
        startActivity(new Intent(this, nothafi1.class));
    }


    OnClickListener gotostarfsmadurClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            starfsmadurbutton();
        }
    };
    private void starfsmadurbutton(){
        startActivity(new Intent(this, starfsmadur1.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


