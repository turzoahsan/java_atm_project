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
public class main 
{
    public static sign s;
    public static home h;
    public static custser c;
    public static credi cred;
    public static deposi depo;
    public static void main(String [] args)
    {
        s = new sign();
        c = new custser();
        cred = new credi();
        depo = new deposi();
        c.cus.setVisible(false);
        cred.cr.setVisible(false);
        depo.dp.setVisible(false);
    }
}
