
/*
Name: Krzysztof Kowalski
Course#: IST 242
Date Written: 2026-11-06
Description: Contains the robust inputInt function handling exception safety and validation ranges.
 */

import java.util.Scanner;
public class kowalski_InputInt {
    private static final String DEFAULT_INPUT_MSG = "Please enter an integer value: ";
    private static final String ERROR_NOT_INTEGER = "Invalid input. Please enter a valid whole integer.";
    private static final String ERROR_OUT_OF_RANGE = "Value is out of range. Please enter a number between ";
    private static final String AND_STR = " and ";

    public int inputInt(String msg, int minVal, int maxVal)
    {
        Scanner scanner = new Scanner(System.in);
        int validatedValue = 0;
        boolean isValid = false;

        if (msg == null || msg.isEmpty())
        {
            System.out.print(DEFAULT_INPUT_MSG);
        }
        else
        {
            System.out.print(msg);
        }

        while (!isValid)
        {
            try
            {
                String userInput = scanner.nextLine();
                validatedValue = Integer.parseInt(userInput);

                if (maxVal < minVal)
                {
                    isValid = true;
                }
                else
                {
                    if (validatedValue >= minVal && validatedValue <= maxVal)
                    {
                        isValid = true;
                    }
                    else
                    {
                        System.out.println();
                        System.out.println(ERROR_OUT_OF_RANGE + minVal + AND_STR + maxVal + ".");
                        System.out.print("Please try again: ");
                    }
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println();
                System.out.println(ERROR_NOT_INTEGER);
                System.out.print("Please try again: ");
            }
        }

        System.out.println();
        
        return validatedValue;
    }
}