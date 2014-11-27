package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
/**
 * Hofundur: Egill Orn Sigthorsson
 * Dagsetning: 19.11.2014
 * Lysing: activity til ad birta hverja toflu fyrir fullu blisstaknatofluna
 */

public class tafla11 extends Activity {

    DBHelper DB;

    static int _LesMyndNum = 0;
    static String _TableToUse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DB = new DBHelper(this);
        setContentView(R.layout.activity_tafla11);
        System.out.println("11111111111111111111");
        SetImage();
    }

    /**
     * Setur inn alla myndirnar fra gagnagrunninum
     */
    public void SetImage(){
        String[] myndir = new String[12];
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("keyMessage");
        String tafla = msg.substring(msg.length()-3);
        System.out.println(tafla);
        System.out.println("22222222222222222222222");
        tafla = ""+tafla.charAt(1)+"."+tafla.charAt(2);
        //todo lesa inn tad sem var smellt a i full_bill... i stad 1.1
        myndir = DBHelper.getBigTableSymbols(tafla);
        if(tafla.equals("t11")){
            myndir = DBHelper.getBigTableSymbols("1.1");
        }
        if(tafla.equals("t22")){
            myndir = DBHelper.getBigTableSymbols("2.2");
        }
        System.out.println("33333333333333333333333");
        //for(int i = 0;i<25;i++){
        // /   myndir[i]= "sorg";
       // }

        ImageButton takkiA1 = (ImageButton) findViewById(R.id.A1);
        ImageButton takkiA2 = (ImageButton) findViewById(R.id.A2);
        ImageButton takkiA3 = (ImageButton) findViewById(R.id.A3);
        ImageButton takkiA4 = (ImageButton) findViewById(R.id.A4);
        ImageButton takkiA5 = (ImageButton) findViewById(R.id.A5);
        ImageButton takkiB1 = (ImageButton) findViewById(R.id.B1);
        ImageButton takkiB2 = (ImageButton) findViewById(R.id.B2);
        ImageButton takkiB3 = (ImageButton) findViewById(R.id.B3);
        ImageButton takkiB4 = (ImageButton) findViewById(R.id.B4);
        ImageButton takkiB5 = (ImageButton) findViewById(R.id.B5);
        ImageButton takkiC1 = (ImageButton) findViewById(R.id.C1);
        ImageButton takkiC2 = (ImageButton) findViewById(R.id.C2);
        ImageButton takkiC3 = (ImageButton) findViewById(R.id.C3);
        ImageButton takkiC4 = (ImageButton) findViewById(R.id.C4);
        ImageButton takkiC5 = (ImageButton) findViewById(R.id.C5);
        ImageButton takkiD1 = (ImageButton) findViewById(R.id.D1);
        ImageButton takkiD2 = (ImageButton) findViewById(R.id.D2);
        ImageButton takkiD3 = (ImageButton) findViewById(R.id.D3);
        ImageButton takkiD4 = (ImageButton) findViewById(R.id.D4);
        ImageButton takkiD5 = (ImageButton) findViewById(R.id.D5);
        ImageButton takkiE1 = (ImageButton) findViewById(R.id.E1);
        ImageButton takkiE2 = (ImageButton) findViewById(R.id.E2);
        ImageButton takkiE3 = (ImageButton) findViewById(R.id.E3);
        ImageButton takkiE4 = (ImageButton) findViewById(R.id.E4);
        ImageButton takkiE5 = (ImageButton) findViewById(R.id.E5);
        System.out.println("444444444444444444444");
        if(myndir[0].charAt(0) == 'A'){takkiA1.setImageBitmap(DBHelper.getBigTableSymbolImage("A1",tafla));}
        if(myndir[1].charAt(0) == 'A'){takkiA2.setImageBitmap(DBHelper.getBigTableSymbolImage("A2",tafla));}
        if(myndir[2].charAt(0) == 'A'){takkiA3.setImageBitmap(DBHelper.getBigTableSymbolImage("A3",tafla));}
        if(myndir[3].charAt(0) == 'A'){takkiA4.setImageBitmap(DBHelper.getBigTableSymbolImage("A4",tafla));}
        if(myndir[4].charAt(0) == 'A'){takkiA5.setImageBitmap(DBHelper.getBigTableSymbolImage("A5",tafla));}
        if(myndir[5].charAt(0) == 'B'){takkiB1.setImageBitmap(DBHelper.getBigTableSymbolImage("B1",tafla));}
        if(myndir[6].charAt(0) == 'B'){takkiB2.setImageBitmap(DBHelper.getBigTableSymbolImage("B2",tafla));}
        if(myndir[7].charAt(0) == 'B'){takkiB3.setImageBitmap(DBHelper.getBigTableSymbolImage("B3",tafla));}
        if(myndir[8].charAt(0) == 'B'){takkiB4.setImageBitmap(DBHelper.getBigTableSymbolImage("B4",tafla));}
        if(myndir[9].charAt(0) == 'B'){takkiB5.setImageBitmap(DBHelper.getBigTableSymbolImage("B5",tafla));}
        if(myndir[10].charAt(0) == 'C'){takkiC1.setImageBitmap(DBHelper.getBigTableSymbolImage("C1",tafla));}
        if(myndir[11].charAt(0) == 'C'){takkiC2.setImageBitmap(DBHelper.getBigTableSymbolImage("C2",tafla));}
        if(myndir[12].charAt(0) == 'C'){takkiC3.setImageBitmap(DBHelper.getBigTableSymbolImage("C3",tafla));}
        if(myndir[13].charAt(0) == 'C'){takkiC4.setImageBitmap(DBHelper.getBigTableSymbolImage("C4",tafla));}
        if(myndir[14].charAt(0) == 'C'){takkiC5.setImageBitmap(DBHelper.getBigTableSymbolImage("C5",tafla));}
        if(myndir[15].charAt(0) == 'D'){takkiD1.setImageBitmap(DBHelper.getBigTableSymbolImage("D1",tafla));}
        if(myndir[16].charAt(0) == 'D'){takkiD2.setImageBitmap(DBHelper.getBigTableSymbolImage("D2",tafla));}
        if(myndir[17].charAt(0) == 'D'){takkiD3.setImageBitmap(DBHelper.getBigTableSymbolImage("D3",tafla));}
        if(myndir[18].charAt(0) == 'D'){takkiD4.setImageBitmap(DBHelper.getBigTableSymbolImage("D4",tafla));}
        if(myndir[19].charAt(0) == 'D'){takkiD5.setImageBitmap(DBHelper.getBigTableSymbolImage("D5",tafla));}
        if(myndir[20].charAt(0) == 'E'){takkiE1.setImageBitmap(DBHelper.getBigTableSymbolImage("E1",tafla));}
        if(myndir[21].charAt(0) == 'E'){takkiE2.setImageBitmap(DBHelper.getBigTableSymbolImage("E2",tafla));}
        if(myndir[22].charAt(0) == 'E'){takkiE3.setImageBitmap(DBHelper.getBigTableSymbolImage("E3",tafla));}
        if(myndir[23].charAt(0) == 'E'){takkiE4.setImageBitmap(DBHelper.getBigTableSymbolImage("E4",tafla));}
        if(myndir[24].charAt(0) == 'E'){takkiE5.setImageBitmap(DBHelper.getBigTableSymbolImage("E5",tafla));}
        System.out.println("5555555555555555555555");
        takkiA1.setOnClickListener(OnClickbutton);
        takkiA2.setOnClickListener(OnClickbutton);
        takkiA3.setOnClickListener(OnClickbutton);
        takkiA4.setOnClickListener(OnClickbutton);
        takkiA5.setOnClickListener(OnClickbutton);
        takkiB1.setOnClickListener(OnClickbutton);
        takkiB2.setOnClickListener(OnClickbutton);
        takkiB3.setOnClickListener(OnClickbutton);
        takkiB4.setOnClickListener(OnClickbutton);
        takkiB5.setOnClickListener(OnClickbutton);
        takkiC1.setOnClickListener(OnClickbutton);
        takkiC2.setOnClickListener(OnClickbutton);
        takkiC3.setOnClickListener(OnClickbutton);
        takkiC4.setOnClickListener(OnClickbutton);
        takkiC5.setOnClickListener(OnClickbutton);
        takkiD1.setOnClickListener(OnClickbutton);
        takkiD2.setOnClickListener(OnClickbutton);
        takkiD3.setOnClickListener(OnClickbutton);
        takkiD4.setOnClickListener(OnClickbutton);
        takkiD5.setOnClickListener(OnClickbutton);
        takkiE1.setOnClickListener(OnClickbutton);
        takkiE2.setOnClickListener(OnClickbutton);
        takkiE3.setOnClickListener(OnClickbutton);
        takkiE4.setOnClickListener(OnClickbutton);
        takkiE5.setOnClickListener(OnClickbutton);
    }

    // onclick fyrir töflur
    View.OnClickListener OnClickbutton = new View.OnClickListener() {
        /**
         * ef smellt er a bio takkan er kallad a fallid bio()
         * @param v view
         */
        @Override
        public void onClick(View v) {
            // todo byrta mynd a lesstiku
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
        //full_blisstafla._lesmynd[_LesMyndNum] = "sorg";
        _LesMyndNum++;
        //full_blisstafla.PutToLes();
        System.out.println("sorg.........................................................");

        String msg = "sorg";
        Intent i = new Intent(tafla11.this, full_blisstafla.class);
        i.putExtra("keyMessage", msg);
        startActivity(i);

        //startActivity(new Intent(this, full_blisstafla.class));
    }

    /**
     * Fall sem býr til nýja töflu
     * @param upphafstakn mynd fyrir töfluna
     * @param size fjöldi mynda
     * @param myndir array fyrir oll taknin
     */
    //ImageButton takn2 = (ImageButton) findViewById(R.id.imageButton3);
    //ImageButton takn1 = (ImageButton) findViewById(R.id.imageButton2);

    public static void maketablefun(String upphafstakn, int size, String[] myndir) {
        //make new imagebutton....
        //ImageButton takn2 = (ImageButton) findViewById(R.id.imageButton3);
        //ImageButton takn1 = (ImageButton) findViewById(R.id.imageButton2);
        //takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[0]));
        //takn2.setImageBitmap(DBHelper.getSymbolImage(myndir[1]));
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