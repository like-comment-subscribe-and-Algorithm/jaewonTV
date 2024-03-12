import sys
input = sys.stdin.readline
from collections import deque
sys.setrecursionlimit(10**5)

"""
DFS, BFS 직접 구현해보기

중간에 정점번호 작은 것 부터 방문해야해서 dfs할 때 sort를 해버렸고
M<10000이라서 배열도 그냥 만들어버렸다
풀이는 성공했는데 이게 맞는지는 모르겠다..

"""

def bfs(start):
    visited = [False for x in range(100001)]
    
    Q = deque()
    Q.append(start)
    visited[start] = True
    
    while Q :
        node = Q.popleft()
        visited[node] = True
        print(node,end=" ")
        for n in graph[node]:
            if not visited[n]:
                visited[n] = True
                Q.append(n)
                
def dfs(node):
    visited[node] = True
    print(node,end=" ")
    graph[node].sort()
    for n in graph[node]:
        if not visited[n]:        
            dfs(n)

N, M, V = map(int,input().split())

graph = [[] for x in range(N+1)]

for i in range(M):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
    
visited = [False for x in range(10001)]

dfs(V)
print()
bfs(V)