/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



public class SignUpModel {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private String confirmPassword;
    private String securityQuestion1;
    private String securityQuestion2;

    public SignUpModel(String firstName, String lastName, String phoneNumber, String email,
                       String password, String confirmPassword, String securityQuestion1, String securityQuestion2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.securityQuestion1 = securityQuestion1;
        this.securityQuestion2 = securityQuestion2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getSecurityQuestion1() {
        return securityQuestion1;
    }

    public void setSecurityQuestion1(String securityQuestion1) {
        this.securityQuestion1 = securityQuestion1;
    }

    public String getSecurityQuestion2() {
        return securityQuestion2;
    }

    public void setSecurityQuestion2(String securityQuestion2) {
        this.securityQuestion2 = securityQuestion2;
    }  
}


