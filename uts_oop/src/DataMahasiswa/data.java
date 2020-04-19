package DataMahasiswa;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadi
 */
public class data {
    private String NamaMahasiswa;
    private String Alamat;
    private String TempatTanggalLahir;
    private String ProgramStudi;
    private String nim;
    private String no_hp;

    public data() {
        NamaMahasiswa = "";
        nim = "";
        Alamat = "";
        TempatTanggalLahir = "";
        ProgramStudi = "";
        no_hp = "";
    }

    public data(String NamaMahasiswa,  String nim, String Alamat, String TempatTanggalLahir, String ProgramStudi, String no_hp) {
        this.NamaMahasiswa = NamaMahasiswa;
        this.nim = nim;
        this.Alamat = Alamat;
        this.TempatTanggalLahir = TempatTanggalLahir;
        this.ProgramStudi = ProgramStudi;
        this.no_hp = no_hp;
    }

    public void setNamaMahasiswa(String NamaMahasiswa) {
        this.NamaMahasiswa = NamaMahasiswa;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setTempatTanggalLahir(String TempatTanggalLahir) {
        this.TempatTanggalLahir = TempatTanggalLahir;
    }
    public void setProgramStudi(String ProgramStudi) {
        this.ProgramStudi = ProgramStudi;
    }
    public void setno_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getNamaMahasiswa() { return NamaMahasiswa; }

    public String getnim() { return nim; }

    public String getAlamat() { return Alamat; }

    public String getTempatTanggalLahir() { return TempatTanggalLahir; }
    
    public String getProgramStudi() { return ProgramStudi; }

    public String getno_hp() { return no_hp; }
}


