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

        ImageButton t12;
        t12 = (ImageButton) findViewById(R.id.t12);
        t12.setOnClickListener(gototafla12ClickListener);

        ImageButton t13;
        t13 = (ImageButton) findViewById(R.id.t13);
        t13.setOnClickListener(gototafla13ClickListener);

        ImageButton t14;
        t14 = (ImageButton) findViewById(R.id.t14);
        t14.setOnClickListener(gototafla14ClickListener);

        ImageButton t15;
        t15 = (ImageButton) findViewById(R.id.t15);
        t15.setOnClickListener(gototafla15ClickListener);

        ImageButton t16;
        t16 = (ImageButton) findViewById(R.id.t16);
        t16.setOnClickListener(gototafla16ClickListener);
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
     * opnar nyja gluggan tafla11
     */
    private void t11(){
        startActivity(new Intent(this, tafla11.class));
    }


    View.OnClickListener gototafla12ClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            t12();
        }
    };

    /**
     * opnar nyja gluggan tafla12
     */
    private void t12(){
        startActivity(new Intent(this, tafla11.class));
    }


    View.OnClickListener gototafla13ClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            t13();
        }
    };

    /**
     * opnar nyja gluggan tafla13
     */
    private void t13(){
        startActivity(new Intent(this, tafla11.class));
    }


    View.OnClickListener gototafla14ClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            t14();
        }
    };

    /**
     * opnar nyja gluggan tafla14
     */
    private void t14(){
        startActivity(new Intent(this, tafla11.class));
    }


    View.OnClickListener gototafla15ClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            t15();
        }
    };

    /**
     * opnar nyja gluggan tafla15
     */
    private void t15(){
        startActivity(new Intent(this, tafla11.class));
    }


    View.OnClickListener gototafla16ClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            t16();
        }
    };

    /**
     * opnar nyja gluggan tafla16
     */
    private void t16(){
        startActivity(new Intent(this, tafla11.class));
    }


}
