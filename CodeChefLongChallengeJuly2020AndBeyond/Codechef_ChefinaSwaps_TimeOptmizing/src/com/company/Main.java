package com.company;

import java.io.*;
import java.util.*;

public class Main {
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

            Scanner scan=new Scanner(System.in);
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

                        /**Putting the first array element in commonArray*/
                        long[] commonArray = new long[2 * n];
                        for (int i = 0; i < A.length; i++) {
                            commonArray[i] = A[i];
                        }
                        /**Putting the second array element in commonArray*/
                        int k = 0;
                        for (int i = A.length; i < commonArray.length; i++) {
                            commonArray[i] = B[k++];
                        }
                        /**this sorting can may be not used because it will be time efficient and we only need to find the minimum element**/
                        Arrays.sort(commonArray);
                        /**We are sorting to find the minimum value in whole of the commonArray which can be used for minimum value to
                         * swap large values when the swapping will be needed to be done for optimized swapping
                         */
                        long minimumValue = commonArray[0]; /**This can be used for swapping purpose if it's twice the number is smaller than*/

                        /**Now we will store all the value of commonArray in our Map to check if couplets of all number exists or not*/
                        Map<Long, Integer> map = new HashMap<>();
                        for (int i = 0; i < commonArray.length; i++) {
                            if (!map.containsKey(commonArray[i])) {
                                map.put(commonArray[i], 1);
                            } else {
                                int oldValue = map.get(commonArray[i]);
                                map.replace(commonArray[i], oldValue, oldValue + 1);
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
                            /**System.out.println(numOfdoubletsA + " " + duplicateElementsA);
                             System.out.println(numOfdoubletsB + " " + duplicateElementsB);*/

                            /**Lets put all our values of doublets in single list
                             * --->>But we don't want to store the common elements present in both list from two arrays
                             * */


                            /** System.out.println("Both list combined after removing those couplets which are present in both without removing duplicates in same list  " + concatedList);*/


                            /**  Just subtract the first List from second list and only those from seconnd to first which are not present in first*/

                            /**  First Lets Copy all the elements in array */
                            long[] arrayA = new long[(int) numOfdoubletsA];
                            long[] arrayB = new long[(int) numOfdoubletsB];
                            for (int i = 0; i < numOfdoubletsA; i++) {
                                arrayA[i] = duplicateElementsA.get(i);
                                arrayB[i] = duplicateElementsB.get(i);
                            }

                            /** Now lets remove all the common elements in both list by identifying whichever are common and making it -1 as new value*/
                            for (int i = 0; i < numOfdoubletsA; i++) {
                                for (int j = 0; j < numOfdoubletsB; j++) {
                                    if (arrayA[i] == arrayB[j]) {
                                        arrayA[i] = -1;
                                        arrayB[j] = -1;
                                        break;
                                    }
                                }
                            }

                            /**New List will be generated having no common element if for any values it's -1 then they won't be added hence common removed*/
                            List<Long> newListA = new ArrayList<>();
                            List<Long> newListB = new ArrayList<>();
                            for (int i = 0; i < numOfdoubletsA; i++) {
                                if (arrayA[i] >= 0) {
                                    newListA.add(arrayA[i]);
                                }
                                if (arrayB[i] >= 0) {
                                    newListB.add(arrayB[i]);
                                }

                            }


                            /** Hence Now we just concatenate the two list and go for our final answer to identify the total cost of swapping and making it identical**/
                            List<Long> newConcatedList = new ArrayList<>();
                            newConcatedList.addAll(newListA);
                            newConcatedList.addAll(newListB);
                            /** System.out.println("After removing common elements present in both arrays");
                             System.out.println(newListA.size() + " " + newListA);
                             System.out.println(newListB.size() + " " + newListB);
                             System.out.println(newConcatedList);*/


                            /**System.out.println("Our Random two minimum pick solution will be as " + randomPickAnswer);
                             System.out.println("My previous all good ans were as " + myOptimalAnswer);
                             System.out.println("Minimum Possible value is " + Math.min(randomPickAnswer, myOptimalAnswer));*/


                            /** Now sort our concated list and only obtain first listSize of either A or B numbers to get the minimumb possible answer*/
                            /** And also if minimum value in whole of the commonArray can also be helped to swapped
                             * if min elements we are going to swap are much larger than twice the minimum number
                             * */
                            Collections.sort(newConcatedList);
                            long newCommonRemoverAnswerFinal = 0;
                            long minimumValueComparator = 2 * minimumValue;
                            for (int i = 0; i < newListA.size(); i++) {  //Here we only need to pick number of doublets in any of the new list
                                if (minimumValueComparator < newConcatedList.get(i)) {
                                    newCommonRemoverAnswerFinal += minimumValueComparator;
                                } else {
                                    newCommonRemoverAnswerFinal += newConcatedList.get(i);
                                }
                            }

//                            System.out.println(newCommonRemoverAnswerFinal);
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
