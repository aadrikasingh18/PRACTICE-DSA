// Given an array containing positive integers and an integer X,
// find the element in the array which is smaller than X and closest to it.

// FEW CASES ARE NOT EXECUTING ON GFG

package com.company;
import java.util.*;
public class Java_19_ImmediateSmallerThanX
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
        System.out.print("Enter value of X : ");
        int x = sc.nextInt();
        int[] b = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++)
        {
            if(a[i] < x)
            {
                b[k] = a[i];
                k++;
            }
        }
        Arrays.sort(b);
        int ans = 0;
        ans = b[k];
        System.out.println("Element closest to " + x + " is : " + ans);
    }
}
