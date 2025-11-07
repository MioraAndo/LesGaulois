package personnages;

public class Gaulois {
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	private String nom;
//	private int force;
	private int effetPotion =1;
	private Village village;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	

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

//	private String prendreParole() {
//		return "Le Gaulois "+ nom + " : ";
//	}
	
	private String prendreParole() { 
		String texte = "Le gaulois " + nom + " : "; 
		return texte; 
	} 
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);	
	}

	@Override
	public String toString() {
		return nom;
	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom +  " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup(force /3);
//		
//	}
	public void frapper(Romain romain) { 
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + 
		romain.getNom()); 
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion); 
		for (int i = 0; trophees != null && i < trophees.length; i++, 
		nb_trophees++) { 
		this.trophees[nb_trophees] = trophees[i]; 
		} 
		return; 
	}
	public void boirePotion(int effet) {
        effetPotion = effet;
    }
	
	public void sePresenter() {
	    if (this instanceof Chef) {
	        System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom +
	                ". Je suis le chef du village " + village.getNom() + ".\"");
	    } else if (village != null) {
	        System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom +
	                ". J'habite le village " + village.getNom() + ".\"");
	    } else {
	        System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom +
	                ". Je voyage de villages en villages.\"");
	    }
	}
	
	

	

}
