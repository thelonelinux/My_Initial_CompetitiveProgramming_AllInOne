package com.company;

import java.util.*;

public class Main {

    static char[] vertexLabel={'A','B','C','D','E','F'};
    static int[] vertexCount={0,1,2,3,4,5};
//    static boolean[] wasVisited ={false,false,false,false,false,false};
    static int V=vertexCount.length;

     static Queue<Integer>  queue=new LinkedList<>();
     static Stack<Integer> stack=new Stack<>();


    static int[][] edges={{0,1,0,1,0,0},
            {1,0,1,0,0,0},
            {0,1,0,0,0,0},
            {1,0,0,0,1,0},
            {0,0,0,1,0,1},
            {0,0,0,0,1,0}};


//    static void bfs(){
//       wasVisited[0]=true;
//       System.out.println(vertexLabel[0]);
//        queue.add(vertexCount[0]);
//        int nextVertex;
//
//        while(!queue.isEmpty()){
//            int currVertex= queue.remove();
//
//
//            while ((nextVertex=getAdjacentVertex(currVertex))!=-1){
//
//                wasVisited[nextVertex]=true;
//                System.out.println(vertexLabel[nextVertex]);
//                queue.add(nextVertex);
//
//            }
//        }
//
//    }



//    static void dfs(){
//        wasVisited[0]=true;
//        System.out.println(vertexLabel[0]);
//        stack.push(vertexCount[0]);
//
//        while (!stack.isEmpty()){
//
//            int nextVertex=getAdjacentVertex(stack.peek());
//
//            if(nextVertex==-1){
//                stack.pop();
//            }
//            else {
//                wasVisited[nextVertex]=true;
//                System.out.println(vertexLabel[nextVertex]);
//                stack.push(vertexCount[nextVertex]);
//            }
//        }

   // }


//    static int getAdjacentVertex(int currVertex){
//        for(int j=0;j<vertexCount.length;j++){
//            if(edges[currVertex][j]==1 && wasVisited[j]==false){
//                return j;
//            }
//        }
//        return -1;
//    }



    static boolean isCyclicConntected(int[][] edges, int s, int V, boolean wasVisited[]) {

        int parent[] = new int[V];
        Arrays.fill(parent, -1);

        // Mark the current node as
        // visited and enqueue it
        wasVisited[s] = true;
        queue.add(s);
        int nextVertex;

        while (!queue.isEmpty()) {
            int currVertex = queue.poll();

            while ((nextVertex=getAdjacentVertex(currVertex))!=-1){

                int v = nextVertex;
                if (!wasVisited[v])
                {
                    wasVisited[v] = true;
                    queue.add(v);
                    parent[v] = currVertex;
                }
                else if (parent[currVertex] != v)
                    return true;
            }
        }
        return false;
    }


    static boolean isCyclicDisconntected(int[][] edges, int V)
    {

        // Mark all the vertices as not visited
        boolean wasVisited[] = new boolean[V];
        Arrays.fill(wasVisited,false);

        for (int i = 0; i < V; i++)
            if (!wasVisited[i] &&
                    isCyclicConntected(edges, i, V, wasVisited))
                return true;
        return false;
    }


    public static void main(String[] args) {
	// write your code here

        if (isCyclicDisconntected(edges, V))
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
