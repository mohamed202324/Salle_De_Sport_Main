package com.tp.sport;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        Prestation sauna = new Prestation("Sauna", "Accès sauna", 5.80);
        Prestation coach = new Prestation("Coach", "Cours perso", 150.50);

        Seance bodyPump = new Seance(1, "BodyPump",
                                     LocalDateTime.of(2026, 3, 10, 18, 0), 10);


        Reservation r1 = new Reservation(bodyPump);
        r1.ajouterPrestation(sauna);
        r1.ajouterPrestation(coach);

        if (!r1.getPrestations().isEmpty()) {
            LOGGER.log(Level.INFO, "Réservation : {0}", r1);
            LOGGER.log(Level.INFO, "Cout prestations = {0} euros", r1.coutPrestation());
        }

        r1.annuler();
        LOGGER.log(Level.INFO, "Après annulation - Statut = {0}", r1.getStatut());


    }
}