package CarShow.controller;

import CarShow.model.Proprietaire;

import java.util.List;

public class ProprietaireController {
    private static List<Proprietaire> listProp;

    public static void setListProp(List<Proprietaire> listProp) {
        ProprietaireController.listProp = listProp;
    }

    public static void add(Proprietaire prop){
        listProp.add(prop);
    }

    public static List<Proprietaire> getListProp(){
        return listProp;
    }
}
