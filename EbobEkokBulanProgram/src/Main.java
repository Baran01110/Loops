import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

          Scanner inp = new Scanner(System.in);
          System.out.print("Küçük sayıyı giriniz : ");
          int n1 = inp.nextInt();

          System.out.print("Büyük sayıyı giriniz : ");
          int n2 = inp.nextInt();
          int ebob = 1;

          for (int i =1;i<=n1;i++){
              if(n1%i==0 && n2%i==0){
                  System.out.println(i);
                   ebob = i;
              }
          }
          //While ile tersten okuma yaparak üstteki for dögüsünden kıyasla daha hızlı Ebob buluyoruz.
        //Şans eseri eğer kullanıcı aralığı geniş iki asal sayı girmesi gibi durumlar olmadığı sürece alttaki döngü daha hızlıdır.
          int k=n1;
          System.out.println("------------");
          while (k>=1){
              k--;
              if(n1%k==0 && n2%k==0){
                  ebob = k;
                  System.out.println(ebob);
                  break;
              }
          }
          System.out.println("---------------");
          //--------------------------------------------------------------------------------------------------------
        int j=1;
        while (j<=(n1*n2)){
            j++;
            if(j%n1==0 && j%n2==0){
                System.out.println(j);
                break;
            }
        }
        System.out.println((n1*n2)/ebob);
    }
}