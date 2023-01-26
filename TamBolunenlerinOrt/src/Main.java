import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, k, counter = 0;
        double top = 0, sayac;
        Scanner inp=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        k = inp.nextInt();

        for(i=0; i<=k; i++)
        {
            if( (i%3==0) && (i%4==0) )
            {
                top+=i;
                counter++;
            }
        }
        sayac=top/counter;
        System.out.println("Ortalama : "+sayac);
    }
}