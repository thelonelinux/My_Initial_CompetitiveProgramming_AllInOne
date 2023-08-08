package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    private static char[] vertexLabel;

    private static int[] vertexCount;

    private static boolean[] wasVisited;

    private static Queue<Integer> queue=new LinkedList<>();
    private static Stack<Integer> stack=new Stack<>();


    private static int[][] edges;


    private static void bfs(){
        wasVisited[vertexCount[0]]=true;
        System.out.println(vertexLabel[0]);
        queue.add(vertexCount[0]);
        int nextVertex;

        while(!queue.isEmpty()){
            int currVertex= queue.remove();

            while ((nextVertex=getAdjacentVertex(currVertex))!=-1){
                wasVisited[nextVertex]=true;
                System.out.println(vertexLabel[nextVertex]);
                queue.add(nextVertex);
            }
        }

    }

    private static void dfs(){
        wasVisited[0]=true;
        System.out.println(vertexLabel[0]);
        stack.push(vertexCount[0]);

        while (!stack.isEmpty()){

            int nextVertex=getAdjacentVertex(stack.peek());

            if(nextVertex==-1){
                stack.pop();
            }
            else {
                wasVisited[nextVertex]=true;
                System.out.println(vertexLabel[nextVertex]);
                stack.push(vertexCount[nextVertex]);
            }
        }

    }

    static void bfs2(){

        wasVisited[0]=true;
        System.out.println(vertexLabel[0]);
        queue.add(vertexCount[0]);
        int nextVertex;


        while (!queue.isEmpty()){
            int currVertex=queue.remove();

            while ((nextVertex=getAdjacentVertex(currVertex))!=1){
                wasVisited[nextVertex]=true;
                System.out.println(vertexLabel[nextVertex]);
                queue.add(vertexCount[nextVertex]);
            }
        }

    }

    static void dfs2(){

        wasVisited[0]=true;
        System.out.println(vertexLabel[0]);
        stack.push(vertexCount[0]);

        while (!stack.isEmpty()){
            int nextVertex=getAdjacentVertex(stack.peek());

            if (nextVertex==-1){
                stack.pop();
            }
            else {
                wasVisited[nextVertex]=true;
                System.out.println(vertexLabel[nextVertex]);
                stack.push(vertexCount[nextVertex]);
            }
        }
    }

    private static int getAdjacentVertex(int currVertex){
        for(int j=0;j<vertexCount.length;j++){
            if(edges[currVertex][j]==1 && !wasVisited[j]){
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
                    if(j==3*i  || j==i+1){
                        edges[i][j]=1;
                    }
                    else {
                        edges[i][j]=0;
                    }
                }
            }
            int count=0;

            for(int i=0;i<len;i++){
                if(edges[1][i]==1){
                    count++;
                }
            }
            vertexCount=new int[len];
            wasVisited =new boolean[len];
            Arrays.fill(wasVisited,false);
            vertexLabel=new char[len];

            for(int i=0;i<len;i++){
                vertexCount[i]=i;
                vertexLabel[i]=(char)(65+i);
            }


            bfs3();
        }

    }


    static void bfs3(){
        wasVisited[0]=true;
        System.out.println(vertexLabel[0]);
        queue.add(vertexCount[0]);
        int nextVertex;

        while (!queue.isEmpty()){

            int currVertex=queue.remove();

            while ((nextVertex=getAdjacentVertex(currVertex))!=-1){
                wasVisited[nextVertex]=true;
                System.out.println(vertexLabel[nextVertex]);
                queue.add(vertexCount[nextVertex]);
            }

        }
    }

    static void dfs3(){
        wasVisited[0]=true;
        System.out.println(vertexLabel[0]);
        stack.push(vertexCount[0]);

        while (!stack.isEmpty()){
            int nextVertex=getAdjacentVertex(stack.peek());

            if (nextVertex==-1){
                stack.pop();
            }
            else{
                wasVisited[nextVertex]=true;
                System.out.println(vertexLabel[nextVertex]);
                stack.push(vertexCount[nextVertex]);
            }
        }
    }
}
