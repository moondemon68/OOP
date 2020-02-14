#include "C.hpp"
#include <iostream>

using namespace std;

C::C() : B(), A() {
    //
}

void C::sing() {
    B::sing();
    A::sing();
}