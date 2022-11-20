#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    set<int> people;
    map<int, int> coors;

    cin >> n;

    for(int i = 1; i <= n; i++){
        int x, y;
        cin >> x >> y;
        if(coors.find(x) == coors.end()){
            // not found
            coors.insert(pair<int, int>(x, y));
        }
    }

    int ans = 0;
    for(int i = 1; i <= n; i++){
        cout << "coors i:" << coors[i].first << " " << coors[i].second << endl;
        for(int j = i + 1; j <= n; j++){
//            cout << "coors j:" << coors[j].first << " " << coors[j].second << endl;
//            cout << "coors i:" << coors[i].first << " " << coors[i].second << endl;
            if((coors[i].first == coors[j].first) || (coors[i].second == coors[j].second)){
                ans++;
            }
        }
    }

    cout << ans << endl;
}

