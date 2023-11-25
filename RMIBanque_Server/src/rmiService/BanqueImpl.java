package rmiService;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {

    private List<Compte> comptes;

    public BanqueImpl() throws RemoteException {
        comptes = new ArrayList<>();
    }

    @Override
    public String creerCompte(Compte c) throws RemoteException {
        comptes.add(c);

        return c + " a été ajouté avec succès.";
    }

    @Override
    public String getInfoCompte(int code) throws RemoteException {
        for (Compte compte : comptes) {
            if (compte.getCode() == code) {
                return "Code: " + compte.getCode() +
                        "\nSolde: " + compte.getSolde() +
                        "\nDate de création: " + compte.getDateCreation();
            }
        }
        return "Le compte n'existe pas.";
    }
}