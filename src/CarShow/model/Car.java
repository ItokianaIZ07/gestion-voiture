package CarShow.model;

public class Car {
    private int id;
    private String nom;
    private String marque;
    private String numero;
    private ModelCar model;

    public Car(int id, String nom, String marque, String numero, ModelCar model) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.numero = numero;
        this.model = model;
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

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ModelCar getModel() {
        return model;
    }

    public void setModel(ModelCar model) {
        this.model = model;
    }

    public void afficher(){
        System.out.println("Nom: "+this.getNom()+" Marque : "+this.getMarque()
           +" numero: "+this.getNumero()+" model: "+this.getModel().getNom());
    }

    @Override
    public String toString() {
        return "Car{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", numero='" + numero + '\'' +
                ", model=" + model +
                '}';
    }
}
