
package bms;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.DefaultMenuLayout;

public class home extends sqlquary implements ActionListener
{
    public JFrame ho;
    private JPanel p;
    private JLabel na,des,ad,mob,mail;
    private JButton co,sout;
    public String na1 ="",des1="",ad1="",mob1="",mail1="";
    public home()
    {
        ho = new JFrame();
        p = new JPanel();
        try 
        {
            na1="   Name : ";
            na1 = na1 + sqlquary.getadname(sign.str1);
        } 
        catch (Exception ex) 
        {
           JOptionPane.showMessageDialog(null,"Sorry some unexpected error occured");
        }
        na = new JLabel(na1);
        try 
        {
            des1="   Designation : ";
            des1 = des1 + sqlquary.getadpost(sign.str1);
        } 
        catch (Exception ex) 
        {
           JOptionPane.showMessageDialog(null,"Sorry some unexpected error occured");
        }
        des = new JLabel(des1);
        try 
        {
            ad1="   Address : ";
            ad1 = ad1 + sqlquary.getadadd(sign.str1);
        } 
        catch (Exception ex) 
        {
           JOptionPane.showMessageDialog(null,"Sorry some unexpected error occured");
        }
        ad = new JLabel(ad1);
        try 
        {
            mob1="   Mobile : ";
            mob1 = mob1 + sqlquary.getadmob(sign.str1);
        } 
        catch (Exception ex) 
        {
           JOptionPane.showMessageDialog(null,"Sorry some unexpected error occured");
        }
        mob = new JLabel(mob1);
       try 
        {
            mail1="   E-mail : ";
            mail1 = mail1 + sqlquary.getadmail(sign.str1);
        } 
        catch (Exception ex) 
        {
           JOptionPane.showMessageDialog(null,"Sorry some unexpected error occured");
        }
        mail = new JLabel(mail1);
        
        co = new JButton("Customer operation");
        sout = new JButton("Sign Out");
        
        ho.setTitle("Home Page");
        ho.setSize(300,350);
        ho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ho.setLayout(new GridLayout(6,1));
        p.setLayout(new FlowLayout());
        
        ho.add(na);
        ho.add(des);
        ho.add(mob);
        ho.add(ad);
        ho.add(mail);
        p.add(co);
        p.add(sout);
        ho.add(p,BorderLayout.SOUTH);
        ho.setResizable(false);
        ho.setVisible(true);
        co.addActionListener(this);
        sout.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        Object o = e.getSource();
        if (o == sout)
        {
            main.h.ho.setVisible(false);
            sign.pa.setText("");
            sign.us.setText("");
            sign.str1="";
            sign.str2="";
            sign.str3="";
            main.s.sign.setVisible(true);
            JOptionPane.showMessageDialog(null, "Signed out successfully");
        }
        else if (o == co)
        {
            main.h.ho.setVisible(false);
            main.c.cus.setVisible(true);
        }
    }
    
}
