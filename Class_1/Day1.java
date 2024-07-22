import java.util.Scanner;
//return the inverse of a number
//return number of digits present in a number n , n=1234 , return: 4
// create a fxn to print the whole array

public class Day1 {

    // Creating a fxn//

    /*
     * static void sayHi(){
     * system.out.println("Hello World")
     * }
     */

    /*
     * static void swap(int a, int b) {
     * int t = a;
     * a = b;
     * b = t;
     * System.out.println(a + " " + b);
     * 
     * }
     */

    public static void main(String[] args) {
        int a = 10, b = 15;
        // swap(a, b);
        // Scanner sc = new Scanner(System.in);
        // int f = sc.nextInt();
        // natural_numbers(f);
        // System.out.println(armstrong(f));
        int[] arr = new int[100];
        arr[0] = 6;
        System.out.println(arr[0]);
        System.out.println(arr);
        char[] array = new char[120];
        array[0] = 1;
        array[1] = 2;
        System.out.println(array[0]);
        System.out.println(array[1]);
        int[] arrr = new int[10];
        for (int i = 0; i < arrr.length; i++) {
            arrr[i] = i + 1;
        }
        printArr(arrr);
        printArr(arrr);

    }

    /*
     * public static void natural_numbers(int n) {
     * for (int i = 1; i < n; i++) {
     * System.out.println(i + " ");
     * }
     * }
     */

    /*
     * public static boolean prime(int n) {
     * for (int i = 2; i < n; i++) {
     * if (n % i == 0)
     * return false;
     * else
     * return true;
     * }
     * return true;
     * }
     */

    /*
     * public static int inverse_number(int n) {
     * int temp = 0;
     * while (n != 0) {
     * temp = temp * 10 + (n % 10);
     * n /= 10;
     * 
     * }
     * return temp;
     * 
     * }
     */

    /*
     * public static int digits(int n) {
     * int temp = 0;
     * while (n != 0) {
     * temp += 1;
     * n /= 10;
     * }
     * return temp;
     * }
     * 
     * public static boolean armstrong(int n) {
     * int d = digits(n);
     * int sum = 0;
     * int temp = n;
     * while (n != 0) {
     * sum += Math.pow(n % 10, d);
     * n /= 10;
     * }
     * return (temp == sum);
     * }
     */

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.err.println();

        for (int i : arr) {
            System.out.println(i + " ");
        }

    }

}