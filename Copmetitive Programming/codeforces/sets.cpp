/*
 * map<string, int> names;
    int n;

    cin >> n;

    for(int i = 0; i < n; i++){
        string w;
        cin >> w;

        map<string, int>::iterator it;
        it = names.find(w);

        if(it == names.end()){
            names.insert(pair<string, int>(w, 0));
            cout << "OK" << endl;
        } else {
            auto it = names.find(w);
            string name = it->first;
            int counter = it->second += 1;
//            counter++;
            cout << name << counter << endl;
        }
    }
 * */


/*
 * Working with map in c++
 * int n, m;
    cin >> n >> m;

    map<string, string> words;
    map<string, string>::iterator it;

    for(int i = 0; i < m; i++){
        string first, second;
        cin >> first >> second;

        first.size() <= second.size() ? words.insert(pair<string, string>(first, second)) : words.insert(pair<string, string>(second, first));

    }

    for(int i = 0; i < n; i++){
        bool ans = true;
        string lect;
        cin >> lect;

        string lectF;
        for(auto& it: words){
            if(it.second == lect){
                lectF = it.first;
                ans = false;
                break;
            }
        }

        if(ans){
            cout << lect << " ";
        } else {
            cout << lectF << " ";
        }
    }*/

// Sets C
/*
 *  int n;
    cin >> n;

    map<int, int> uniq;
    for(int i = 0; i < n; i++){
        int q;
        cin >> q;

        map<int, int>::iterator it;
        it = uniq.find(q);

        if(it == uniq.end()){
            uniq.insert(pair<int, int>(q, 1));
        } else {
            uniq[q]++;
        }
    }

    for(int i = 1; i <= 2; i++){
        map<int, int> check = uniq;
        for(int j = 0; j < n-i; j++){
            int p;
            cin >> p;
            auto it = check.find(p);
            it->second--;
        }


        for(auto& k: check){
            if(k.second == 1){
                uniq[k.first]--;
                cout << k.first << endl;
            }

        }
    }*/