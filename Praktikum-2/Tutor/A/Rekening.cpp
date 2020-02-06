#include "Rekening.h"

Rekening::Rekening(double x) {
	if (x < 0) {
		saldo = 0;
	} else {
		saldo = x;
	}
}

void Rekening::setSaldo(double x) {
	saldo = x;
}

double Rekening::getSaldo() const {
	return saldo;
}

void Rekening::simpanUang(double x) {
	saldo += x;
}

bool Rekening::tarikUang(double x) {
	if (x <= saldo) {
		saldo -= x;
		return 1;
	} else {
		return 0;
	}
}