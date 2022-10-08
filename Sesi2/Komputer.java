/*
No 3 Soal
Nama = Muhamad Iqbal Ramadhan
NIM = 20210040139
Kelas = TI21G
 */
package Sesi2;

public class Komputer {     //1. Class Declaration, mendefinisikan sebuah class Komputer
    String jenis_komputer;
    private String merk;    //2. Attribute, attribute dari sebuah class Komputer

    public void setDataKomputer (String jenis, String merk) {
        jenis_komputer = jenis;
        this.merk = merk;       /*3. Method Declaration, sebuah method setter untuk mendeklarasi sebuah nilai variable jenis dan merk,
                                     yang nantinya akan diberi sebuah nilai oleh programmer*/
    }

    public String getJenis() {
        return jenis_komputer;  /*4. Method, ini menggunakan method jenis getter untuk mengambil nilai variable jenis,
                                     dan mengembalikan nilai return sebagai timbal balik.*/
    }

    public String getMerk() {
        return merk;            /*5. Method, sama ini juga menggunakan method jenis getter untuk mengambil nilai variable merk,
                                     dan mengembalikan nilai return sebagai timbal balik.*/
    }

    public static void main(String[] args) {
        Komputer mykom = new Komputer();    //6. Object, Membuat object dengan nama mykom
        mykom.setDataKomputer("LAPTOP", "MACBOOK");  /*7. Method Setter, Memberi nilai kemasing - masing variable jenis dan merk,
                                                                      dengan nilai string "LAPTOP" dan "MACBOOK".*/
        System.out.println(mykom.getJenis());
        System.out.println(mykom.getMerk());        //8. Print Output, Menampilkan serta mengambil nilai dari variable jenis dan merk.
    }
}
