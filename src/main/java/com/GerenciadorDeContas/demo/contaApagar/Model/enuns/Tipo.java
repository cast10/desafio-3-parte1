package com.GerenciadorDeContas.demo.contaApagar.Model.enuns;

public enum Tipo {

    LUZ,
    AGUA,
    COMIDA,
    LAZER,
    OUTROS;

    public Tipo getAgua() {
        return AGUA;
    }

    public Tipo getComida() {
        return COMIDA;
    }

    public Tipo getLuz() {
        return LUZ;
    }

    public Tipo getLazer() {
        return LAZER;

    }
    public Tipo getOutros() {
        return OUTROS;
    }
}
