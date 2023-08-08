package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int n=sc.nextInt();

                if (n==1){
                    System.out.println(1+" "+1+" "+1);
                }
                else if(n==2){
                    System.out.println(2+" "+1+" "+3);
                }else if(n==3){
                    System.out.println(3+" "+1+" "+3);
                }else if(n==4){
                    System.out.println(2+" "+1+" "+3);
                }else if(n==5){
                    System.out.println(5+" "+1+" "+3);
                }else if(n==6){
                    System.out.println(2+" "+1+" "+3);
                }else if(n==7){
                    System.out.println(7+" "+1+" "+3);
                }else if(n==8){
                    System.out.println(2+" "+1+" "+3);
                }else if(n==9){
                    System.out.println(2+" "+1+" "+3);
                }

                //part 1
                int count=0;
                int secondSmallest=0;
                for (int i=1;i<=n;i++){
                    if (n%i==0){
                        count++;
                        if(count==2){
                            secondSmallest=i;
                            break;
                        }
                    }
                }
                System.out.print(secondSmallest+" ");

                //part 2
                Integer integer=n;
                String string=integer.toString();
                String rev=new StringBuffer(string).toString();
                int max=0;
                int i=0;
                for (char c : rev.toCharArray()){
                    int ch=c;

                    if(ch>max){
                        max=ch;
                        i++;
                    }
                }
                i++;
                System.out.print(i+" ");

                //part 3
                String newStr=new String();
                for (char c : string.toCharArray()){
                    int ch=c;
                    if (ch%2==0){
                        ch=ch+1;
                    }
                    newStr+=(char)ch;

                }
                System.out.println(newStr);

            }
        }catch (Exception e){
            return;
        }

    }
}
