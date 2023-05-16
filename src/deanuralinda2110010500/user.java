/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deanuralinda2110010500;

/**
 *
 * @author ASUS
 */
public class user {
    private String iduser;
    private String email;
    private String username;
    private String password;
    
    public user (String iduser, String email, String username, String password){
    this.iduser=iduser;
    this.email=email;
    this.username=username;
    this.password=password;
    }
    
    public void setIdUser (String iduser){
        this.iduser=iduser;
    }
    
    public String getIdUser (){
        return this.iduser;
    }
    
    public void setEmail (String email){
        this.email=email;
    }
    
    public String getEmail (){
        return this.email;
    }
    
    public void setUsername (String username){
        this.username=username;
    }
    
    public String getUsername (){
        return this.username;
    }
    
    public void setPassword (String password){
        this.password=password;
    }
    
    public String getPassword (){
        return this.password;
    }
    
    public void tampilkanUser(){
        System.out.println("ID User : " + iduser);
        System.out.println("Email : " + email);
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
    }
}
