/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project01;

/**
 *
 * @author 1
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class G14UserDaoImpl implements G14UserDao{
    public static File file = new File("user.csv");

    //静态代码块，随着类的加载而加载
    static{
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //注册功能

    public void regist(G14User user) throws IOException {
        try{
            //把用户信息存进文件里
            String title="ID,Name,Password,User Type,Time created,User Status,Current Balance";
            String info=user.getUserName()+","+user.getPassWord()+","+user.getTime()+","+user.getType()
                    +","+user.getStatus()+","+user.getBalance();
            //创建高效字符输出流来给文件写入数据，创建了一个可以追加写入的FileWriter，避免了文件中之前的用户信息被覆盖
            BufferedWriter bw = new BufferedWriter(new FileWriter("user.csv",true));
            bw.write(title);
            bw.newLine();
            bw.write(info);
            bw.newLine();
            bw.flush();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //登录功能

    public boolean isLogin(String userName, String passWord) {
        boolean flag=false;
        try{
            //创建高效字符输入流来读取数据
            BufferedReader br = new BufferedReader(new FileReader("user.csv"));
            String line;
            while ((line=br.readLine())!=null) {
                String[] s=line.split(",");
                if (s[0].equals(userName)&&s[1].equals(passWord)) {
                    flag=true;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return flag;
    }
    
    
    

}
