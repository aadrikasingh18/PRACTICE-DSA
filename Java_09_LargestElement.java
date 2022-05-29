// PROGRAM TO FIND THE LARGEST ELEMENT IN THE ARRAY
package com.company;
import java.util.*;
public class Java_09_LargestElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt(); // 1 2 3 4 5
        }
        int k = 0;
        for (int i = 0; i < n; i++)
        {
            if(a[i] > a[k])
            {
                k = i;
            }
        }
        System.out.println("Largest Element is : " + a[k]);
    }
}


