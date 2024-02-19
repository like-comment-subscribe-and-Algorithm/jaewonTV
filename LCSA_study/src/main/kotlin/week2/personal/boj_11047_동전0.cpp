#define __STDC_NO_VLA__
#include <iostream>
#include <algorithm>
#include <stdio.h>
using namespace std;

int main() {

	int N;
	int sum = 0,num;
	int a[1000] = { 0, };
	cin >> N >> num;

	for (int i = 0; i < N; i++)
	{
		cin >> a[i];
	}

	for (int i = N-1; i >= 0; i--)
	{
		if (a[i] <= num)
		{
			sum += num / a[i];
			num = num - (num / a[i]) * a[i];
		}
		if (num == 0)
			break;
	}
	cout << sum;

   return 0;
}