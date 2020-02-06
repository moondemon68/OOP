// main.cpp
#include "A.hpp"
#include "B.hpp"

void set(A* a) {
	a->setValue(888);
}

int main() {
  B b; /** ANDA HARUS MENGGUNAKAN DEFAULT CONSTRUCTOR */
  
  set(&b);
  b.setValue(10888);
  // Your code goes here :)
  // ...
  // ...
  
  b.print(); // OUTPUT: (888, 10888)
  return 0;
}