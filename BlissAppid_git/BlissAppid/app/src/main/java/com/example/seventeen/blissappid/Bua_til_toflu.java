package com.example.seventeen.blissappid;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Hofundur: Egill Orn Sigthorsson
 * Dagsetning: 3.11.2014
 * Lysing: Kominn beinagrind fyir ad getad buid til nyja toflu
 */

public class Bua_til_toflu extends Activity {
    /**
     *
     * @param savedInstanceState save instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bua_til_toflu);

        Button maketable;
        maketable = (Button) findViewById(R.id.maketable);
        maketable.setOnClickListener(gotomaketableClickListener);

        DispList();

    }

    /**
     *
     */
    public void DispList(){
        TextView taknalist;
        taknalist = (TextView)findViewById(R.id.taknalist);

        // then get the TextView and set its text

        try {
            String cardPath = String.valueOf(Environment.getExternalStorageDirectory());
            FileReader fr = new FileReader(cardPath + "/nofn1.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            try {
                while(br.readLine()!=null)
                {
                    line = br.readLine();
                    taknalist.append(line);
                    taknalist.append("\n");
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*try {
            //String cardPath = String.valueOf(Environment.getExternalStorageDirectory());
            AssetManager am = getAssets();
            InputStream is = am.open("nofn1.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(is);
            BufferedReader r = new BufferedReader(inputStreamReader);
            //BufferedReader r = new BufferedReader(new FileReader(cardPath + "/nofn1.txt"));
            StringBuilder total = new StringBuilder();
            String line;
            try {
                while((line = r.readLine()) != null) {
                    total.append(line);
                    total.append("\n");
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            taknalist.setText(total.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
    /**
     *
     * @param view
     */
    public void onTextClicked(View view) {
        EditText upphafsmynd;
        upphafsmynd = (EditText) view;
        upphafsmynd.setText("");
    }

    /**
     *
     * @param view
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked) {
                    setVisiblefor(4);
                    break;
                }
            case R.id.radioButton2:
                if (checked) {
                    setVisiblefor(6);
                    break;
                }
            case R.id.radioButton5:
                if (checked) {
                    setVisiblefor(9);
                    break;
                }
            case R.id.radioButton6:
                if (checked) {
                    setVisiblefor(12);
                    break;
                }
        }
    }

    /**
     *
     * @param NumOfItems
     */
    public void setVisiblefor(int NumOfItems){
        String _Radiochecked = "0";

        EditText nr5, nr6, nr7, nr8, nr9, nr10, nr11, nr12, nr13, nr14, nr15 ;

        nr5 = (EditText) findViewById(R.id.editText9);
        nr6 = (EditText) findViewById(R.id.editText8);
        nr7 = (EditText) findViewById(R.id.editText10);
        nr8 = (EditText) findViewById(R.id.editText11);
        nr9 = (EditText) findViewById(R.id.editText12);
        nr10 = (EditText) findViewById(R.id.editText13);
        nr11 = (EditText) findViewById(R.id.editText14);
        nr12 = (EditText) findViewById(R.id.editText15);

        if(NumOfItems == 4){
            _Radiochecked = "4";
            nr5.setVisibility(View.GONE);
            nr6.setVisibility(View.GONE);
            nr7.setVisibility(View.GONE);
            nr8.setVisibility(View.GONE);
            nr9.setVisibility(View.GONE);
            nr10.setVisibility(View.GONE);
            nr11.setVisibility(View.GONE);
            nr12.setVisibility(View.GONE);
        }
        if(NumOfItems == 6){
            _Radiochecked = "6";
            nr5.setVisibility(View.VISIBLE);
            nr6.setVisibility(View.VISIBLE);
            nr7.setVisibility(View.GONE);
            nr8.setVisibility(View.GONE);
            nr9.setVisibility(View.GONE);
            nr10.setVisibility(View.GONE);
            nr11.setVisibility(View.GONE);
            nr12.setVisibility(View.GONE);
        }
        if(NumOfItems == 9){
            _Radiochecked = "9";
            nr5.setVisibility(View.VISIBLE);
            nr6.setVisibility(View.VISIBLE);
            nr7.setVisibility(View.VISIBLE);
            nr8.setVisibility(View.VISIBLE);
            nr9.setVisibility(View.VISIBLE);
            nr10.setVisibility(View.GONE);
            nr11.setVisibility(View.GONE);
            nr12.setVisibility(View.GONE);
        }
        if(NumOfItems == 12){
            _Radiochecked = "12";
            nr5.setVisibility(View.VISIBLE);
            nr6.setVisibility(View.VISIBLE);
            nr7.setVisibility(View.VISIBLE);
            nr8.setVisibility(View.VISIBLE);
            nr9.setVisibility(View.VISIBLE);
            nr10.setVisibility(View.VISIBLE);
            nr11.setVisibility(View.VISIBLE);
            nr12.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Ef smellt er a Búa til töflu takkan er kallad a fallid Tbutton() og maketable.maketablefun
     */
    View.OnClickListener gotomaketableClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a Búa til töflu takkan er kallad a fallid maketable()
         * @param v view
         */
        @Override
        public void onClick(View v) {
            EditText upphafsmynd;
            upphafsmynd = (EditText)findViewById(R.id.textView9);
            String txt9=upphafsmynd.getText().toString();
            MakeTable.maketablefun(txt9);
            Tbutton();
        }
    };

    /**
     * opnar nyja gluggan starfsmadur1
     */
    private void Tbutton(){
        startActivity(new Intent(this, starfsmadur1.class));
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