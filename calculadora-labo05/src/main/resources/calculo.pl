s(A+B,R) :-
    atomic(A), atomic(B),
    R is A + B.

d(A-B,R) :-
    atomic(A), atomic(B),
    R is A - B.