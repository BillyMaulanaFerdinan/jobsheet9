import java.util.Scanner;
public class Tugas06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: ");
        int jmlNilai = input.nextInt();
        int[] nilai = new int[jmlNilai];
        int nilaiMaks = 0, nilaiMin = 0, total = 0;
        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        for (int i = 0; i < jmlNilai; i++) {
            if (nilai[i] > nilaiMaks) {
                nilaiMaks = nilai[i];
            }
            if (nilai[i] < nilaiMaks) {
                nilaiMin = nilai[i];
            }
            total += nilai[i];
        }
        double rata2 = (double)total / jmlNilai;
        System.out.println("Nilai tertinggi: " + nilaiMaks);
        System.out.println("Nilai terendah: " + nilaiMin);
        System.out.println("Rata-rata: " + rata2);
    }
}