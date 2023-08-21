package javabasics;

import java.util.*;

public class LineaarSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int N = sc.nextInt();
        System.out.println("Enter elements:");

        // storing elements in an array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int index = Search(N, arr, target);

        if (index == -1) {
            System.out.println(
                    "Sorry, element not found");
        }
        else{
            System.out.println("The element is present at index " + index);
        }
    }

    public static int Search(int N, int[] arr, int target) {
        // using for loop to traverse the array
        for (int i = 0; i < N; i++) {
            // if target is found return
            if (arr[i] == target) {
                return i + 1;
            }
        }
        // if the target is not present return
        return -1;
    }
}
