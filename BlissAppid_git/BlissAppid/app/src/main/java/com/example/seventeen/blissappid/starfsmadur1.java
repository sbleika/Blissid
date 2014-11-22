package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Hofundur: Egill Orn Sigthorsson
 * Dagsetning: 28.10.2014
 * Lysing: vidmot fyrir starfsmann tar sem hann getur valid
 * um ad fara i notkunarskra eda ad bua til toflu
 */

public class starfsmadur1 extends Activity {
    /**
     * Gerum onclicklisner fyrir bua til toflu takka  og notkunarskra takka
     * @param savedInstanceState save instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starfsmadur1);
        // 2 takkar starfsmadur og nothafi
        ImageButton buatiltolfubutton;
        ImageButton notkunarskrabutton;
        notkunarskrabutton = (ImageButton) findViewById(R.id.notkunarskra);
        notkunarskrabutton.setOnClickListener(gotoNotkunarskraClickListener);
        buatiltolfubutton = (ImageButton) findViewById(R.id.buatiltoflu);
        buatiltolfubutton.setOnClickListener(gotobuatiltofluClickListener);
    }
    View.OnClickListener gotoNotkunarskraClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a notkunarskra takkan er kallad a fallid Nbutton()
         * @param v view
         */
        @Override
        public void onClick(View v) {
            Nbutton();
        }
    };

    /**
     * opnar nyja gluggan Notkunarskra
     */
    private void Nbutton(){
        startActivity(new Intent(this, Notkunarskra.class));
    }


    View.OnClickListener gotobuatiltofluClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bua til toflu takkan er kallad a fallid BTTbutton()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            BTTbutton();
        }
    };

    /**
     * opnar nyja gluggan Bua til toflu
     */
    private void BTTbutton(){
        startActivity(new Intent(this, Bua_til_toflu.class));
    }

    /**
     * Inflate the menu; this adds items to the action bar if it is present.
     * @param menu menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.starfsmadur1, menu);
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
