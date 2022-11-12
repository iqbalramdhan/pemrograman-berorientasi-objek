package Kampus;

import java.util.ArrayList;

public class Dosen extends Person {
    private int jumlahmatkul;
    private ArrayList<String> matkuList;

    public Dosen(String name, String address) {
        super(name, address);
        jumlahmatkul = 0;
        matkuList = new ArrayList<>();

    }

    public boolean addCourse(String course) {
        // jika dalam arraylist ada yang sama maka matkul telah ada
        if (matkuList.contains(course)) {
            System.out.println("matkul telah ada");
            return false;
        }

        // menambahkan
        jumlahmatkul++;
        matkuList.add(course);
        return true;
    }

    public boolean removeCourse(String course) {
        // jika dalam arraylist tidak ada course maka tidak bisa menghapus matkul
        if (!matkuList.contains(course)) {
            System.out.println("matkul yang akan dihapus tidak ada");
            return false;
        }

        // jika ada hapus
        jumlahmatkul--;
        matkuList.remove(course);
        return true;

    }

    public int getjumlahmatkul() {
        return jumlahmatkul;
    }

    public String toString() {
        return super.toString() +
                "\n jumlah mata kuliah yang diampu : " + getjumlahmatkul();
    }
}