#include <bits/stdc++.h>
using namespace std;

//#define int long long
// EOF
// a = 5, b =++ a, b = 6, a = 6
// c = a++, b = 5, a = 6

// Time Complexity O(v + e)

//
vector<bool> visited;
vector<vector<int>> graph;
vector<int> cost;
vector<vector<int>> matrix;


// lambda function
//function<int(int)> dfs = [&](int v){};

// dfs without visited
//int dfs(int v, int p){
//    if(to == parent)
//        continue;
//}

//int dfs(int v){
//    visited[v] = true; // paint vertices
//
//    int res = cost[v];
//    for(int to: graph[v]){
//        if(visited[to])
//            continue;
//        res = min(res, dfs(to));
//    }
//    return res;
//}

signed main() {
    int n, s, f;

    cin >> n >> s >> f;

    // makes all false
    matrix.resize(n);
//    for (auto& v: cost) cin >> v;

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            int q;
            cin >> q;
            matrix[i][j] = q;
        }
    }

    cout << n << s << f << endl;
}


