package personnages;

public class Druide {
    private String nom;
    private int force;
    private Chaudron chaudron;
    private int forcePotion;

    public Druide(String nom, int force) {
        this.nom = nom;
        this.force = force;
        this.chaudron = new Chaudron();
        this.forcePotion = 1;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le Druide " + nom + " : ";
    }

    public void fabriquerPotion(int nbDoses, int forcePotion) {
        chaudron.remplirChaudron(nbDoses);
        this.forcePotion = forcePotion;
        parler("J'ai concocté " + nbDoses + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }

    public void boosterGaulois(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else {
            if (chaudron.restePotion()) {
                parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
                gaulois.boirePotion(forcePotion);
                chaudron.utiliserDose();
            } else {
                parler("Désolé " + gaulois.getNom() + ", je n'ai plus de potion !");
            }
        }
    }
}

