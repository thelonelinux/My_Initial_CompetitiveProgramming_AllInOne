import java.util.Scanner;
import java.util.Vector;

public class JavaRegexUnderstanding {

    //This code is help to store the whole string in token form or in word form in string array by removing
    //any space, or any special character as you can see the code in the following where we have written str.split() function
    //to remove any space or special character and only add word to our string array form given sentence in our string input

    //The below code is solution for the codechef problem to understand use of regerx
    //Problem Code: IAREVERS

    public static void main(String[] args) throws Exception{
        // write your code here

        Scanner s = new Scanner(System.in);
        int n =s.nextInt(),temp=n;
        s.nextLine();
        Vector<String[]> svec = new Vector<String[]>();
        while(temp--!=0){
            String str = s.nextLine();
            String arr[] = str.split("[\\s | . | , | ! | ? | ;  | : | @ |  * |']+");
            svec.add(arr);
            // s.nextLine();
        }
        for(int i=n-1;i>=0;i--){
            String[] exa = svec.get(i);
            int len = exa.length;
            for(int j=len-1;j>=0;j--){
                System.out.print(exa[j]+" ");
            }
            System.out.print("\n");
        }

    }
}
