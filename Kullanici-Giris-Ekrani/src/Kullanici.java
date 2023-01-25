import java.util.Scanner;

public class Kullanici {
    public static void main(String[] args) {
        String kullanici,sifre;

        Scanner input=new Scanner(System.in);

       System.out.print("Lütfen Kullanıcı Adınızı Giriniz:");
       kullanici=input.nextLine();

       System.out.print("Lütfen Şifrenizi Giriniz:");
       sifre=input.nextLine();

       if (kullanici.equals("Ahmet") && sifre.equals("123456")) {
            System.out.print("Bilgileriniz doğru");

       }
       else{
           System.out.print("Bilgileriniz yanlış");
       }


    }
}
