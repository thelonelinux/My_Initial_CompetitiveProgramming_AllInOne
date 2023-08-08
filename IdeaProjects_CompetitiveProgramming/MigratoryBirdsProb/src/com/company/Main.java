package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the list");

        int n =scanner.nextInt();

       List<Integer> list = new ArrayList<>(n);

       System.out.println("Enter the " + n +" elements in the list");

       for (int i=0;i<n;i++){
//           System.out.println("enter the " +i+"th elemnent :");
           int value=scanner.nextInt();
           int index=i;
           list.add(index,value);
       }

//       System.out.println("Elements in the list are :");
//
//       for (int i=0;i<n;i++){
//           System.out.println(list.get(i));
//       }

//       System.out.println("transferring values from list to array");



//       System.out.println("values in the array :");
//
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }



//        System.out.println("values in the array after sorting :");
//
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
        int[]  ar = new int[list.size()];

        for(int i=0;i<list.size();i++){
            ar[i]=list.get(i);
        }

        Arrays.sort(ar);

        int max_count = 1, res = ar[0];
        int curr_count = 1;

        for (int i = 1; i < list.size(); i++)
        {
            if (ar[i] == ar[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = ar[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = ar[n - 1];
        }

        System.out.println("longest repeating number is :"+res);

        int m=list.size();
        System.out.println("size of the list is "+m);


        //scanning and printing the values in the arraylist;

//
//       System.out.println("enter the values in the arraylist");
//
//
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//       for (int i = 0;i<n;i++){
//           arrayList.add(scanner.nextInt());
//           arrylist.add(i,values);
//       }
//
//
//        System.out.println("Elements in the list are :");
//
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }


    }
}
