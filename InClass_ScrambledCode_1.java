//=============================================================================
//	Krzysztof kowalski
//	IST242, Penn State Fall 2026
//
//	Description of this Program.
// 
// 
//	This program works however it is unreadable.
//	Format this code properly according to the style guidelines described below.
//	When finished formatting the code, make sure it still runs.
//	You are to work alone and do not use any resource on the Internet.
// 
//	You can copy this code into any Java development environment you choose.
//
//	Submission.
//	1. Do not remove this comment header.
//	2. Student's name must be placed at the top of this comment header.
//	3. At the top of this comment header, describe what this code does.
//	4. Submit just this .java file to Canvas.
//
//	Style Guidelines
//	> One instruction per line
//	> All braces must be on their on line.
//	> Braces must line up AND be indented with the indented code.
//	> Put spaces around each operator (=, >, etc).
//	> Place blank lines where you feel are appropriate.
//	> Put a blank line above any WHILE, IF and FOR statements.
// 
//=============================================================================

import java.util.Arrays;
import java.util.Scanner;

public class InClass_ScrambledCode_1 {

    final static int EXIT_VALUE = -1;

    // -------------------------------------------------------
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r, temp;
        int[] binaryVals = new int[100];
        int idx = 0;
        int numDigits = 0;
        int destBase = 2;
        int numBits, i, numDisplayed;
        int inValue;
        for (i = 0; i < 100; i++)
            binaryVals[i] = 0;
        inValue = -2;
        // -- (fill in a comment)
        while (((inValue < 0) || (inValue > 4000000)) && (inValue != EXIT_VALUE)) {
            System.out.print("Enter a decimal value betwee 0-4000000: ");
            inValue = scan.nextInt();
            if (((inValue < 0) || (inValue > 4000000)) && (inValue != EXIT_VALUE))
                System.out.println("You enter an invalid value !!!!");
        }
        temp = inValue;
        if (inValue != EXIT_VALUE) {// -- (fill in a comment)
            while (temp != 0) {
                r = temp % destBase; // the remainders are the conversion digits.
                temp = temp / destBase;
                binaryVals[idx] = r;
                idx++;
                numDigits++;
            } // -- (Fill in a comment).
            numBits = (((numDigits - 1) / 8) + 1) * 8;
            i = numBits - 1;
            numDisplayed = 0;
            System.out.print("\n" + inValue + " = ");
            while (i >= 0) {
                System.out.print(binaryVals[i] + " ");
                numDisplayed++;
                i--;
                // -- fill in a comment
                if ((numDisplayed == 8) && (i > 0)) {
                    System.out.print(" - ");
                    numDisplayed = 0;
                }
            }
            System.out.println("\n\n");
        }
        return;
    }
}
