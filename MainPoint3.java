package Exercice3;

public class MainPoint3 {
    public static void main(String[] args) {
        Point A = new Point("Origine", 0.0);
        A.affiche();

        A.translate(4.5);
        A.affiche();
    }
}