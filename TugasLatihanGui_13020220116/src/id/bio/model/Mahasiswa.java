/*
NIM              : 13020220116
Nama             : Zia Ul Haq Bahar
Hari/Tanggal     : Selasa, 28 Mei 2024
Waktu Pengerjaan : 08:00
*/

package id.bio.model;

public class Mahasiswa {
   private String stambuk, nama;
   private Jurusan prodi;
   public Mahasiswa(String stambuk, String nama, Jurusan prodi){
       this.stambuk = stambuk;
       this.nama = nama;
       this.prodi = prodi;
   }
   public Mahasiswa(String stambuk){
       this.stambuk = stambuk;
   }
    public String getStambuk() {
        return stambuk;
    }

    public void setStambuk(String stambuk) {
        this.stambuk = stambuk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Jurusan getProdi() {
        return prodi;
    }

    public void setProdi(Jurusan prodi) {
        this.prodi = prodi;
    } 
}
