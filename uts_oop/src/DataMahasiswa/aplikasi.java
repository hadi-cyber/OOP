package DataMahasiswa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Hadi
 */
public class aplikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aplikasi app = new aplikasi();
        Scanner sc = new Scanner(System.in);
        while (true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("==============");
                    System.out.println("MENU TAMBAH DATA");
                    System.out.println("==============");
                    app.addData();
                    break;
                case 2:
                    System.out.println("==============");
                    System.out.println("MENU UBAH DATA");
                    System.out.println("==============");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.println("MENU TAMBAH DATA");
                    System.out.println("==================================");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Daftar Data");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Hapus data ke-");
        int idx = sc.nextInt();
        //  hapus data
        operasi.removeData(idx - 1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Ubah data ke-");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.println("======================");
        System.out.print("Nama Mahasiswa : ");
        String NamaMahasiswa = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Alamat : ");
        String Alamat = sc.nextLine();
        System.out.print("Tempat Tanggal Lahir : ");
        String TempatTanggalLahir = sc.nextLine();
        System.out.print("Program Studi : ");
        String ProgramStudi = sc.nextLine();
        System.out.print("No HP : ");
        String no_hp = sc.nextLine();
        //  simpan perubahan
        operasi.editData(new data(NamaMahasiswa, nim, Alamat, TempatTanggalLahir, ProgramStudi, no_hp), idx - 1);
    }

    public void listData() {
        //  tampilkan daftar data
        List<data> result = operasi.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("data ke-" + (i + 1));
            System.out.println("  Nama Mahasiswa : " + result.get(i).getNamaMahasiswa());
            System.out.println("  NIM : " + result.get(i).getnim());
            System.out.println("  Alamat : " + result.get(i).getAlamat());
            System.out.println("  Tempat Tanggal Lahir : " + result.get(i).getTempatTanggalLahir());
            System.out.println("  Jurusan : " + result.get(i).getProgramStudi());
            System.out.println("  No HP : " + result.get(i).getno_hp());
        }
    }

    public void addData() {
        System.out.println("Silahkan isi lengkap data diri anda ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Mahasiswa : ");
        String NamaMahasiswa = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Alamat : ");
        String Alamat = sc.nextLine();
        System.out.print("Tempat Tanggal Lahir : ");
        String TempatTanggalLahir = sc.nextLine();
        System.out.print("Program Studi : ");
        String ProgramStudi = sc.nextLine();
        System.out.print("No HP : ");
        String no_hp = sc.nextLine();        //  simpan data
        operasi.addData(new data(NamaMahasiswa, nim, Alamat, TempatTanggalLahir, ProgramStudi, no_hp));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("=================================");
        System.out.println("APLIKASI PEREKAMAN DATA MAHASISWA");
        System.out.println("=================================");
        System.out.println("PIlih menu :");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }
}
