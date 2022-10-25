package fr.webforce.entities;

public class adresse {
    int id_adresse;
    int num_adresse;
    String nom_rue;
    String nom_ville;
    int code_postal;

    public adresse(int id_adresse, int num_adresse, String nom_rue, String nom_ville, int code_postal) {
        this.id_adresse = id_adresse;
        this.num_adresse = num_adresse;
        this.nom_rue = nom_rue;
        this.nom_ville = nom_ville;
        this.code_postal = code_postal;
    }
}
