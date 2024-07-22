import java.util.Scanner;

public class Day2 {
    // create a fxn to search for an element in an array
    // creating two fxn linear search and binary search
    static boolean linearsearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                System.out.println(arr[i]);
                return true;
            }
        }
        return false;
    }

    static boolean binarysearch(int[] arr, int n, int a, int b) {
        int i = arr[a], j = arr[b] - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == n) {
                return true;
            } else if (arr[mid] < n) {
                i = mid + 1;
            } else if (arr[mid] > n) {
                j = mid - 1;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search for: ");
        int n = sc.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(binarysearch(arr, n));

    }
}