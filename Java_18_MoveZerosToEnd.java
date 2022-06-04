// METHOD 1 : NAIVE METHOD
// 2 LOOPS ARE USED HERE

// EXAMPLE :
// Enter number of elements in an array : 5
// Enter elements in the array : 0 0 1 2 0
// Array after moving all the zeroes to end is : 2 1 0 0 0

//package com.company;
//import java.util.Scanner;
//public class Java_18_MoveZerosToEnd
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of elements in an array : ");
//        int n = sc.nextInt();
//        System.out.print("Enter elements in the array : ");
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++)
//        {
//            a[i] = sc.nextInt(); // 0 0 1 2 0
//        }
//        for (int i = 0; i < n; i++)
//        {
//            if(a[i] == 0)
//            {
//                for (int j = i+1; j < n; j++)
//                {
//                    if(a[j] != 0)
//                    {
//                        int temp = 0;
//                        temp = a[j];
//                        a[j] = a[i];
//                        a[i] = temp;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.print("Array after moving all the zeroes to end is : ");
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print(a[i] + " ");
//        }
//    }
//}

// METHOD 2 (EFFICIENT)
// ONE LOOP IS USED

package com.company;
import java.util.Scanner;
public class Java_18_MoveZerosToEnd
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
        int count = 0;
        // 1 2 0 3 0
        for (int i = 0; i < n; i++)
        {
            if(a[i] != 0)
            {
                int temp = 0;
                temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }
        System.out.print("Array after moving all the zeroes to end is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}