#include "Vehicle.h"
#include "Bike.h"
#include "Car.h"

int main () {
	Vehicle A(3, 2);
	Vehicle B = A;
	Vehicle C(6, 50);
	Car E(8);
	Car F = E;
	Car I(6);
	Bike K;
	I.drive();
	K.show();
	K.ride();
	return 0;
}