import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input Nilai Mahasiswa Ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + " : ");
           
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai Rata-Rata Mahasiswa " + (i + 1) + ": " + totalPerSiswa / jumlahMataKuliah);
        }
        System.out.println("====================================");
        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah: ");
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }
    }   
    
}