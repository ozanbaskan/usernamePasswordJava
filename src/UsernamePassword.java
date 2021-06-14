import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        String userName, passWord, reset, newPW;

        Scanner s = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = s.nextLine();

        System.out.print("Şifreniz: ");
        passWord = s.nextLine();

        if (userName.equals("cs50") && passWord.equals("DavidJ.Malan"))
        {
            System.out.print("Giriş yaptınız!");
        }
        else
        {
            System.out.println("Kullanıcı adı veya şifreniz yanlış!");
            if (userName.equals("cs50"))
            {
                System.out.println("Şifrenizi sıfırlamak ister misiniz? (e) (h): ");
                reset = s.nextLine();
                if (reset.equals("e"))
                {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPW = s.nextLine();
                    if(newPW.equals("DavidJ.Malan"))
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else
                    {
                        System.out.println("Şifre oluşturuldu.");
                    }
                }
            }


        }

    }
}
