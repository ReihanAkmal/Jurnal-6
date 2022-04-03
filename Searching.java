package Searching;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static int binarySearch(int[] data, int key) {
        int low = 0; // Angka terkecil
        int high = data.length - 1; // Angka terbesar
        int middle = (low + high + 1) / 2; // Angka yang berada di tengah
        int location = -1; // Letak lokasi angka yang dicari
        do {
            System.out.print(remainingElements(data, low, high)); // Untuk menampilkan semua data angka

            for (int i = 0; i < middle; i++) {
                System.out.print(" ");
            }
            System.out.println(" * ");

            if (key == data[middle]) {
                location = middle; // Jika data yang terbaru ditengah maka data tersebut berada di tengah
            } else if (key < data[middle]) { // middle element is too high
                high = middle - 1; // eliminate the higher half
            } else { // middle element is too low
                low = middle + 1; // eliminate the lower half
            }
            middle = (low + high + 1) / 2; // recalculate the middle
        } while ((low <= high) && (location == -1));
        return location; // return location of search key
    }

    // method to output certain values in array
    private static String remainingElements(
            int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();
        // append spaces for alignment
        for (int i = 0; i < low; i++) {
            temporary.append(" ");
        }
        // append elements left in array
        for (int i = low; i <= high; i++) {
            temporary.append(data[i] + " ");
        }
        return String.format("%s%n", temporary);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        // create array of 15 random integers in sorted order
        int[] data = generator.ints(15, 10, 91).sorted().toArray();
        System.out.printf("%s%n%n", Arrays.toString(data)); // display array
        // get input from user
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();
        // repeatedly input an integer; -1 terminates the program
        while (searchInt != -1) {
            // perform search
            int location = binarySearch(data, searchInt);
            if (location == -1) { // not found
                System.out.printf("%d was not found%n%n", searchInt);
            } else { // found
                System.out.printf("%d was found in position %d%n%n",
                        searchInt, location);
            }
            // get input from user
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}
