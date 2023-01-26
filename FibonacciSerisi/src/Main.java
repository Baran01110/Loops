import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int eleman,k=0,l=1;
        System.out.print("eleman sayısı girin : ");
        eleman = inp.nextInt();
        for (int i = 1; i<=eleman;i++){
            //toplam+l=toplam
            //toplam+l=toplam
            //l+toplam=toplam
            System.out.print(k+" ");
            k=k+l;
            l=k-l;

        }
    }
}