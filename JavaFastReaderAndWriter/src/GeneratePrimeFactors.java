import java.util.*;
import java.lang.*;

// Java program to print the smallest 
// integer with n factors or more 

public class GeneratePrimeFactors {
    private static final int MAX = 1000001;

    private static final int[] factor = new int [MAX];
    public static void generatePrimeFactors() {
        factor[1] = 1;

        for (int i = 2; i < MAX; i++)
            factor[i] = i;

        for (int i = 4; i < MAX; i += 2)
            factor[i] = 2;


        for (int i = 3; i * i < MAX; i++) {


            if (factor[i] == i) {


                for (int j = i * i; j < MAX; j += i) {


                    if (factor[j] == j)
                        factor[j] = i;
                }
            }
        }
    }


    public static int calculateNoOFactors(int n) {
        if (n == 1)
            return 1;

        int ans = 1;


        int dup = factor[n];

        int c = 1;

        int j = n / factor[n];


        while (j != 1) {


            if (factor[j] == dup)
                c += 1;

            else {
                dup = factor[j];
                ans = ans * (c + 1);
                c = 1;
            }

            // prime factorizes a number
            j = j / factor[j];
        }


        ans = ans * (c + 1);

        return ans;
    }

    public static int smallest(int n)
    {
        for (int i = 1;; i++)


            if (calculateNoOFactors(i) >= n)
                return i;
    }


    public static void main(String args[]) {
       //----------------> // generate prime factors of number
       //----------------->// upto 10^6
       
        generatePrimeFactors();       //<--------------This is why I have submitted here. It tells how you can presave all your array of primes before going in testCases in coding 
                                      //Program, It saves whole lot of time, rather than in each testcase to generate a new array of prime
                                      //so it's time complexity becomes O(log(n)).

        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while (t-->0){

            int n = scan.nextInt();
            System.out.println(smallest(n));
        }


    }
}



