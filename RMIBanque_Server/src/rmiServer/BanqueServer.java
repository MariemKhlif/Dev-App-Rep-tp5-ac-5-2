package rmiServer;

import rmiService.BanqueImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

// La classe BanqueServer représente le serveur RMI pour le service bancaire
public class BanqueServer {
    public static void main(String[] args) {

        try {
            // Crée un registre RMI sur le port 1090
            LocateRegistry.createRegistry(1090);

            // Crée une instance de l'implémentation du service bancaire
            BanqueImpl bi = new BanqueImpl();

            // Affiche les informations de l'objet BanqueImpl (appelle implicitement la méthode toString)
            System.out.println(bi.toString());

            // Lie l'objet BanqueImpl au registre RMI avec le nom "BanqueService"
            Naming.rebind("rmi://localhost:1090/BanqueService", bi);

            // Affiche un message indiquant que le serveur est en cours d'exécution
            System.out.println("Server is running...");
        } catch (RemoteException | MalformedURLException e) {
            // En cas d'erreur, lance une exception RuntimeException avec l'erreur d'origine
            throw new RuntimeException(e);
        }
    }
}