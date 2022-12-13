/*
Contoh Program ArrayDeque
*/
package com.collection;

import java.util.ArrayDeque;

public class DoraemonII {

    public static void main(String[] args) {
        //Buat obyek arraydeque
        ArrayDeque<String> kantong = new ArrayDeque<String>();
        //Masukan benda kedalam kantong
        kantong.add("Senter Ajaib");
        kantong.add("Pintu Kemana Saja");
        kantong.add("Printer 3D");
        //Masukan benda pertama kali
        kantong.addFirst("Mesin Waktu");
        //Masukan benda terakhir
        kantong.addLast("Tikus");
        //Hapus benda terakhir
        kantong.removeLast();
        //Menampilkan jumlah barang dikantong
        System.out.println("Kantong Berisi " + kantong.size() + " item");
        //Menampilkan barang yang ada dikantong
        System.out.println("------------------------------------------------");
        for (String jml : kantong) {
            System.out.println(jml);
        }
    }
}
