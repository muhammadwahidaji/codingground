 import java.util.Scanner;
 public class Tugas6 {
    public static void main(String[] args) {

        Scanner masukan = new Scanner (System.in);
        //deklarasi variabel
        double a;
    
        //menerima input dari user
        System.out.print("Masukkan nilai anda :");
        a = masukan.nextDouble();
       //pengecekan terhadap nilai
         if (a<0||a>100)
            System.out.println("Maaf nilai anda salah");

         else if (a>60)
            System.out.println("Selamat anda lulus");

         else
            System.out.println("Maaf anda tidak lulus");
    }
    }