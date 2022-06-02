package com.company;
import java.util.Scanner;
public class Java_16_RightRotateBy1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();
        System.out.print("Enter elements in the array : ");
        int[] a = new int[n];
        for (int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int temp = 0;
        temp = a[n-1];
        int[] b = new int[n];
        for (int i = 1; i < n; i++)
        {
            b[i] = a[i-1];
        }
        b[0] = temp;
        System.out.print("Array after right rotating by 1 is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
