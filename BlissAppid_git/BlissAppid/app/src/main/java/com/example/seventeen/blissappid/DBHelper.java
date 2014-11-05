package com.example.seventeen.blissappid;
import java.sql.*;
/**
 * Created by ivar on 05/11/14.
 */
public class DBHelper
{
    private Connection conn =null;

    public DBHelper()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:symbols.db");
        } catch ( Exception e )
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    //Usage:x=DBHelper.getSymbols(tableName)
    //Before: tableName is a name of a table in the tables database
    //After: x is a list of the names of symbols belonging to table tableName
    //or empty if he query failed
    public String[] getSymbols(String tableName)
    {
        try {


            String command = "SELECT symbolname from tableSymbols where tablename=\"?\";";
            PreparedStatement statement = conn.prepareStatement(command);
            statement.setString(1, tableName);

            ResultSet rs=statement.executeQuery();
            Array temp = rs.getArray("symbolname");
            String[] output = (String[])temp.getArray();
            return output;

        }
        catch(Exception e)
        {
            System.out.println("sqlerror in DBHelper.getSymbols"+e.getMessage());
            String[] empty = new String[0];
            return empty;
        }

    }



}
