package personnages;
import objets.Equipement;
public class Gaulois {
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	private String nom;
	private int effetPotion =1;
	private Village village;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	

	public String getNom() {
		return nom;
	}
	public void setVillage(Village village) {
	    this.village = village;
	}
	public Village getVillage() {              
        return village;
    }
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte + "\"");

	}

	
	private String prendreParole() { 
		return "Le gaulois " + nom + " : "; 
	} 
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);	
	}

	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) { 
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + 
		romain.getNom()); 
		Equipement[] coupe = romain.recevoirCoup((force / 3) * effetPotion); 
		for (int i = 0; coupe != null && i < coupe.length; i++, 
		nbTrophees++) { 
		this.trophees[nbTrophees] = trophees[i]; 
		} 
		 
	}
	public void boirePotion(int effet) {
        effetPotion = effet;
    }
	
	public void sePresenter() {
		String texte1 = "Le Gaulois ";
		String texte2 = " : \"Bonjour, je m'appelle ";
	    if (this instanceof Chef) {
	        System.out.println(texte1+ nom + texte2 + nom +
	                ". Je suis le chef du village " + village.getNom() + ".\"");
	    } else if (village != null) {
	        System.out.println(texte1 + nom + texte2 + nom +
	                ". J'habite le village " + village.getNom() + ".\"");
	    } else {
	        System.out.println(texte1 + nom + texte2 + nom +
	                ". Je voyage de villages en villages.\"");
	    }
	}
	
	

	

}
