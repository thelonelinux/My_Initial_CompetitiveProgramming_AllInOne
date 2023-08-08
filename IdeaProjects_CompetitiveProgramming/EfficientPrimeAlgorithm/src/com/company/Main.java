package com.company;

import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    static String[] ans(String[] arr){

        List<String> hs=new ArrayList<>();
        HashSet<String> store=new HashSet<>();

        for (int i=0;i<arr.length;i++){

            if(store.contains(arr[i])){
                hs.add("YES");
                store.add(arr[i]);

            }
            else {
                hs.add("NO");
                store.add(arr[i]);
            }
        }
        String[] arr2=new String[hs.size()];

        for(int i=0;i<hs.size();i++){
            arr2[i]=hs.get(i);
        }

        return arr2;
    }



    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        int len= Integer.parseInt(br.readLine());

        String[] arr=new String[len];

        for(int i=0;i<arr.length;i++){
            arr[i]=br.readLine();
        }

        String[] ans=ans(arr);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }





    }
}
