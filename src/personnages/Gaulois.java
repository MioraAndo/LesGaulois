package personnages;

public class Gaulois {
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	private String nom;
	private int force;
	private int effetPotion =1;
	

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte + "\"");

	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le Gaulois "+ nom + " : ";
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
		System.out.println(nom +  " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force /3);
		
	}
	public void boirePotion(int effet) {
        effetPotion = effet;
    }

	

}
