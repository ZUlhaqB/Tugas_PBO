/*
NIM              : 13020220116
Nama             : Zia Ul Haq Bahar
Hari/Tanggal     : Rabu 13/03/2024
Waktu Pengerjaan : 15:40
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaString {

    public static void main(String[] args) throws IOException {

        String str;
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nBaca string dan Integer: \n");
        System.out.print("masukkan sebuah string: ");
        str = datAIn.readLine();
        System.out.print("String yang dibaca : " + str);
    }
}