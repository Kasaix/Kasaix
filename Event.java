package miniApp.event;

import java.util.*;

public class Event {
    // Scanner prenant l'input
    private Scanner scan = new Scanner(System.in);
    // Tableau 
    private ArrayList<String> listDebHour = new ArrayList<String>();
    private ArrayList<String> listFinHour = new ArrayList<String>();
    private ArrayList<String> listEvent = new ArrayList<String>();

    private String event, debHours, finHours;
    private String convFin = finHours;
    private Boolean verif;


    /************************************
     * Accesseurs et mutateurs d'objets *
     ***********************************/
    public ArrayList<String> getListDebHour() {
        return listDebHour;
    }

    public ArrayList<String> getListFinHour() {
        return listFinHour;
    }

    public ArrayList<String> getListEvent() {
        return listEvent;
    }

    public int getDebHours() {
        // Conversion de string à int
        int deb = Integer.parseInt(debHours);
        return deb;
    }

    public int getFinHours() {
        // Conversion de string à int
        int fin = Integer.parseInt(finHours);
        return fin;
    }

    /***********************************
     * Constructeur de la classe Event *
     **********************************/
    public Event() {

        // Entrée des heures de début et de fin de l'évènement
        System.out.print("Entrez l'heure de debut: ");
        debHours = scan.nextLine();
        System.out.print("Entrez l'heure de fin: ");
        finHours = scan.nextLine();

        // Vérification du bon format de l'heure de début et de fin
        verif = verifHours(getDebHours(), getFinHours());
        if (!verif) {
            System.out.println("Entree invalide, l'heure de fin est automatiquement superieure a l'heure de debut");
            int deb = Integer.parseInt(debHours);
            int fin = Integer.parseInt(finHours);
            fin = deb + 1;
            convFin = Integer.toString(fin);
        } else {
            convFin = finHours;
        }
        
        // Entrée de l'identifiant de l'évènement
        System.out.printf("Entrez l'evenement pour %sh-%sh: ", debHours, convFin);
        event = scan.nextLine();

        // Ajout des éléments aux listes correspondantes
        listDebHour.add(debHours);
        listFinHour.add(convFin);
        listEvent.add(event);        
    }

    
    /*******************************************************************************
     * Vérification de la logique de l'heure de début par rapport à l'heure de fin *
     ******************************************************************************/
    public Boolean verifHours(int deb, int fin) {
        // Renvoie true si l'heure de début < l'heure de fin, sinon renvoie false
        if (deb > fin || deb < 0 || fin < 0 || deb == fin) {
            return false;
        } else {
            return true;
        }
    }

}
