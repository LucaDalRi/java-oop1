package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto newProd = new Prodotto("Riso", "Riso roma", 0.85, 3);

        System.out.println("Codice Seriale: " + newProd.getSerialCode());
        System.out.println("Nome prodotto: " + newProd.getName());
        System.out.println("Nome completo prodotto " + newProd.getFullName());
        System.out.println("Descrizione prodotto: " + newProd.getDescription());
        System.out.println("Prezzo: " + newProd.getPrice());
        System.out.println("Prezzo Tassato : " + newProd.taxedPrice());
        System.out.println("Tasse: " + newProd.getTaxes() + "%");

    }
}
