#include "Box.hpp"

int main () {
	Box* A = new Box(2);
	Box* B = new Box;
	Box* C = new Box(1);
	*B = *A;
	Box* D = new Box(*C);
	(*A).peek();
	(*C).peek();
	delete(A);
	delete(C);
	delete(D);
	delete(B);
	return 0;
}
