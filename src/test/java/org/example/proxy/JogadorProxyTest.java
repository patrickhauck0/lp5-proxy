package org.example.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JogadorProxyTest {
    @BeforeEach
    void setUp() {
        BD.addJogador(new Jogador(1, "Mauricio", "Mago", 15.0f));
        BD.addJogador(new Jogador(2, "Thales", "Guerreiro", 42.0f));
    }

    @Test
    void deveRetornarDadosJogador() {
        JogadorProxy jogador = new JogadorProxy(1);

        assertEquals(Arrays.asList("Mauricio", "Mago"), jogador.obterDadosPersonagem());
    }

    @Test
    void deveRetornarLevelJogador() {
        Mestre mestre = new Mestre("Gabriel", true);
        JogadorProxy jogador = new JogadorProxy(2);

        assertEquals(Arrays.asList(42.0f), jogador.obterLevel(mestre));
    }

    @Test
    void deveRetornarExcecaoMestreNaoAutorizadoConsultarLevel() {
        try {
            Mestre mestre = new Mestre("Patrick", false);
            JogadorProxy jogador = new JogadorProxy(2);

            jogador.obterLevel(mestre);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Mestre não autorizado", e.getMessage());
        }
    }

}