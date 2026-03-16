package Exercice3;

public class Point {
    String nom;
    double abscisse;


    Point(String N, double A) {
        nom = N;
        abscisse =A;
    }

    void affiche() {
        System.out.println("Le point est " + nom + " : l'abscisse est = " + abscisse);
    }

    void translate(double valeur) {
         abscisse += valeur;
    }
}