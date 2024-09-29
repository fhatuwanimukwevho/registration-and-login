/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.regex.*;

/**
 * ST10452212 Fhathuwani Mukwevho
 */
public class Login {

    /**
     * At least One Upper Case : (?=.*?[A-Z]) At least One Lower Case :
     * (?=.*?[a-z]) At least One Digit : (?=.*?[0-9]) At least One special
     * character : (?=.*?[#?!@$%^&*-]) Minimum 8 in length : .{8,}
     */
    private static final String P_COMPLEXITY = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

    private String username;

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    private String password;

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    private String firstname;

    /**
     * Get the value of first name
     *
     * @return the value of first name
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Set the value of first name
     *
     * @param firstname new value of first name
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    private String lastname;

    /**
     * Get the value of last name
     *
     * @return the value of last name
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Set the value of last name
     *
     * @param lastname new value of last name
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Login() {
    }

    public Login Login(Login obj) {
        return obj;
    }

    public boolean checkUserName() {
        boolean lOK = true;
        if (!this.username.contains("_") || this.username.length() > 5) {
            lOK = false;
        }
        return lOK;
    }

    public boolean checkPasswordComplexity() {
        boolean lOK;
        if (this.password.isEmpty()) {
            lOK = false;
        }

        Pattern p = Pattern.compile(P_COMPLEXITY); // Compile the Regex
        Matcher m = p.matcher(this.password); // find match between given pswd and regex
        lOK = m.matches();

        return lOK;
    }

    public String registerUser() {
        String response = "";

        if (!checkUserName()) {
            response = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!checkPasswordComplexity()) {
            response = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        return response;
    }

    public boolean loginUser(String uname, String pswd) {
        boolean lOK = false;
        if (uname.equals(this.username) && pswd.equals(this.password)) {
            lOK = true;
        }
        return lOK;
    }

    public String returnLoginStatus(boolean status) {
        String response = "Username or password incorrect, please try again";

        if (status) {
            response = "Welcome " + getFirstname() + " , " + getLastname() + " it is great to see you again.";
        }
Scanner scan = new Scanner(System.in);
        int numOfTasks;    
    }
}

           
     
        
    
    

