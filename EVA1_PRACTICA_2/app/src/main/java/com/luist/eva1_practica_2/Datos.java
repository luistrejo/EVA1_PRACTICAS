package com.luist.eva1_practica_2;

public class Datos {
    int iDesarrollados, iAmeLatina, iAsia, iAfrica, iDifGen;

    public Datos(int iDesarrollados, int iAmeLatina, int iAsia, int iAfrica, int iDifGen) {
        this.iDesarrollados = iDesarrollados;
        this.iAmeLatina = iAmeLatina;
        this.iAsia = iAsia;
        this.iAfrica = iAfrica;
        this.iDifGen = iDifGen;
    }

    public int getiDesarrollados() {
        return iDesarrollados;
    }

    public int getiAmeLatina() {
        return iAmeLatina;
    }

    public int getiAsia() {
        return iAsia;
    }

    public int getiAfrica() {
        return iAfrica;
    }

    public int getiDifGen() {
        return iDifGen;
    }
}
