import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n, toplam = 0;

       Scanner inp = new Scanner(System.in);

       do{
           System.out.print("Sayı Giriniz : ");
           n = inp.nextInt();
           if(n%4 == 0){
              toplam += n;
           }
       }while ( n%2==0);
       System.out.println("Toplam : " + toplam);
    }
}
// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
// çift ve 4'ün katları olan sayıları toplayıp ekrana basan program