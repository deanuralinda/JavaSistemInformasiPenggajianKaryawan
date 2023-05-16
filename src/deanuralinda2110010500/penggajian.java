/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deanuralinda2110010500;

/**
 *
 * @author ASUS
 */
public class penggajian {
    private String idpenggajian;
    private String idkaryawan;
    private int bulan;
    private String statuspengambilan;
    private int total;
    
    public penggajian (String idpenggajian, String idkaryawan, int bulan, String statuspengembilan, int total){
    this.idpenggajian=idpenggajian;
    this.idkaryawan=idkaryawan;
    this.bulan=bulan;
    this.statuspengambilan=statuspengembilan;
    this.total=total;
    }
    
    public void setIdPenggajian (String idpenggajian){
        this.idpenggajian=idpenggajian;
    }
    
    public String getIdPenggajian (){
        return this.idpenggajian;
    }
    
    public void setIdKaryawan (String idkaryawan){
        this.idkaryawan=idkaryawan;
    }
    
    public String getIdKaryawan (){
        return this.idkaryawan;
    }
    
    public void setBulan (int perbulan){
    //bulan 1-3
    if ( perbulan >= 1 && perbulan <= 3){
        this.bulan=6000000;
    } else if ( perbulan >= 4 && perbulan <= 6){
        this.bulan=12000000;
    } else {
        this.bulan=18000000;
        }
    }
    
    public int getBulan (){
        return this.bulan;
    }
    
    public void setStatusPengambilan (String statuspengambilan){
        this.statuspengambilan=statuspengambilan;
    }
    
    public String getStatusPengambilan (){
        return this.statuspengambilan;
    }
    
    public void setTotal (String total){
    if (total.equals("Manager")){
        this.total=3000000;
        } else if (total.equals("Staf Keuangan")){
        this.total=3500000;
        } else {
        this.total=4000000;
        }
    }
    
    public int getTotal (){
        return this.total;
    }
    
    public void tampilkanPenggajian (){
        System.out.println("ID Penggajian : " + idpenggajian);
        System.out.println("ID Karyawan : " + idkaryawan);
        System.out.println("Bulan : " + bulan);
        System.out.println("Status Pengambilan : " + statuspengambilan);
        System.out.println("Total : " + total);
    }
}
