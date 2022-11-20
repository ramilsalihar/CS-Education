#include <bits/stdc++.h>
using namespace std;
//using int  = long long int;

//#define int long long
// EOF
// a = 5, b =++ a, b = 6, a = 6
// c = a++, b = 5, a = 6

// Time Complexity O(v + e)

//
vector<bool> visited;
vector<vector<int>> graph;
vector<int> cost;


// lambda function
//function<int(int)> dfs = [&](int v){};

// dfs without visited
//int dfs(int v, int p){
//    if(to == parent)
//        continue;
//}

int dfs(int v){
    visited[v] = true; // paint vertices

    int res = cost[v];
    for(int to: graph[v]){
        if(visited[to])
            continue;
        res = min(res, dfs(to));
    }
    return res;
}

int main() {
    int n, m;

    cin >> n >> m;

    // makes all false
    cost.resize(n);
    for (auto& v: cost) cin >> v;
//    for(int i = 0; i < n; i++){
//        int q;
//        cin >> q;
//        cost.push_back(q);
//    }
    graph.resize(n);
    for(int i = 0; i < m; i++){
        int q, r;
        cin >> q >> r;
        --q, --r;
        graph[q].push_back(r);
        graph[r].push_back(q);
    }

    visited.assign(n, false);
    int ans = 0;
    for(int v = 0; v < n; ++v){
        if(!visited[v]){
            ans += dfs(v);
        }
    }

    cout << ans << endl;
}


