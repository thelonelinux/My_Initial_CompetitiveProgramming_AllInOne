package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Integer[] arr=new Integer[5];
       arr[0]=1;
       arr[1]=5;
       arr[2]=5;
       arr[3]=6;
       arr[4]=8;

       Collections.rotate(arr,2);
    }
}
