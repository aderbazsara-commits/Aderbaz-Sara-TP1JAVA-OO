//EXO 2 
public class Point {
    char nom;
    double abscisse;

    /* Une fonction initialiser recevant en arguments le nom et l’abscisse d’un point*/
    void initialiser(char N, double A) {
        nom = N;
        abscisse = A;
    }

    /*•Une deuxième fonction initialiser recevant en argument un objet de type Point*/
    void initialiser(Point Y) {
        nom = Y.nom;
        abscisse = Y.abscisse;
    }
    /*•	une méthode affiche imprimant le nom du point et son abscisse*/
    void affiche() {
        System.out.println("Le Point est " + nom + " : de abscisse = " + abscisse);
    }
    /*une méthode translate effectuant une translation définie par la valeur de son argument */
    void translate(double value) {
        abscisse += value;
    }
}
/*Écrire un petit programme utilisant cette classe pour créer un point, en afficher les
caractéristiques, le déplacer et en afficher à nouveau les caractéristiques.*/

public class MainPoint2 {
    public static void main(String[] args) {
        Point A = new Point();
        A.initialiser('A', 3.5);
        A.affiche();        

        A.translate(2.0);
        A.affiche();          
        Point A2 = new Point();
        A2.initialiser(A);    
        A2.affiche();         
    }
}
