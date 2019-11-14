/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auth;

import java.sql.*;
/**
 *
 * @author Ad
 */
public class Connecting {
    
        Connection connect;
        Statement stmnt;
    public Connecting(String username,String password){
        
        String localURI = "jdbc:mysql://localhost:3306/mysql";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(localURI, username, password);
            stmnt = connect.createStatement();
            
        }catch (ClassNotFoundException e){
            
            System.out.println("Driver Not Found :("+e);
            System.exit(1);
            
        } catch (SQLException e) {
            
            System.out.println(e);
            System.exit(1);
            
        }
        
    }
    
    public Statement getStatement() {
            return stmnt;
        }
        
    
}
