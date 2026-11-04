package test;

import model.Athlete;
import model.EpreuveCollective;
import model.Medaille;
import model.Pays;

import java.util.ArrayList;

public class TestPays {

    public static void main(String[] args) {

        Athlete unAthlete = new Athlete();
        Pays unPays = new Pays(1,"France");
        Pays unPays2 = new Pays(3, "USA");

        EpreuveCollective uneEpreuveCollective = new EpreuveCollective(1, "100m", "18 sec", 1);
        EpreuveCollective uneEpreuveCollective2 = new EpreuveCollective(3, "200m nage libre", "60min", 2);

        Medaille uneMedaille = new Medaille(1, "d'or", 3);
        Medaille uneMedaille2 = new Medaille(1, "d'argent", 2);

        ArrayList<Athlete> lesAhtletes = new ArrayList<Athlete>();
        ArrayList<Athlete> lesAhtletes2 = new ArrayList<Athlete>();

        Athlete a1 = new Athlete(1, "ELIE");
        Athlete a2 = new Athlete(4, "BERNARD");
        Athlete a3 = new Athlete(6, "TEST");

        a1.setPays(unPays);
        a2.setPays(unPays);
        a3.setPays(unPays2);

        lesAhtletes.add(a1);
        lesAhtletes.add(a2);
        lesAhtletes2.add(a3);

        int nbAthletes = lesAhtletes.size();
        int nbAthletes2 = lesAhtletes2.size();

        ArrayList<Medaille> lesMedailles = new ArrayList<Medaille>();

        System.out.println("Le nombre d'athletes en " + unPays2.getNom() + " est de " + unPays2.nbAtheletePays(nbAthletes));
        System.out.println("Le nombre d'athletes en " + unPays.getNom() + " est de " + unPays.nbAtheletePays(nbAthletes));


        System.out.println("L'athlete "+a1.getNom()+" ,participera a l'epreuve de "+
                uneEpreuveCollective.getNom()+", il devra faire "+uneEpreuveCollective.getNbTours()
                +" tour en "+uneEpreuveCollective.getDureeMin()+", si il obtient la medaille "+ uneMedaille.getNom()+", il obtiendra "
                + uneMedaille.getNbPoints()+" pts, pour la " +unPays.getNom());

        System.out.println("L'athlete "+a2.getNom()+" ,participera a l'epreuve de "+
                uneEpreuveCollective.getNom()+", il devra faire "+uneEpreuveCollective2.getNbTours()
                +" tour en "+uneEpreuveCollective2.getDureeMin()+", si il obtient la medaille "+ uneMedaille2.getNom()+", il obtiendra "
                + uneMedaille2.getNbPoints()+" pts, pour la " +unPays.getNom());
    }

}

