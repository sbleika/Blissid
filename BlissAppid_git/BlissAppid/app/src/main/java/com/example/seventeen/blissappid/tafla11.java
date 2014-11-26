package com.example.seventeen.blissappid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;


public class tafla11 extends Activity {
    DBHelper DB = new DBHelper(this);
    static String _TableToUse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kallari);




        SetImage();

    }
    public static void SetImage(){
        String[] myndir = new String[12];
        myndir = DBHelper.getSymbols(_TableToUse);

        ImageButton takkiA1 = (ImageButton) findViewById(R.id.A1);
        ImageButton takkiA2 = (ImageButton) findViewById(R.id.A2);

        if(myndir[0].charAt(0) == 'A'{takn1.setImageBitmap(DBHelper.getSymbolImage(A1));}
        if(myndir[1].charAt(0) == 'A'{takn1.setImageBitmap(DBHelper.getSymbolImage(A2));}
        if(myndir[2].charAt(0) == 'A'{takn1.setImageBitmap(DBHelper.getSymbolImage(A3));}
        if(myndir[3].charAt(0) == 'A'{takn1.setImageBitmap(DBHelper.getSymbolImage(A4));}
        if(myndir[4].charAt(0) == 'A'{takn1.setImageBitmap(DBHelper.getSymbolImage(A5));}
        if(myndir[5].charAt(0) == 'B'{takn1.setImageBitmap(DBHelper.getSymbolImage(B1));}
        if(myndir[6].charAt(0) == 'B'{takn1.setImageBitmap(DBHelper.getSymbolImage(B2));}
        if(myndir[7].charAt(0) == 'B'{takn1.setImageBitmap(DBHelper.getSymbolImage(B3));}
        if(myndir[8].charAt(0) == 'B'{takn1.setImageBitmap(DBHelper.getSymbolImage(B4));}
        if(myndir[9].charAt(0) == 'B'{takn1.setImageBitmap(DBHelper.getSymbolImage(B5));}
        if(myndir[10].charAt(0) == 'C'{takn1.setImageBitmap(DBHelper.getSymbolImage(C1));}
        if(myndir[11].charAt(0) == 'C'{takn1.setImageBitmap(DBHelper.getSymbolImage(C2));}
        if(myndir[12].charAt(0) == 'C'{takn1.setImageBitmap(DBHelper.getSymbolImage(C3));}
        if(myndir[13].charAt(0) == 'C'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[14].charAt(0) == 'C'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[15].charAt(0) == 'D'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[16].charAt(0) == 'D'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[17].charAt(0) == 'D'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[18].charAt(0) == 'D'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[19].charAt(0) == 'D'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[20].charAt(0) == 'E'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[21].charAt(0) == 'E'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[22].charAt(0) == 'E'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[23].charAt(0) == 'E'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
        if(myndir[24].charAt(0) == 'E'{takn1.setImageBitmap(DBHelper.getSymbolImage(myndir[4]));}
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