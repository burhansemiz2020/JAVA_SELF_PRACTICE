package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours07_IfElseIfStatements04 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun. Musteri karti
        varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quantity of the product: ");
        double quantity = scan.nextDouble();
        System.out.println("Enter the price of the product: ");
        double price = scan.nextDouble();
        System.out.println("Do you have a customer card?: ");
        boolean card = scan.nextBoolean();

        if (card == true && quantity > 10) {
            System.out.println("Discounted total price1: " + (quantity*price * 0.8));
        } else if (card == true && quantity <= 10) {
            System.out.println("Discounted total price2: " + (quantity*price * 0.85));
        }
        if (card == false && quantity > 10) {
            System.out.println("Discounted total price3: " + (quantity*price * 0.85));
        } else if (card == false && quantity <= 10) {
            System.out.println("Discounted total price4: " + (quantity*price * 0.90));

        /*
        Enter the quantity of the product:
        15
        Enter the price of the product:
        10
        Do you have a customer card?:
        false
        Discounted total price3: 127.5
         */
        }
    }
}
