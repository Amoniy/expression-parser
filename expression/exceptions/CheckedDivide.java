package ru.itmo.ctddev.Kopitsa.expression.exceptions;

import ru.itmo.ctddev.Kopitsa.expression.Operation;
import ru.itmo.ctddev.Kopitsa.expression.SuperExpression;
import ru.itmo.ctddev.Kopitsa.expression.TripleExpression;

public class CheckedDivide extends CheckedOperation {
    public CheckedDivide(TripleExpression x, TripleExpression y) {
        super(x, y);
    }

    @Override
    public int over(int x, int y) {
        if (y == 0) {
            throw new DBZException(x, y);
        }
        if (x == Integer.MIN_VALUE && y == -1) {
            throw new OverflowException(Integer.toString(x) + " / " + Integer.toString(y));
        }
        return x / y;
    }
}
