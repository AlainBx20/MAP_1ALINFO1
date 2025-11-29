public class Main {
    public static void main(String[] args) {
        System.out.println("=== Test avec SocieteHashMap ===\n");

        SocieteHashMap societeHashMap = new SocieteHashMap();

        Departement dept1 = new Departement("D001", "Informatique");
        Departement dept2 = new Departement("D002", "Ressources Humaines");
        Departement dept3 = new Departement("D003", "Comptabilité");

        Employe emp1 = new Employe("12345678", "MAT001", "Ben Ali", "Ahmed");
        Employe emp2 = new Employe("87654321", "MAT002", "Trabelsi", "Fatma");
        Employe emp3 = new Employe("11223344", "MAT003", "Jendoubi", "Mohamed");

        societeHashMap.ajouterEmployeDepartement(emp1, dept1);
        societeHashMap.ajouterEmployeDepartement(emp2, dept2);
        societeHashMap.ajouterEmployeDepartement(emp3, dept1);

        System.out.println();
        societeHashMap.afficherLesEmployesLeursDepartements();

        System.out.println();
        societeHashMap.afficherLesEmployes();

        System.out.println();
        societeHashMap.afficherLesDepartements();

        System.out.println("\n=== Recherche ===");
        System.out.println("Recherche emp1: " + societeHashMap.rechercherEmploye(emp1));
        System.out.println("Recherche dept1: " + societeHashMap.rechercherDepartement(dept1));

        System.out.println();
        societeHashMap.afficherDepartement(emp1);

        System.out.println();
        societeHashMap.supprimerEmploye(emp2);
        System.out.println();
        societeHashMap.afficherLesEmployes();

        System.out.println("\n\n=== Test avec SocieteTreeMap ===\n");

        SocieteTreeMap societeTreeMap = new SocieteTreeMap();

        societeTreeMap.ajouterEmployeDepartement(emp2, dept2);
        societeTreeMap.ajouterEmployeDepartement(emp1, dept1);
        societeTreeMap.ajouterEmployeDepartement(emp3, dept1);

        System.out.println();
        societeTreeMap.afficherLesEmployesLeursDepartements();

        System.out.println();
        societeTreeMap.afficherLesEmployes();
    }
}