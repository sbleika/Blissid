package com.example.seventeen.blissappid;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

/**
 * Hofundur: Egill Orn Sigthosson
 * Dagsetning: 4.10.2014
 * Lysing: inniheldur tofluna sem tengist bio
 */
public class bio extends Activity {
    /**
     *
     * @param savedInstanceState save instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);


        DBHelper DB = new DBHelper();

        ImageButton takn1;
        takn1 = (ImageButton) findViewById(R.id.takn1);
        //((ImageButton) takn1).setImageResource(R.drawable.ja);
        ImageButton takn2;
        takn2 = (ImageButton) findViewById(R.id.takn2);
        ((ImageButton) takn2).setImageResource(R.drawable.poppkorn);
        ImageButton takn3;
        takn3 = (ImageButton) findViewById(R.id.takn3);
        ((ImageButton) takn3).setImageResource(R.drawable.gosdrykkur);
        ImageButton takn4;
        takn4 = (ImageButton) findViewById(R.id.takn4);
        ((ImageButton) takn4).setImageResource(R.drawable.nammi);
       ((ImageButton) takn1).setImageBitmap(DBHelper.getSymbolImage("ja"));

    }

    /**
     * Inflate the menu; this adds items to the action bar if it is present.
     * @param menu Menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.nothafi1, menu);
        return true;
    }

    /**
     * Handle action bar item clicks here. The action bar will
     * automatically handle clicks on the Home/Up button, so long
     * as you specify a parent activity in AndroidManifest.xml.
     * @param item MenuItem
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
