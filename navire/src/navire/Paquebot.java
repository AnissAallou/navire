package navire;

public class Paquebot extends Navire {

		// Attribut
		private int nbEquipage;
		private int tonnageMax;
		private int passagerPossible;
		
		
		
		
		
		
		// Constructeur
		public Paquebot(String immatriculation, String nom, int nbEquipage, int tonnageMax, int passagerPossible) {
			super(immatriculation, nom);
			this.nbEquipage = nbEquipage;
			this.tonnageMax = tonnageMax;
			this.passagerPossible = passagerPossible;
		}






		
		// getters setters
		public int getNbEquipage() {
			return nbEquipage;
		}

		public void setNbEquipage(int nbEquipage) {
			this.nbEquipage = nbEquipage;
		}


		public int getTonnageMax() {
			return tonnageMax;
		}


		public void setTonnageMax(int tonnageMax) {
			this.tonnageMax = tonnageMax;
		}

		public int getPassagerPossible() {
			return passagerPossible;
		}


		public void setPassagerPossible(int passagerPossible) {
			this.passagerPossible = passagerPossible;
		}

		
		
		
		@Override
		public String toString() {
			return "Paquebot [nbEquipage=" + nbEquipage + ", tonnageMax=" + tonnageMax + ", passagerPossible="
					+ passagerPossible + "]";
		}







		// redefinition des methodes
		@Override
		public int getVitesseMaximale() {

			return 200;
		}
}
