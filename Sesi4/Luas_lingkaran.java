//contoh kasus Luas_lingkaran
package Sesi4;

public class Luas_lingkaran {
    //overloading method
    int add(int p, int r1, int r2) {
        int kali = p * r1 * r2;
        return kali;
    }

    double add(double p, double r1, double r2) {
        double kali = p * r1 * r2;
        return (double) kali;
    }

    public static void main(String[] args) {
        Luas_lingkaran hasil = new Luas_lingkaran();
        System.out.println(hasil.add(3.14, 10, 10));
        System.out.println(hasil.add(3.14, 10, 10));
    }
}
