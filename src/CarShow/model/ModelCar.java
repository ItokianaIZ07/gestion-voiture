package CarShow.model;

public class ModelCar {
    private String nom;

    public ModelCar(String nom){
        setNom(nom);
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }

    @Override
    public String toString() {
        return "ModelCar{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
