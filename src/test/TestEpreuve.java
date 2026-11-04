package test;

import model.Epreuve;
import model.EpreuveCollective;
import model.Pays;

public class TestEpreuve {

    public static void main(String[] args) {

        EpreuveCollective uneEpreuveCollective = new EpreuveCollective(1,"Basketball","40",1);
        Pays unPays = new Pays(1,"France");

        //System.out.println(uneEpreuveCollective.participationEpreuve());

        System.out.println("Il y a "+uneEpreuveCollective.nbParticipantEpCollective(5)+" pays qui participe à l'epreuve de "
                +uneEpreuveCollective.getNom()); // A valider


    }
}
