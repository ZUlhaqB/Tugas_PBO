/*
NIM              : 13020220116
Nama             : Zia Ul Haq Bahar
Hari/Tanggal     : Selasa, 28 Mei 2024
Waktu Pengerjaan : 08:00
*/

package id.bio.dao;

import id.bio.model. Jurusan; 
import java.util.List;

public interface JurusanDAO {
    public boolean insert (Jurusan j);
    public boolean update (Jurusan j);
    public boolean delete (Jurusan j);
    public List<Jurusan> getAllJurusan ();
    public Jurusan getByID (String id);
    public List<Jurusan> getByName (String name);
}
