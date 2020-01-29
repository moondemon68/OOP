#include "Complex.h"

int main () {
    Complex a(1, 2);
    Complex b(3, 4);
    cout << a.getReal() << " " << a.getImaginer() << endl;
    cout << b.getReal() << " " << b.getImaginer() << endl;
    a = a + b;
    cout << a.getReal() << " " << a.getImaginer() << endl;
    Complex c(b);
    b = b + c;
    cout << b.getReal() << " " << b.getImaginer() << endl;    
    return 0;
}