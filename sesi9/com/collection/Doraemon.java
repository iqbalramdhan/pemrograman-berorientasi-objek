/*
Contoh Program ArrayList
*/
package com.collection;
import java.util.ArrayList;

public class Doraemon {
    public static void main(String[] args) {
        //Membuat obyek arraylist
        ArrayList<String> kantong = new ArrayList<String>();
        //Memasukan benda kedalam kantong
        kantong.add("Senter Ajaib");
        kantong.add("Pintu Kemana Saja");
        kantong.add("Tikus");
        kantong.add("Mesin Waktu");
        //menghapus tikus dari dalam kantong
        kantong.remove("Tikus");
        //Menampilkan jumlah barang yang ada dikantong
        System.out.println("Kantong Berisi "+ kantong.size() + " item");
        //Menampikan barang yang ada dikantong
        System.out.println("------------------------------------------------");
        for (String jmlh : kantong){
            System.out.println(jmlh);
        }
    }
}