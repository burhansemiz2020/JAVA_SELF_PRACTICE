package W3Resources;

import java.util.Scanner;

import static java.lang.Long.reverse;

public class Q37_ReverseString {
    public static void main(String[] args) {
        /*
        37. Write a Java program to reverse a string.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] ch = scan.nextLine().toCharArray();
        System.out.print("Reversed String: ");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.print("\nEnter a string: ");
        String input = scan.nextLine();
        System.out.print("Reversed String: ");
        StringBuilder reversedString = new StringBuilder(input).reverse();
        System.out.print(reversedString);
        /*
        Explanation:

        **We import the Scanner class from the java.util package to read input from the user.
        **We create a new Scanner object to read user input from the console.
        **We prompt the user to enter a string by displaying the message "Enter a string: ".
        **We read the input string from the user using the nextLine() method of
        the Scanner object and store it in a String variable called inputString.
        **We create a new StringBuilder object by passing the inputString to the
        constructor and then call the reverse() method of the StringBuilder object to reverse the string.
        **We display the reversed string to the console by concatenating the string
        "Reversed string: " with the reversedString StringBuilder object using the + operator.
         */
        /*
        Enter a string: burhan
        Reversed String: nahrub
        Enter a string: semiz
        Reversed String: zimes
        Process finished with exit code 0
         */
    }
}
