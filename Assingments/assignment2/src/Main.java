//Name:Fariha Noshin
//Date:16-02-2025
//Description:Assignment-2 Iteration and Arrays


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Input Handling with Re-prompt
        int n;
        while (true) {
            // prompting the user to enter the number of elements
            System.out.print("Enter the number of elements (maximum 20): ");
            n = scanner.nextInt();

            // Validating input to ensure it does not exceed 20 and is greater than 0
            if (n <= 20 && n > 0) {
                // Exit the loop if the input is valid
                break;
            } else {
                // Displaying an error message if the input is invalid
                System.out.println("Invalid input! Please enter a number between 1 and 20.");
            }
        }

        // Creating an array to store the numbers
        int[] array = new int[n];

        // Prompting the user to enter the numbers
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            // Read numbers into the array
            array[i] = scanner.nextInt();
        }

        // Processing the Array
        // Displaying the array elements
        System.out.print("Array Elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Finding the largest and smallest numbers
        int largest = array[0];
        int smallest = array[0];
        int sum = 0;

        for (int num : array) {
            // Update the largest number if the current number is greater
            if (num > largest) {
                largest = num;
            }
            // Update the smallest number if the current number is smaller
            if (num < smallest) {
                smallest = num;
            }
            // Calculating the sum of all numbers
            sum += num;
        }

        // Calculating the average of the numbers
        double average = (double) sum / n;

        // Displaying the results
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        //  Searching and Sorting
        // Prompting the user to enter a number to search
        System.out.print("Enter a number to search: ");
        int searchNum = scanner.nextInt();

        // Searching for the number in the array
        boolean found = false;
        for (int num : array) {
            if (num == searchNum) {
                // Set found to true if the number is found
                found = true;
                break;
            }
        }

        // Displaying the search result
        if (found) {
            System.out.println(searchNum + " is found in the array.");
        } else {
            System.out.println(searchNum + " is not found in the array.");
        }

        // Sorting the array using Bubble Sort
        /*
         * - Bubble Sort is a simple sorting algorithm that repeatedly steps through the array,
         *   compares adjacent elements, and swaps them if they are in the wrong order.
         * - This process is repeated until no more swaps are needed, meaning the array is sorted.
         * - After each pass, the largest unsorted element "bubbles up" to its correct position.
         */
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swapping elements if they are in the wrong order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Displaying the sorted array
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Closing the scanner to avoid resource leak
        scanner.close();
    }
}