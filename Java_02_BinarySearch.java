package com.company;

import java.util.Scanner;

public class Java_02_BinarySearch {
    static int binarySearch(int a[], int n, int k) // array, it's length and element to be found are in parameters
    {
        int low = 0;
        int up = n-1;
        while(low <= up)
        {
            int mid = (low + up)/2;

            if(a[mid] == k)
                return mid;

            if(a[mid] < k)
                low = mid + 1;
            else
                up = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt(); // 1 2 3 4 5
        }
        System.out.print("Enter element to be searched : ");
        int k = sc.nextInt(); // 2
        int ans = 0;
        ans = binarySearch(a,n,k);
        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
}
