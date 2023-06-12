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
public class dataSetKaryawan {
    private ArrayList<String> IdKaryawan;
    private ArrayList<String> IdJabatan;
    private ArrayList<String> Nip;
    private ArrayList<String> NamaKaryawan;
    private ArrayList<String> NamaBagian;
    private ArrayList<String> Status;
    
    public dataSetKaryawan(){
        IdKaryawan = new ArrayList<String>();
        IdJabatan = new ArrayList<String>();
        Nip = new ArrayList<String>();
        NamaKaryawan = new ArrayList<String>();
        NamaBagian = new ArrayList<String>();
        Status = new ArrayList<String>();
    }
    
    public void tambahIdKaryawan(String value){
        IdKaryawan.add(value);
    }
     public ArrayList<String> getDatasetIdKaryawan(){
        return this.IdKaryawan;
    }
     
    public void tambahIdJabatan(String value){
        IdJabatan.add(value);
    }
     public ArrayList<String> getDatasetIdJabatan(){
        return this.IdJabatan;
    }
     
    public void tambahNip(String value){
        Nip.add(value);
    }
     public ArrayList<String> getDatasetNip(){
        return this.Nip;
    }
    
    public void tambahNamaKaryawan(String value){
        NamaKaryawan.add(value);
    }
     public ArrayList<String> getDatasetNamaKaryawan(){
        return this.NamaKaryawan;
    }
     
    public void tambahNamaBagian(String value){
        NamaBagian.add(value);
    }
     public ArrayList<String> getDatasetNamaBagian(){
        return this.NamaBagian;
    }
     
    public void tambahStatus(String value){
        Status.add(value);
    }
     public ArrayList<String> getDatasetStatus(){
        return this.Status;
    }
     
    public void tambahData(String idkaryawan, String idjabatan, String namakaryawan, String namabagian, String status){
         this.IdKaryawan.add(idkaryawan);
         this.IdJabatan.add(idjabatan);
         this.NamaKaryawan.add(namakaryawan);
         this.NamaBagian.add(namabagian);
         this.Status.add(status);
     }
}
