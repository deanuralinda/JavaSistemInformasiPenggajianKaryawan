/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deanuralinda2110010500;

/**
 *
 * @author ASUS
 */
public class Deanuralinda2110010500 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan myobj = new tunjangan(); //ini dari konstruktor
        myobj.setIdTunjangan("1234");
        myobj.setIdJabatan("222333");
        myobj.setUangMakan("750000");
        myobj.setUangTransportasi("300000");
        myobj.setTunjanganKel("500000");
        System.out.println(myobj.tunjangan);
        
    }
    
}
