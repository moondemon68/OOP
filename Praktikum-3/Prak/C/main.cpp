#include <bits/stdc++.h>

using namespace std;

int main() {
	int n,m;
	cin >> n;
	map<string,int> mp;
	map<string,int>::iterator it;
	for (int i=1;i<=n;i++) {
		string s;
		cin >> s;
		mp[s]++;
	}
	cin >> m;
	for (int i=1;i<=m;i++) {
		string s;
		cin >> s;
		mp[s]--;
	}
	for (it = mp.begin(); it != mp.end(); it++) {
        if (it->second > 0) {
        	int x = it->second;
        	for (int i=1;i<=x;i++) cout << it->first << endl;
        }
    }
	return 0;
}