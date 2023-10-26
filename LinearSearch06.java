import java.util.Scanner;

public class LinearSearch06 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int jmlArray;
        System.out.print("Masukkan jumlah elemen array: ");
        jmlArray = sc.nextInt();
        int [] arrayInt = new int [jmlArray];
        int hasil = 0;
        int key;

        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-"+(i)+": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
            else{
                System.out.println("Key tidak ada");
            }break;        
        }
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
    }
}