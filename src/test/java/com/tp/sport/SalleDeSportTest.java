package com.tp.sport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;


import static org.junit.jupiter.api.Assertions.*;

class SalleDeSportTest {

    private SalleDeSport salle;
    private Adherent adherentBasic;
    private Adherent adherentPremium;
    private Seance seance;

    @BeforeEach
    void setUp() {
        salle = new SalleDeSport();

        AbonnementBasic basic     = new AbonnementBasic("B1",    LocalDate.of(2025, 1, 1), 6, 30.0);
        AbonnementPremium premium = new AbonnementPremium("P1",  LocalDate.of(2025, 1, 1), 6, 50.0, 3);

        adherentBasic   = new Adherent(1, "Alice", basic,   null);
        adherentPremium = new Adherent(2, "Bob",   premium, null);
        seance          = new Seance(10, "Pilates", LocalDateTime.of(2026, 7, 1, 10, 0), 15);
    }


    // ajouterAdherent()
    @Test
    @DisplayName("ajouterAdherent : ajoute l'adhérent à la liste")
    void ajouterAdherent_valid_shouldAdd() {
        salle.ajouterAdherent(adherentBasic);
        assertEquals(1, salle.getAdherents().size());
    }

    @Test
    @DisplayName("ajouterAdherent null → ignoré, pas d'exception")
    void ajouterAdherent_null_shouldBeIgnored() {
        assertDoesNotThrow(() -> salle.ajouterAdherent(null));
        assertTrue(salle.getAdherents().isEmpty());
    }

    // ajouterSeance()

    @Test
    @DisplayName("ajouterSeance : ajoute la séance à la liste")
    void ajouterSeance_valid_shouldAdd() {
        salle.ajouterSeance(seance);
        assertEquals(1, salle.getSeances().size());
    }

    @Test
    @DisplayName("ajouterSeance null → ignorée, pas d'exception")
    void ajouterSeance_null_shouldBeIgnored() {
        assertDoesNotThrow(() -> salle.ajouterSeance(null));
        assertTrue(salle.getSeances().isEmpty());
    }


}
