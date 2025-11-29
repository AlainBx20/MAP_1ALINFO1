public class Main {
    public static void main(String[] args) {

        SocieteHashMap societe1 = new SocieteHashMap();

        Departement d1 = new Departement("D001", "Informatique");
        Departement d2 = new Departement("D002", "RH");
        Departement d3 = new Departement("D003", "Compta");

        Employe e1 = new Employe("12345678", "MAT001", "Ben Ali", "Mohamed");
        Employe e2 = new Employe("87654321", "MAT002", "Trabelsi", "Ahmed");
        Employe e3 = new Employe("11223344", "MAT003", "Jendoubi", "Fatma");

        societe1.ajouterEmployeDepartement(e1, d1);
        societe1.ajouterEmployeDepartement(e2, d2);
        societe1.ajouterEmployeDepartement(e3, d1);

        System.out.println();
        societe1.afficherLesEmployesLeursDepartements();

        System.out.println();
        societe1.afficherLesEmployes();

        System.out.println();
        System.out.println("Recherche e1: " + societe1.rechercherEmploye(e1));
        System.out.println("Recherche d1: " + societe1.rechercherDepartement(d1));

        System.out.println();
        societe1.afficherDepartement(e1);

        System.out.println();
        societe1.supprimerEmploye(e2);
    }
}