package com.tp.sport;


public SalleDeSport() {
    this.adherents = new ArrayList<>();
    this.seances   = new ArrayList<>();
}

public Adherent trouverAdherent(int id) {
    for (Adherent a : adherents) {
        if (a.getId() == id) return a;
    }
    throw new RuntimeException("Adhérent introuvable par id=" + id);
}

@Override
public String toString() {
    return "SalleDeSport{nbAdherents=" + adherents.size() + ", nbSeances=" + seances.size() + "}";
}