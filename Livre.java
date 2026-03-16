package Exercice4;

//EXO 4
public class Livre {
    String titre;
    String auteur;
    int nombredepage;
    double prix;
    boolean prixFixe;

    /* •Un constructeur qui prend en paramètre le titre, l’auteur et le nombre de pages.*/
    public Livre(String T, String A, int NP) {
        titre = T;
        auteur = A;
        nombredepage = NP;
        prix = -1;
        prixFixe=false;
    }

    /*•	Un constructeur qui prend en paramètre le titre, l’auteur et le nombre de pages. */
    public Livre(String T, String A, int NP, double PR) {
        titre = T;
        auteur = A;
        nombredepage = NP;
        prix = PR;
        prixFixe = true;
    }

    /*2.Des méthodes d’accès et d’altération (get et set) pour les différents attributs. */
    public String getTitre()      { return titre; }
    public String getAuteur()     { return auteur; }
    public int getnombredepage()   { return nombredepage; }
    public double getPrix()       { return prix; }


    public void setTitre(String titre)       { this.titre = titre; }
    public void setAuteur(String auteur)     { this.auteur = auteur; }
    public void setnombredepage(int pages)    { this.nombredepage = pages; }

    public void setPrix(double prix) {
        if (!prixFixe) {
            this.prix = prix;
            prixFixe = true;
        } else {
            System.out.println("Erreur : le prix est déjà fixé.");
        }
    }

    public boolean prixFixe() {
        return prixFixe;
    }

    /*3.Une méthode toString() qui renvoie une chaîne de caractères qui décrit le livre. Si le prix d’un livre n’a pas été donné, la description du livre (toString()) devra indiquer «Prix pas encore donné ». */
    public String toString() {

        if (prix == -1) {
            return titre + " - " + auteur + " (" + nombredepage +
                    " pages) Prix pas encore donné";
        } else {
            return titre + " - " + auteur + " (" + nombredepage +
                    " pages) Prix : " + prix;
        }
    }

    /*5.Écrivez une méthode « compare » pour comparer 2 livres sur leur nombre de pages. */
    public int compare(Livre l) {

        if (this.nombredepage == l.nombredepage)
            return 0;
        else if (this.nombredepage > l.nombredepage)
            return 1;
        else
            return -1;
    }
}

