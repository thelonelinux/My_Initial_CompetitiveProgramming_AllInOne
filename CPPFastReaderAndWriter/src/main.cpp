#include <bits/stdc++.h>
using namespace std;
long long int realAndLongMethod(long x,long y,long l, long r){
    long long int max=0;
    long long int answer=0;
    for (long long int z=l;z<=r;z++){
        long sum=(x&z)*(y&z);
        if (sum>max){
            max=sum;
            answer=z;
        }
    }
//        System.out.print("Real Max=> "+max+" ");
    if (answer==0){
        return l;
    }else {
        return answer;
    }
}

int main()
{
    // added the two lines below for fast I/O
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int number;
    cin>> number;
    while (number-->0){
        long long int x,y,l,r;
        cin>>x>>y>>l>>r;
        long long int main=x|y;

        if (x==0 || y==0) {
            cout<<l<<"\n";
        }else if(r>=main && l<=main){
            cout<<main<<"\n";
        }else {
            cout<<realAndLongMethod(x,y,l,r)<<"\n";
        }
    }
    return 0;
}
