/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project01;

import java.util.Date;



public class G14User {
    private String userName;
    private String passWord;
    private Date time;
    private String userType;
    private String userStatus;
    private String balance;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public Date getTime() {
        return time;
    }
    
     public void setTime(Date time) {
        this.time = time;
    }
     
    public String getType() {
        return userType;
    }
    public void setType(String userType) {
        this.userType = userType;
    }
    
    public String getStatus() {
        return userStatus;
    }
    public void setStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public G14User(String userName,String passWord) {
        super();
        this.userName = userName;
        this.passWord = passWord;
    }

    public G14User(String userType) {
        super();
        this.userType = userType;
    }
    

    
   public G14User(String userName, String passWord, Date time, String userType, String userStatus, String balance) {
        super();
        this.userName = userName;
        this.passWord = passWord;
        this.time = time;        
        this.userType = userType;
        this.userStatus = userStatus;
        this.balance = balance;
    }     
 
            
    public G14User() {
        super();
        // TODO Auto-generated constructor stub
    }


}
