import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("fikri", "3i", "Struktur Data", 2021037031));
        mhs.put("2", new Mahasiswa("ivan", "3d", "Matematika", 2021037032));
        mhs.put("3", new Mahasiswa("gahfur", "3c", "Pemrograman", 2021037033));

        System.out.println("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa: " + data.nama + ", Kelas: " + data.kelas + ", Mata Kuliah Praktikum: " + data.matkulPraktikum + ", NIM: " + data.nim);
        }
    }
}