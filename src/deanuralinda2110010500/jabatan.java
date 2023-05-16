/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deanuralinda2110010500;

/**
 *
 * @author ASUS
 */
public class jabatan {
    private String idjabatan;
    private String namajabatan;
    
    public jabatan (String idjabatan, String namajabatan){
    this.idjabatan = idjabatan;
    this.namajabatan = namajabatan;
    }
    
    public void setIdJabatan (String idjabatan){
        this.idjabatan=idjabatan;
    }
    
    public String getIdJabatan (){
        return this.idjabatan;
    }
    
    public void setNamaJabatan (String namajabatan){
        this.namajabatan=namajabatan;
    }
    
    public String getNamaJabatan (){
        return this.namajabatan;
    }
    
    public void TampilkanJabatan (){
        System.out.println("ID Jabatan : " + idjabatan);
        System.out.println("Nama Jabatan : " + namajabatan);
    }
    
}
