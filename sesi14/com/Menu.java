package sesi14.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Menu {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/toko";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void main(String[] args) {

        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data Supplier");
        System.out.println("2. Insert Data Barang");
        System.out.println("3. Insert Data Makanan");
        System.out.println("4. Show Data All");
        System.out.println("5. Edit Data");
        System.out.println("6. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertSupplier();
                    break;
                case 2:
                    insertBarang();
                    break;
                case 3:
                    insertMakanan();
                    break;
                case 4:
                    showData();
                    break;
                case 5:
                    updateSupplier();
                    break;
                case 6:
                    deleteSupplier();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData() {
        String sql = "SELECT * FROM supplier,tbl_barang,tbl_makanan";

        try {
            rs = stmt.executeQuery(sql);
            int nomor = 0;
            System.out.println("+--------------------------------+");
            System.out.println("|     DATA TOKO KELONTONGAN      |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                nomor++;
                System.out.println("Nomor:" + nomor);

                int kode_supplier = rs.getInt("kode_supplier");
                String nama_supplier = rs.getString("nama_supplier");
                String no_hp = rs.getString("no_hp");
                String nama_barang = rs.getString("nama_barang");
                int harga_barang = rs.getInt("harga_barang");
                int stok_barang = rs.getInt("stok_barang");
                String nama_makanan = rs.getString("nama_makanan");
                int harga_makanan = rs.getInt("harga_makanan");
                int stok_makanan = rs.getInt("stok_makanan");

                System.out.println(String.format("(%d) %s %s -- %s %s %s -- %s %s %s", kode_supplier, nama_supplier,
                        no_hp, nama_barang, harga_barang, stok_barang, nama_makanan, harga_makanan, stok_makanan));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertSupplier() {
        try {
            System.out.print("Masukan Kode Supplier: ");
            int kode_supplier = Integer.parseInt(input.readLine());
            System.out.print("Masukan Nama Supplier: ");
            String nama_supplier = input.readLine().trim();
            System.out.print("Masukan no hp: ");
            String no_hp = input.readLine().trim();

            String sql = "INSERT INTO supplier (kode_supplier, nama_supplier, no_hp) VALUE('%s', '%s', '%s')";
            sql = String.format(sql, kode_supplier, nama_supplier, no_hp);

            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertBarang() {
        try {
            System.out.print("Masukan kode barangnya: ");
            int kode_barang = Integer.parseInt(input.readLine().trim());
            System.out.print("Masukan nama barang: ");
            String nama_barang = input.readLine();
            System.out.print("Tentukan harga barangnya: ");
            int harga_barang = Integer.parseInt(input.readLine().trim());
            System.out.print("Tentukan Stoknya: ");
            int stok_barang = Integer.parseInt(input.readLine().trim());

            String sql = "INSERT INTO tbl_barang (kode_barang, nama_barang, harga_barang, stok_barang) VALUE('%s', '%s', '%s', '%s')";
            sql = String.format(sql, kode_barang, nama_barang, harga_barang, stok_barang);

            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertMakanan() {
        try {
            System.out.print("Masukan kode makanan: ");
            int kode_makanan = Integer.parseInt(input.readLine().trim());
            System.out.print("Masukan nama makanan: ");
            String nama_makanan = input.readLine();
            System.out.print("Tentukan harga makanan: ");
            int harga_makanan = Integer.parseInt(input.readLine().trim());
            System.out.print("Tentukan Stoknya: ");
            int stok_makanan = Integer.parseInt(input.readLine().trim());

            String sql = "INSERT INTO tbl_makanan (kode_makanan, nama_makanan, harga_makanan, stok_makanan) VALUE('%s', '%s', '%s', '%s')";
            sql = String.format(sql, kode_makanan, nama_makanan, harga_makanan, stok_makanan);

            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void updateSupplier() {
        try {
            System.out.print("Kode ID Supplier yang mau diedit: ");
            int idSupplier = Integer.parseInt(input.readLine());
            System.out.print("Masukan Nama Baru Supplier: ");
            String nama_supplier = input.readLine().trim();
            System.out.print("Masukan no hp Baru Supplier: ");
            String no_hp = input.readLine().trim();

            String sql = "UPDATE supplier SET nama_supplier='%s', no_hp='%s' WHERE kode_supplier=%s";
            sql = String.format(sql, nama_supplier, no_hp, idSupplier);

            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteSupplier() {
        try {
            System.out.print("ID Supplier yang mau dihapus: ");
            int idSupplier = Integer.parseInt(input.readLine());

            String sql = String.format("DELETE FROM supplier WHERE kode_supplier=%s", idSupplier);

            stmt.execute(sql);

            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}