package rmiClient;

import rmiService.IBanque;
import metier.Compte;

import java.rmi.Naming;
import java.util.Date;

public class BanqueClient {
    public static void main(String[] args) {
        try {
            IBanque banque = (IBanque) Naming.lookup("rmi://localhost:1090/BanqueService");

            Compte nouveauCompte = new Compte(12, 700.5, new Date());

            String messageCreation = banque.creerCompte(nouveauCompte);
            System.out.println("Message de création de compte : " + messageCreation);

            int codeCompte = 12;

            String infoCompte = banque.getInfoCompte(codeCompte);
            System.out.println("Information du compte : " + infoCompte);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}