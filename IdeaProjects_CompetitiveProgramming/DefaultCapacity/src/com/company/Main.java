package com.company;


import java.util.*;

import java.io.*;

import java.awt.DisplayMode;

import java.lang.Exception;

import java.lang.RuntimeException;



public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

    //Also above you must write throws Exception in main otherwise it will show java.lang.Exception;
    //and you wont be able to crete any object of StackUsingArray since it contains many Exceptions;

        StackUsingArray stacs = new StackUsingArray(5);

        for (int i=0;i<5;i++){
            stacs.push(i);
        }


    }
}
