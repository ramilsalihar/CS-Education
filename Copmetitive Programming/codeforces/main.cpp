#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    vector<string> names;
    unordered_set<string> result;

    cin >> n;
    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        names.push_back(s);
    }

//    for (int i = 0; i < n; i++) {
//        result.insert(names[i]);
//    }

    std::reverse(names.begin(), names.end());

    for (int i = 0; i < n; i++) {
        result.insert(names[i]);
    }

    // Don't know how to reverse unordered_set
    vector<string> ans;
    for (auto s: result){
        ans.push_back(s);
    }

    std::reverse(ans.begin(), ans.end());

    for(auto &a: ans){
        cout << a << endl;
    }

}

