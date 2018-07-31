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

public class deposi extends sqlquary implements ActionListener
{
    public JFrame dp;
    private JLabel acc,bal;
    private JTextField accon,balan;
    private JButton sub,res,bac;
    private JPanel dpe;
    
    public deposi()
    {
        dp = new JFrame();
        dpe = new JPanel();
        
        sub = new JButton("Deposit");
        res = new JButton("Reset");
        bac = new JButton("Back");
        
        acc = new JLabel("Account Number :");
        bal = new JLabel("Prefered Balance :");
        
        accon = new JTextField(10);
        balan = new JTextField(10);
        
        dp.setTitle("Customer Service");
        dp.setSize(250,200);
        dp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dp.setLayout(new FlowLayout());
        dpe.setLayout(new FlowLayout());
        
        dp.add(acc);
        dp.add(accon);
        dp.add(bal);
        dp.add(balan);
        
        dpe.add(sub);
        dpe.add(res);
        dpe.add(bac);
        
        dp.add(dpe,BorderLayout.SOUTH);
        
        dp.setResizable(false);
        dp.setVisible(true);
        
        sub.addActionListener(this);
        res.addActionListener(this);
        bac.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        Object o = e.getSource();
        if (o == bac)
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
                    tb = tb + balanc;
                    sqlquary.upbal(accn, tb);
                    accon.setText("");
                    balan.setText("");
                    String nbal = "Account is Successfully deposited and the total balance is ";
                    nbal = nbal + String.valueOf(tb);
                    JOptionPane.showMessageDialog(null,nbal);
                } 
                catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(null,"Sorry some unexpected error occured");
                }
            }
        }
    }
}
