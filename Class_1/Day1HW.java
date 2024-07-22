// return the sum of the array
// print the array in the reverse order
// reverse the array 

import java.util.Scanner;

public class Day1HW {

    static void reverse(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        System.out.println();
    }

    static void swap(int[] arr, int n, int a, int b) {
        int temp, j;

        int[] array = new int[n];
        for (int i : arr) {
            System.out.println("The array before swapping is: " + " " + i);
        }

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        for (int i : arr) {
            System.out.println("The array after swapping is: " + " " + i);
        }

    }

    static void reverseusingArray(int[]arr int a , int b){
        for (int i = 0; j < arr.length-1; i<j; j-- , i++) {
            swap(arr[a::b], i, i, j);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no. of elements in the array");
        // printarray();
        // sumarray();
        int[] arr = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(arr, n, a, b);

    }

    /*
     * public static void sumarray() {
     * 
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * 
     * int[] arr = new int[n];
     * 
     * 
     * for (int i = 0; i < n; i++) {
     * arr[i] = sc.nextInt();
     * }
     * 
     * for (int i = 0; i < n; i++) {
     * System.out.println("The elements of your array are: " + " " + arr[i]);
     * }
     * 
     * int temp = 0;
     * for (int i = 0; i < n; i++) {
     * temp += arr[i];
     * }
     * System.out.println("The sum of array is: " + " " + temp);
     * 
     * }
     */

    /*
     * public static void printarray() {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * 
     * int[] arr = new int[n];
     * 
     * for (int i = 0; i < n; i++) {
     * arr[i] = sc.nextInt();
     * }
     * 
     * for (int i = n - 1; i >= 0; i--) {
     * System.out.println("The elements of your array are: " + " " + arr[i]);
     * }
     * 
     * }
     */

    // create a swap fxn to swap two values inside an array

}
