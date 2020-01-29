#include "Polinom.hpp"

Polinom::Polinom() {
    derajat = 0;
    for (int i=0;i<MAX_LENGTH;i++) {
        koef[i] = 0;
    }
}

Polinom::Polinom(int n) {
    derajat = n;
    for (int i=0;i<MAX_LENGTH;i++) {
        koef[i] = 0;
    }
}

Polinom::Polinom(const Polinom& P) {
    derajat = P.derajat;
    for (int i=0;i<MAX_LENGTH;i++) {
        koef[i] = P.koef[i];
    }
}

Polinom::~Polinom() {
    // gaada new, makanya kosong
}

Polinom& Polinom::operator=(const Polinom& P) {
    derajat = P.derajat;
    for (int i=0;i<MAX_LENGTH;i++) {
        koef[i] = P.koef[i];
    }
    return *this;
}


int Polinom::getKoefAt(int idx) const {
    return koef[idx];
}

