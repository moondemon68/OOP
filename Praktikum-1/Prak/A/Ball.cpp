#include "Ball.hpp"
#include <iostream>

using namespace std;

Ball::Ball() {
	radius = 1;
}

Ball::Ball(int r) {
	radius = r;
}

Ball::Ball(const Ball& b) {
	radius = b.radius;
}

Ball::~Ball() {

}

void Ball::bounce() {
	cout << "bo";
	for (int i=1;i<=radius;i++) cout << 'i';
	cout << "ng" << "\n";
}