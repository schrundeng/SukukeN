package sukukeN;

import java.util.Scanner;

public class sukukeN {
    public static void main(String[] args) {
        String ulang = "";
        do{
        Scanner in = new Scanner(System.in);
        System.out.println("Kalkulator Nilai Suku ke n & Jumlah Suku ke n");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan Nilai Suku Pertama= ");
        int nilaiSukuPertama= in.nextInt();
        System.out.print("Masukkan Selisih Suku= ");
        int selisih=in.nextInt();
        int sukuPertama=1;
        System.out.print("Masukkan Nilai Suku ke n= ");
        int sukuTerakhir=in.nextInt();
        int nilaiSukukeN=nilaiSukuPertama;
        for(int n=sukuPertama; n<=sukuTerakhir; n++){
           nilaiSukukeN=nilaiSukuPertama+(selisih*(n-1));
           System.out.println("Nilai suku ke "+n+" = "+nilaiSukukeN);
        } 
        int Sn=sukuTerakhir/2*(sukuPertama+nilaiSukukeN);
        System.out.println("Jumlah Total Suku ke "+sukuTerakhir+" = "+Sn);
        System.out.println("Apakah anda ingin mengulang? (ya/tidak)");
        ulang = in.next();
        }while (ulang.equalsIgnoreCase("ya"));
    }
}