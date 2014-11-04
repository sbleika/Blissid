package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class nothafi1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nothafi1);


        ImageButton jabutt;
        jabutt = (ImageButton) findViewById(R.id.ja);
        jabutt.setOnClickListener(gotoClickListener);

        ImageButton neibutt;
        neibutt = (ImageButton) findViewById(R.id.nei);
        neibutt.setOnClickListener(gotoneiClickListener);
    }
View.OnClickListener gotoClickListener = new View.OnClickListener() {

    @Override
    public void onClick(View v) {
        final ImageButton jabutt;
        jabutt = (ImageButton) findViewById(R.id.ja);
        new CountDownTimer(3000,1000){
            @Override
            public void onTick(long millisUntilFinished){
                jabutt.setBackgroundResource(R.drawable.jafoc);
            }

            @Override
            public void onFinish(){
                //set the new Content of your activity
                jabutt.setBackgroundResource(R.drawable.ja);
            }
        }.start();
    }
};
    View.OnClickListener gotoneiClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            final ImageButton neibutt;
            neibutt = (ImageButton) findViewById(R.id.ja);
            new CountDownTimer(3000,1000){
                @Override
                public void onTick(long millisUntilFinished){
                    neibutt.setBackgroundResource(R.drawable.neifoc);
                }

                @Override
                public void onFinish(){
                    //set the new Content of your activity
                    neibutt.setBackgroundResource(R.drawable.nei);
                }
            }.start();
        }
    };


    public void launchBrowser(View view) {
        Uri uriUrl = Uri.parse("http://haefing.is/blisstafla/is/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nothafi1, menu);
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
