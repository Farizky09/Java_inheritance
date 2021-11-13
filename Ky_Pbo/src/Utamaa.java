
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Utamaa {
     public static void main (String [] args)throws Exception
     {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //instance of class
        Motor motorA = new Motor("","","");
        Motor motorB = new Motor("","","","","");
        //menu
        while(true)
        {
            //menu
            System.out.println("================");
            System.out.println("MENU MOTOR");
            System.out.println("================");
            System.out.println("1. Input MOTOR A");
            System.out.println("2. Input MOTOR B");
            System.out.println("3. Lihat Data MOTOR");
            System.out.println("4. Keluar");
            System.out.println("================");
        
        //input
        System.out.print("Masukan pilihan = ");
        int pilih = Integer.parseInt (br.readLine());
        System.out.println();
        
        //proses + output
        switch(pilih)
        {
            //jika pilih = 1
            case 1:
                //isi pilihan bernilai 1 ketika dijalankan
                System.out.println("================");
                System.out.println("INPUT MOTOR A");
                System.out.println("================");
                System.out.print("Masukan merk = ");
                String merk = br.readLine();
                System.out.print("Masukan warna = ");
                String warna = br.readLine();
                System.out.print("Masukan tahun = ");
                String tahun = br.readLine();
                
               motorA = new Motor(merk, warna, tahun);
                
                System.out.println();
                
                System.out.println("### Data MOTOR A telah disimpan###");
                break;
            //jika pilih = 2
            case 2:
                //isi pilihan bernilai 2 ketika dijalankan
                System.out.println("================");
                System.out.println("INPUT MOTOR B");
                System.out.println("================");
                System.out.print("Masukan merk = ");
                merk = br.readLine();
                System.out.print("Masukan warna = ");
                warna = br.readLine();
                System.out.print("Masukan tahun = ");
                tahun = br.readLine();
                System.out.print("Masukan jenis = ");
                String jenis = br.readLine();
                System.out.print("Masukan tipe = ");
                String tipe = br.readLine();
                
                motorB = new Motor(merk, warna, tahun, jenis, tipe);
                
                System.out.println();
                
                System.out.println("### Data MOTOR B telah disimpan###");
                break;
            //jika pilih = 3
            case 3:
                //isi pilihan bernilai 3 ketika dijalankan
                System.out.println("================");
                System.out.println("DATA MOTOR");
                System.out.println("================");
                
                System.out.println("MOTOR A");
                System.out.println("Merk Motor A = "+motorA.getMerk());
                System.out.println("Warna Motor A = "+motorA.getWarna());
                System.out.println("Tahun Motor A = "+motorA.getTahun());
                System.out.println("Jenis Motor A = "+motorA.getJenis());
                System.out.println("Tipe Motor A = "+motorA.getTipe());
                
                System.out.println();
                
                System.out.println("MOTOR B");
                System.out.println("Merk Motor B = "+motorB.getMerk());
                System.out.println("Warna Motor B = "+motorB.getWarna());
                System.out.println("Tahun Motor B = "+motorB.getTahun());
                System.out.println("Jenis Motor B = "+motorB.getJenis());
                System.out.println("Tipe Motor B = "+motorB.getTipe());
                
                System.out.println("================");
                break;
             //jika nilai pilih yang dimasukkan bukan 1,2,atau 3, maka program akan keluar secara otomatis
            default:
                System.exit(0);
        }
    }
     }
}



