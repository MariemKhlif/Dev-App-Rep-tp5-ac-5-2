package metier;

import java.io.Serializable;
import java.util.Date;

// La classe Compte représente un compte bancaire
public class Compte implements Serializable {

    // Attributs de la classe
    private int code;            // Le code du compte
    private double solde;        // Le solde du compte
    private Date dateCreation;    // La date de création du compte

    // Constructeur avec paramètres pour initialiser les attributs
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    // Constructeur par défaut
    public Compte() {
        // Utilisé lorsque l'objet est créé sans spécifier de valeurs initiales
    }

    // Méthode getter pour obtenir le code du compte
    public int getCode() {
        return code;
    }

    // Méthode setter pour définir le code du compte
    public void setCode(int code) {
        this.code = code;
    }

    // Méthode getter pour obtenir le solde du compte
    public double getSolde() {
        return solde;
    }

    // Méthode setter pour définir le solde du compte
    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Méthode getter pour obtenir la date de création du compte
    public Date getDateCreation() {
        return dateCreation;
    }

    // Méthode setter pour définir la date de création du compte
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}