/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deanuralinda2110010500;

/**
 *
 * author deanuralinda
 */
public class gajipokok {
    private String idgajipokok;
    private String idjabatan;
    private String nominal;
    
    public gajipokok( String idgajipokok, String idjabatan, String nominal ){
    this.idgajipokok = idgajipokok;
    this.idjabatan = idjabatan;
    this.nominal = nominal;
    }
    
    public void setIdGajiPokok(String idgajipokok){
        this.idgajipokok=idgajipokok;
    }
    
    public String getIdGajiPokok(){
        return this.idgajipokok;
    }
    
    public void setIdJabatan(String idjabatan){
        this.idjabatan=idjabatan;
    }
    
    public String getIdJabatan(){
        return this.idjabatan;
    }
    
    public void setNominal(String posisi){
        if (posisi.equals("Manager")) {
            this.nominal = "4000000";
        } else if(posisi.equals("Staff Keuangan")) {
            this.nominal = "3500000";
        } else {
            this.nominal = "3000000";
        }
    }
    
    public String getNominal(){
        return this.nominal;
    }
    
    public void tampilkanGajiPokok(){
        System.out.println("ID Gaji Pokok : " + idgajipokok);
        System.out.println("ID Jabatan : " + idjabatan);
        System.out.println("Nominal : " + nominal);
    }
}