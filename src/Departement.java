import java.util.Objects;

public class Departement {
    private String identifiant;
    private String nom;

    // Constructeur sans paramètre
    public Departement() {
    }

    // Constructeur avec paramètres
    public Departement(String identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    // Getters et Setters
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

    // Méthode toString()
    @Override
    public String toString() {
        return "Departement{" +
                "identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }

    // Méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return Objects.equals(identifiant, that.identifiant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant);
    }
}

