import java.util.Objects;

public class Departement {
    private String identifiant;
    private String nom;

    public Departement() {
    }

    public Departement(String identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "Departement{" + "identifiant='" + identifiant + '\'' + ", nom='" + nom + '\'' + '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Departement that = (Departement) o;
        if (identifiant != null && that.identifiant != null) {
            if (identifiant.equals(that.identifiant)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(identifiant);
    }
}
