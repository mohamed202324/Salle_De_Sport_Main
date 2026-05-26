package com.tp.sport;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Prestation sauna = new Prestation("Sauna", "Accès sauna", 5.80);
        Prestation coach = new Prestation("Coach", "Cours perso", 150.50);

        Seance bodyPump = new Seance(1, "BodyPump",
                                     LocalDateTime.of(2026, 3, 10, 18, 0), 10);
        Seance yoga = new Seance(2, "Yoga",
                                 LocalDateTime.of(2026, 3, 17, 19, 0), 20);

        Reservation r1 = new Reservation(bodyPump);
        r1.ajouterPrestation(sauna);
        r1.ajouterPrestation(coach);

        LOGGER.info("Réservation :");
        LOGGER.info(r1.toString());
        LOGGER.info("Cout prestations = " + r1.coutPrestation() + " euros");

        r1.annuler();
        LOGGER.info("Après annulation :");
        LOGGER.info("Statut = " + r1.getStatut());
    }
}