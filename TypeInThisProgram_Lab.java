/*
---------------------------------------------------------------------
-- Krzysztof Kowalski, Week 1, converts any number but 0 into binary, and prints it out.
--------------------------------------------------------------------
*/
import java.util.Arrays;
import java.util.Scanner;

public class TypeInThisProgram_Lab{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int x, remainder, quotient;
    int origValue = 1;
    while (origValue != 0){
        System.out.print ("\nEnter a integer value (or \"0\" to exit): ");
        x = scn.nextInt();
        origValue = x;
        String allRemainders = "";
        if (origValue < 0)
            System.out.println ("Input Error> Data enter was invalid");
        else if (origValue > 0){
            while (x > 0){
                quotient = x / 2;
                remainder = x % 2;
                x = quotient;
                allRemainders = (char)(remainder+48) + allRemainders ;
            }
        System.out.printf ("Value [%d] = [%s], in binary.\n", origValue,
        allRemainders);
        }
    } 
    System.out.println ("\n\nHave a nice day.");
    }
}