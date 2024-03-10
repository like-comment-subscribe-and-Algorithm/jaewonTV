import sys
input = sys.stdin.readline

from collections import defaultdict

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
