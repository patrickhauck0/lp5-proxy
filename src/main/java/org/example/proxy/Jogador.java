package org.example.proxy;

import java.util.Arrays;
import java.util.List;

public class Jogador implements IJogador {
    private Integer tag;
    private String nome;
    private String classe;
    private Float level;

    public Jogador(int tag) {
        this.tag = tag;

        Jogador objeto =  BD.getJogador(tag);

        this.nome = objeto.nome;
        this.classe = objeto.classe;
        this.level = objeto.level;
    }

    public Jogador(Integer tag, String nome, String classe, Float level) {
        this.tag = tag;
        this.nome = nome;
        this.classe = classe;
        this.level = level;
    }

    public Integer getTag() {
        return tag;
    }

    @Override
    public List<String> obterDadosPersonagem() {
        return Arrays.asList(this.nome, this.classe);
    }

    @Override
    public List<Float> obterLevel(Mestre mestre) {
        return Arrays.asList(this.level);
    }

}
