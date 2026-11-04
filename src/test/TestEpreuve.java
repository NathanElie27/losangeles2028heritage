package test;

import model.Epreuve;
import model.EpreuveCollective;
import model.Pays;

import java.util.ArrayList;

public class TestEpreuve {

    public static void main(String[] args) {

        EpreuveCollective uneEpreuveCollective = new EpreuveCollective(1,"Basketball","40",1);

        Pays p1 = new Pays(1,"France");
        Pays p2 = new Pays(2,"Espagne");
        Pays p3 = new Pays(3,"Italie");

        ArrayList<Pays> lesPays = new ArrayList<Pays>();
        lesPays.add(p1);
        lesPays.add(p2);
        lesPays.add(p3);

        int nbPays = lesPays.size();

        System.out.println("Nombre de pays participant à l'epreuve de "+uneEpreuveCollective.getNom()+" : "+uneEpreuveCollective.nbParticipantEpCollective(nbPays));

    }
}
