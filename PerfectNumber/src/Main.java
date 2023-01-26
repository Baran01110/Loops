import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int deger=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sorgulancak sayıyı giriniz : ");
        sayi = inp.nextInt();

        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                deger += i;
            }
        }
        if(deger == sayi){
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }

    }
}
//Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.