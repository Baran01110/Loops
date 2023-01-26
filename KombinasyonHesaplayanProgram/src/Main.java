import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalNR = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        int n = inp.nextInt();
        int totalN = 1;

        System.out.print("Grubun eleman sayısını giriniz : ");
        int r = inp.nextInt();
        int totalR = 1;



        for(int i=1;i <= n;i++){
             totalN = totalN * i;
        }
        for (int j=1; j<=r; j++){
            totalR = totalR * j;
        }
        for (int k=1; k<=(n-r);k++){
            totalNR = totalNR * k;
        }

        System.out.println(totalN/totalR*totalNR);

    }

}