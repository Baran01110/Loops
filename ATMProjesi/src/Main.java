import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String userName, password;
        int balance = 1500;
        int right = 3;
        int select=0;

        while (right>0) {
            System.out.println("X Bankasına Hoş Geldiniz.");
            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            userName = inp.nextLine();

            System.out.print("Lütfen parolanızı giriniz: ");
            password = inp.nextLine();

            if (userName.equals("baran") && password.equals("şifre")) {
                do {

                    System.out.println("************************************************");
                    System.out.println("1.Para yatırma\n2.Para çekme\n3.Bakiye sorgulama\n4.Çıkış yapma");
                    System.out.println("************************************************");
                    System.out.println("Lütfen yapacağınız işlemi seçiniz");
                    select = inp.nextInt();

                    switch(select){
                        case 1 :
                            System.out.print("Lütfen yatıracağınız tutarı giriniz: ");
                            int money = inp.nextInt();
                            balance+=money;
                            System.out.println("Yeni bakiyeniz: "+ balance);
                            break;

                        case 2 :
                            System.out.print("Lütfen çekiceğiniz tutarı giriniz: ");
                            money = inp.nextInt();
                            if (money>balance) {
                                System.out.println("Bakiyeniz yetersiz.");

                            }else{
                                balance-=money;
                                System.out.println("Yeni bakiyeniz: "+ balance);

                            }
                            break;

                        case 3 :
                            System.out.println("Bakiyeniz: "+ balance);

                            break;

                    }

                }while (select!=4);
                System.out.println("Çıkış yapılıyor\nTekrar bekleriz.");
                break;

            }else{
                right--;
                System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");

                if (right == 0) {

                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");

                }else {
                    System.out.println("Hatalı giriş lütfen tekrar deneyiniz.");
                    System.out.println("Kalan toplam hakkınız: "+ right);
                }
            }

        }
    }

}
