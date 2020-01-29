#include "Complex.h"

Complex::Complex() {
	this->real = 0;
	this->imaginer = 0;
}

Complex::Complex(int re, int im) {
	this->real = re;
	this->imaginer = im;
}

Complex::Complex(const Complex &comp) {
	this->real = comp.real;
	this->imaginer = comp.imaginer;
}

Complex::~Complex() {
    // gaada new, makanya kosong    
}

int Complex::getReal() {
	return this->real;
}

int Complex::getImaginer() {
	return this->imaginer;
}

void Complex::setReal(int re) {
	this->real = re;
}

void Complex::setImaginer(int im) {
	this->imaginer = im;
}

Complex Complex::operator + (Complex const &comp) {
	return Complex(this->real + comp.real, this->imaginer + comp.imaginer);
}

Complex Complex::operator - (Complex const &comp) {
	return Complex(this->real - comp.real, this->imaginer - comp.imaginer);
}

Complex Complex::operator * (Complex const &comp) {
	return Complex(this->real * comp.real - this->imaginer * comp.imaginer, this->real * comp.imaginer + this->imaginer * comp.real);
}
