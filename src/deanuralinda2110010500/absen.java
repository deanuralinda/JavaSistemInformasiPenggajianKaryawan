/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deanuralinda2110010500;

/**
 *
 * @author ASUS
 */
public class absen {
   private String idabsen;
   private String idkaryawan;
   private String tanggalmasuk;
   private String jammasuk;
   private String jamkeluar;
   
   public absen (String idabsen, String idkaryawan, String tanggalmasuk, String jammasuk, String jamkeluar){
   this.idabsen = idabsen;
   this.idkaryawan = idkaryawan;
   this.tanggalmasuk = tanggalmasuk;
   this.jammasuk = jammasuk;
   this.jamkeluar = jamkeluar;
   }
   
   public void setIdAbsen (String idabsen){
        this.idabsen=idabsen;
    }
    
    public String getIdAbsen (){
        return this.idabsen;
    }
    
   public void setIdKaryawan (String idkaryawan){
        this.idkaryawan=idkaryawan;
    }
    
    public String getIdKaryawan (){
        return this.idkaryawan;
    }
    
    public void setTanggalMasuk (String tanggalmasuk){
        this.tanggalmasuk=tanggalmasuk;
    }
    
    public String getTanggalMasuk (){
        return this.tanggalmasuk;
    }
    
    public void setJamMasuk (String jammasuk){
        this.jammasuk=jammasuk;
    }
    
    public String getJamMasuk(){
        return this.jammasuk;
    }
    
    public void setJamKeluar (String jamkeluar){
        this.jamkeluar=jamkeluar;
    }
    
    public String getJamKeluar (){
        return this.jamkeluar;
    }
    
    public void tampilkanInfoAbsen(){
        System.out.println("ID Absen : " + idabsen);
        System.out.println("ID Karyawan : " + idkaryawan);
        System.out.println("Tanggal Masuk : " + tanggalmasuk);
        System.out.println("Jam Masuk : " + jammasuk);
        System.out.println("Jam Keluar : " + jamkeluar);
    }
}
