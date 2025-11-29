import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private HashMap<Employe, Departement> employeDepartementMap;

    public SocieteHashMap() {
        this.employeDepartementMap = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (e != null && d != null) {
            employeDepartementMap.put(e, d);
            System.out.println("Employé ajouté avec succès au département.");
        } else {
            System.out.println("Erreur : L'employé ou le département est null.");
        }
    }

    @Override
    public void supprimerEmploye(Employe e) {
        if (employeDepartementMap.remove(e) != null) {
            System.out.println("Employé supprimé avec succès.");
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        if (employeDepartementMap.isEmpty()) {
            System.out.println("Aucun employé dans la société.");
            return;
        }
        System.out.println("=== Liste des employés et leurs départements ===");
        for (Map.Entry<Employe, Departement> entry : employeDepartementMap.entrySet()) {
            System.out.println("Employé: " + entry.getKey() + " -> Département: " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        if (employeDepartementMap.isEmpty()) {
            System.out.println("Aucun employé dans la société.");
            return;
        }
        System.out.println("=== Liste des employés ===");
        for (Employe employe : employeDepartementMap.keySet()) {
            System.out.println(employe);
        }
    }

    @Override
    public void afficherLesDepartements() {
        if (employeDepartementMap.isEmpty()) {
            System.out.println("Aucun département dans la société.");
            return;
        }
        System.out.println("=== Liste des départements ===");
        for (Departement departement : employeDepartementMap.values()) {
            System.out.println(departement);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement departement = employeDepartementMap.get(e);
        if (departement != null) {
            System.out.println("Département de l'employé " + e.getNom() + " " + e.getPrenom() + " : " + departement);
        } else {
            System.out.println("Employé non trouvé ou n'appartient à aucun département.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employeDepartementMap.containsValue(d);
    }
}

