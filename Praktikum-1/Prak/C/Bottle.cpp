#include "Bottle.hpp"

using namespace std;

int Bottle::numOfBottle = 0;

Bottle::Bottle() : id(numOfBottle + 1) {
	height = 10.00;
	radius = 10.00;
	waterHeight = 0;
	numOfBottle++;
}

Bottle::Bottle(float h, float r) : id(numOfBottle + 1) {
	height = h;
	radius = r;
	waterHeight = 0;
	numOfBottle++;
}

Bottle::Bottle(const Bottle& b) : id(b.id) {
	height = b.height;
	radius = b.radius;
	waterHeight = b.waterHeight;
}

Bottle::~Bottle() {
	// numOfBottle--;
}

int Bottle::getId() const {
	return id;
}

float Bottle::getWaterVolume() const {
	return PI * radius * radius * waterHeight;
}

float Bottle::getBottleVolume() const {
	return PI * radius * radius * height;
}

void Bottle::setHeight(float h) {
	height = h;
	if (waterHeight > height) {
		waterHeight = height;
	}
}

void Bottle::addWater(float v) {
	float a = v / (PI * radius * radius);
	waterHeight += a;
	if (waterHeight > height) {
		waterHeight = height;
	}
}

void Bottle::substractWater(float v) {
	float a = v / (PI * radius * radius);
	waterHeight -= a;
	if (waterHeight < 0) {
		waterHeight = 0;
	}	
}

float Bottle::getWaterHeightIfVolume(float v) const {
	float a = v / (PI * radius * radius);
	return a;
}

void Bottle::pourWaterTo(Bottle& other) {
	float sisa = other.height - other.waterHeight;
	float a = waterHeight * PI * radius * radius;
	sisa = sisa * PI * other.radius * other.radius;
	if (a > sisa) {
		a = sisa;
	}
	waterHeight = waterHeight - a / (PI * radius * radius);
	other.addWater(a);
}