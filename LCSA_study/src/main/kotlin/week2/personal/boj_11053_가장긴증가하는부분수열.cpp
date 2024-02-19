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
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> num[i];
	}

	dp[0] = 1;
	for (int i = 1; i < n; i++)
	{
		int max = -1,max_cnt=-1;
		for (int j = i-1; j >= 0; j--)
		{
			if (num[i] > num[j]) {
				if (max < dp[j]) {
					max_cnt = j;
					max = dp[j];
				}
			}
		}

		if (max_cnt == -1) {
			dp[i] = 1;
		}
		else {
			dp[i] = dp[max_cnt] + 1;
		}

	}
	sort(dp, dp + n);
	cout << dp[n-1];



	return 0;
}