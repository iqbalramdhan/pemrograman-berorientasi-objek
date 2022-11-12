/*
Nama    = Muhamad Iqbal Ramadhan
NIM     = 20210040139
Kelas   = TI21G
 */
package Sesi5.Kampus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("masukan nama dosen : ");
        String nama = sc.nextLine();
        System.out.print("masukan alamat dosen : ");

        String alamat = sc.nextLine();

        Dosen dosen1 = new Dosen(nama, alamat);

        for (int i = 0; i < 3; i++) {
            System.out.print("masukan mata kuliah yang diampu: ");
            String matkul = sc.nextLine();
            dosen1.addCourse(matkul);
        }

        System.out.println(dosen1);
        sc.close();
    }
}