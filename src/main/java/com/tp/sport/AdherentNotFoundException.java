package com.tp.sport;

public class AdherentNotFoundException extends RuntimeException {
   public AdherentNotFoundException(int id) {
      super("Adhérent introuvable pour l'id : " + id);
   }
}