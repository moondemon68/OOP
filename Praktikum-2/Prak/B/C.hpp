#ifndef _C_HPP_
#define _C_HPP_

#include "A.hpp"
#include "B.hpp"

class C : public B, public A{
public:
    C();
    void sing();
};

#endif
