package com.company;

import java.util.*;

public class Main {

    public static String precisionCompute(long x, long y, int n) {
        // Base cases
        String string=new String();
        if (y == 0) {
            //   System.out.print("Infinite");
            string="Infinite";
            return string;
        }
        if (x == 0) {
            //  System.out.print("0");
            string="0";
            return string;
        }
        if (n <= 0) {
            // Since n <= 0, don't compute after
            // the decimal
            Long longInt=x/y;
            // System.out.print(x / y);
            string=longInt.toString();
            return string;
        }

        // Handling negative numbers
        if (((x > 0) && (y < 0)) || ((x < 0) && (y > 0))) {
            //  System.out.print("-");
            string+="-";
            x = x > 0 ? x : -x;
            y = y > 0 ? y : -y;
        }

        // Integral division
        Long d = x / y;

        // Now one by print digits after dot
        // using school division method.
        for (int i = 0; i <= n; i++) {
            // System.out.print(d);
            string+=d.toString();
            x = x - (y * d);
            if (x == 0)
                break;
            x = x * 10;
            d = x / y;
            if (i == 0) {
                //System.out.print(".");
                string+=".";
            }
        }
        return string;
    }

    static int AdditionAnswer(long p,long q, long r, long a, long b, long c){
        long diff1=a-p;
        long diff2=b-q;
        long diff3=c-r;

        long[] arr={diff1,diff2,diff3};

        //Here a,b,c,p,q,r can also be negative number
        //For difference . Here no matter whether you need to keep p,q,r greater or smaller than a,b,c;
        Set<Long> set=new HashSet<>();
        int count=0;

        for (int i=0;i<3;i++){
            if (arr[i]==0){
                //nothing to do
            }
            if (arr[i]!=0){
                boolean ans=set.add(arr[i]);
                if (ans==true){
                    count++;
                }
            }
        }
        return count;
        //For the case when multiplying numbers in tuple can convert it into the required tuple
        //If only
    }

    public static void main(String[] args) throws  java.lang.Exception{

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                long p=sc.nextLong();
                long q=sc.nextLong();
                long r=sc.nextLong();
                long a=sc.nextLong();
                long b=sc.nextLong();
                long c=sc.nextLong();

                //count number of zeroes in PQR;
                int count=0;
                if (p==0){
                    count++;
                }
                if (q==0){
                    count++;
                }
                if (r==0){
                    count++;
                }

                int ABCCount=0;
                if (a==0){
                    ABCCount++;
                }
                if (b==0){
                    ABCCount++;
                }
                if (c==0){
                    ABCCount++;
                }


                Set<Float> set=new HashSet<>();
                List<Float> list=new ArrayList<>();


                if (a==p && b==q && c==r){
                    //Base Case 1
//                    System.out.println("It's an Universal Base Case");
//                    System.out.println("All Are same so Answer is 0");
                    System.out.println(0);
                }
                else if ((a==0 && b==0 && c==0) ){
                    //Base case 2
//                    System.out.println("It's Universal Base Case");
//                    System.out.println("All ABC are zero so number of operator require is 1 which is 0 so Answer is 1");
                    System.out.println(1);
                }
                else if (ABCCount==2){
                    //Base Case 3
                    if (count<=1){
                        if (a==0 && b==0 && c==r){
                            System.out.println(Math.min(1,AdditionAnswer(p,q,r,a,b,c)));
                        }else if (b==0 && c==0 && p==a){
                            System.out.println(Math.min(1,AdditionAnswer(p,q,r,a,b,c)));
                        }else if (a==0 && c==0 && q==b){
                            System.out.println(Math.min(1,AdditionAnswer(p,q,r,a,b,c)));
                        }else{
                            System.out.println(Math.min(2,AdditionAnswer(p,q,r,a,b,c)));
                        }
                        continue;
                    }

                }
                else if ((a==b && b==c)){
                    //Base Case 4
                    if (a==0){
                        System.out.println(Math.min(1,AdditionAnswer(p,q,r,a,b,c)));
                        continue;
                    }else {
                        System.out.println(Math.min(2,AdditionAnswer(p,q,r,a,b,c)));
                        continue;
                    }

                }
                else if ( p>a && q>b && r>c && a>=0 && b>=0 && c>=0) {
                    //Base case 5
                    System.out.println(AdditionAnswer(p,q,r,a,b,c));
                    continue;
                }
                else if ( ((p>a && q>b) || (p>a && r>c) || (q>b && r>c)) && (a>=0 && b>=0 && c>=0) ) {
                    //Base case 5
                    System.out.println(AdditionAnswer(p,q,r,a,b,c));
                    continue;
                }
                else{
                    //Base case 6

                    if (count<2){

                        if (p!=0 && p!=a ){
                            Float finalAns=Float.parseFloat(precisionCompute(a,p,10));
                            if (a%p!=0){
//                            System.out.println("It's not perfect divisor");
//                            System.out.println(finalAns);
                                list.add(finalAns);
                            }else{
//                            System.out.println("It's a perfect divisor");
//                            System.out.println(finalAns);
//                            set.add(finalAns);
                                list.add(finalAns);
                            }

                        }else{
//                        System.out.println("Try without a as 0 or may be P and A are same");
                        }


                        if (q!=0 && q!=b){
                            Float finalAns=Float.parseFloat(precisionCompute(b,q,10));
                            if (b%q!=0){
//                            System.out.println("It's not perfect divisor");
//                            System.out.println(finalAns);
                                list.add(finalAns);
                            }else{
//                            System.out.println("It's a perfect divisor");
//                            System.out.println(finalAns);
//                            set.add(finalAns);
                                list.add(finalAns);
                            }

                        }else{
//                        System.out.println("Try without b as 0 or May be Q and B are same");
                        }

                        if (r!=0 && r!=c){
                            Float finalAns=Float.parseFloat(precisionCompute(c,r,10));
                            if (c%r!=0){
//                            System.out.println("It's not perfect divisor");
//                            System.out.println(finalAns);
                                list.add(finalAns);
                            }else{
//                            System.out.println("It's a perfect divisor");
//                            System.out.println(finalAns);
//                            set.add(finalAns);
                                list.add(finalAns);
                            }

                        }else{
//                        System.out.println("Try without c as 0 or may be R and C are same");
                        }

                    }else{

//                        System.out.println("We have more than 2 zeroes in PQR so try finding by addition only");
//                        System.out.println("So Answer by Addition operation is "+ AdditionAnswer(p,q,r,a,b,c));
                        System.out.println( AdditionAnswer(p,q,r,a,b,c));

                        continue;
                    }

                    //Useful content
//                    System.out.println("Useful Content");
                    int finalCount=0;
                    for (int i=0;i<list.size();i++){

                        if (list.get(i)==1){
//                            System.out.println("Match Found");
                            finalCount=finalCount;
                            continue;
                        }

                        if (Math.abs(list.get(i))<1){
//                            System.out.println("Less than one");
                            finalCount++;
                        }else{
//                            System.out.println(list.get(i));
                            set.add(list.get(i));
                        }
                    }
                    int finalAnswer=set.size()+finalCount;
//                    System.out.println("Number of operator d require "+Math.min(finalAnswer,AdditionAnswer(p,q,r,a,b,c)));
                    System.out.println(Math.min(finalAnswer,AdditionAnswer(p,q,r,a,b,c)));
                }

            }

        }catch (Exception e){
            return;
        }

    }
}
