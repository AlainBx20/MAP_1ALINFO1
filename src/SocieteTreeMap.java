import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private TreeMap<Employe, Departement> map;

    public SocieteTreeMap() {
        map = new TreeMap<>(new Comparator<Employe>() {
            public int compare(Employe e1, Employe e2) {
                return e1.getCin().compareTo(e2.getCin());
            }
        });
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
