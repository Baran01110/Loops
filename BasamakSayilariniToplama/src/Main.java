import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int basValue;
        int result =0;



        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi = inp.nextInt();


            while (sayi != 0) {
            basValue = sayi%10;
            result +=basValue;
            sayi /= 10;
        }
        System.out.println(result);
    }
}