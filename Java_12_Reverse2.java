package com.company;
import java.util.Scanner;
public class Java_12_Reverse2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();
        System.out.print("Enter elements in the array : ");
        int[] a = new int[n];
        for (int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int low = 0;
        int high = n-1;
        int temp = 0;
        while(low < high)
        {
            temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low ++;
            high --;
        }
        System.out.print("Reversed Array is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
