
//-----------------------------------------------------------------------------
//	IST242, Penn State U., Abington, 
//
//	Creating static array functions. 
// 
//	There are these same methods for ArrayLists in the ArrayList class.
//	We want to create similar functions for Arrays.
//
//	The professor provided templates for the functions, to get you started.
//	Finish coding these 3 functions.
//	Create a main function, to test these 3 new array methods.
//
//	Change the class name, and match the file name.
//	Replace my name with you name.
//
//	Note: these static methods are part of a class.
//		  The methos do not know the size of the array.
//-----------------------------------------------------------------------------

import java.util.Arrays;

public class Lab_ArrayMethods
{

//-----------------------------------------------------------------------------
//	add() function to add an integer item to an array.
//	Inputs:
//		1st param. is the address of the array.
//		2nd param: the new value to be added.
//		3rd param: the index of where to place the data.
//			If the index is invalid for this array, try to add it to the end.
//	Return values:
//		-1 if add() did not work.
//		0-n, index number added to
//-----------------------------------------------------------------------------
public static int add (String[] names, String newValue, int idxPosn)
	{
	int retVal = -1;
	System.out.println ("add> array = " + Arrays.toString(names));
	
	return retVal;
	}
	
//-----------------------------------------------------------------------------
//	removes data from the array.
//	If data is removed, shift all data, after it, down one position.
//
//	Inputs:
//		1st param. is the address of the array.
//		2nd param: the value to be removed.
//
//	Return values:
//		0-n: The index number where the data was removed from.
//		-1:  if could not find data in the array.
//-----------------------------------------------------------------------------
public static int remove (String[] names, int removeValue)
	{
	int removedWorked = -1;
	
	System.out.println ("remove> array = " + Arrays.toString(names));
	
	return removedWorked;
	}

//-----------------------------------------------------------------------------
//	finds the index of the string searching for.
//
//	Inputs:
//		1st param. is the address of the array.
//		2nd param: the data searching for, in the array.
//
//	Return values:
//		0-n: The index number where the data was found
//		-1:  if could not find data in the array.
//-----------------------------------------------------------------------------
public static int indexOf (String[] names, int searchVal)
	{
	int foundIdx = -1;
	
	System.out.println ("indexOf> array = " + Arrays.toString(names));

	return foundIdx;
	}
	
} // end of class
