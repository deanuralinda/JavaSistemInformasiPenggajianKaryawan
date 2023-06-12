/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class dataSetUser {
    private ArrayList<String> IdUser;
    private ArrayList<String> Email;
    private ArrayList<String> Username;
    private ArrayList<String> Password;
    
    public dataSetUser(){
        IdUser =new ArrayList<String>();
        Email = new ArrayList<String>();
        Username = new ArrayList<String>();
        Password = new ArrayList<String>();
    }
    
    public void tambahIdUser(String value){
        IdUser.add(value);
    }
    
    public ArrayList<String> getDataSetIdUser(){
        return this.IdUser;
    }
    
    public void tambahEmail(String value){
        Email.add(value);
    }
    
    public ArrayList<String> getDataSetEmail(){
        return this.Email;
    }
    
    public void tambahUsername(String value){
        Username.add(value);
    }
    
    public ArrayList<String> getDataSetUsername(){
        return this.Username;
    }
    
    public void tambahPassword(String value){
        Password.add(value);
    }
    
    public ArrayList<String> getDataSetPassword(){
        return this.Password;
    }
    
    public void tambahData(String iduser, String email, String username, String password){
         this.IdUser.add(iduser);
         this.Email.add(email);
         this.Username.add(username);
         this.Password.add(password);
         
     }
    
}
