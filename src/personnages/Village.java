package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois;
    private int nbVillageois;

    public Village(String nom, int nbVillageoisMax, Chef chef) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMax];
        this.chef = chef;
        this.nbVillageois = 0;
        chef.setVillage(this);
    }

    public void ajouterVillageois(Gaulois gaulois) {
        villageois[nbVillageois] = gaulois;
        nbVillageois++;
        gaulois.setVillage(this);
    }

    public Gaulois trouverVillageois(int numero) {
        if (numero <= 0 || numero > nbVillageois) {
            System.out.println("Il n’y a pas autant d’habitants dans notre village !");
            return null;
        }
        return villageois[numero - 1];
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }

    public String getNom() {
        return nom;
    }
    
    public static void main(String[] args) {
        Chef abraracourcix = new Chef("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", 30, abraracourcix);

        Gaulois gaulois = village.trouverVillageois(30); // ne doit pas lever d'erreur

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

        gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);

        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois);

        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();

        Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);

        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
    }

}

