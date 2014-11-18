package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class full_blisstafla extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_blisstafla);

        ImageButton t11;
        t11 = (ImageButton) findViewById(R.id.t11);
        t11.setOnClickListener(gototafla11ClickListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.full_blisstafla, menu);
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


    View.OnClickListener gototafla11ClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            t11();
        }
    };

    /**
     * opnar nyja gluggan bio
     */
    private void t11(){
        startActivity(new Intent(this, tafla11.class));
    }


}
