/*
NIM              : 13020220116
Nama             : Zia Ul Haq Bahar
Hari/Tanggal     : Rabu 06/03/2024
Waktu Pengerjaan : 13:00
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class T2_data {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nim      : ");
        String nim = reader.readLine();
        System.out.print("Nama     : ");
        String nama = reader.readLine();
        System.out.print("Jurusan  : ");
        String jurusan = scanner.nextLine();
        System.out.print("Fakultas : ");
        String fakultas = scanner.nextLine();

        System.out.println("NIM : "+nim+"\n"+"Nama : "+nama+"\n"+"Jurusan : "+jurusan+"\n"+"Fakultas : "+fakultas);
        JOptionPane.showMessageDialog(null, "NIM : "+nim+"\n"+"Nama : "+nama+"\n"+"Jurusan : "+jurusan+"\n"+"Fakultas : "+fakultas);
    }
}