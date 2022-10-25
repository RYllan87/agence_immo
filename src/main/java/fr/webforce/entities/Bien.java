package fr.webforce.entities;

public class Bien {
int id_bien;
int id_type_bien;
int id_adresse;
int nb_piece_bien;
int surface_bien;
double prix_bien;
int annee_construction;
String garage_bien;
String terrasse_bien;
String balcon_bien;
String jardin_bien;

    public Bien(int id_bien, int id_type_bien, int id_adresse, int nb_piece_bien, int surface_bien, double prix_bien, int annee_construction, String garage_bien, String terrasse_bien, String balcon_bien, String jardin_bien) {
        this.id_bien = id_bien;
        this.id_type_bien = id_type_bien;
        this.id_adresse = id_adresse;
        this.nb_piece_bien = nb_piece_bien;
        this.surface_bien = surface_bien;
        this.prix_bien = prix_bien;
        this.annee_construction = annee_construction;
        this.garage_bien = garage_bien;
        this.terrasse_bien = terrasse_bien;
        this.balcon_bien = balcon_bien;
        this.jardin_bien = jardin_bien;
    }
}
