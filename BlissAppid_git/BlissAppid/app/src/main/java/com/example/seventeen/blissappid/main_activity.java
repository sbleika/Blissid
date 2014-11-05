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
import android.widget.ImageButton;
/**
 * Höfunur: Egill Örn Sigþórsson
 * Dagsetning: 28.11.2014
 * Lýsing: Upphafsgluggi þar sem hægt er að velja á milli
 * að fara í starfsmannaviðmót eða notendaviðmót
 */

public class main_activity extends Activity {
    /**
     * Gerum onclicklisner fyrir nemadi og strafssemi
     * @param savedInstanceState save instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
        // 2 takkar starfsmadur og nothafi
        ImageButton mynothafibutton;
        ImageButton mystarfsmadurbutton;
        mynothafibutton = (ImageButton) findViewById(R.id.button2);
        mynothafibutton.setOnClickListener(gotonothafiClickListener);
        mystarfsmadurbutton = (ImageButton) findViewById(R.id.button1);
        mystarfsmadurbutton.setOnClickListener(gotostarfsmadurClickListener);
    }
    OnClickListener gotonothafiClickListener = new OnClickListener() {
        /**
         * ef smellt er a nemandi takkan er fallað a nothafibutton()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            nothafibutton();
        }
    };

    /**
     * opnar nothafi klasan
     */
    private void nothafibutton(){
        startActivity(new Intent(this, nothafi1.class));
    }


    OnClickListener gotostarfsmadurClickListener = new OnClickListener() {
        /**
         * ef smellt er a strassemi takkan er fallað a starfsmadurbutton()
         * @param v view
         */
        @Override
        public void onClick(View v) {
            starfsmadurbutton();
        }
    };

    /**
     * opnar starfsmadur1 klasan
     */
    private void starfsmadurbutton(){
        startActivity(new Intent(this, starfsmadur1.class));
    }

    /**
     * Inflate the menu; this adds items to the action bar if it is present.
     * @param menu menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_activity, menu);
        return true;
    }

    /**
     * Handle action bar item clicks here. The action bar will
     * automatically handle clicks on the Home/Up button, so long
     + as you specify a parent activity in AndroidManifest.xml.
     * @param item menuitem
     * @return super.onOptionsItemSelected(item);
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


