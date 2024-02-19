#include<iostream>
#include<queue>
#include<stack>
#include<stdio.h>
#include<algorithm>
#include<string.h>
using namespace std;

// boj_1463_1로만들기

vector<int> dp( 10000000,9999999 );


int main() {

	int M;
	cin >> M;

	dp[1] = 0;
	dp[2] = 1;
	dp[3] = 1;

	for (int i = 4; i <= M; i++)
	{
		if (i % 3 == 0)
		{
			dp[i] = min(dp[i], dp[i / 3]+1);
		}

		if (i % 2 == 0)
		{
			dp[i] = min(dp[i], dp[i / 2]+1);
		}

		dp[i] = min(dp[i], dp[i-1] + 1);
	}
	cout << dp[M];



	return 0;
}