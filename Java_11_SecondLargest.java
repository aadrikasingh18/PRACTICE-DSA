// METHOD 1 & 2 BOTH ARE CORRECT !!!
// METHOD 01
//package com.company;
//import java.util.*;
//public class Java_11_SecondLargest
//{
//    static int getLargest (int[] a, int n)
//    {
//        int k = 0;
//        for (int i = 0; i < n-1; i++)
//        {
//            if(a[i] > k)
//                k = a[i];
//        }
//        return k;
//    }
//    static void getSecondLargest (int[] a, int n)
//    {
//        int k = getLargest(a,n);
//        int in = -1;
//        for (int i = 0; i < n-1; i++)
//        {
//            int r = a[i];
//            if((a[i+1] > r) && (a[i] < k) && (a[i] != k))
//            {
//                in = i+1;
//            }
//        }
//        if (in != -1)
//            System.out.println("Second Largest Element is "+a[in]+" and it's index is "+in);
//        else
//            System.out.println("All elements are equal");
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of elements in an array : ");
//        int n = sc.nextInt();
//        System.out.print("Enter elements in the array : ");
//        int[] a = new int[n];
//        for (int i = 0; i < n ; i++)
//        {
//            a[i] = sc.nextInt();
//        }
//        getSecondLargest(a,n);
//    }
//}


// METHOD 02
package com.company;
import java.util.*;
public class Java_11_SecondLargest
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
        int sec = -1;
        int lar = 0;
        for (int i = 1; i < n; i++)
        {
            if(a[i] > a[lar])
            {
                sec = lar;
                lar = i;
            }
            else if(a[i] != a[lar])
            {
                if(sec == -1 || a[i] > a[sec])
                {
                    sec = i;
                }
            }
        }
        System.out.println("Second largest element is "+a[sec]+" and it's index is "+sec);
    }
}
