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
import java.util.logging.Level;
import java.util.logging.Logger;
public class credi extends sqlquary implements ActionListener
{
    public JFrame cr;
    private JLabel acc,bal;
    private JTextField accon,balan;
    private JButton sub,res,bac;
    private JPanel cre;
    
    public credi()
    {
        cr = new JFrame();
        cre = new JPanel();
        
        sub = new JButton("Credit");
        res = new JButton("Reset");
        bac = new JButton("Back");
        
        acc = new JLabel("Account Number :");
        bal = new JLabel("Prefered Balance :");
        
        accon = new JTextField(10);
        balan = new JTextField(10);
        
        cr.setTitle("Customer Service");
        cr.setSize(250,200);
        cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cr.setLayout(new FlowLayout());
        cre.setLayout(new FlowLayout());
        
        cr.add(acc);
        cr.add(accon);
        cr.add(bal);
        cr.add(balan);
        
        cre.add(sub);
        cre.add(res);
        cre.add(bac);
        
        cr.add(cre,BorderLayout.SOUTH);
        
        cr.setResizable(false);
        cr.setVisible(true);
        
        sub.addActionListener(this);
        res.addActionListener(this);
        bac.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        Object o = e.getSource();
        if (o==bac)
        {
            main.cred.cr.setVisible(false);
            main.c.cus.setVisible(true);
        }
        else if (o == res)
        {
            accon.setText("");
            balan.setText("");
        }
        else if (o == sub)
        {
            String strc1,strc2;
            strc1 = accon.getText();
            strc2 = balan.getText();
            if (strc1.equals("") || strc2.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Account number Or Balance Invalid");
            }
            else
            {
                int accn = Integer.parseInt(strc1);
                double tb;
                double balanc = Double.parseDouble(strc2);
                try 
                {
                    tb = sqlquary.getcubal(accn);
                    if (tb<balanc)
                    {
                        JOptionPane.showMessageDialog(null,"Acount does not have sufficient balance");
                    }
                    else
                    {
                        tb = tb - balanc;
                        sqlquary.upbal(accn, tb);
                        accon.setText("");
                        balan.setText("");
                        String nbal = "Account is Successfully credited and the remaining balance is ";
                        nbal = nbal + String.valueOf(tb);
                        JOptionPane.showMessageDialog(null,nbal);
                    }
                } 
                catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(null,"Sorry some unexpected error occured");
                }
            }
        }
    }
   
}
