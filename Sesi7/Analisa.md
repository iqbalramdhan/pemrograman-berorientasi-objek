<!--- Nama  = Muhamad Iqbal -->
<!--- Kelas = TI21G -->

# Hasil analisa saya dari nomor 1 dan 2!
## Hasil nomor 1
- Berikan analisa anda terkait program tersebut!
- Jika file tersebut dieksekusi maka akan menghasilkan file dengan ekstensi .class, sebutkan file class apa saja yang dihasilkan! 
- Jawab
> 1. Terdapat 3 buah file extensi .class yaitu Outer.class, Main.class dan Outer$Inner.class
> 2. Program berjalan dengan benar karena tidak ada bug, terdapat Inner class yaitu Kelas Inner di dalam kelas Outer. Pada kelas main akan dibuat objek Outer dengan nama out.

## Hasil nomor 2
- Apakah yang terjadi jika kode ++number diganti dengan number++?berikan analisa anda!
- Jika file tersebut dieksekusi maka akan menghasilkan file dengan ekstensi .class, sebutkan file class apa saja yang dihasilkan!
> - 1. Terdapat perberdaan antara ++number (prefix) dan number++ (postfix).
> ``++number`` Di inisiasikan variable number dengan value 0, ketika melakukan increment pada method print, ++number akan menambahkan variabel number dengan 1 terlebih dahulu sebelum dilakukannya print (muncul pada konsol). Maka yang dihasilkan
> ![++number file!](/Sesi7/dua/Screenshot_22.png "++number file")
>
> ``number++`` Sebaliknya dengan number++, pemanggilan variabel number yang bernilai 0 akan di munculkan terlebih dahulu oleh method print sebelum melakukan penambahan dengan
>  ![number++ file!](/Sesi7/dua/Screenshot_23.png "number file++")
> - 2. Terdapat 3 buah class yang dibuat yaitu Outer.class.Outer$1Inner.class, OuterAccess.class