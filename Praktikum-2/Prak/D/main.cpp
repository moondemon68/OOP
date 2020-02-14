#include "AddExpression.hpp"
#include "SubstractExpression.hpp"
#include "NegativeExpression.hpp"

#include <iostream>

using namespace std;

int main () {
	AddExpression* e = new AddExpression(
			new TerminalExpression(4), new TerminalExpression(6)
		);
	cout << e->solve() << '\n';

	SubstractExpression* f = new SubstractExpression(
			new TerminalExpression(4), new TerminalExpression(6)
		);
	cout << f->solve() << '\n';

	NegativeExpression* g = new NegativeExpression(
			new TerminalExpression(4)
		);
	cout << g->solve() << '\n';
	return 0;
}