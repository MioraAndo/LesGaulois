package personnages;

public class Chef extends Gaulois {
    
    public Chef(String nom, int force) {
        super(nom, force);
    }

    @Override
    public void sePresenter() {
        System.out.println("Le Gaulois " + getNom() + 
            " : \"Bonjour, je m'appelle " + getNom() + 
            ". Je suis le chef du village " + getVillage().getNom() + ".\"");
    }
}
