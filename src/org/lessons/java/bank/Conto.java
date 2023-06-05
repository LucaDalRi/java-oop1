package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    private int idConto;
    private String nomeProprietario;
    private double saldoConto;

    Conto(String nomeProprietario) {

        this.idConto = getIdConto();
        this.nomeProprietario = getNomeProprietario();
        this.saldoConto = getSaldoConto();

    }

//    Metodi

    public void withdrawCash(double amount) {

        if (saldoConto - amount > 0) {

            this.saldoConto -= amount;
        }
    }

    public void depositCash(double amount) {

        this.saldoConto += amount;

    }


    public int getIdConto() {

        Random random = new Random();

        idConto = random.nextInt((1000 - 1) + 1) + 1;

        return idConto;

    }

    public double getSaldoConto() {

        if (this.saldoConto == 0) {
            return 0.00;
        }

        return this.saldoConto;
    }

    public String getNomeProprietario() {

        return this.nomeProprietario;

    }


}
