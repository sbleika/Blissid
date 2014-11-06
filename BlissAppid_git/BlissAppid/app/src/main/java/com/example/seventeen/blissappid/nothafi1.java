package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

/**
 * Hofundur: Egill Orn Sigthorsson
 * Dagsetning: 1.10.2014
 * Lysing: Vidmot fyrir nothafa, tar sem hann getur tjad ja og nei
 * a audskiljanlegan hatt og opnad fulla blisstaknatoflu
 */
public class nothafi1 extends Activity {
    /**
     * Gerum sitthvoran onclicklistner fyrir ja og nei
     * @param savedInstanceState save instance
     */
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

        ImageButton bio;
        bio = (ImageButton) findViewById(R.id.bio);
        bio.setOnClickListener(gotoBioClickListener);

    }

    /**
     * Ef smellt er a ja takkan
     */

View.OnClickListener gotoClickListener = new View.OnClickListener() {

    /**
     * tegar smellt er a ja takkan gloir hann i 3 sekundur
     *
     * @param v er view
     */
    @Override
    public void onClick(View v) {
        final ImageButton jabutt;
        jabutt = (ImageButton) findViewById(R.id.ja);
        new CountDownTimer(3000,1000){
            /**
             * breytum bakgrunni a takkanum a medan vid teljum nidur
             * @param millisUntilFinished timi eftir
             */
            @Override
            public void onTick(long millisUntilFinished){
                jabutt.setBackgroundResource(R.drawable.jafoc);
            }

            /**
             * breytum bakgrunni a takkanum i upprunalegt astandi tegar 3 sekundur eru lidnar
             */
            @Override
            public void onFinish(){
                //set the new Content of your activity
                jabutt.setBackgroundResource(R.drawable.ja);
            }
        }.start();
    }
};
    /**
     * Ef smellt er a nei takkan
     */
    View.OnClickListener gotoneiClickListener = new View.OnClickListener() {
        /**
         * Þegar smellt er á nei takkan glóir hann i 3 sekundur
         * @param v er view
         */
        @Override
        public void onClick(View v) {
            final ImageButton neibutt;
            neibutt = (ImageButton) findViewById(R.id.nei);
            new CountDownTimer(3000,1000){
                /**
                 * breytum bakgrunni á takkanum a medan við teljum nidur
                 * @param millisUntilFinished timi eftir
                 */
                @Override
                public void onTick(long millisUntilFinished){
                    neibutt.setBackgroundResource(R.drawable.neifoc);
                }

                /**
                 * breytum bakgrunni á takkanum í upprunalegt astandi tegar 3 sekundur eru lidnar
                 */
                @Override
                public void onFinish(){
                    //set the new Content of your activity
                    neibutt.setBackgroundResource(R.drawable.nei);
                }
            }.start();
        }
    };
    /**
     * Ef smellt er a bio takkan
     */
    View.OnClickListener gotoBioClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            bio();
        }
    };

    /**
     * opnar nyja gluggan bio
     */
    private void bio(){
        startActivity(new Intent(this, bio.class));
    }

    /**
     * Timabundin lausn a ad opna fulla blisstaknatoflu
     * opnar vefsidu tar sem haekt er ad skoda hana (http://haefing.is/blisstafla/is/)
     * @param view view
     */
    public void launchBrowser(View view) {
        Uri uriUrl = Uri.parse("http://haefing.is/blisstafla/is/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
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
