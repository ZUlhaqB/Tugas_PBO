package Modul4;

/*
Nama             : Zia Ul Haq Bahar
NIM              : 13020220116
Kelas            : A3 - TI
Modul            : Modul 4, No 2.
Waktu Pengerjaan : 27/03/2024, 21:50 WITA
*/

import java.util.*;

class Orang {
    public String nama;

    public Orang() {
        this.nama = "Zia Ul Haq Bahar";
    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Orang.");
    }
}

class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "1302002116"; //stambuk anda
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Mahasiswa.");
    }
}

public class Utamaa {
    public static void main(String[] args) {
        // Memanggil method info() dari kelas Orang
        Orang.info();
        
        // Memanggil method info() dari kelas Mahasiswa
        Mahasiswa.info();
    }
}