
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class MyConnection {
    // we create a function to connect with mysql database
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.msql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc://localhost:3306/fdbms", "root", "idrice");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}