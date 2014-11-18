package com.example.seventeen.blissappid;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

        String txt9=upphafsmynd.getText().toString();

    }

    EditText upphafsmynd = (EditText) findViewById(R.id.textView9);
    EditText nr1 = (EditText) findViewById(R.id.editText4);
    EditText nr2 = (EditText) findViewById(R.id.editText5);
    EditText nr3 = (EditText) findViewById(R.id.editText7);
    EditText nr4 = (EditText) findViewById(R.id.editText6);
    EditText nr5 = (EditText) findViewById(R.id.editText9);
    EditText nr6 = (EditText) findViewById(R.id.editText8);
    EditText nr7 = (EditText) findViewById(R.id.editText10);
    EditText nr8 = (EditText) findViewById(R.id.editText11);
    EditText nr9 = (EditText) findViewById(R.id.editText12);
    EditText nr10 = (EditText) findViewById(R.id.editText13);
    EditText nr11 = (EditText) findViewById(R.id.editText14);
    EditText nr12 = (EditText) findViewById(R.id.editText15);


    public void onupphafsmyndClicked(View view) {
        upphafsmynd.setText("");
    }

    String _Radiochecked = "0";

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked) {
                    _Radiochecked = "4";
                    nr5.setVisibility(View.GONE);
                    nr6.setVisibility(View.GONE);
                    nr7.setVisibility(View.GONE);
                    nr8.setVisibility(View.GONE);
                    nr9.setVisibility(View.GONE);
                    nr10.setVisibility(View.GONE);
                    nr11.setVisibility(View.GONE);
                    nr12.setVisibility(View.GONE);
                    break;
                }
            case R.id.radioButton2:
                if (checked) {
                    _Radiochecked = "6";
                    nr7.setVisibility(View.GONE);
                    nr8.setVisibility(View.GONE);
                    nr9.setVisibility(View.GONE);
                    nr10.setVisibility(View.GONE);
                    nr11.setVisibility(View.GONE);
                    nr12.setVisibility(View.GONE);
                    break;
                }
            case R.id.radioButton5:
                if (checked) {
                    _Radiochecked = "9";
                    nr10.setVisibility(View.GONE);
                    nr11.setVisibility(View.GONE);
                    nr12.setVisibility(View.GONE);
                    break;
                }
            case R.id.radioButton6:
                if (checked) {
                    _Radiochecked = "12";
                    nr5.setVisibility(View.VISIBLE);
                    nr6.setVisibility(View.VISIBLE);
                    nr7.setVisibility(View.VISIBLE);
                    nr8.setVisibility(View.VISIBLE);
                    nr9.setVisibility(View.VISIBLE);
                    nr10.setVisibility(View.VISIBLE);
                    nr11.setVisibility(View.VISIBLE);
                    nr12.setVisibility(View.VISIBLE);
                    break;
                }
        }
    }

    /**
     * Ef smellt er a Búa til töflu takkan
     */
    View.OnClickListener gotomaketableClickListener = new View.OnClickListener() {
        /**
         * ef smellt er a Búa til töflu takkan er kallad a fallid maketable()
         * @param v view
         */
        @Override
        public void onClick(View v) {

            MakeTable.maketablefun(12);
        }
    };


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
/*
    public void displayOutput()
    {
        File sdcard = Environment.getExternalStorageDirectory();
        File file = new File(sdcard,"/TextFile.txt");
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
        }
        catch (IOException e) {
            Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

        TextView output=(TextView) findViewById(R.id.output);
        // Assuming that 'output' is the id of your TextView
        output.setText(text);
    }
*/
