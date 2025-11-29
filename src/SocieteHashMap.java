import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SocieteHashMap implements InterfaceSociete {
    private HashMap<Employe, Departement> hashMap;
    private TreeMap<Employe, Departement> treeMap;

    public SocieteHashMap() {
        hashMap = new HashMap<>();
        treeMap = new TreeMap<>(new Comparator<Employe>() {
            public int compare(Employe e1, Employe e2) {
                return e1.getCin().compareTo(e2.getCin());
            }
        });
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        hashMap.put(e, d);
        treeMap.put(e, d);
        System.out.println("Employe ajoute");
    }

    public void supprimerEmploye(Employe e) {
        hashMap.remove(e);
        treeMap.remove(e);
        System.out.println("Employe supprime");
    }

    public void afficherLesEmployesLeursDepartements() {
        System.out.println("Liste des employes et departements (HashMap):");
        for (Map.Entry<Employe, Departement> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        System.out.println("Liste des employes et departements (TreeMap - trie par CIN):");
        for (Map.Entry<Employe, Departement> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void afficherLesEmployes() {
        System.out.println("Liste des employes (HashMap):");
        for (Employe e : hashMap.keySet()) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Liste des employes (TreeMap - trie par CIN):");
        for (Employe e : treeMap.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherLesDepartements() {
        System.out.println("Liste des departements:");
        for (Departement d : hashMap.values()) {
            System.out.println(d);
        }
    }

    public void afficherDepartement(Employe e) {
        Departement d = hashMap.get(e);
        if (d != null) {
            System.out.println("Departement: " + d);
        } else {
            System.out.println("Employe non trouve");
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return hashMap.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return hashMap.containsValue(d);
    }
}
