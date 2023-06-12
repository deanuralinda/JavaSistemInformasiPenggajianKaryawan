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
public class dataSetAbsen {
    private ArrayList<String> idabsen;
    private ArrayList<String> idkaryawan;
    private ArrayList<String> tanggalmasuk;
    private ArrayList<String> jammasuk;
    private ArrayList<String> jamkeluar;
    
    public dataSetAbsen(){
        idabsen =new ArrayList<String>();
        idkaryawan = new ArrayList<String>();
        tanggalmasuk = new ArrayList<String>();
        jammasuk = new ArrayList<String>();
        jamkeluar = new ArrayList<String>();
    }
    
    public void tambahIdAbsen(String value){
        idabsen.add(value);
    }
    
    public ArrayList<String> getDataSetIdAbsen(){
        return this.idabsen;
    }
    
    public void tambahIdKayawan(String value){
        idkaryawan.add(value);
    }
    
    public ArrayList<String> getDataSetIdKaryawan(){
        return this.idkaryawan;
    }
    
    public void tambahTangggalMasuk(String value){
        tanggalmasuk.add(value);
    }
    
    public ArrayList<String> getDataSetTanggalMasuk(){
        return this.tanggalmasuk;
    }
    
    public void tambahJamMasuk(String value){
        jammasuk.add(value);
    }
    
    public ArrayList<String> getDataSetJamMasuk(){
        return this.jammasuk;
    }
    
    public void tambahJamKeluar(String value){
        jamkeluar.add(value);
    }
    
    public ArrayList<String> getDataSetJamKeluar(){
        return this.jamkeluar;
    }
    
    public void tambahData(String idabsen, String idkaryawan, String tanggalmasuk, String jammasuk, String jamkeluar){
         this.idabsen.add(idabsen);
         this.idkaryawan.add(idkaryawan);
         this.tanggalmasuk.add(tanggalmasuk);
         this.jammasuk.add(jammasuk);
         this.jamkeluar.add(jamkeluar);
         
     }
    
}
