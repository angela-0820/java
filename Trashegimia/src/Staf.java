/**
 * Klasa eshte-nje nenklase e klases Punjones.
 * @author Anxhela
 */

public class Staf extends Punjones{
 private String titulli;

/**
 * 
 */
public Staf() {
	super();
	// TODO Auto-generated constructor stub
}

/**
 * @param emer
 * @param adresa
 * @param nrTel
 * @param email
 * @param zyra
 * @param paga
 * @param dataPunesimit
 * @param titulli
 */
public Staf(String emer, String adresa, String nrTel, String email, String zyra, double paga, Data dataPunesimit, String titulli) {
	super(emer, adresa, nrTel, email, zyra, paga, dataPunesimit);
	// TODO Auto-generated constructor stub
}

/**
 * @return the titulli
 */
public String getTitulli() {
	return titulli;
}

/**
 * @param titulli the titulli to set
 */
public void setTitulli(String titulli) {
	this.titulli = titulli;
}

@Override
public String toString() {
	
	return super.toString() + String.format("Titulli: %s\n", titulli);
}
 
 
}
