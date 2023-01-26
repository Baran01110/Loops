

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberNumbers,numbers,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,temp;

        Scanner input=new Scanner(System.in);

        System.out.print("Kaç sayi Girilsin : ");
        numberNumbers=input.nextInt();

        for (int i=1 ; i<=numberNumbers ; i++){
            System.out.print(i+".Sayıyı giriniz : ");
            numbers=input.nextInt();
            if(numbers < min){
                min=numbers;
            }
            if(numbers > max){
                max=numbers;
            }
        }

        System.out.println("Girdiğiniz sayılardan en küçüğü : "  +  min);
        System.out.println("Girdiğiniz sayılardan en büyüğü : "  +  max);



    }
}