#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    map<int, int> uniq;
    for(int i = 0; i < n; i++){
        int q;
        cin >> q;

        map<int, int>::iterator it;
        it = uniq.find(q);

        if(it == uniq.end()){
            uniq.insert(pair<int, int>(q, 0));
        } else {
            auto it = uniq.find(q);
            int counter = it->second += 1;
        }
    }

    for(int i = 0; i < n-1; i++){

    }

    for(int i = 0; i < n-2; i++){

    }

}


