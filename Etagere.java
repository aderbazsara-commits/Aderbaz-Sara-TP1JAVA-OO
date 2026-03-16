package Exercice4;

/*6.Créez une classe Etagere pour représenter une étagère qui peut contenir un certain nombre de livres (fixe pour chaque étagère). Vous utiliserez pour cela un tableau. */
class Etagere {

    private Livre[] livres;
    private int numbLivres;
    /*7.Le constructeur prendra en paramètre le nombre de livres que pourra contenir l’étagère. */
    public Etagere(int capacite) {
        livres = new Livre[capacite];
        numbLivres = 0;
    }

    /*8.Vous ajouterez des méthodes pour :
    a.	Donner le nombre de livres que peut contenir l’étagère, et le nombre de livres qu’elle contient.
    */
    public int getCapacite() {
        return livres.length;
    }


    public int getNombreLivres() {
        return numbLivres;
    }

    /*b.Ajouter des livres (« void ajouter (Livre) »). Vous ajouterez les livres « à la fin » de l’étagère. Il devra être impossible d’ajouter des livres dans une étagère pleine. */
    public void ajouter(Livre l) {

        if (numbLivres < livres.length) {
            livres[numbLivres] = l;
            numbLivres++;
        } else {
            System.out.println("Impossible : étagère pleine");
        }
    }

    /*c.Récupérer un livre dont on donne la position sur l’étagère (le livre reste sur l’étagère, on récupère simplement les informations sur le livre). La méthode renverra une instance de livre. La position du premier livre d’une étagère devra être 1 (et pas 0, bien que le livre soit rangé dans la première position du tableau, qui est d’indice 0). La signature de la méthode sera « Livre getLivre(int) ». */
    public Livre getLivre(int position) {

        if (position >= 1 && position <= numbLivres) {
            return livres[position - 1];
        }

        return null;
    }

    /*d.Chercher sur l’étagère un livre repéré par son titre et son auteur. La méthode renverra la position du livre dans l’étagère (ou 0 si le livre n’y est pas). Le profil de la méthode sera*/
    public int chercher(String titre, String auteur) {

        for (int i = 0; i < numbLivres; i++) {

            if (livres[i].getTitre().equals(titre)
                    && livres[i].getAuteur().equals(auteur)) {

                return i + 1;
            }
        }

        return 0;
    }

    /*e. supprimer des livre*/
    public void supprimer(int position) {

        if (position >= 1 && position <= numbLivres) {

            for (int i = position - 1; i < numbLivres - 1; i++) {
                livres[i] = livres[i + 1];
            }

            livres[numbLivres - 1] = null;
            numbLivres--;
        }
    }
}
