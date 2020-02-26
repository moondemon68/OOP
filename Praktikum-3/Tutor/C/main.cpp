#include <bits/stdc++.h>

using namespace std;

int main () {
	int n;
	cin >> n;
	if (n == 0) {
		cout << "-" << endl;
		cout << "-" << endl;
		cout << "-" << endl;
		cout << "-" << endl;
		cout << 0 << endl;
		return 0;
	}
	vector<int> a,b;
	int x;
	while (cin >> x) {
		a.push_back(x);
		b.push_back(x);
	}
	if (a.size() != n) {
		cout << "-" << endl;
		cout << "-" << endl;
		cout << "-" << endl;
		cout << "-" << endl;
		cout << 0 << endl;
		return 0;
	}
	double t = 0;
	for (int i=0;i<n;i++) {
		t += a[i];
	}
	cout << t/n << endl;
	sort(b.begin(), b.end());
	if (n%2==0) cout << ((double)b[n/2-1]+(double)b[n/2])/2 << endl;
	else cout << b[n/2] << endl;
	int maxcnt = 0, maxnum = 0, cnt = 0;
	for (int i=0;i<n;i++) {
		if (i == n-1 || b[i] != b[i+1]) {
			cnt++;
			if (cnt > maxcnt) {
				maxcnt = cnt;
				maxnum = b[i];
			}
			cnt = 0;
		} else {
			cnt++;
		}
	}
	cout << maxnum << endl;
	for (int i=1;i<=maxcnt;i++) a.push_back(maxnum);
	for (int i=0;i<a.size();i++) {
		cout << a[i];
		if (i != a.size()-1) {
			cout << " ";
		}
	}
	cout << endl;
	cout << a.size() << endl;
	return 0;
}