package com.company;

import java.io.*;
import java.util.*;

public class ReOptimized {

    /** Your answer was correct but check for optimizing it since in last two case it gave TLE probably due to sort and
     *  removing common elements may have triggered it.
     *  */

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here

        try{
            Reader sc=new Reader();
            BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
            int t=sc.nextInt();
            while (t-->0) {
                int n = sc.nextInt();
                long[] A = new long[n];
                long[] B = new long[n];
                for (int i = 0; i < n; i++) {
                    A[i] = sc.nextLong();
                }
                for (int i = 0; i < n; i++) {
                    B[i] = sc.nextLong();
                }

                Arrays.sort(A);
                Arrays.sort(B);


                /**Case when there is single element in both the arrays*/
                if (n == 1) {
                    if (A[0] == B[0]) {
//                        System.out.println(0);
                        wr.write("0"+"\n");
                    } else {
//                        System.out.println(-1);
                        wr.write("-1"+"\n");
                    }
                }

                /**Case when there is more than one element in the array*/
                else if (n > 1) {

                    /**Case when they are already identical both the arrays*/
                    if (Arrays.equals(A, B)) {
//                        System.out.println(0);
                        wr.write("0"+"\n");
                    }

                    /**Case when they are not already identical so let's check if they can be made identical or not */
                    else {
                        /**First Let's check if they can be made identical or not, means there must be pair of each element */

                        /**Put all in common array
                         ->and then check if each value is present in even number of times using of course map
                         ->If any value is not present in even number of times then print -1 means they can't be converted into identical
                         ->If all the value is present in even number of times then only we can convert it to identical arrays */



                        /**#############For Optimization Instead of making common array we instead traverse both array to store in map and make array and find minimumValue################3**/



                        Map<Long, Integer> map = new HashMap<>(); /**Map to Store couplets*/
                        long minimumValue=Integer.MAX_VALUE;   /** minimumValue to find the lowest element in the whole arrays without applying sort*/
                        for (int i = 0; i < A.length; i++) {
                            minimumValue=Math.min(A[i],minimumValue);
                            if (!map.containsKey(A[i])) {
                                map.put(A[i], 1);
                            } else {
                                int oldValue = map.get(A[i]);
                                map.replace(A[i], oldValue, oldValue + 1);
                            }
                        }

                        for (int i = 0; i < B.length; i++) {
                            minimumValue=Math.min(B[i],minimumValue);
                            if (!map.containsKey(B[i])) {
                                map.put(B[i], 1);
                            } else {
                                int oldValue = map.get(B[i]);
                                map.replace(B[i], oldValue, oldValue + 1);
                            }
                        }



                        boolean ansGiven = false;/** This is to be used when we get answer here only that no possible identical can be constructed then*/
                        /**Now checking if couplets of all number exists or not then*/
                        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
                            long key = entry.getKey();
                            int value = entry.getValue();
                            if (value % 2 == 1) { /**This shows that some element's couplets not exists so we print -1 and exit from this case*/
                                ansGiven = true;
//                                System.out.println(-1);
                                wr.write("-1"+"\n");
                                break;
                            }
                        }


                        /**But in above case if all the value is present in even number of times
                         then check the possible doublets in both the array because they are to be swapped for the cost of min(Ai , Bi)*/




                        /**    For couplets in array A    ***/
                        Map<Long, Integer> doubletsA = new HashMap<>();
                        List<Long> duplicateElementsA = new ArrayList<>();
                        long numOfdoubletsA = 0;

                        if (!ansGiven) {

                            /**Finding the possible couplets in array A using map*/
                            for (int i = 0; i < A.length; i++) {
                                if (!doubletsA.containsKey(A[i])) {
                                    doubletsA.put(A[i], 1);
                                } else {
                                    int oldValue = doubletsA.get(A[i]);
                                    doubletsA.replace(A[i], oldValue, oldValue + 1);
                                }
                            }

                            /**Storing the elements in list whose couplets is present*/
                            for (Map.Entry<Long, Integer> entry : doubletsA.entrySet()) {
                                long key = entry.getKey();
                                int value = entry.getValue();
                                if (value > 1) {
                                    int types = value / 2;
                                    for (int i = 0; i < types; i++) {
                                        duplicateElementsA.add(key);
                                    }
                                    numOfdoubletsA += value / 2;
                                }
                            }
                        }



                        /**   For couplets in array B    ***/
                        Map<Long, Integer> doubletsB = new HashMap<>();
                        List<Long> duplicateElementsB = new ArrayList<>();
                        long numOfdoubletsB = 0;

                        if (!ansGiven) {

                            /**Finding the possible couplets in array B using map*/
                            for (int i = 0; i < B.length; i++) {
                                if (!doubletsB.containsKey(B[i])) {
                                    doubletsB.put(B[i], 1);
                                } else {
                                    int oldValue = doubletsB.get(B[i]);
                                    doubletsB.replace(B[i], oldValue, oldValue + 1);
                                }
                            }

                            /**Storing the elements in the list whose couplets are found*/
                            for (Map.Entry<Long, Integer> entry : doubletsB.entrySet()) {
                                long key = entry.getKey();
                                int value = entry.getValue();
                                if (value > 1) {
                                    int types = value / 2;
                                    for (int i = 0; i < types; i++) {
                                        duplicateElementsB.add(key);
                                    }
                                    numOfdoubletsB += value / 2;
                                }
                            }



                            /**Now we have found couplets from the both the arrays*/

                            Collections.sort(duplicateElementsB);
                            Collections.sort(duplicateElementsA);
//                            System.out.println(numOfdoubletsA + " " + duplicateElementsA);
//                             System.out.println(numOfdoubletsB + " " + duplicateElementsB);

                            /**Lets put all our values of doublets in single list
                             * --->>But we don't want to store the common elements present in both list from two arrays
                             * */


                            /** System.out.println("Both list combined after removing those couplets which are present in both without removing duplicates in same list  " + concatedList);*/



                            /**############For Efficiently removing common Elements we can optimize our code as following############3**/
                            /**  Just traverse the first duplicateElementsA and store the value in map with their key as element their value as occurrence**/
                            /** And then traverse through second duplicateElementsB and if found that key then minimize the value by -1 then previous*/
                            /** But if it has reached to zero and going to  -1 means it has extra element in second duplicateElementB so later to all those/* Negative element just make it positive so that they can be no more common element but extra elements
                             */
                            /** After you finished with map store all the values in a list with their values as number of times*/

                            Map<Long, Integer> commonRemovalMap=new HashMap<>();
                            /** Traversing via the first duplicateElementA */
                            for (int i=0;i<duplicateElementsA.size();i++){
                                long number=duplicateElementsA.get(i);
                                if (!commonRemovalMap.containsKey(number)) {
                                    commonRemovalMap.put(number, 1);
                                } else {
                                    int oldValue = commonRemovalMap.get(number);
                                    commonRemovalMap.replace(number, oldValue, oldValue + 1);
                                }
                            }

                            /** Now Traversing the via the second duplicateElementsB */
                            List<Long> withoutCommonElementFinalList=new ArrayList<>();
                            for (int i=0;i<duplicateElementsB.size();i++){
                                long number=duplicateElementsB.get(i);
                                if (!commonRemovalMap.containsKey(number)) {
//                                    commonRemovalMap.put(number, 1);
                                        withoutCommonElementFinalList.add(number);
                                    /**   <---------- Mistake here since duplicates within second duplicateElementsB will be also removed
                                     **     so we better add in list in here only rather than manipulating with map**/
                                } else {
                                    int oldValue = commonRemovalMap.get(number);
                                    commonRemovalMap.replace(number, oldValue, oldValue - 1);
                                }
                            }

                            /** Now Traverse through this Map to add the key as element and their values as frequency, if frequency is negative then make is absolute*/

                            for (Map.Entry<Long,Integer> entry: commonRemovalMap.entrySet()){
                                long key=entry.getKey();
                                int value=Math.abs(entry.getValue());
                                if (value==0){
                                    //No need to add anything
                                    continue;
                                }
                                else if (value==1){
                                    withoutCommonElementFinalList.add(key);
                                }
                                else if (value>1){
                                    while (value-->0){
                                        withoutCommonElementFinalList.add(key);
                                    }
                                }
                            }


                           /**So Now we got our final list **/

                           Collections.sort(withoutCommonElementFinalList);
//                           System.out.println("Final List "+ withoutCommonElementFinalList);
                           long newCommonRemoverAnswerFinal = 0;
                           long minimumValueComparator = 2 * minimumValue;
                           for (int i = 0; i < withoutCommonElementFinalList.size()/2; i++) {  //Here we only need to pick number of doublets in any of the new list
                                if (minimumValueComparator < withoutCommonElementFinalList.get(i)) {
                                    newCommonRemoverAnswerFinal += minimumValueComparator;
                                } else {
                                    newCommonRemoverAnswerFinal += withoutCommonElementFinalList.get(i);
                                }
                           }
//                           System.out.println(newCommonRemoverAnswerFinal);
                            wr.write(newCommonRemoverAnswerFinal+"\n");
                        }
                    }

                }
            }
            wr.flush();
            wr.close();

        }catch (Exception e){
            return;
        }
    }
}
