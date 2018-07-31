
package bms;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class custser extends sqlquary implements ActionListener
{
    public JFrame cus;
    private JButton cr,dp,mt,ci,bac,cracc;
    
    public custser()
    {
        cus = new JFrame();
        
        cr = new JButton("Credit");
        dp = new JButton("Deposit");
        mt = new JButton("Tranfer Balance");
        ci = new JButton("Customer information");
        cracc = new JButton("Create Account");
        bac = new JButton("Back");
        
        cus.setTitle("Customer Service");
        cus.setSize(200,200);
        cus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cus.setLayout(new FlowLayout());
        
        cus.add(cr);
        cus.add(dp);
        cus.add(mt);
        cus.add(ci);
        cus.add(cracc);
        cus.add(bac);
        
        cus.setResizable(false);
        cus.setVisible(true);
        
        cr.addActionListener(this);
        dp.addActionListener(this);
        mt.addActionListener(this);
        ci.addActionListener(this);
        cracc.addActionListener(this);
        bac.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
       Object o = e.getSource();
       
       if (o == bac)
       {
           cus.setVisible(false);
           main.h.ho.setVisible(true);
       }
       
       else if (o == cr)
       {
           main.c.cus.setVisible(false);
           main.cred.cr.setVisible(true);
       }
       
       else if (o == dp)
       {
           main.c.cus.setVisible(false);
           main.depo.dp.setVisible(true);
       }
      
    }
    
}
