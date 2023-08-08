package com.company;

import java.util.*;

public class Main {

    /**
     * Q.1
     * Q.1.1 Ans--> For representing the dataset1 and dataset2 we have created it's respective class name
     * with all it's attributes
    */

    public static   class Dataset1{

        String salesRepresentativeID;
        String customerID;
        String orderDate;
        Long revenue;

        public Dataset1(String salesRepresentativeID, String customerID, String orderDate, Long revenue ){
            this.salesRepresentativeID=salesRepresentativeID;
            this.customerID=customerID;
            this.orderDate=orderDate;
            this.revenue=revenue;
        }



        /**
         * Q.1.2  To rate each salesRepresentativeID on the basis of their daily revenue (For given Date, and the whole list of datas)
         */

        public static long averageRevenueForGivenDate(String date, List<Dataset1> dataset1List){
            long sum=0;
            int n=dataset1List.size();
            for (int i=0;i<n;i++){
                if (date.equals(dataset1List.get(i).orderDate)){
                    //If its the data for given date then only add in total sum
                    sum+=dataset1List.get(i).revenue;
                }
            }

            long averageRevenueForToday=sum/n;
            return averageRevenueForToday;

        }

        /**
         * Total Revenue of each salesRepresentative for given date (Today let be 01-02-2020)
         */
        public static Map<String,Long> todaysTotalRevenueForEachSalesRepresentative(String date, List<Dataset1> dataset1List){
            Map<String,Long> ansMap=new HashMap<>();
            int n=dataset1List.size();
            for (int i=0;i<n;i++){
                if (date.equals(dataset1List.get(i).orderDate)){
                    //If it's the date for given date then only we store their today's total revenue
                    String salesRepresentative=dataset1List.get(i).salesRepresentativeID;
                    Long hisRevenue=dataset1List.get(i).revenue;
                    if (!ansMap.containsKey(salesRepresentative)){
                        //If it's the new salesRepresentative who sold some revenue today then add him in the map and his value
                        ansMap.put(salesRepresentative,hisRevenue);
                    }else{
                        //He is already on the list and this is another revenue today so just add it to the previous revenue to get his sum total revenue for today
                        long hisTillNowRevenue=ansMap.get(salesRepresentative);
                        ansMap.replace(salesRepresentative,hisTillNowRevenue,hisTillNowRevenue+hisRevenue);
                    }
                }

            }
            return ansMap;

        }


    }

    public static class Dataset2{

        String managerID;
        String salesRepresentativeID;
        String createDate;
        String terminationDate;

        public Dataset2(String managerID, String salesRepresentativeID, String createDate, String terminationDate ){
            this.managerID=managerID;
            this.salesRepresentativeID=salesRepresentativeID;
            this.createDate=createDate;
            this.terminationDate=terminationDate;
        }

    }

    public static void main(String[] args) {
        /**
            To store the data we will make list of each of the dataset
        */

        List<Dataset1> listOfDataset1=new ArrayList<>();
        List<Dataset2> listOfDataset2=new ArrayList<>();

        /**
         * Now lets store some values in both the datasets
         */
        //For Dataset1
        listOfDataset1.add(new Dataset1("S1","C1A","01-02-2020",25000L));
        listOfDataset1.add(new Dataset1("S1","C1B","01-02-2020",45000L));
        listOfDataset1.add(new Dataset1("S1","C1C","01-02-2020",15000L));
        listOfDataset1.add(new Dataset1("S1","C1D","01-02-2020",20000L));

        listOfDataset1.add(new Dataset1("S2","C2A","01-02-2020",30000L));
        listOfDataset1.add(new Dataset1("S3","C3A","01-02-2020",35000L));
        listOfDataset1.add(new Dataset1("S4","C4A","01-02-2020",40000L));

        listOfDataset1.add(new Dataset1("S2","C2B","01-03-2020",30000L));
        listOfDataset1.add(new Dataset1("S3","C3B","01-04-2020",35000L));
        listOfDataset1.add(new Dataset1("S4","C4B","01-05-2020",40000L));




       //For Dataset2
        listOfDataset2.add(new Dataset2("M1","C1","01-02-2020","31-02-2020"));
        listOfDataset2.add(new Dataset2("M2","C2","01-03-2020","31-03-2020"));
        listOfDataset2.add(new Dataset2("M3","C3","01-04-2020","31-04-2020"));
        listOfDataset2.add(new Dataset2("M4","C4","01-05-2020","31-05-2020"));



        //Average earning for all the employees for today let date be 01-02-2020;
        System.out.println("############################    Q.1.2 Solution    ####################3");
        System.out.println();
        long averageRevenueForToday=Dataset1.averageRevenueForGivenDate("01-02-2020",listOfDataset1);
        System.out.println("Average Revenue for today i.e. (01-02-2020) is --> "+averageRevenueForToday);

        //Now we get the MapList of each of employees name with their todays revenue

        Map<String,Long> mapListRevenue=Dataset1.todaysTotalRevenueForEachSalesRepresentative("01-02-2020",listOfDataset1);
        //Now giving award to each of the sales representative
        for (Map.Entry<String,Long> entry: mapListRevenue.entrySet()){
            if (entry.getValue()>(1.5*averageRevenueForToday)){
                System.out.println("Excellent-->"+entry.getKey()+"-->His Today's Total Revenue is "+ entry.getValue());
            }
            else if (entry.getValue()<(1.5*averageRevenueForToday) || entry.getValue()>(1.1*averageRevenueForToday)){
                System.out.println("Good-->"+ entry.getKey()+"-->His Today's Total Revenue is "+ entry.getValue());
            }
            else if (entry.getValue()<(1.1*averageRevenueForToday) || entry.getValue()>(0.9*averageRevenueForToday)){
                System.out.println("Average-->"+ entry.getKey()+"-->His Today's Total Revenue is "+ entry.getValue());
            }
            else if (entry.getValue()<(0.9*averageRevenueForToday)){
                System.out.println("Poor-->"+ entry.getKey()+"-->His Today's Total Revenue is "+ entry.getValue());
            }
            else{
                System.out.println("Data Invalid");
            }
        }



    }
}
