package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.SignUpModel;


public class SignUpDAO {

    public static boolean isEmailTaken(String email) {
        try{
            Connection connect = DbConnection.connect();
            PreparedStatement st = connect.prepareStatement("Select email from signUp");
            ResultSet res = st.executeQuery();
            int i=0;
            while (res.next()) {
                String emailValue = res.getString("email");
                if(emailValue.equals(email)){
                    i++;
                }
            }
            if(i!=0){
                return true;
            }
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public boolean createUser(SignUpModel signUpModel) {
        
        Connection connect = DbConnection.connect();
        if(connect != null){
            try{
                PreparedStatement st = connect.prepareStatement("INSERT INTO signUp (fname, lname, number, email, password, confirmpassword, securityQuestion1, securityQuestion2) VALUES (?, ?, ?, ?, ?, ?,?,?)", Statement.RETURN_GENERATED_KEYS); 
                st.setString(1,signUpModel.getFirstName());
                st.setString(2,signUpModel.getLastName());
                st.setString(3,signUpModel.getPhoneNumber());
                st.setString(4,signUpModel.getEmail());
                st.setString(5,signUpModel.getPassword());
                st.setString(6,signUpModel.getConfirmPassword());
                st.setString(7,signUpModel.getSecurityQuestion1());
                st.setString(8,signUpModel.getSecurityQuestion2());
                st.executeUpdate();
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }else{
            System.out.println("The connection not available");
            return false;
        }
    }
}
