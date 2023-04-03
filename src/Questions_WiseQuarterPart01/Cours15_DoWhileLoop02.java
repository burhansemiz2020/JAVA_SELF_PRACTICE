package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours15_DoWhileLoop02 {
    /*
    Soru 2- Kullanicidan bir sifre girmesini isteyin.
    Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar
    bu islemi tekrar edin ve gecerli
    sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean valid = false;
        do {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters.");
            } else if (!password.matches(".*[a-z].*")) {
                System.out.println("Password must contain lowercase letters.");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Password must contain capital letters.");
            } else if (!password.matches(".*[^a-zA-Z0-9].*")) {
                System.out.println("Password must contain special characters.");
            } else {
                valid = true;
            }
        } while (!valid);
        System.out.println("Your Password Accepted");
    }

}
