//=============================================================================
//	Krzysztof kowalski
//	IST242, Penn State Fall 2026
//=============================================================================

import java.util.ArrayList;

public class IST242_Arrays_ArrayLists {
    public static void main(String[] args) {
        String[] arrayNames = new String[10];
        ArrayList<String> arrayListNames = new ArrayList<String>();
        System.out.println("Empty ArrayList and Array.");
        printArrayandList(arrayNames, arrayListNames);

        arrayNames[0] = "Turner";
        arrayNames[1] = "Realmuto";
        arrayNames[2] = "Harper";
        arrayNames[3] = "Bohm";
        arrayNames[4] = "Wheeler";
        arrayNames[5] = "Stott";
        arrayNames[6] = "Verling";
        arrayNames[7] = "Schwarber";
        arrayNames[8] = "Wilson";
        arrayNames[9] = "Nola";
        for (String name : arrayNames) {
            arrayListNames.add(name);
        }

        System.out.println("\nFilled ArrayList and Array with names.");
        printArrayandList(arrayNames, arrayListNames);



        
        System.out.println("\nSwapping the first two names in ArrayList and Array.");
        System.out.println("Before Swap: ");
        printArrayandList(arrayNames, arrayListNames);

        String swapString = arrayListNames.get(0);
        arrayListNames.set(0, arrayListNames.get(1));
        arrayListNames.set(1, swapString);

        String swapString2 = arrayNames[0];
        arrayNames[0] = arrayNames[1];
        arrayNames[1] = swapString2;

        System.out.println("After Swap: ");
        printArrayandList(arrayNames, arrayListNames);



        System.out.println("\nFind the name \" Wilson \". If found, replace it with \"Sosa\" in ArrayList and Array.");
        System.out.println("Before Replacement: ");
        printArrayandList(arrayNames, arrayListNames);
        int wilsonIndex = arrayListNames.indexOf("Wilson");
        if (wilsonIndex != -1) {
            arrayListNames.set(wilsonIndex, "Sosa");
        }

        for (int i = 0; i < arrayNames.length; i++) {
            if (arrayNames[i].equals("Wilson")) {
                arrayNames[i] = "Sosa";
            }
        }

        System.out.println("After Replacement: ");
        printArrayandList(arrayNames, arrayListNames);

        System.out.println("\nFind the name \" Bohm \". If found, replace it with \"Alec Bohm\" in ArrayList and Array.");
        System.out.println("Before Replacement: ");
        printArrayandList(arrayNames, arrayListNames);
        int bohmIndex = arrayListNames.indexOf("Bohm");
        if (bohmIndex != -1) {
            arrayListNames.set(bohmIndex, "Alec Bohm");
        }

        for (int i = 0; i < arrayNames.length; i++) {
            if (arrayNames[i].equals("Bohm")) {
                arrayNames[i] = "Alec Bohm";
            }
        }

        

        System.out.print("Find \"Wheeler\". If found, remove his name from the list. Slide the names that were after \"Wheeler\" down 1 spot.");
        System.out.println("Before Replacement: ");
        printArrayandList(arrayNames, arrayListNames);
        int wheelerIndex = arrayListNames.indexOf("Wheeler");
        if (wheelerIndex != -1) {
            arrayListNames.remove(wheelerIndex);
        }

        for (int i = 0; i < arrayNames.length; i++) {
            if (arrayNames[i].equals("Wheeler")) {
                arrayNames[i] = null;
                for (int j = i; j < arrayNames.length - 1; j++) {
                    arrayNames[j] = arrayNames[j + 1];
                }
                arrayNames[arrayNames.length - 1] = "null";
            }
            
        }
        System.out.println("After Replacement: ");
        printArrayandList(arrayNames, arrayListNames);




        System.out.println("Final ArrayList and Array.");
        printArrayandList(arrayNames, arrayListNames);
    }

    public static void printArrayandList(String[] array, ArrayList<String> list) {
        System.out.println("\t" + "ArrayList Names: "+ list);
        System.out.print("\t" +"Array Names: ");
        for (String name : array) {
            System.out.print(name + ", ");
        }   
        System.out.println();
        System.out.println(); 
        System.out.println(); 
    }
}