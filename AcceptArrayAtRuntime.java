package Assignments;

import java.util.Scanner;

public class AcceptArrayAtRuntime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
