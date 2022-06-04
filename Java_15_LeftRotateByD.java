package com.company;
import java.util.Scanner;
public class Java_15_LeftRotateByD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();
        System.out.print("Enter elements in the array : ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter value of D : ");
        int d = sc.nextInt();
        int[] b = new int[d];
        for (int i = 0; i < d ; i++)
        {
            b[i] = a[i];
        }
        int k = 0;
        for (int i = 0; i < n-d; i++)
        {
            a[i] = a[d+i];
            k++;
        }
        for (int i = 0; i < d; i++)
        {
            a[k] = b[i];
            k++;
        }
        System.out.print("Array after left rotating by" + d + "is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
