package test;

import model.Epreuve;
import model.EpreuveCollective;
import model.Pays;

import java.util.ArrayList;

public class TestEpreuve {

    public static void main(String[] args) {

        EpreuveCollective uneEpreuveCollective = new EpreuveCollective(1,"Basketball","40",1);

        Pays pays1 = new Pays();
        Pays pays2 = new Pays();
        Pays pays3 = new Pays();

        ArrayList<Pays> lesPays = new ArrayList<Pays>();

        pays1.setNom("France");
        lesPays.add(pays1);
        pays1.setNom("Espagne");
        lesPays.add(pays2);
        pays1.setNom("Italie");
        lesPays.add(pays3);

        int nbPays = lesPays.size();

        System.out.println("Nombre de pays participant à l'epreuve de "+uneEpreuveCollective.getNom()+" : "+uneEpreuveCollective.nbParticipantEpCollective(nbPays));

    }
}
