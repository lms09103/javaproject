/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project01;


import java.io.IOException;


public interface G14UserDao {


    public abstract void regist(G14User user) throws IOException;


    public abstract boolean isLogin(String userName,String passWord);

}
