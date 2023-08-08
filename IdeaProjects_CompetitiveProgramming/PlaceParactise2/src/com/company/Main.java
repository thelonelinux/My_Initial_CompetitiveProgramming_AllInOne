package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int HL=b.get(0);   //Highest possible factor value
        int LL=a.get(a.size()-1);  //Lowest possible factor value

        int sizeOfB=b.size();
        int hcf=b.get(0);

        int i = 1;
        while(i<sizeOfB)
        {
            if(b.get(i)%hcf==0)
            {
                i++;
            } else {
                hcf = b.get(i)%hcf;
                i++;
            }
        }

        int finalHcf=hcf;
        int count=0;
        for (int i1=LL; i1<=HL;i1++){
            if (finalHcf%i1==0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();

        list1.add(0,2);
        list1.add(1,4);

        list2.add(0,16);
        list2.add(1,32);
        list2.add(2,96);

        int ans=getTotalX(list1,list2);

        System.out.println(ans);
    }
}
