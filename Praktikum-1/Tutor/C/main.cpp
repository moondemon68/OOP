#include "Polinom.hpp"
#include <iostream>

using namespace std;

int main () {
    Polinom A(2);
    Polinom B(3);
    A.input();
    B.input();
    cout << "Print doang" << endl;
    A.print();
    B.print();
    Polinom C;
    C = A + B;
    cout << "A + B" << endl;
    C.print();
    C = A * 3;
    cout << "A * 3" << endl;
    C.print();
    C = A.derive();
    cout << "Turunan A" << endl;
    C.print();
    cout << "Masukin x = 2 ke A" << endl;
    cout << A.substitute(2) << endl;
    return 0;
}