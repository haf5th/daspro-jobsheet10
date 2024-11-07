import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println(" Selamat Datang di Bioskop, Menu apa yang ingin di pilih");
            System.out.println("1. pesan tempat duduk");
            System.out.println("2. daftar penonton");
            System.out.println("0. Akhiri pemilihan");
            System.out.println(" Masukkan pilihan dengan angka yang sesuai: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan){
                case 0:
                break ;
                case 1:
                    while(true){
                        System.out.print("Masukkan nama : ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan Baris : ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan Kolom : ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        if(penonton[(baris-1)] [(kolom-1)] != "***"){
                            System.out.println("Kursi sudah ditempati, dimohon untuk melihat kursi yang kosong");
                            break;
                            
                        }
                        if(baris > penonton.length || kolom > penonton[0].length || baris <= 0 || kolom <= 0){
                            System.out.println("Kursi sudah ditempati, dimohon untuk melihat kursi yang kosong");
                            break;
                        }
                        penonton[(baris -  1)][(kolom - 1)] = nama;
                        System.out.print("Input penonton lainya ? (y/n)");
                        next = sc.nextLine();
                        if(next.equalsIgnoreCase("n")){
                            break;
                        }
                    }
                 break;
                 
                 case 2:
                    for (int i =0; i< penonton.length; i++) {
                        System.out.println(" Pentonton baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]) + "\n");
                    }
                break;
                default:
                System.out.println("Masukkan Pilihan Yang Tersedia !");
                }

                for(int i = 0; i< penonton.length; i++){
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j]== null) {
                            penonton[i][j] = "***";
                        }
                    }
                }
            }
                
        }
    }
