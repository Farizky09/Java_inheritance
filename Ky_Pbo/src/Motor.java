/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Motor extends KENDARAAN {
    
     public Motor() {
    }
    //deklarasi variabel
    private String jenis="unknown";
    private String tipe="unknown";
    //constructor
    Motor (String merk, String warna, String tahun)
    {
        super(merk,warna,tahun);
    }
    Motor (String merk, String warna, String tahun, String jenis, String tipe)
    {
        super.setMerk(merk);
        super.setWarna(warna);
        super.setTahun(tahun);
        
        this.jenis = jenis;
        this.tipe = tipe;
    }
    //getter
   public String getMerk()
   {
       return super.getMerk();
   }
   public String getWarna()
   {
    return super.getWarna();
   }
   public String getTahun()
   {
       return super.getTahun();
   }
   public String getJenis()
   {
       return jenis;
   }
   public String getTipe()
   {
       return tipe;
   }
   
}


