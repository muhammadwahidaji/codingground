
import java.util.Scanner;
public class Tugas4{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan angka 1 : ");
        byte number1 = scanner.nextByte();
        System.out.println("masukkan angka 1 : ");
        byte number2 = scanner.nextByte();
        int hasil= number1+number2;
        System.out.println("hasilnya adalah = " + hasil);
     }
}
