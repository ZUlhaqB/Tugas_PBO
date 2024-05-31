/*
NIM              : 13020220116
Nama             : Zia Ul Haq Bahar
Hari/Tanggal     : Selasa, 28 Mei 2024
Waktu Pengerjaan : 08:00
*/

package id.bio.model;

public class Jurusan {
    private String id;
    private String nama;
    public Jurusan(String id) {
        this.id = id;
        this.nama = nama;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public String toString(){
        return "Jurusan{" + "id=" + id + ", nama=" + nama + '}' ;
    }
}
