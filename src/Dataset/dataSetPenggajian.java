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
public class dataSetPenggajian {
    private ArrayList<String> IdPenggajian;
    private ArrayList<String> IdKaryawan;
    private ArrayList<Integer> Bulan;
    private ArrayList<String> StatusPengambilan;
    private ArrayList<Integer> Total;
    
    public dataSetPenggajian(){
        IdPenggajian = new ArrayList<String>();
        IdKaryawan = new ArrayList<String>();
        Bulan = new ArrayList<Integer>();
        StatusPengambilan = new ArrayList<String>();
        Total = new ArrayList<Integer>();
    }
    
    public void tambahIdPenggajian(String value){
        IdPenggajian.add(value);
    }
     public ArrayList<String> getDatasetIdPenggajian(){
        return this.IdPenggajian;
    }
     
    public void tambahIdKaryawan(String value){
        IdKaryawan.add(value);
    }
     public ArrayList<String> getDatasetIdKaryawan(){
        return this.IdKaryawan;
    }
     
    public void tambahBulan(Integer y){
        Bulan.add(y);
    }
     public ArrayList<Integer> getDatasetBulan(){
        return this.Bulan;
    }
     
    public void tambahStatusPengambilan(String value){
        StatusPengambilan.add(value);
    }
     public ArrayList<String> getDatasetStatusPengambilan(){
        return this.StatusPengambilan;
    }
     
    public void tambahTotal(Integer x){
        Total.add(x);
    }
     public ArrayList<Integer> getDatasetTotal(){
        return this.Total;
    }
     
    public void tambahData(String idpenggajian, String idkaryawan, Integer bulan, String statuspengambian, Integer total){
         this.IdPenggajian.add(idpenggajian);
         this.IdKaryawan.add(idkaryawan);
         this.Bulan.add(bulan);
         this.StatusPengambilan.add(statuspengambian);
         this.Total.add(total);
     }
}
