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