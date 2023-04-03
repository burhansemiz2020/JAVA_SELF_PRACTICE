package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours08_NestedIfStatements02 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun. Musteri karti
        varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quantity of products: ");
        int quantity = scan.nextInt();
        System.out.println("Enter the price of each product: ");
        double price = scan.nextDouble();
        double total;
        System.out.println("Do you have the card client? (Y/N)");
        String client = scan.next().toUpperCase();
        if (client.equals("Y")) {
            if (quantity > 10 && quantity <= 200) {
                total = quantity * price * 0.8;
                System.out.println("The total is: " + total);

            } else if (quantity <= 10 && quantity > 0) {
                total = quantity * price * 0.85;
                System.out.println("The total is: " + total);
            }
        } else if (client.equals("N")) {
            if (quantity > 10 && quantity <= 200) {
                total = quantity * price * 0.85;
                System.out.println("The total is: " + total);
            } else if (quantity <= 10 && quantity > 0) {
                total = quantity * price * 0.9;
                System.out.println("The total is: " + total);
            }
        }else System.out.println("Control your information");
        /*
        Enter the quantity of products:
        15
        Enter the price of each product:
        10
        Do you have the card client? (Y/N)
        y
        The total is: 120.0
         */

    }
}

