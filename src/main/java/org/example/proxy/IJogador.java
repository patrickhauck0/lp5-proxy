package org.example.proxy;

import java.util.List;

public interface IJogador {
    List<String> obterDadosPersonagem();
    List<Float> obterLevel(Mestre mestre);
}
