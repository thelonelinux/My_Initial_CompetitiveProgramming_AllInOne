package com.company;

import java.util.Scanner;

public class FinalSubmission {

    public static int[] eachRowStatus(int len, Scanner sc, int totalPositive){
        int[] rowStatus=new int[len];
        int grader=0;
        int sum=0;
        for (int i=0;i<len;i++){
            System.out.println(1+" "+(i+1)+" "+(1)+" "+(i+1)+" "+len);
            System.out.flush();
            grader=sc.nextInt();
            rowStatus[i]=grader;
            sum=sum+grader;
            if (sum==totalPositive){
                //So that further exploring the row is not required
                break;
            }

        }
        return rowStatus;
    }

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here
        //Your marks will depend on number of queries you asked and not in memory efficiency or time optimization

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();   //which value is 2
        while (t-->0){
            int len=sc.nextInt();   //which value is 60
            int P=sc.nextInt();    //which value is 2 most often; after doing 2 only you have to reply your matrix.
            int q=5*len*len;


            int[][] arr=new int[len][len];
            int X=-1;


            //First query to ask for whole matrix
            int grader=0;
            System.out.println(1+" "+1+" "+1+" "+len+" "+len);
            System.out.flush();
            grader=sc.nextInt();
            //First Base Case --> If  none positive case is present
            if (grader==0){
                System.out.println(2);
                for (int i=0;i<len;i++){
                    for (int j=0;j<len;j++){
                        System.out.print(arr[i][j]+" ");
                        System.out.flush();
                    }
                    System.out.println();
                    System.out.flush();
                }
                X=sc.nextInt();
                if (X==1 ){
                    continue; // means go for next testcase //of course this will always return continue
                }else{
//                    System.out.println("You said non positive still giving wrong reply");
                }
            }
            //Second Base Case --> If all the case is positive
            else if (grader==(len*len)){
                System.out.println(2);
                for (int i=0;i<len;i++){
                    for (int j=0;j<len;j++){
                        System.out.print(1+" ");
                        System.out.flush();
                    }
                    System.out.println();
                    System.out.flush();
                }
                X=sc.nextInt();
                if (X==1 ){
                    continue; // means go for next testcase //of course this will always return continue
                }else{
//                    System.out.println("You said all positive still getting wrong reply");
                }
            }
            //Real Coding Starts
            else{

                //First Check for all rows
//                System.out.println("Check for each rows because positive case is not zero");
                int[] rowStatus=new int[len];
                rowStatus=eachRowStatus(len,sc,grader);

                //Now for each rows the status we have got in an array form
                //Now try and find within array the positive case in sequence in which they are
                for (int i=0;i<len;i++){
                    //Within it there are two base case
                    //First Case --> when all the case is positive in the given row
                    if (rowStatus[i]==len){
                        //Just put all the values as 1 in the given row
                        for (int j=0;j<len;j++){
                            arr[i][j]=1;
                        }
                    }
                    //Second Case --> when all the case is negative
                    else if (rowStatus[i]==0){
                        //do nothing
                        continue;
                    }
                    //For all other case
                    //Also we could have third case as when numOfPositiveCaseIn Row is one then by finding by binary.
                    else{
                        //find some less queried way to find the answer for other cases

                        //in a lay man way we can do as ask for each
                        int numOfPositiveCase=rowStatus[i];
                        int numOfNegativeCase=len-numOfPositiveCase;
                        int count=0;
                        int antiCount=0;
                        //if We get number of count==numOfPositiveCase(i.e. grader==1) or antiCount==numOfNegativeCase(i.e. grader==0) then we fill the
                        // value accordingly and rest values as per our case

                        //Now lets ask the grader
                        int reply=0;
                        int index=0;
                        for (int j=1;j<=len;j++){
                            System.out.println(1+" "+(i+1)+" "+j+" "+(i+1)+" "+j);
                            System.out.flush();
                            reply=sc.nextInt();
                            if (reply==0){
                                antiCount++;
                                arr[i][j-1]=0;
                            }else{
                                arr[i][j-1]=1;
                                count++;
                            }

                            if (count==numOfPositiveCase){
                                //We got our answer leave rest as 0 only so break;
                                break;
                            }
                            if (antiCount==numOfNegativeCase){
                                //Only this are our possible negative case rest are all positive
                                //so fill all the rest as positive i.e. is 1;
                                //store the index and come out of the loop
                                index=j;
                                for (int k=index;k<len;k++){
                                    arr[i][k]=1;
                                }
                                break;
                            }
                        }
                    }
                }

                //Now after we are done we can print our answer
                System.out.println(2);
                for (int i=0;i<len;i++){
                    for (int j=0;j<len;j++){
                        System.out.print(arr[i][j]+" ");
                        System.out.flush();
                    }
                    System.out.println();
                    System.out.flush();
                }
                X=sc.nextInt();
                if (X==1 ){
                    continue; // means go for next testcase //of course this will always return continue
                }else{
//                    System.out.println("You said non positive still giving wrong reply");
                }





            }
        }

    }
}
