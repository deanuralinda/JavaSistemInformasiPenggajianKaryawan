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
public class dataSetTunjangan {
    private ArrayList<String> IdTunjangan;
    private ArrayList<String> IdJabatan;
    private ArrayList<Integer> UangMakan;
    private ArrayList<Integer> UangTransportasi;
    private ArrayList<Integer> TunjanganKel;
    
    public dataSetTunjangan(){
        IdTunjangan = new ArrayList<String>();
        IdJabatan = new ArrayList<String>();
        UangMakan = new ArrayList<Integer>();
        UangTransportasi = new ArrayList<Integer>();
        TunjanganKel = new ArrayList<Integer>();
    }
    
    public void tambahIdTunjangan(String value){
        IdTunjangan.add(value);
    }
     public ArrayList<String> getDatasetIdTunjangan(){
        return this.IdTunjangan;
    }
     
    public void tambahIdJabatan(String value){
        IdJabatan.add(value);
    }
     public ArrayList<String> getDatasetIdJabatan(){
        return this.IdJabatan;
    }
     
    public void tambahUangMakan(Integer x){
        UangMakan.add(x);
    }
     public ArrayList<Integer> getDatasetUangMakan(){
        return this.UangMakan;
    }
     
    public void tambahUangTransportasi(Integer y){
        UangTransportasi.add(y);
    }
     public ArrayList<Integer> getDatasetUangTransportasi(){
        return this.UangTransportasi;
    }
     
    public void tambahTunjanganKeluarga(Integer z){
        TunjanganKel.add(z);
    }
     public ArrayList<Integer> getDatasetTunjanganKeluarga(){
        return this.TunjanganKel;
    }
     
    public void tambahData(String idtunjangan, String idjabatan, Integer uangmakan, Integer uangtranportasi, Integer tunjangankel){
         this.IdTunjangan.add(idtunjangan);
         this.IdJabatan.add(idjabatan);
         this.UangMakan.add(uangmakan);
         this.UangTransportasi.add(uangtranportasi);
         this.TunjanganKel.add(tunjangankel);
     }
}
