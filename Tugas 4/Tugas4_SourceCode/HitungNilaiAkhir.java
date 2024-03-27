package Evaluasi.HitungNilai;

/*
Nama             : Zia Ul Haq Bahar
NIM              : 13020220116
Kelas            : A3 - TI
Modul            : Modul 4, No 3.
Waktu Pengerjaan : 27/03/2024, 21:50 WITA
*/

public class HitungNilaiAkhir {
    public double NilaiTugas(int tugas1, int tugas2) {
        return (tugas1 + tugas2) * 2.0;
    }

    public double nilaiAkhir(double tugas, int mid, int uas) {
        return (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
    }
}