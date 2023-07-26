package database;
import java.sql.*;

public class DbConnection{
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dormify","root","ashok_4444");
            return connection;
        }
        catch(Exception e){
            return null;
        }
    }
    
    public static void main(String[] args){
        Connection connection = connect();
        if(connection != null){
            System.out.println("Connection successful!");
            
            
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
