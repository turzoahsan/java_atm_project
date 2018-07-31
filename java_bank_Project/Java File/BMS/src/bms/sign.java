
package bms;

import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sign extends sqlquary implements ActionListener
{
    public JFrame sign;
    private JPanel sop;
    public static JTextField us,pa;
    private JLabel use,pas;
    private JButton res,sub;
    public static String str1 ="",str2="",str3="";
    
    public sign()
    {
        sign = new JFrame();
        sop = new JPanel();
        us = new JTextField(10);
        pa = new JTextField(10);
        pas = new JLabel("Password");
        use = new JLabel("User ID");
        res = new JButton("Reset");
        sub = new JButton("Submit");
        sign.setTitle("Sign in Page");
        sign.setSize(220,220);
        sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sop.setLayout(new FlowLayout());    
        sop.add(use);
        sop.add(us);
        sop.add(pas);
        sop.add(pa);
        sop.add(res);
        sop.add(sub);
        sign.add(sop,BorderLayout.CENTER);
        sign.setResizable(false);
        sign.setVisible(true);
        res.addActionListener(this);
        sub.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        Object o = e.getSource();
        
        if (o == res)
        {
            us.setText(null);
            pa.setText(null);
        }
        else if (o==sub)
        {
            try 
            {
                str1 = us.getText();
                str2 = pa.getText();
                if (str1.equals("") || str2.equals(""))
                    JOptionPane.showMessageDialog(null,"Wrong User Name Or Password");
                else
                {
                str3 = sqlquary.getadpass(str1);              
                if (str3.equals(str2))
                {
                    main.s.sign.setVisible(false);
                    main.h = new home();
                }
                else
                    JOptionPane.showMessageDialog(null,"Wrong User Name Or Password");
                }
            }
    
            catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(null,"Sorry some unexpected error occured");
            }
        }
    }
}
