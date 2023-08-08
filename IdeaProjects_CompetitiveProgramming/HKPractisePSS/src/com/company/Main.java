package com.company;

public class Main {

    static String timeInWords(int h, int m) {

        String[] hour={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        String[] minute={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","quarter","sixteen",
        "seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine", "half past"};


        String oClock="o' clock";
        String quarterPast="quarter past";
        String quarterTo="quarter to";


        //case 1 o'clock
        if(m==0){
            return  hour[h]+" "+oClock;
        }
        if(m==15){
            return  quarterPast+" "+hour[h];
        }
        if(m==45){
            return  quarterTo+" "+hour[h+1];

        }
        if(m==30){
            return  minute[m]+" "+hour[h];

        }


        if(m>0 && m<30){
            if(m==1){
                return minute[m]+" minute past "+hour[h];
            }
            return minute[m]+" minutes past "+hour[h];
        }
        if(m>30){
            int ans=60-m;
            if(ans==1){
                return minute[ans]+" minute to "+hour[h+1];
            }
            return minute[ans]+" minutes to "+hour[h+1];
        }


        return null;
    }

    public static void main(String[] args) {
	// write your code here

        int h=1;
        int m=1;

        System.out.println(timeInWords(h,m));
    }
}
