package org.example.proxy;

public class Mestre {
    private String nome;
    private boolean permissaoMestre;

    public Mestre(String nome, boolean permissaoMestre) {
        this.nome = nome;
        this.permissaoMestre = permissaoMestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPermissaoMestre() {
        return permissaoMestre;
    }

    public void setPermissaoMestre(boolean permissaoMestre) {
        this.permissaoMestre = permissaoMestre;
    }
}
