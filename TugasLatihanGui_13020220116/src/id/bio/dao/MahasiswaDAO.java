/*
NIM              : 13020220116
Nama             : Zia Ul Haq Bahar
Hari/Tanggal     : Selasa, 28 Mei 2024
Waktu Pengerjaan : 08:00
*/

package id.bio.dao;

import id.bio.model.Mahasiswa;
import java.util.List;
public interface MahasiswaDAO {
    public boolean insert (Mahasiswa m);
    public boolean update (Mahasiswa m);
    public boolean delete (Mahasiswa m);
    public List<Mahasiswa> getAllMahasiswa();
    public Mahasiswa getByID (String nim);
    public List<Mahasiswa> getByName (String name);
}
