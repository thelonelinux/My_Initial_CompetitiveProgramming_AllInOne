package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Varargs(variable arguments.

        Varargs varargs=new Varargs();

        varargs.func(8);

        varargs.func(8,7);

        varargs.func(8,7,6);

        varargs.func(8,7,6,5);

        varargs.func(8,7,6,5,4,3,2,1);

        varargs.func("hello:   ");

        varargs.func("hello","world:   ");

        varargs.func("what","is","this:   ");

        varargs.func("hoo");
    }
}
