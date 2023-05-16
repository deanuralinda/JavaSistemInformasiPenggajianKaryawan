/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deanuralinda2110010500;

/**
 *
 * @author ASUS
 */
public class tunjangan {
    private String idtunjangan;
    private String idjabatan;
    private int uangmakan;
    private int uangtransportasi;
    private int tunjangankel;
    
    public tunjangan (String idtunjangan, String idjabatan, int uangmakan, int uangtransportasi, int tunangankel){
    this.idtunjangan=idtunjangan;
    this.idjabatan=idjabatan;
    this.uangmakan=uangmakan;
    this.uangtransportasi=uangtransportasi;
    this.tunjangankel=tunangankel;
}
    
    public void setIdtunjangan (String idtunjangan){
        this.idtunjangan=idtunjangan;
    }
    
    public String getIdTunjangan (){
        return this.idtunjangan;
    }
    
    public void setIdJabatan (String idjabatan){
        this.idjabatan=idjabatan;
    }
    
    public String getIdJabatan (){
        return this.idjabatan;
    }
    
    public void setUangMakan (int minggu){
        if (minggu >= 3 && minggu <= 4 ){
            this.uangmakan=750000;
        }else{
            //minggu 7-8
            this.uangmakan=1500000;
        }
    }
    
    public int getUangMakan (){
        return this.uangmakan;
    }
    
    public void setUangTransportasi (int minggu){
        if (minggu >= 3 && minggu <= 4 ){
            this.uangtransportasi=300000;
        }
    }
    
    public int getUangTransportasi (){
        return this.uangtransportasi;
    }
    
    public void setTunjanganKel (int jumlahanak){
        //anak 1-3
        if (jumlahanak >= 1 && jumlahanak <= 3){
            this.tunjangankel=500000;
        //anak 4-6
       }else if (jumlahanak >= 4 && jumlahanak <= 6 ){
           this.tunjangankel=750000;
        //anak 7-9
       }else if (jumlahanak >= 7 && jumlahanak <= 9){
           this.tunjangankel=1000000;
       }else if (jumlahanak >= 10 && jumlahanak <= 12){
           this.tunjangankel=1250000;
       }else
           //13....n
           this.tunjangankel=1500000;
    }
    
    public int getTunjanganKel (){
        return this.tunjangankel;
    }
    
    public void tampilkanTunjangan(){
        System.out.println("ID Tunjangan : " + idtunjangan);
        System.out.println("ID Jabatan : " + idjabatan);
        System.out.println("Uang Makan : " + uangmakan);
        System.out.println("Uang Transportasi : " + uangtransportasi);
        System.out.println("Tunjangan Keluarga : " + tunjangankel);
    }
}
