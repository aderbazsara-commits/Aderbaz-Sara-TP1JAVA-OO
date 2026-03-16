package Exercice2;

/*Écrire un petit programme utilisant cette classe pour créer un point, en afficher les
caractéristiques, le déplacer et en afficher à nouveau les caractéristiques.*/

public class MainPoint {
    public static void main(String[] args) {
        Point A = new Point();
        A.initialiser('B', 3.5);
        A.affiche();

        A.translate(2.0);
        A.affiche();

        Point A2 = new Point();
        A2.initialiser(A);
        A2.affiche();
    }
}
