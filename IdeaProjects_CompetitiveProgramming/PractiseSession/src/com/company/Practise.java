package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Practise {


    public static long carParkingRoof(List<Long> cars, int k){
        if (cars.size() == 0 || k < 0) {
            return 0;
        }

        PriorityQueue<Long> maxHeap = new PriorityQueue<Long>(k, Collections.reverseOrder());

        long minSlot = Long.MAX_VALUE;

        for (long carSlot : cars) {
            maxHeap.offer(carSlot);

            minSlot = Math.min(minSlot, carSlot);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.poll() - minSlot + 1;
    }


    public static void main(String[] args) {
        long arr[] = { 6,2,12,7 };
        List<Long> list=new ArrayList<>();
        int k=3;
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        System.out.print(carParkingRoof(list,k));
    }
}
