package CarShow.model;

import java.util.ArrayList;
import java.util.List;

public class Proprietaire {
    private int id;
    private String nom;
    private String prenom;
    private List<Car> listVoiture;

    public Proprietaire(int id, String nom, String prenom, List<Car> listVoiture) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.listVoiture = listVoiture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Car> getListVoiture() {
        return listVoiture;
    }

    public void setListVoiture(List<Car> listVoiture) {
        this.listVoiture = listVoiture == null ? new ArrayList<>() : listVoiture;
    }
}
