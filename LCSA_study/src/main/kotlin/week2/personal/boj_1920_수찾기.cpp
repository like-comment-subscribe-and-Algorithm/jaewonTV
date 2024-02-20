#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// 이진 탐색 함수
bool find_num(vector<int>& a, int num) {
    int top = 0;
    int tail = a.size() - 1;

    while (top <= tail) {
        int mid = top + (tail - top) / 2;

        if (a[mid] == num) {
            return true; // 찾음
        } else if (a[mid] < num) {
            top = mid + 1;
        } else {
            tail = mid - 1;
        }
    }
    return false;
}

int main() {
    int a_num, b_num, temp;
    vector<int> a, b;

    cin >> a_num;
    for (int i = 0; i < a_num; i++) {
        cin >> temp;
        a.push_back(temp);
    }

    cin >> b_num;
    for (int i = 0; i < b_num; i++) {
        cin >> temp;
        b.push_back(temp);
    }

    sort(a.begin(), a.end());

    for (int i = 0; i < b.size(); i++) {
        cout << find_num(a, b[i]) << '\n';
    }

    return 0;
}