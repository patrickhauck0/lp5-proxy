package org.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Jogador> jogadores = new HashMap<>();

    public static Jogador getJogador(Integer tag) {
        return jogadores.get(tag);
    }

    public static void addJogador(Jogador jogador) {
        jogadores.put(jogador.getTag(), jogador);
    }
}
