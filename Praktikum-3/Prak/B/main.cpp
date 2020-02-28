#include "Bank.hpp"

int main () {
    Bank b;
    try {
        b.getAccount(0).setNumber("10");
        b.getAccount(0).add(120);
        b.getAccount(1).setNumber("20");
        b.getAccount(1).add(110);

        b.transfer("10", "20", 120);
    } catch (BaseException* e) {
        e->printMessage();
    }
    cout << b.getAccount(0).getBalance() << " ";
    cout << b.getAccount(1).getBalance() << " ";
    return 0;
}