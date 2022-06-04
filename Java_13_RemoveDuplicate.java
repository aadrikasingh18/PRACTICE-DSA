// REMOVE DUPLICATES FROM A SORTED ARRAY
// METHOD 1 & 2 BOTH ARE CORRECT

// I/P : 1 1 1 2 2 3
// O/P : 1 2 3

// I/P : 1 1 1
// O/P : 1

// KIND OF NAIVE SOLUTION (METHOD 1)

//package com.company;
//import java.util.*;
//public class Java_13_RemoveDuplicate
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter number of elements in an array : ");
//        int n = sc.nextInt();
//        System.out.print("Enter elements in the array : ");
//        int[] a = new int[n];
//        for (int i = 0; i < n ; i++)
//        {
//            a[i] = sc.nextInt();
//        }
//        int[] c = new int[n+1];
//        for (int i = 0; i < n; i++)
//        {
//            c[i] = a[i];
//        }
//        int k = 0;
//        int[] b = new int[n];
//        b[0] = a[0];
//        for (int i = 0; i < n; i++)
//        {
//            if(c[i] != c[i+1])
//            {
//               b[k+1] = c[i+1];
//               k++;
//            }
//        }
//        System.out.print("Array after removing duplicate element is : ");
//        for (int i = 0; i < k; i++)
//        {
//            System.out.print(b[i] + " ");
//        }
//    }
//}

// MORE EFFICIENT CAUSE EK ARRAY KAM USE HO RHA  (METHOD 1 BETTER)
//package com.company;
//import java.util.*;
//public class Java_13_RemoveDuplicate
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter number of elements in an array : ");
//        int n = sc.nextInt();
//        System.out.print("Enter elements in the array : ");
//        int[] a = new int[n];
//        for (int i = 0; i < n ; i++)
//        {
//            a[i] = sc.nextInt();
//        }
//        int k = 0;
//        int[] b = new int[n];
//        b[0] = a[0];
//        for (int i = 1; i < n; i++)
//        {
//            if(b[k] != a[i])
//            {
//                b[k+1] = a[i];
//                k++;
//            }
//        }
//        System.out.print("Array after removing duplicate element is : ");
//        for (int i = 0; i < k+1; i++)
//        {
//            System.out.print(b[i] + " ");
//        }
//    }
//}

// METHOD 2

package com.company;
import java.util.*;
public class Java_13_RemoveDuplicate
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
        int k = 0;
        int[] b = new int[n];
        b[0] = a[0];
        for (int i = 1; i < n; i++)
        {
            if(b[k] != a[i])
            {
                b[k+1] = a[i];
                k++;
            }
        }
        System.out.print("Array after removing duplicate element is : ");
        for (int i = 0; i < k+1; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
