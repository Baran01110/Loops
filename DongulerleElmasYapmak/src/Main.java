import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = inp.nextInt();

        for (int i = 0; i <= number; i++) {

            for (int j = 0; j < (number-i); j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = 0; i <= number-1; i++) {

            for (int j = 0; j < (i+1); j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2*(number-i)-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}