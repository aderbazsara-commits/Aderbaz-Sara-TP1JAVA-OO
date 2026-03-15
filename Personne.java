//1. Écrire le code pour créer la class Personne
public class Personne {
    String CIN;
    String Nom;
    String Prenom;
    String Email;
    int Age;
//2. Écrire la fonction initialiser qui permet d’initialiser les valeur d’un objet personne
    void initialiser(String cin, String nom, String prenom, String email, int age) {
        CIN = cin;
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Age = age;
    }
//3.	Écrire une fonction afficherPersonne qui permet d’afficher les informations d’une personne
    void afficherPersonne() {
        System.out.println("CIN: " + CIN);
        System.out.println("Nom: " + Nom);
        System.out.println("Prenom: " + Prenom);
        System.out.println("Email: " + Email);
        System.out.println("Age: " + Age);
    }
}
