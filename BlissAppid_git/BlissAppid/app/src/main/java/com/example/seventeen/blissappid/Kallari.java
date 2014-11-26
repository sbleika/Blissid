package com.example.seventeen.blissappid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

/**
 * Hofundur: Rúnar Þór
 * Dagsetning: 20.11.2014
 * Lysing:
 */
public class Kallari extends Activity {
    DBHelper DB = new DBHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kallari);


    }

    /**
     * Fall sem býr til nýja töflu
     * @param upphafstakn mynd fyrir töfluna
     * @param size fjöldi mynda
     * @param myndir array fyrir oll taknin
     */


    public static void maketablefun(String upphafstakn, int size, String[] myndir) {
        //make new imagebutton...
        ImageButton takn2 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton takn1 = (ImageButton) findViewById(R.id.imageButton2);
        takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[0]));
        takn2.setImageBitmap(DBHelper.getSymbolImage(myndir[1]));
    }

    /**
     * Inflate the menu; this adds items to the action bar if it is present.
     * @param menu menu
     * @return true
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.bua_til_toflu, menu);
        return true;

    }

    /**
     * Handle action bar item clicks here. The action bar will
     * automatically handle clicks on the Home/Up button, so long
     * as you specify a parent activity in AndroidManifest.xml.
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