package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
/**
 * Höfunur: Egill Örn Sigþórsson
 * Dagsetning: 28.10.2014
 * Lýsing:
 */

public class starfsmadur1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starfsmadur1);
        // 2 takkar starfsmadur og nothafi
        Button buatiltolfubutton;
        Button notkunarskrabutton;
        notkunarskrabutton = (Button) findViewById(R.id.notkunarskra);
        notkunarskrabutton.setOnClickListener(gotoNotkunarskraClickListener);
        buatiltolfubutton = (Button) findViewById(R.id.buatiltoflu);
        buatiltolfubutton.setOnClickListener(gotobuatiltofluClickListener);
    }
    View.OnClickListener gotoNotkunarskraClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Nbutton();
        }
    };
    private void Nbutton(){
        startActivity(new Intent(this, Notkunarskra.class));
    }


    View.OnClickListener gotobuatiltofluClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            BTTbutton();
        }
    };
    private void BTTbutton(){
        startActivity(new Intent(this, Bua_til_toflu.class));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.starfsmadur1, menu);
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
