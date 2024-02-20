#include<iostream>
#include<queue>
#include<stack>
#include<stdio.h>
#include<algorithm>
#include<string.h>
using namespace std;

int num[100001];
int dp[100001];
int main() {
	int n;
	int max ;
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> num[i];
	}

	dp[0] = num[0];
	max = dp[0];
	for (int i = 1; i < n; i++)
	{
		if (dp[i - 1] > 0)
		{
			dp[i] = dp[i - 1] + num[i];
		}
		else
		{
			dp[i] = num[i];
		}

		if (max < dp[i])
		{
			max = dp[i];
		}
	}

	cout << max;



	return 0;
}