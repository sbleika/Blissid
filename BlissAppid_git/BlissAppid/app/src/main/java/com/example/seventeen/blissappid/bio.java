package com.example.seventeen.blissappid;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

/**
 * Hofundur: Egill Orn Sigthrosson
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

/*
        DPH = new DBH;

        ImageButton takn1;
        takn1 = (ImageButton) findViewById(R.id.takn1);
        ((ImageButton) takn1).setImageBitmap(ja);
        //((ImageButton) takn1).setImageResource(R.drawable.ja);

        ImageButton takn2;
        takn2 = (ImageButton) findViewById(R.id.takn1);
        ((ImageButton) takn2).setImageBitmap(bio);

        ImageButton takn3;
        takn3 = (ImageButton) findViewById(R.id.takn1);
        ((ImageButton) takn3).setImageBitmap(X);

        ImageButton takn4;
        takn4 = (ImageButton) findViewById(R.id.takn1);
        ((ImageButton) takn4).setImageBitmap(W);

*/
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
