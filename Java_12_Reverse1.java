// Reverse function is used in case when string builder is present or
// in case of Array list

package com.company;
import java.util.Scanner;
public class Java_12_Reverse1
{
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
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
        {
            b[i] = a[n - i - 1];
        }
        System.out.print("Reversed Array is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
