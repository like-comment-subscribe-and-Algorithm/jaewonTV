#include<iostream>
#include<queue>
#include<stack>
#include<stdio.h>
#include<algorithm>
#include<string.h>
using namespace std;

int dp[400];
int arr[400];


int main() {
	int n;
	cin >> n;
	for (int i = 1; i <= n; i++)
	{
		cin >> arr[i];

        if(i==1){
            dp[i]=arr[i];
        }
        if(i==2){
            dp[i]=arr[i] +arr[1];
        }
        if(i==3)
            dp[i]= max(arr[1]+arr[i],arr[2]+arr[i]);
	}

    for(int i=4;i<=n;i++)
    {
        dp[i] = max(dp[i-2]+arr[i],arr[i-1]+dp[i-3]+arr[i]);
    }


    if(n<=3)
    {
        cout << dp[n];
    }
    else
        cout <<dp[n];

	return 0;
}