/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auth;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
 *
 * @author Ad
 */
public class Fetch {
    
    JFrame records;
    public Fetch(){
        records = new JFrame("Records");
        String cols[] = { "Name","Shows Registered"};
        String data[][] = { {"Ad","Daredevil"},{"Xda","Robot"}};
        
        JTable mytable = new JTable(data,cols);
        
        mytable.setBounds(50,50,300,300);          
        JScrollPane sp=new JScrollPane(mytable);    
        records.add(sp);          
        records.setSize(500,500);    
        
        records.setVisible(true);    
    }
    
    public static void main(String args[]) {
        new Fetch();
    }
    
}
