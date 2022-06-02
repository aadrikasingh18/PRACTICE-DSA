// d=1 and d=2 ke liye wrong ans aa rha hai

package com.company;
import java.util.Scanner;
public class Java_17RightRotateByD
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
            a[i] = sc.nextInt(); // 1 2 3
        }
        System.out.print("Enter value of D : ");
        int d = sc.nextInt(); // 1
        int[] b = new int[d];
        int m = 0;
        for (int i = n-d; i < n ; i++)
        {
            b[m] = a[i];
            m++;
        }
        int[] c = new int[n];
        for (int i = d; i < n; i++)
        {
            c[i] = a[i-d];
        }
        for (int i = 0; i < d; i++)
        {
            c[i] = b[i];
        }
        System.out.print("Array after right rotating by " + d + " is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}
