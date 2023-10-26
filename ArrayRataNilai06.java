import java.util.Scanner;

public class ArrayRataNilai06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMhs;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int [jmlMhs];
        double total = 0;
        double rata2;
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }
            else{
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
    }
}
