// PROBLEM: Find the maximum & minimum number in an array of integers.

import java.util.*;

public class Practice_Questions_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        // Check for empty/invalid array size
        if (size <= 0) {
            System.out.println("Array is Empty");
        } else {
            int[] arr = new int[size];
            
            // Input elements into the array
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + i + ": ");
                arr[i] = sc.nextInt();
            }

            // Initialize min and max with the first element of the array
            int min = arr[0];
            int max = arr[0];

            // Traverse to find actual min and max
            for (int i = 0; i < size; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
                if (max < arr[i]) {
                    max = arr[i];
                }
            }

            System.out.println("min value in array : " + min);
            System.out.println("max value in array : " + max);
        }
        sc.close();
    }
}