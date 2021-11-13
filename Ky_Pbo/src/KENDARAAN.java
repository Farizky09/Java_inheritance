/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class KENDARAAN {
      //deklarasi variabel
    private String merk, warna, tahun;
    
    //constructor
    KENDARAAN()
    {  
    }
    KENDARAAN (String merk, String warna, String tahun)
    {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    //setter
    public void setMerk(String k)
    {
        merk = k;
    }
     public void setWarna(String n)
    {
        warna = n;
    } public void setTahun(String l)
    {
        tahun = l;
    }
    
    //getter
    public String getMerk()
    {
        return merk;
    }
     public String getWarna()
    {
        return warna;
    }
     public String getTahun()
    {
        return tahun;
    }
}


