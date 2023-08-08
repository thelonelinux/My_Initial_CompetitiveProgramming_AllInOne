package com.company;

import java.io.IOException;
import java.util.*;

public class Main {
    static char[] vertexLabel;

    static int[] vertexCount;

    static boolean[] wasVistited;

    static Queue<Integer> queue=new LinkedList<>();
    static Stack<Integer> stack=new Stack<>();


    static int[][] edges;


    static void bfs(){
        wasVistited[0]=true;
        System.out.println(vertexLabel[0]);
        queue.add(vertexCount[0]);
        int nextVertex;

        while(!queue.isEmpty()){
            int currVertex= queue.remove();


            while ((nextVertex=getAdjacentVertex(currVertex))!=-1){

                wasVistited[nextVertex]=true;
                System.out.println(vertexLabel[nextVertex]);
                queue.add(nextVertex);

            }
        }

    }


    static void dfs(){
        wasVistited[0]=true;
        System.out.println(vertexLabel[0]);
        stack.push(vertexCount[0]);

        while (!stack.isEmpty()){

            int nextVertex=getAdjacentVertex(stack.peek());

            if(nextVertex==-1){
                stack.pop();
            }
            else {
                wasVistited[nextVertex]=true;
                System.out.println(vertexLabel[nextVertex]);
                stack.push(vertexCount[nextVertex]);
            }
        }

    }


    static int getAdjacentVertex(int currVertex){
        for(int j=0;j<vertexCount.length;j++){
            if(edges[currVertex][j]==1 && wasVistited[j]==false){
                return j;
            }
        }
        return -1;
    }



    public static void main(String[] args) throws IOException {
        // write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        for(int t=0;t<testCase;t++){


            int len=sc.nextInt();

            edges=new int[len][len];

            for(int i=0;i<len;i++){
                for(int j=0;j<len;j++){

                    edges[i][j]=sc.nextInt();
                }
            }

            vertexCount=new int[len];
            wasVistited=new boolean[len];
            Arrays.fill(wasVistited,false);
            vertexLabel=new char[len];

            for(int i=0;i<len;i++){
                vertexCount[i]=i;
                vertexLabel[i]=(char)(65+i);
            }

            dfs();
        }

    }
}
