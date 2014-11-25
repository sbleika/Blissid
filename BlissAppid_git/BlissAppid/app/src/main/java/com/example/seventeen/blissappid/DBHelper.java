package com.example.seventeen.blissappid;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ArrayList;


/**
 * Created by ivar on 05/11/14.
 * Lysing: DBHelper er til að saekja gogn ur gagnagrunni
 */
public class DBHelper
{
    /**
     * new connection
     */
private static SQLiteDatabase db = null;

    /**
     * make the connection
     */
    public DBHelper(Context context)
    {
        try
        {
            ExternalDbOpenHelper opener = new ExternalDbOpenHelper(context,"symbols.db");
            db = opener.getDb();

        } catch ( Exception e )
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.err.println("failed connection");
            System.exit(0);
        }
    }

    public void close()
    {

        try {
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Usage:x=DBHelper.getSymbols(tableName)
     * Before: tableName is a name of a table in the tables database
     * After: x is a list of the names of symbols belonging to table tableName
     * or empty if he query failed
     * @param tableName is a name of a table in the tables database
     * @return see after
     */
    public String[] getSymbols(String tableName)
    {
        try {

        /*
            String command = "SELECT symbolname from tableSymbols where tablename=\"?\";";
            PreparedStatement statement = conn.prepareStatement(command);
            statement.setString(1, tableName);
            */
            //String[] selectionColumns =  {"symbolname"};
            Cursor cursor = db.query("tableSymbols",new String[]{"symbolname"},"tablename=\"?\";",new String[]{tableName},null,null,null);

            int index=cursor.getColumnIndex("symbolname");
            ArrayList list = new ArrayList<String>();

            while(!cursor.isAfterLast())
            {
                list.add(cursor.getInt(index));
                cursor.moveToNext();
            }

            String[] output = (String[]) list.toArray();

            return output;

        }
        catch(Exception e)
        {
            System.out.println("sqlerror in DBHelper.getSymbols"+e.getMessage());
            System.err.println("failed getsymbols");
            String[] empty = new String[0];
            return empty;
        }

    }

    /**
     * get the image
     * @param symbolName su mynd sem vid viljum saekja
     * @return the image with the symbolname
     */
    public static Bitmap getSymbolImage(String symbolName)
    {

        byte[] byteImage = null;

        try
        {
            /*
            String command = "SELECT image from symbol where name=\"?\";";

            PreparedStatement statement = conn.prepareStatement(command);
            statement.setString(1, symbolName);
            */
            Cursor cursor = db.query("symbols",new String[]{"image"},"_id=\"?\"",new String[]{symbolName},null,null,null);



            byteImage = cursor.getBlob(0);

           // int blobLength = (int) blobImage.length();
           // byteImage = blobImage.getBytes(1,blobLength);

            Bitmap image = BitmapFactory.decodeByteArray(byteImage,0,byteImage.length);
            return image;

        }
        catch(Exception e)
        {
            System.out.println("sqlerror in DBHelper.getSymbolImage"+e.getMessage());
            System.err.println("failed getsymbolImage");
            String[] empty = new String[0];
            return null;
        }

    }
}
