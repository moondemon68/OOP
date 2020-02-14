#include "WarungSaltedEgg.hpp"
#include <iostream>
using namespace std;

WarungSaltedEgg::WarungSaltedEgg(int uang, int nasi, int telur, int telurAsin, int ayam) : WarungNasi(uang, telur, nasi) {
    this->telurAsin = telurAsin;
    this->ayam = ayam;
}

bool WarungSaltedEgg::masak(int pesanan) {
    if (getNasi() < pesanan && getTelur() < pesanan && this->telurAsin < pesanan*3 && this->ayam < pesanan) {
        return false;
    } else {
        int pendapatan = pesanan * 30000;
        setUang(getUang() + pendapatan);
        return true;
    }
}