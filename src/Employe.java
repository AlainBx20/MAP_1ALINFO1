import java.util.Objects;

public class Employe {
    private String cin;
    private String matricule;
    private String nom;
    private String prenom;

    public Employe() {
    }

    public Employe(String cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String toString() {
        return "Employe{" + "cin='" + cin + '\'' + ", matricule='" + matricule + '\'' + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Employe employe = (Employe) o;
        if (cin != null && employe.cin != null) {
            if (cin.equals(employe.cin)) {
                return true;
            }
        }
        if (matricule != null && employe.matricule != null) {
            if (matricule.equals(employe.matricule)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(cin, matricule);
    }
}
