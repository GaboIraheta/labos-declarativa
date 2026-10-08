almacenar(0, [0]) :- !.
almacenar(N, R) :-
    N > 0,
    almacenar(N, [], R).
almacenar(0, Acc, Acc) :- !.
almacenar(N, Acc, R) :-
    N > 0,
    D is N mod 10,
    N1 is N // 10,
    almacenar(N1, [D|Acc], R).
