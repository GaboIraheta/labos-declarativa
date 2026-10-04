flowchart TD
    A["?- suma(3,R)"]
    A -->|"C1: suma(1,1), 3 no unifica con 1"| F1["fallo"]
    A -->|"C2: N=3, S=R"| B["?- 3>1, N1 is 3-1, suma(N1,S1), R is S1+3"]
    B -->|"3>1 es verdadero"| C["?- N1 is 3-1, suma(N1,S1), R is S1+3"]
    C -->|"N1=2"| D["?- suma(2,S1), R is S1+3"]
    D -->|"C1: 2 no unifica con 1"| F2["fallo"]
    D -->|"C2: N=2, S=S1"| E["?- 2>1, N2 is 2-1, suma(N2,S2), S1 is S2+2, R is S1+3"]
    E -->|"2>1 es verdadero"| G["?- N2 is 2-1, suma(N2,S2), S1 is S2+2, R is S1+3"]
    G -->|"N2=1"| H["?- suma(1,S2), S1 is S2+2, R is S1+3"]
    H -->|"C1: S2=1"| I["?- S1 is 1+2, R is S1+3"]
    H -->|"C2: N=1"| F3["?- 1>1, ... fallo"]
    I -->|"S1=3"| J["?- R is 3+3"]
    J -->|"R=6"| K["[] éxito: R=6"]

    classDef fallo fill:#f8d7da,stroke:#c0392b
    classDef exito fill:#d4edda,stroke:#27ae60
    class F1,F2,F3 fallo
    class K exito