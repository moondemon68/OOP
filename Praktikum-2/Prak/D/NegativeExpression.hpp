#ifndef _NEGATIVEXPRESSION_HPP_
#define _NEGATIVEEXPRESSION_HPP_

#include "Expression.hpp"

class NegativeExpression : public UnaryExpression {
public:
    NegativeExpression(Expression* x);
    int solve();
};

#endif
