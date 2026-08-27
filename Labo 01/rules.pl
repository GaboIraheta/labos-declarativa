:- [base]

lugar_seguro(LocalMama, LocalPapa, LocalSeguro) :-
    local(LocalSeguro),
    LocalSeguro \== LocalMama,
    LocalSeguro \== LocalPapa.