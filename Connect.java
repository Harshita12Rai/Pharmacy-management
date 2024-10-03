package main;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {
//    public static void main(String[] args) {
//        String url="jdbc:mysql://localhost:3306/pharmacy";
//        String username="root";
//        String password="";
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection connection= DriverManager.getConnection(url,username,password);
//            Statement statement=connection.createStatement();
//            ResultSet resultSet=statement.executeQuery("select * from company");
//            while (resultSet.next()){
//                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
//            }
//            connection.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }

    public static Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy","root","");
            if(con!=null)return con ;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
        }
        return null ;
    }
}
