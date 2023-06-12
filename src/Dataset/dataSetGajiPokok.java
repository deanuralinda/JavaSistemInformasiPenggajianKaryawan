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
public class dataSetGajiPokok {
    private ArrayList<String> IdGajiPokok;
    private ArrayList<String> IdJabatan;
    private ArrayList<String> Nominal;
    
    public dataSetGajiPokok(){
        IdGajiPokok = new ArrayList<String>();
        IdJabatan = new ArrayList<String>();
        Nominal = new ArrayList<String>();
    }
    
    public void tambahIdGajiPokok(String value){
        IdGajiPokok.add(value);
    }
     public ArrayList<String> getDatasetIdGajiPokok(){
        return this.IdGajiPokok;
    }
     
     public void tambahIdJbatan(String value){
        IdJabatan.add(value);
    }
     public ArrayList<String> getDatasetIdJabatan(){
        return this.IdJabatan;
    }
     
     public void tambahNominal(String value){
        Nominal.add(value);
    }
     public ArrayList<String> getDatasetNominal(){
        return this.Nominal;
    }
     
     public void tambahData(String idgajipokok, String idjabatan, String nominal){
         this.IdGajiPokok.add(idgajipokok);
         this.IdJabatan.add(idjabatan);
         this.Nominal.add(nominal);
     }
}
