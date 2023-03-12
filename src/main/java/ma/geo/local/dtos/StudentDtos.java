package ma.geo.local.dtos;

public class StudentDtos {
    private long id;
    private String nom;

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "StudentDtos{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
