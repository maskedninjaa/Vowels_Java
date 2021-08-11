package javaproject1;

import java.util.Scanner;
/**
 * First java project done from scratch on java
 * @author Wasim Nasser
 */
public class vowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String str = input.nextLine();

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                    count++;

        }
        System.out.println("There are " + count + " vowels in this phrase!");
    }

}


