package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class full_blisstafla extends Activity {
    static String[] _lesmynd = new String[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_blisstafla);

        //takkar fyrir röð 1
        ImageButton t11;
        t11 = (ImageButton) findViewById(R.id.t11);
        t11.setOnClickListener(gototafla11ClickListener);

        ImageButton t12;
        t12 = (ImageButton) findViewById(R.id.t12);
        t12.setOnClickListener(gototafla11ClickListener);

        ImageButton t13;
        t13 = (ImageButton) findViewById(R.id.t13);
        t13.setOnClickListener(gototafla11ClickListener);

        ImageButton t14;
        t14 = (ImageButton) findViewById(R.id.t14);
        t14.setOnClickListener(gototafla11ClickListener);

        ImageButton t15;
        t15 = (ImageButton) findViewById(R.id.t15);
        t15.setOnClickListener(gototafla11ClickListener);

        ImageButton t16;
        t16 = (ImageButton) findViewById(R.id.t16);
        t16.setOnClickListener(gototafla11ClickListener);

        //takkar fyrir röð 2
        ImageButton t21;
        t21 = (ImageButton) findViewById(R.id.t21);
        t21.setOnClickListener(gototafla11ClickListener);

        ImageButton t22;
        t22 = (ImageButton) findViewById(R.id.t22);
        t22.setOnClickListener(gototafla11ClickListener);

        ImageButton t23;
        t23 = (ImageButton) findViewById(R.id.t23);
        t23.setOnClickListener(gototafla11ClickListener);

        ImageButton t24;
        t24 = (ImageButton) findViewById(R.id.t24);
        t24.setOnClickListener(gototafla11ClickListener);

        ImageButton t25;
        t25 = (ImageButton) findViewById(R.id.t25);
        t25.setOnClickListener(gototafla11ClickListener);

        ImageButton t26;
        t26 = (ImageButton) findViewById(R.id.t26);
        t26.setOnClickListener(gototafla11ClickListener);

        //takkar fyrir röð 3
        ImageButton t31;
        t31 = (ImageButton) findViewById(R.id.t31);
        t31.setOnClickListener(gototafla11ClickListener);

        ImageButton t32;
        t32 = (ImageButton) findViewById(R.id.t32);
        t32.setOnClickListener(gototafla11ClickListener);

        ImageButton t33;
        t33 = (ImageButton) findViewById(R.id.t33);
        t33.setOnClickListener(gototafla11ClickListener);

        ImageButton t34;
        t34 = (ImageButton) findViewById(R.id.t34);
        t34.setOnClickListener(gototafla11ClickListener);

        ImageButton t35;
        t35 = (ImageButton) findViewById(R.id.t35);
        t35.setOnClickListener(gototafla11ClickListener);

        ImageButton t36;
        t36 = (ImageButton) findViewById(R.id.t36);
        t36.setOnClickListener(gototafla11ClickListener);

        //takkar fyrir röð 4
        ImageButton t41;
        t41 = (ImageButton) findViewById(R.id.t41);
        t41.setOnClickListener(gototafla11ClickListener);

        ImageButton t42;
        t42 = (ImageButton) findViewById(R.id.t42);
        t42.setOnClickListener(gototafla11ClickListener);

        ImageButton t43;
        t43 = (ImageButton) findViewById(R.id.t43);
        t43.setOnClickListener(gototafla11ClickListener);

        ImageButton t44;
        t44 = (ImageButton) findViewById(R.id.t44);
        t44.setOnClickListener(gototafla11ClickListener);

        ImageButton t45;
        t45 = (ImageButton) findViewById(R.id.t45);
        t45.setOnClickListener(gototafla11ClickListener);

        ImageButton t46;
        t46 = (ImageButton) findViewById(R.id.t46);
        t46.setOnClickListener(gototafla11ClickListener);


        ImageButton tilbaka;
        tilbaka = (ImageButton) findViewById(R.id.tilbaka);
        tilbaka.setOnClickListener(gototilbakaClickListener);

        ImageButton lesstika1;
        lesstika1 = (ImageButton) findViewById(R.id.lesstika1);

        //Bundle extras = getIntent().getExtras();
       // String msg = extras.getString("keyMessage");

        //((ImageButton) lesstika1).setImageBitmap(DBHelper.getSymbolImage("nei"));
    }



    // onclick fyrir töflur
    View.OnClickListener gototafla11ClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {
            // todo birta mynd a lesstiku
            t11(v);
        }
    };

    /**
     * opnar nyja gluggan tafla11
     */
    private void t11(View v){
        //ImageButton iv = (ImageButton)v;
        //int id = iv.getId();
        //String idStr = getResources().getResourceName(id);
        //tafla11._TableToUse = idStr;
       System.out.println("111111111111111111111111111111111111111111111111111111111111111111");
        startActivity(new Intent(this, tafla11.class));
    }

    //public static void PutToLes(){
     //   ImageButton lesstika1;
     //   lesstika1 = (ImageButton) findViewById(R.id.lesstika1);
     //   ((ImageButton) lesstika1).setImageBitmap(DBHelper.getSymbolImage(_lesmynd[0]));
   // }

    View.OnClickListener gototilbakaClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a tilbaka takkan er kallad a fallid()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            tilbaka();
        }
    };

    /**
     * opnar nyja gluggan nothafi
     */
    private void tilbaka(){
        startActivity(new Intent(this, nothafi1.class));}



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
        if(id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
