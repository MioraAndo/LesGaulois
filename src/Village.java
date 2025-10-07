import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois[] Villageois;
	private Gaulois chef;
	
	
	public Village(String nom,int nbmaxV) {
		this.nom = nom;
		this.Villageois = new Gaulois[nbmaxV];
	}
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return chef;
	}
	public void setChef(Gaulois chef) {
		this.chef = chef;
	}
	public void ajouterVillageois(Gaulois gaulois) {
		if(nbVillageois < Villageois.length) {
			Villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}	
	}
	public Gaulois trouverVillageois(int numero) {
		if(numero<1 || numero>Villageois.length) {
			System.out.println("il n'y a pas autant d'habitants dans notre village");
			return null;
		}
		return Villageois[numero-1];
		
	}
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
	}
		public void afficherVillageois() {
			
		}

}
