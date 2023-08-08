package com.company;

public class Main {

    static void makeAnagram(String a, String b) {

        int index=0;
        int m=0;
        StringBuilder sb=new StringBuilder(a);
        StringBuilder sb2=new StringBuilder(b);


        for(char c : a.toCharArray()){


            for(int i=0;i<b.length();i++){
                if(c==b.charAt(i)){

                    sb2.setCharAt(i,'0');
                    sb.setCharAt(index,'0');
                    break;
                }


            }
            index++;
        }
        int count=0;
        for(int n=0;n<a.length();n++){
            if(sb.charAt(n)=='0'){
                count=count+1;
            }
        }
        for(int p=0;p<b.length();p++){
            if(sb2.charAt(p)=='0'){
                count=count+1;
            }
        }

        int totalSize=a.length()+b.length();

//        return totalSize-count;
        System.out.println(sb.toString());
        System.out.println(sb2.toString());
    }

    static int makeAnagram2(String a, String b) {

        int index=0;
        int m=0;
        StringBuilder sb=new StringBuilder(a);
        StringBuilder sb2=new StringBuilder(b);


        for(char c : a.toCharArray()){


            for(int i=0;i<b.length();i++){
                if(c==b.charAt(i)){

                    sb2.setCharAt(i,'0');
                    sb.setCharAt(index,'0');
                    break;
                }


            }
            index++;
        }
        int count=0;
        for(int n=0;n<a.length();n++){
            if(sb.charAt(n)=='0'){
                count=count+1;
            }
        }
        for(int p=0;p<b.length();p++){
            if(sb2.charAt(p)=='0'){
                count=count+1;
            }
        }

        int totalSize=a.length()+b.length();

        return totalSize-count;
//        System.out.println(sb.toString());
//        System.out.println(sb2.toString());
    }


    public static void main(String[] args) {

       String a="bugexikjevtubidpulaelsbcqlupwetzyzdvjphn";
       String b="lajoipfecfinxjspxmevqxuqyalhrsxcvgsdxxkacspbchrbvvwnvsdtsrdk";
       String c="abcjkl";
       String d="decjkl";
       System.out.println(makeAnagram2(c,d));
       makeAnagram(c,d);
    }
}
