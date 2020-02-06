#include "RekeningTabungan.h"

RekeningTabungan::RekeningTabungan(double x, double y) : Rekening(x){
	if (y < 0) {
		biayaTransaksi = 0;
	} else {
		biayaTransaksi = y;
	}
}

void RekeningTabungan::setBiayaTransaksi(double x) {
	biayaTransaksi = x;
}

double RekeningTabungan::getBiayaTransaksi() const {
	return biayaTransaksi;
}

void RekeningTabungan::simpanUang(double x) {
	Rekening::simpanUang(x);
	Rekening::setSaldo(Rekening::getSaldo() - biayaTransaksi);
}

bool RekeningTabungan::tarikUang(double x) {
	bool success = Rekening::tarikUang(x);
	if (success) {
		Rekening::setSaldo(Rekening::getSaldo() - biayaTransaksi);
	}
	return success;
}