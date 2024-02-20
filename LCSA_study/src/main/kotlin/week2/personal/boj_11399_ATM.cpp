#define __STDC_NO_VLA__
#include <iostream>
#include <algorithm>
#include <stdio.h>
using namespace std;

int main() {

	int N;
	int sum = 0;
	int a[1000] = { 0, };
	cin >> N;

	for (int i = 0; i < N; i++)
	{
		cin >> a[i];
	}
	sort(a, a +N);
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < i + 1; j++)
		{
			sum += a[j];
		}
	}
	cout << sum;

   return 0;
}