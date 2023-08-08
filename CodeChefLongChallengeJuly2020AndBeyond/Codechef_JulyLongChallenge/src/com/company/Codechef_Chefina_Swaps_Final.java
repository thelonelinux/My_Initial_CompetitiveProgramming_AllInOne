package com.company;

import java.io.*;
import java.lang.reflect.AnnotatedElement;
import java.util.*;

public class Codechef_Chefina_Swaps_Final {

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

                if (n == 1) {
                    if (A[0] == B[0]) {
//                        System.out.println(0);
                        wr.write("0"+"\n");
                    } else {
//                        System.out.println(-1);
                        wr.write("-1"+"\n");
                    }
                } else if (n > 1) {
                    if (Arrays.equals(A, B)) {
//                        System.out.println(0);
                        wr.write("0"+"\n");
                    } else {
                        //Put all in common array
                        //and then check it each value is present in even number of times using of course map
                        //If any value is not present in even number of times then print -1
                        //If all the value is present in even number of times

                        //then check the possible doubletsA in any array
                        //the output is num of doubletsA
                        long[] commonArray = new long[2 * n];
                        for (int i = 0; i < A.length; i++) {
                            commonArray[i] = A[i];
                        }
                        int k = 0;
                        for (int i = A.length; i < commonArray.length; i++) {
                            commonArray[i] = B[k++];
                        }
                        Arrays.sort(commonArray);
                        long minimumValue = commonArray[0]; //This can be used for swapping purpose if it's twice the number is smaller than
                        Map<Long, Integer> map = new HashMap<>();
                        for (int i = 0; i < commonArray.length; i++) {
                            if (!map.containsKey(commonArray[i])) {
                                map.put(commonArray[i], 1);
                            } else {
                                int oldValue = map.get(commonArray[i]);
                                map.replace(commonArray[i], oldValue, oldValue + 1);
                            }
                        }
                        boolean ansGiven = false;
                        for (Map.Entry<Long, Integer> entry : map.entrySet()) {

                            long key = entry.getKey();
                            int value = entry.getValue();
                            if (value % 2 == 1) {
                                ansGiven = true;
//                                System.out.println(-1);
                                wr.write("-1"+"\n");
                                break;
                            }
                        }
                        //If all the value is present in even number of times
                        //then check the possible doubletsA in any array
                        //the output is min(Ai , Bi)

                        //For DoubletsA
                        Map<Long, Integer> doubletsA = new HashMap<>();
                        List<Long> duplicateElementsA = new ArrayList<>();
                        long numOfdoubletsA = 0;
                        if (!ansGiven) {
                            for (int i = 0; i < A.length; i++) {
                                if (!doubletsA.containsKey(A[i])) {
                                    doubletsA.put(A[i], 1);
                                } else {
                                    int oldValue = doubletsA.get(A[i]);
                                    doubletsA.replace(A[i], oldValue, oldValue + 1);
                                }
                            }


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
//                        System.out.println(numOfdoubletsA+" "+duplicateElementsA);
                        }

                        //For DoubletsB
                        Map<Long, Integer> doubletsB = new HashMap<>();
                        long myOptimalAnswer = 0;
                        if (!ansGiven) {
                            for (int i = 0; i < B.length; i++) {
                                if (!doubletsB.containsKey(B[i])) {
                                    doubletsB.put(B[i], 1);
                                } else {
                                    int oldValue = doubletsB.get(B[i]);
                                    doubletsB.replace(B[i], oldValue, oldValue + 1);
                                }
                            }
                            List<Long> duplicateElementsB = new ArrayList<>();
                            long numOfdoubletsB = 0;
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
//                        System.out.println(numOfdoubletsB+" "+duplicateElementsB);

                            Collections.sort(duplicateElementsB);
                            Collections.sort(duplicateElementsA);
                            /**System.out.println(numOfdoubletsA + " " + duplicateElementsA);
                            System.out.println(numOfdoubletsB + " " + duplicateElementsB);*/
//                        int a=0;
//                        int b=0;
//                        long finalAnswer=0;
//                        for (int i=0;i<numOfdoubletsB;i++){
//                            if (duplicateElementsA.get(a)<duplicateElementsB.get(b)){
//                                finalAnswer+=duplicateElementsA.get(a);
//                                a++;
//                                continue;
//                            }
//                            else if (duplicateElementsA.get(a)>duplicateElementsB.get(b)){
//                                finalAnswer+=duplicateElementsB.get(b);
//                                b++;
//                                continue;
//                            }
//                            else if (duplicateElementsA.get(a)==duplicateElementsB.get(b)){
//                                if (a<numOfdoubletsB && b<numOfdoubletsB){
//                                    if (duplicateElementsA.get(a)==duplicateElementsA.get(a+1) || duplicateElementsB.get(b)==duplicateElementsB.get(b+1)){
//                                        a++;
//                                        b++;
//                                        continue;
//                                    }else{
//                                        finalAnswer+=duplicateElementsA.get(a);
//                                        a++;
//                                        continue;
//                                    }
//                                }
//                            }
//                        }

                            //Finding Optimal Answer
                            long minimumPossibleSwaps = Math.min(Math.min(duplicateElementsA.get(0) * 2, duplicateElementsB.get(0)) * 2, minimumValue * 2);
                            myOptimalAnswer = 0;
                            for (int j = 0; j < numOfdoubletsB; j++) {
                                if (duplicateElementsA.get(j) < duplicateElementsB.get(j)) {
                                    myOptimalAnswer += Math.min(duplicateElementsA.get(j), minimumPossibleSwaps);

                                } else if (duplicateElementsA.get(j) > duplicateElementsB.get(j)) {
                                    myOptimalAnswer += Math.min(duplicateElementsB.get(j), minimumPossibleSwaps);

                                } else if (duplicateElementsA.get(j) == duplicateElementsB.get(j)) {
                                    continue;
                                }

                            }


//                        System.out.println("Previous answer "+finalAnswer);
//                        System.out.println("Optimal Solution is "+myOptimalAnswer);

                            //Lets put all our values of doublets in single list
                            List<Long> concatedList = new ArrayList<>();
                            concatedList.addAll(duplicateElementsA);
                            concatedList.addAll(duplicateElementsB);
                            Collections.sort(concatedList);
                           /** System.out.println("Both list combine  " + concatedList);
                            System.out.println("Both list combined after removing those couplets which are present in both without removing duplicates in same list  " + concatedList);*/
                            //Just subtract the first List from second list
                            //First Lets Copy all the elements in array
                            long[] arrayA = new long[(int) numOfdoubletsA];
                            long[] arrayB = new long[(int) numOfdoubletsB];
                            for (int i = 0; i < numOfdoubletsA; i++) {
                                arrayA[i] = duplicateElementsA.get(i);
                                arrayB[i] = duplicateElementsB.get(i);
                            }
                            for (int i = 0; i < numOfdoubletsA; i++) {
                                for (int j = 0; j < numOfdoubletsB; j++) {
                                    if (arrayA[i] == arrayB[j]) {
                                        arrayA[i] = -1;
                                        arrayB[j] = -1;
                                        break;
                                    }
                                }
                            }
                            //New List
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
                            List<Long> newConcatedList = new ArrayList<>();
                            newConcatedList.addAll(newListA);
                            newConcatedList.addAll(newListB);
                           /** System.out.println("After removing common elements present in both arrays");
                            System.out.println(newListA.size() + " " + newListA);
                            System.out.println(newListB.size() + " " + newListB);
                            System.out.println(newConcatedList);*/

                            long randomPickAnswer = 0;

                            long minimumValueComparator = 2 * minimumValue;
                           /** System.out.println("Our minimum value in whole of this list is " + minimumValue + " And we can use " + minimumValueComparator + " to compare minimum possible");*/
                            for (int i = 0; i < numOfdoubletsA; i++) {  //We will go upto number of doublets since that much only number we need to pick
                                if (minimumValueComparator < concatedList.get(i)) {
                                    randomPickAnswer += minimumValueComparator;
                                } else {
                                    randomPickAnswer += concatedList.get(i);
                                }
                            }
                            /**System.out.println("Our Random two minimum pick solution will be as " + randomPickAnswer);
                            System.out.println("My previous all good ans were as " + myOptimalAnswer);
                            System.out.println("Minimum Possible value is " + Math.min(randomPickAnswer, myOptimalAnswer));*/
//                            System.out.println(Math.min(randomPickAnswer,myOptimalAnswer));
                            Collections.sort(newConcatedList);
                            long newCommonRemoverAnswerFinal = 0;
                            for (int i = 0; i < newListA.size(); i++) {  //Here we only need to pick number of doublets in any of the new list
                                if (minimumValueComparator < newConcatedList.get(i)) {
                                    newCommonRemoverAnswerFinal += minimumValueComparator;
                                } else {
                                    newCommonRemoverAnswerFinal += newConcatedList.get(i);
                                }
                            }
                           /** System.out.println("Minimum Possible value is " + Math.min(Math.min(randomPickAnswer, myOptimalAnswer), newCommonRemoverAnswerFinal));*/
                           long finalMinimuaAns=Math.min(Math.min(randomPickAnswer, myOptimalAnswer), newCommonRemoverAnswerFinal);
//                            System.out.println(Math.min(Math.min(randomPickAnswer, myOptimalAnswer), newCommonRemoverAnswerFinal));
                            wr.write(finalMinimuaAns+"\n");
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
/**1 Test Case that was not giving promising answer
5
4 4 4 3 3
4 2 2 100 100
 */

/**1
10
4 4 5 5 6 6 7 7 8 8
1 1 2 2 3 3 4 4 5 5
 */