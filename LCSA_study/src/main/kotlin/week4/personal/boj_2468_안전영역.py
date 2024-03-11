import sys
input = sys.stdin.readline
from collections import deque

max = 1

def bfs(starti,startj,height):
    
    Q = deque() 
    Q.append((starti,startj))
    visited[starti][startj] = True
    
    dx = [-1,1,0,0]
    dy = [0,0,-1,1]
    
    while Q : 
        nodei,nodej = Q.popleft()
        for c in range(4) :
            newi = nodei + dx[c] 
            newj = nodej + dy[c] 
            
            if (0 <= newi <= N-1) and (0 <= newj <= N-1) and graph[newi][newj] > height:
                if not visited[newi][newj] :
                    visited[newi][newj] = True
                    Q.append((newi,newj))
    return +1
    

N = int(input())
graph = [list(map(int,input().split())) for y in range(N)]
visited = []

# 높이를 1~100 모두 체크
for i in range(1,101):
    
    # 방문 배열, 갯수 초기화
    visited = [[False for x in range(N)] for y in range(N)] 
    cnt = 0
    
    for j in range(0,N):
        for k in range(0,N):
            # 높이 보다 크고 && 방문하지 않았으면? BFS 시작
            if graph[j][k] > i and not visited[j][k] :
                cnt += bfs(j,k,i)
                
    #MAX값 갱
    if max < cnt :
        max = cnt

print(max)