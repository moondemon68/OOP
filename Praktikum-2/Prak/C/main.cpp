#include "Vehicle.h"
#include "Car.h"
#include "Bike.h"

int main () {
	Car* A = new Car(4);
	Car* B = new Car(10);
	Bike* C = new Bike();
	Vehicle* D = new Vehicle(*C);
	delete C;
	B->Vehicle::drive();
	D->Vehicle::clean();
	A->drive();
	D->Vehicle::park();
	delete B;
	delete D;
	delete A;
	return 0;
}