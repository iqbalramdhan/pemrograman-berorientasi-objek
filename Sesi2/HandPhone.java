/*
No 4 Soal
Nama = Muhamad Iqbal Ramadhan
NIM = 20210040139
Kelas = TI21G
 */
package Sesi2;

public class HandPhone {
    public String jenis_hp;
    public int tahun_pembuatan;

    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenisHP() {
        return jenis_hp;
    }

    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Samsung", 2022);
        System.out.println("Jenis HP : " + hp.getJenisHP());
        System.out.println("Tahun Dibuatnya HP : " + hp.getTahunPembuatan());
    }
}
