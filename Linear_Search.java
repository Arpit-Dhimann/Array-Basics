/*  PROBLEM: Take an Array as input from the user. Search for
    a given number x and priint the index at which it occurs.  */

import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int size = sc.nextInt();
        
        // Define an integer array of the specified size
        int[] numbers = new int[size];

        // Loop to take input for each array index
        for(int i = 0; i < size; i++) {
            System.out.print("Enter Value for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter number (X) to search: ");
        int x = sc.nextInt();

        // Perform linear search by iterating through the array
        for(int i = 0; i < size; i++) {    
            if(numbers[i] == x) {
                System.out.println("x found at index " + i);
            }
        }  

        // Close scanner to prevent memory leaks
        sc.close();
    }
}