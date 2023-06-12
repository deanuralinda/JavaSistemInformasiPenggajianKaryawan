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
public class dataSetJabatan {
    private ArrayList<String> IdJabatan;
    private ArrayList<String> NamaJabatan;
    
    public dataSetJabatan(){
        IdJabatan = new ArrayList<String>();
        NamaJabatan = new ArrayList<String>();
    }
    
    public void tambahIdJabatan(String value){
        IdJabatan.add(value);
    }
     public ArrayList<String> getDatasetIdJabatan(){
        return this.IdJabatan;
    }
     
    public void tambahNamaJabatan(String value){
        NamaJabatan.add(value);
    }
     public ArrayList<String> getDatasetNamaJabatan(){
        return this.NamaJabatan;
    }
     
    public void tambahData(String idjabatan, String namajabatan, String nominal){
         this.IdJabatan.add(idjabatan);
         this.NamaJabatan.add(namajabatan);
     }
    
}
