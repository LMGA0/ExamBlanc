package be.icc.exaBlanc;

public abstract class DisqueRental extends Disque implements Rentable {
	
	
		private String username;
	    private float prixLocation = 2;
	    

		public DisqueRental(String titre, String nomChanteur, int tours, String username, float prixLocation) {
			super(titre, nomChanteur, tours);
			this.username = username;
			this.setPrixLocation(prixLocation);
		}

		public DisqueRental(String titre, String username, float prixLocation) {
			super(titre);
			this.username = username;
			this.setPrixLocation(prixLocation);
		}
		
		public DisqueRental() {
			
		}

		public float getPrixLocation() {
			return prixLocation;
		}

		public void setPrixLocation(float prixLocation) {
			this.prixLocation = prixLocation;
		}

		public void rent(String username) {    	// la méthode rent doit remplacer le setter de l'attriburt username ????????
			this.username = username;
		}

		public String getUsername() {
			return username;
		}
		
		
		
}
