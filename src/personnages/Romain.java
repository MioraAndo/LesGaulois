package personnages;

import objets.Equipement;

public class Romain {
    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
        assert isInvariantVerified() : "Invariant romain violé après construction (force < 0)";
    }

    public String getNom() { return nom; }
    public int getForce() { return force; }

    private boolean isInvariantVerified() {
        return force >= 0;
    }

    private void parler(String texte) {
        System.out.println("Le soldat " + nom + " : " + texte);
    }

    public void recevoirCoup(int forceCoup) {
        assert forceCoup > 0 : "La force du coup reçu doit être strictement positive";
        int forceAvant = force;
        force -= forceCoup;
        if (force < 1) {
            force = 0;
            parler("J'abandonne !");
        } else {
            parler("Aïe");
        }
        assert force < forceAvant : "La force du romain doit avoir diminué";
        assert isInvariantVerified() : "Invariant romain violé après recevoirCoup (force < 0)";
    }

    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
            case 1:
                if (equipements[0] == equipement) {
                    dejaEquipe(equipement);
                } else {
                    addEquipement(equipement);
                }
                break;
            case 0:
                addEquipement(equipement);
                break;
            default:
                throw new IllegalStateException("nbEquipement invalide: " + nbEquipement);
        }
    }

    private void dejaEquipe(Equipement equipement) {
        System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
    }

    private void addEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
    }

    public static void main(String[] args) {
        System.out.println(Equipement.CASQUE);
        System.out.println(Equipement.BOUCLIER);

        Romain minus = new Romain("Minus", 6);
        minus.recevoirCoup(2);
        minus.recevoirCoup(5);

        minus = new Romain("Minus", 6);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
    }
}
