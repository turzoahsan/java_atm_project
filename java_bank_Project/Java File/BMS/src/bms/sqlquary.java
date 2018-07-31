/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bms;

import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Rony
 */
public class sqlquary 
{
    public static double getcubal(int acnum) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select cubal from cust where acnum = ?");
        statement.setInt(1, acnum);
        ResultSet result = statement.executeQuery();
        double res = 0;
        while (result.next())
            res = result.getDouble(1);
        return res;
        
    }
    
    public static String getcuname(int acnum)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select cuname from cust where acnum = ?");
        statement.setInt(1, acnum);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getcuadd(int acnum)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select cuadd from cust where acnum = ?");
        statement.setInt(1, acnum);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getcumob(int acnum)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select cumob from cust where acnum = ?");
        statement.setInt(1, acnum);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getcumail(int acnum)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select cumail from cust where acnum = ?");
        statement.setInt(1, acnum);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getadname(String uid)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select usname from adid where usid = ?");
        statement.setString(1, uid);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getadpost(String uid)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select uspost from adid where usid = ?");
        statement.setString(1, uid);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getadadd(String uid)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select usadd from adid where usid = ?");
        statement.setString(1, uid);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getadmob(String uid)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select usmob from adid where usid = ?");
        statement.setString(1, uid);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getadmail(String uid)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select usmail from adid where usid = ?");
        statement.setString(1, uid);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static String getadpass(String uid)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("select uspass from adid where usid = ?");
        statement.setString(1, uid);
        ResultSet result = statement.executeQuery();
        String res = "";
        while (result.next())
            res = result.getString(1);
        return res;
    }
    
    public static void upbal(int acnum,double bal)  throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","");
        PreparedStatement statement = con.prepareStatement("UPDATE cust SET cubal = ? WHERE acnum = ?");
        statement.setDouble(1, bal);
        statement.setInt(2, acnum);
        statement.executeUpdate();
    }
    
    /*public static void main(String[] args) throws Exception
    {
        sqlquary.upbal(1000,1500.00);
    }*/
       
}
