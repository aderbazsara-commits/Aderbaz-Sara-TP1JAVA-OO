//EXO 3
public class PointExo3 {
    char nom;
    double abscisse;

    
    void initialiser(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

   
    void initialiser(PointExo3 p) {
        this.nom = p.nom;
        this.abscisse = p.abscisse;
    }

    void affiche() {
        System.out.println("Point " + nom + " : abscisse = " + abscisse);
    }

    void translate(double valeur) {
        this.abscisse += valeur;
    }
}

public class MainPoint2 {
    public static void main(String[] args) {
        PointExo3 p = new PointExo3();
        p.initialiser('A', 3.5);
        p.affiche();         

        p.translate(2.0);
        p.affiche();         

        Point p2 = new Point();
        p2.initialiser(p);    
        p2.affiche();        
    }
}
