package personnages;

public class Chaudron {
    private int quantitePotion;

    public Chaudron() {
        this.quantitePotion = 0;
    }

    public boolean restePotion() {
        return quantitePotion > 0;
    }

    public void remplirChaudron(int quantite) {
        this.quantitePotion += quantite;
    }

    public void utiliserDose() {
        if (restePotion()) {
            quantitePotion--;
        }
    }

    public int getQuantitePotion() {
        return quantitePotion;
    }
}

