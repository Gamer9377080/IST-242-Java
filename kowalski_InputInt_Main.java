/*
Name: Krzysztof Kowalski
Course#: IST 242
Date Written: 2026-11-06
Description: Main execution file that demonstrates the robust inputInt function with various range constraints.
 */

public class kowalski_InputInt_Main {
    private static final String PROMPT_RANGE = "Please enter an integer between 1 and 100: ";
    private static final String PROMPT_NO_RANGE = "Please enter an integer (range checking disabled since max < min): ";

    public static void main(String[] args)
    {
        kowalski_InputInt inputUtil = new kowalski_InputInt();

        int validAge = inputUtil.inputInt(PROMPT_RANGE, 1, 100);
        System.out.println();
        System.out.println("Successfully accepted! Your entered value is: " + validAge);
        System.out.println();

        int anyNumber = inputUtil.inputInt(null, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println();
        System.out.println("Successfully accepted! Your entered value is: " + anyNumber);
        System.out.println();

        int disabledRangeNum = inputUtil.inputInt(PROMPT_NO_RANGE, 50, 10);
        System.out.println();
        System.out.println("Successfully accepted! Your entered value is: " + disabledRangeNum);
        System.out.println();

        int finalReturnValue = 0;
        
        return;
    }
}

