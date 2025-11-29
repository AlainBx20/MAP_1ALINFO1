import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private HashMap<Employe, Departement> map;

    public SocieteHashMap() {
        map = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
        System.out.println("Employe ajoute");
    }

    public void supprimerEmploye(Employe e) {
        map.remove(e);
        System.out.println("Employe supprime");
    }

    public void afficherLesEmployesLeursDepartements() {
        System.out.println("Liste des employes et departements:");
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void afficherLesEmployes() {
        System.out.println("Liste des employes:");
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherLesDepartements() {
        System.out.println("Liste des departements:");
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }

    public void afficherDepartement(Employe e) {
        Departement d = map.get(e);
        if (d != null) {
            System.out.println("Departement: " + d);
        } else {
            System.out.println("Employe non trouve");
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }
}
