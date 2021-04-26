package be.icc.exaBlanc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


/**
 * Définit la classe RentedDisc (location d'un disque)
 * @author MARIGLIANO Ludovic
 * @version 0.1 
 */


	public class RentedDisc extends DisqueRental {
	
	/**
	 * Définit la durée de location en jours
	 */
	private int dureeLocation;
	
	/**
	 * 
	 * @param titre Le titre du disque
	 * @param username Nom de l'emprunteur
	 * @param prixLocation Prix de la location
	 * @param dureeLocation Durée de la location en jours
	 * @throws InvalidDurationException Exception si le nombre de jours de location est négatif
	 */
	public RentedDisc(String titre, String username, float prixLocation, int dureeLocation) throws InvalidDurationException {
		super(titre, username, prixLocation);
		
	
		if(dureeLocation == 0) {
			dureeLocation = DEFAULT_DURATION;
			}
		if(dureeLocation <0) {
			throw new InvalidDurationException();
		}
		this.dureeLocation = dureeLocation;
	}

	
	/**
	 * 
	 * @return calculerPrixTotal retourne le prix à payer par l'emprunteur en fonction du nombre de jour de location du disque
	 */
	
	public float calculerPrixTotal () {
		return dureeLocation * getPrixLocation();
	}
	
	/**
	 *  toString affiche la durée de location et le prix de location d'un disque emprunté
	 */
	@Override
	public String toString() {
		return "Le disque est loué pour une durée de " + dureeLocation + " jours et pour un prix total de " + calculerPrixTotal() + "€";
		}
	
	
	/**
     * Renvoie la durée de location du disque
     *
     * @return La durée de location du disque
     */
	public int getDureeLocation() {
		return dureeLocation;
	}

	/**
	 * Modifie la durée de location du disque
	 * @param dureeLocation La nouvelle durée de location du disque en jours
	 */
	public void setDureeLocation(int dureeLocation) {
		this.dureeLocation = dureeLocation;
	}
	
	/**
	 * Renvoie le titre du disque
	 * 
	 * @return Le titre du disque
	 */
	public Object getTitre() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * 
	 * @param filename
	 * @throws IOException
	 */
	public void toXMLFile(String filename) throws IOException {
		
		XStream xs = new XStream(new DomDriver());
		
		xs.alias("RentedD", RentedDisc.class);
		xs.aliasField("PL", DisqueRental.class, "prixLocation");
		xs.aliasField("DL", RentedDisc.class, "dureeLocation");
		
		xs.toXML(new FileWriter(filename));
		
	}
	
	/**
	 * 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public RentedDisc fromXMLFile(String filename) throws IOException {
		
		XStream xs = new XStream(new DomDriver());
		
		xs.alias("RentedD", RentedDisc.class);
		xs.aliasField("PL", DisqueRental.class, "prixLocation");
		xs.aliasField("DL", RentedDisc.class, "dureeLocation");

		return (RentedDisc) xs.fromXML("RentedDisk.xml");
		
	}
	
	@Override
	public void rent(String name) {
		//?? = name;
	}


	
}
