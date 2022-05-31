package com.pract.sample;

public class ExcelSheetProblem {
	// Function to print Excel column
    // name for a given column number
    private static void printString(int columnNumber)
    {
        // To store result (Excel column name)
        StringBuilder columnName = new StringBuilder();
 
        while (columnNumber > 0) {
            // Find remainder
            int rem = columnNumber % 26;
            System.out.println("rem :"+ rem);
 
            // If remainder is 0, then a
            // 'Z' must be there in output
            if (rem == 0) {
            	
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else // If remainder is non-zero
            {
            	
            	 System.out.println("s :"+ (rem - 1));
            	 System.out.println("A :"+ ( 'A'));
            	 System.out.println("Rem-1 :"+ ((rem - 1) + 'B'));
            	 System.out.println("s :"+ ((char)((rem - 1) + 'A')));
            	char s = (char)((rem - 1) + 'A');
            	 System.out.println("s :"+ s);
                columnName.append(s);
               
                columnNumber = columnNumber / 26;
                System.out.println("columnNumber :"+ columnNumber);
            }
        }
 
        // Reverse the string and print result
        System.out.println(columnName.reverse());
    }
 
    // Driver program to test above function
    public static void main(String[] args)
    {
        printString(26);
        printString(51);
        printString(52);
        printString(80);
        printString(676);
        printString(702);
        printString(705);
    }


}
