import sys
input = sys.stdin.readline
from collections import defaultdict

"""
그림 그려서 문제 정의
전형적인 DP 문제여서 바로 점화식 세우고 풀이완료
제한시간 1초 , O(N), 걸린시간 0.14
"""

D = defaultdict(int)

D[1] = 1
D[2] = 2

n = int(input())

for i in range(3,n+1):
    D[i] = D[i-1] + D[i-2]

print(D[n]%10007)