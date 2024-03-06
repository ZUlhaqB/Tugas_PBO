/*
NIM              : 13020220116
Nama             : Zia Ul Haq Bahar
Hari/Tanggal     : Rabu 06/03/2024
Waktu Pengerjaan : 13:00
*/

import javax.swing.JOptionPane;
public class T2_waktu {
    public static void main(String[] args){
        int totalDetik = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Detik"));
        System.out.println(totalDetik);

        long detikSekarang = totalDetik % 60;
        long totalMenit = totalDetik / 60;
        long menitSekarang = totalMenit % 60;
        long totalJam = totalMenit / 60;
        long jamSekarang = totalJam % 24;

        System.out.println("Waktu saat ini: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);
        JOptionPane.showMessageDialog(null, "Waktu saat ini: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);
    }
}