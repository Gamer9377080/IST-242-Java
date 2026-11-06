
//-----------------------------------------------------------------------------
//	IST242, Penn State U., Abington, 
//
//	Creating a test main, to test the static array methods. 
//-----------------------------------------------------------------------------

import java.util.Arrays;
import Lab_ArrayMethods;

public class Lab_ArrayMethods_Main
{

public static void main (String[] args)
	{
	String testArray[] = { "abc", "def", "xyz", "Bohm", "Stott", "Marsh", "", "", "", ""  };
	int idx;
	
	//-- sample of calling one of the methods in the arrays class.
	idx = Lab_ArrayMethods.add (testArray, "Ganther", 3);
	System.out.printf ("Main> return value = %d, Array = %s.\n", idx, Arrays.toString(testArray));


	}
	
}

