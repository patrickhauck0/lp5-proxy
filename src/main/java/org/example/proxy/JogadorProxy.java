package org.example.proxy;

import java.util.List;

public class JogadorProxy implements IJogador {
    private Jogador jogador;

    private Integer tag;

    public JogadorProxy(Integer tag) {
        this.tag = tag;
    }

    @Override
    public List<String> obterDadosPersonagem() {
        if (this.jogador == null) {
            this.jogador = new Jogador(this.tag);
        }
        return this.jogador.obterDadosPersonagem();
    }

    @Override
    public List<Float> obterLevel(Mestre mestre) {
        if (!mestre.isPermissaoMestre()) {
            throw new IllegalArgumentException("Mestre não autorizado");
        }
        if (this.jogador == null) {
            this.jogador = new Jogador(this.tag);
        }
        return this.jogador.obterLevel(mestre);
    }
}
