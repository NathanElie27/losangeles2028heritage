package test;

import model.Athlete;
import model.EpreuveCollective;
import model.Medaille;
import model.Pays;

public class TestPays {

    public static void main(String[] args) {

        Athlete unAthlete = new Athlete(1,"ELIE");
        EpreuveCollective uneEpreuveCollective = new EpreuveCollective(1,"100m","18 sec",1);
        Pays unPays = new Pays(1, "France");
        Medaille uneMedaille = new Medaille(1,"d'or",3);

        Athlete unAthlete2 = new Athlete(2,"DURANT");
        EpreuveCollective uneEpreuveCollective2 = new EpreuveCollective(3,"200m nage libre","60min",2);
        Pays unPays2 = new Pays(3, "USA");
        Medaille uneMedaille2 = new Medaille(1,"d'argent",2);

        System.out.println("L'athlete "+unAthlete2.getNom()+" ,participera a l'epreuve de "+
                uneEpreuveCollective2.getNom()+", il devra faire "+uneEpreuveCollective2.getNbTours()
                +" tour en "+uneEpreuveCollective2.getDureeMin()+", si il obtient la medaille "+ uneMedaille2.getNom()+", il obtiendra "
                + uneMedaille2.getNbPoints()+" pts, pour les " +unPays2.getNom());

        System.out.println("L'athlete "+unAthlete.getNom()+" ,participera a l'epreuve de "+
                uneEpreuveCollective.getNom()+", il devra faire "+uneEpreuveCollective.getNbTours()
                +" tour en "+uneEpreuveCollective.getDureeMin()+", si il obtient la medaille "+ uneMedaille.getNom()+", il obtiendra "
                + uneMedaille.getNbPoints()+" pts, pour la " +unPays.getNom());

    }
}
