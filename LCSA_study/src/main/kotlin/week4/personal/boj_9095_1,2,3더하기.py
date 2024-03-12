import sys
input = sys.stdin.readline
from collections import defaultdict

"""
이번에도 실제 케이스를 적어보면서 풀어보니까
-1,-2,-3에서 값을 더하면 될 것 같아서 풀었더니 바로 풀이가 완료
시간은 0.136이 걸렸는데 T의 갯수제한이 없어서 예상시간은 O(N^2)이다.
1초 제한이라 안걸릴꺼 같아서 해 보았다.
"""

D = defaultdict(int)
T = int(input())

D[1] = 1
D[2] = 2
D[3] = 4


for j in range(T):
    n = int(input())
    for i in range(4,n+1):
        D[i] = D[i-1] + D[i-2] + D[i-3]
    print(D[n])