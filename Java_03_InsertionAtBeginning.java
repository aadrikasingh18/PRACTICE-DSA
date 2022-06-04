package com.company;
import java.util.Scanner;
public class Java_03_InsertionAtBeginning
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
        System.out.print("Enter element to be inserted in the beginning : ");
        int k = sc.nextInt();
        int[] b = new int[n+1];
        for (int i = 0; i < n; i++)
        {
            b[i+1] = a[i];
        }
        b[0] = k;
        System.out.print("Modified array is : ");
        for (int i = 0; i < n+1 ; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
