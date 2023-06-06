package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conto myConto = new Conto("Luca");

        Scanner s1 = new Scanner(System.in);

        boolean flag = true;

        do {

            System.out.println("Benvenuto! Premi 1 per depositare dei soldi, premi 2 per ritirare dei soldi, premi qualsiasi altro numero per uscire.");

            int choice = s1.nextInt();

            if (choice == 1) {

                System.out.println("Quanto vuoi depositare?");

                int depositAmount = s1.nextInt();

                myConto.depositCash(depositAmount);

                System.out.println("Deposito completato.");

                System.out.println("Saldo corrente: " + myConto.getSaldoConto());

            } else if (choice == 2) {

                System.out.println("Quanto vuoi ritirare?");

                int withdrawAmount = s1.nextInt();


                if (myConto.getSaldoConto() > withdrawAmount) {

                    myConto.withdrawCash(withdrawAmount);

                    System.out.println("Ritiro completato.");

                    System.out.println("Saldo corrente: " + myConto.getSaldoConto());

                } else {

                    System.out.println("Saldo insufficente!");

                    System.out.println("Saldo corrente: " + myConto.getSaldoConto());
                }


            } else {

                System.out.println("Arrivederci!");

                flag = false;
            }
        }
        while (flag);
    }
}
