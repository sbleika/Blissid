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
 * Hofunur: Egill Orn Sigthosson
 * Dagsetning: 1.10.2014
 * Lysing: Vidmot fyrir nothafa, tar sem hann getur tjad ja og nei
 * a audskiljanlegan hatt og opnad fulla blisstáknatöflu
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
    }

    /**
     * Ef smellt er á ja takkan
     */

View.OnClickListener gotoClickListener = new View.OnClickListener() {

    /**
     * Þegar smellt er á já takkan glóir hann i 3 sekundur
     *
     * @param v er view
     */
    @Override
    public void onClick(View v) {
        final ImageButton jabutt;
        jabutt = (ImageButton) findViewById(R.id.ja);
        new CountDownTimer(3000,1000){
            /**
             * breytum bakgrunni á takkanum á meðan við teljum niður
             * @param millisUntilFinished timi eftir
             */
            @Override
            public void onTick(long millisUntilFinished){
                jabutt.setBackgroundResource(R.drawable.jafoc);
            }

            /**
             * breytum bakgrunni á takkanum í upprunalegt ástandi þegar 3 sekundur eru liðnar
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
     * Ef smellt er á nei takkan
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
                 * breytum bakgrunni á takkanum á meðan við teljum niður
                 * @param millisUntilFinished timi eftir
                 */
                @Override
                public void onTick(long millisUntilFinished){
                    neibutt.setBackgroundResource(R.drawable.neifoc);
                }

                /**
                 * breytum bakgrunni á takkanum í upprunalegt ástandi þegar 3 sekundur eru liðnar
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
     * Tímabundin lausn á að opna fulla blisstáknatöflu
     * opnar vefsíðu þar sem hækt er að skoða hana (http://haefing.is/blisstafla/is/)
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
