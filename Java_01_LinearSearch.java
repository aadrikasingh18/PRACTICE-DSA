package com.company;
import java.util.Scanner;
public class Java_01_LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements in the array : ");
        for (int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter element to be searched : ");
        int k = sc.nextInt();
        int flag = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if(k == a[i])
            {
                t = i;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("Element " + k + " is found at index " + t);
        else
            System.out.println("Element is not found.");
    }
}
