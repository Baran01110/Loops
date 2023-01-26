import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır Sayıyı Giriniz : ");
        n = inp.nextInt();

        for (int i=1; i<=n; i*=4){
          System.out.println("4'ün Katları : " +i);
        }
        for (int j=1; j<=n; j*=5){
            System.out.println("5'in Katları : "+j);
        }
    }
}