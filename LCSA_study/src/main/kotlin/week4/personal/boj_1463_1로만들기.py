import sys
input = sys.stdin.readline

from collections import defaultdict

"""
처음에는 DP 문제라고 생각을 못하고 풀었는데
예시를 직접 펜으로 적다보니 규칙이 보였고
10^6이니까 10^8승이 1초니까 0.01로 걸릴 것으로 추측
시간제한 0.15초에 그래서 안걸린 것 같다.

내풀이는 DP bottom-up 방식이다.
재귀를 사용하면 Top-down이 가능한데 메모리 낭비가 너무 심해보인다.
"""

D = defaultdict(int)

N = int(input())

D[1] = 0
D[2] = 1
D[3] = 1

for i in range(4,N+1):
    D[i] = D[i-1]+1 
    if i%2 == 0:
        D[i] = min(D[i],D[i/2]+1)
        
    if i%3 == 0 :
        D[i] = min(D[i],D[i/3]+1)

print(D[N])
