Previous with self Reader file giving wrong answer in Codechef.
Now for same problem when submitting using scanner and throw java.lang.exception in main method thie code ran fine and all correct

It was failing in case when large input was given (Very strange for me)
How come large inputs are not read by self made Reader class as in previoiud readme.MD you can check there.


###################################################################

 public static void main(String[] args) throws java.lang.Exception {

        try{

            Scanner sc=new Scanner(System.in);
            int testCases = sc.nextInt();

            while(testCases-->0){

                String s1=sc.next();
                String s2=sc.next();

                int zeroInS1=0;
                int oneInS1=0;
                int zeroInS2=0;
                int oneInS2=0;


                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)=='0'){
                        zeroInS1++;
                    }else{
                        oneInS1++;
                    }


                    if(s2.charAt(i)=='0'){
                        zeroInS2++;
                    }else{
                        oneInS2++;
                    }

                }
                int ones = Math.min(zeroInS1,oneInS2)+Math.min(zeroInS2,oneInS1);
                StringBuilder ans=new StringBuilder();
                int zeros = s1.length()-ones;
                while(ones-->0){ ans.append('1');}
                while(zeros-->0){ans.append('0');}
                 System.out.println(ans);
                
                
              //  for(int j=0;j<numberOfOnesAtBeginning;j++){
                    //ans+='1';
               //     ans.append('1');
                    //System.out.print("1");
              //  }
               
               // for(int k=numberOfOnesAtBeginning;k<lengthOfString;k++){
                    //ans+='0';
                   // ans.append('0');
                    //System.out.print("0");
                //}
              
              
               
               

            }

        }catch (Exception e){
            return;
        }
       


    }

