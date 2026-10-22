package org.declarativa;

import alice.tuprolog.Prolog;
import alice.tuprolog.SolveInfo;
import alice.tuprolog.Theory;

import java.io.InputStream;
import java.util.Arrays;

public class Connection {

    private final Prolog engine = new Prolog();

    public Connection() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/calculo.pl"))
        {
            if (in == null) throw new IllegalStateException("No se encontró calculo.pl");
                    engine.setTheory(new Theory(in));
        }
    }
    public String consultar(String predicado, String expresion) throws
            Exception {

        String entrada = predicado + "(" + expresion + ", R).";

        SolveInfo info = engine.solve(entrada);
        return info.isSuccess() ? info.getTerm("R").toString()
                : "Sin solución para esa expresión";
    }
}
