import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom;
        String penonton[][] = new String[4][2];

        while (true) {
            System.out.println("==============================================");
            System.out.println("==================== Menu ====================");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton ditambahkan.");
                    } else {
                        System.out.println("Kursi sudah ditempati. Silakan pilih kursi lain.");

            
                        System.out.print("Masukkan baris : ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil ditambahkan.");
                            } else {
                                System.out.println("Kursi masih ditempati. Data penonton tidak ditambahkan.");
                            }
                        } else {
                            System.out.println("Nomor baris/kolom kursi tidak tersedia. Data penonton tidak ditambahkan.");
                        }
                    }
                } else {
                    System.out.println("Nomor baris/kolom kursi tidak tersedia.");
                }

            } else if (menu == 2) {
                System.out.println("========================================");
                System.out.println("Daftar Penonton : ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != "***") {
                            System.out.println(penonton[i][j] + " :Kolom"+ (j + 1) + "," + "Baris " + (i + 1) );
                        }
                    }
                }
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("Menu tidak sesuai.");
            }
        }
    }
}