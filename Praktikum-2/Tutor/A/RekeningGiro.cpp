#include "RekeningGiro.h"

RekeningGiro::RekeningGiro(double x, double y) : Rekening(x) {
	if (y < 0) {
		sukuBunga = 0;
	} else {
		sukuBunga = y;
	}
}

void RekeningGiro::setSukuBunga(double x) {
	sukuBunga = x;
}

double RekeningGiro::getSukuBunga() const {
	return sukuBunga;
}

double RekeningGiro::hitungBunga() {
	return Rekening::getSaldo()*sukuBunga;
}