/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deanuralinda2110010500;

/**
 *
 * @author ASUS
 */
public class karyawaan {
    private String idkaryawan;
    private String idjabatan;
    private String nip;
    private String namakaryawan;
    private String namabagian;
    private String status;
    
    public karyawaan (String idkaryawan, String idjabatan, String nip, String namakaryawan, String namabagian, String status){
    this.idkaryawan = idkaryawan;
    this.idjabatan = idjabatan;
    this.nip = nip;
    this.namakaryawan = namakaryawan;
    this.namabagian = namabagian;
    this.status = status;
    }
    
    public void setIdKaryawan (String idkaryawan){
        this.idkaryawan=idkaryawan;
    }
    
    public String getIdKaryawan (){
        return this.idkaryawan;
    }
    
    public void setIdJabatan(String idjabatan){
        this.idjabatan=idjabatan;
    } 
    
    public String getIdJabatan (){
        return this.idjabatan;
    }
    
    public void setNip(String nip){
        this.nip=nip;
    } 
    
    public String getNip (){
        return this.nip;
    }
    
    public void setNamaKaryawan(String namakaryawan){
        this.namakaryawan=namakaryawan;
    } 
    
    public String getNamaKaryawan (){
        return this.namakaryawan;
    }
    
    public void setNamaBagian(String namabagian){
        this.namabagian=namabagian;
    } 
    
    public String getNamaBagian (){
        return this.namabagian;
    }
    
    public void setStatus(String status){
        this.status=status;
    } 
    
    public String getStatus (){
        return this.status;
    }
    
    public void tampilkanKaryawan (){
        System.out.println("ID Karyawan : " + namabagian);
        System.out.println("ID Jabatan : " + idjabatan);
        System.out.println("NIP : " + nip);
        System.out.println("Nama Karyawan : " + namakaryawan);
        System.out.println("Nama Bagian : " + namabagian);
        System.out.println("Status : " + status);
    }
}
