package navire;

public class Voilier extends Navire {
	
		// Attribut
		private int nbVoiles;
		private int passagersTotal;
		
		
		// Constructeur
		public Voilier(String immatriculation, String nom, int nbVoiles, int passagersTotal) {
			super(immatriculation, nom);
			this.nbVoiles = nbVoiles;
			this.passagersTotal = passagersTotal;
		}

		
		// getters
		
		public int getNbVoiles() {
			return nbVoiles;
		}

		public void setNbVoiles(int nbVoiles) {
			this.nbVoiles = nbVoiles;
		}

		public int getPassagersTotal() {
			return passagersTotal;
		}

		
		// setter
		
		public void setPassagersTotal(int passagersTotal) {
			this.passagersTotal = passagersTotal;
		}



		
		@Override
		public String toString() {
			return "Voilier :\n Nombre de voiles : " + nbVoiles + ", passagersTotal : " + passagersTotal;
		}


		
		@Override
		public int getVitesseMaximale() {
			return 300;
		}
	

}
