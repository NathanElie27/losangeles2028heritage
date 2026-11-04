package test;

import model.Athlete;
import model.EpreuveCollective;
import model.Medaille;
import model.Pays;

public class testPays {

    public static void main(String[] args) {

        Athlete unAthlete = new Athlete(1,"ELIE");
        EpreuveCollective uneEpreuveCollective = new EpreuveCollective(1,"100m","60min",1);
        Pays unPays = new Pays(1, "France");
        Medaille uneMedaille = new Medaille(1,"d'or",3);

        System.out.println("L'athlete "+unAthlete.getNom()+" ,participera a l'epreuve de "+
                uneEpreuveCollective.getNom()+", il devra faire "+uneEpreuveCollective.getNbTours()
                +" tour en "+uneEpreuveCollective.getDureeMin()+", si il obtient la medaille "+uneMedaille.getNom()+", il obtiendra "
                +uneMedaille.getNbPoints()+" pts, pour la " +unPays.getNom());

    }
}
