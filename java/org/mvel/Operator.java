package org.mvel;

public enum Operator {
    ADD, SUB, MULT, DIV, MOD, EQUAL, NEQUAL, LTHAN, GTHAN, LETHAN, GETHAN,
    AND, OR, CHOR, REGEX, INSTANCEOF, CONTAINS, STR_APPEND, SOUNDEX, SIMILARITY,
    BW_AND, BW_OR, BW_XOR, BW_SHIFT_RIGHT, BW_SHIFT_LEFT, BW_USHIFT_RIGHT, BW_USHIFT_LEFT,
    TERNARY, TERNARY_ELSE,
    ASSIGN, INC_ASSIGN, DEC_ASSIGN,
    NEW, PROJECTION, CONVERTABLE_TO,
    END_OF_STMT
}
