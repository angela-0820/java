/**
 * Klasa eshte-nje nenklase e klases Punjones.
 * @author Anxhela
 */
enum Grada{LEKTOR, ASISTENT_PROSEFOR, PROFESOR_ASOCIUAR, DOKTOR, PROFESOR}

public class Fakulteti extends Punjones {
private int oretQendrimitZyre;
private Grada grada;

public Fakulteti() {
	super();
}

/**
 * @param emer
 * @param adresa
 * @param nrTel
 * @param email
 * @param zyra
 * @param paga
 * @param dataPunesimit
 * @param oretQendrimitZyre
 * @param grada
 */
public Fakulteti(String emer, String adresa, String nrTel, String email, String zyra,
		double paga, Data dataPunesimit,int oretQendrimitZyre, Grada grada) {
	super(emer, adresa, nrTel, email, zyra, paga, dataPunesimit);
	setOretQendrimitZyre(oretQendrimitZyre);
	this.grada = grada;
	
}

/**
 * @return the oretQendrimitZyre
 */
public int getOretQendrimitZyre() {
	return oretQendrimitZyre;
}

/**
 * @param oretQendrimitZyre the oretQendrimitZyre to set
 */
public void setOretQendrimitZyre(int oretQendrimitZyre) {
	if(oretQendrimitZyre >=  0)this.oretQendrimitZyre = oretQendrimitZyre;
}

/**
 * @return the grada
 */
public Grada getGrada() {
	return grada;
}

/**
 * @param grada the grada to set
 */
public void setGrada(Grada grada) {
	this.grada = grada;
}

@Override
public String toString() {
	
	return super.toString( ) + String.format("Ore qendrimi ne zyre: %d\nGrada: %s\n", oretQendrimitZyre, grada.name() );
}
/**
 * rishkruan metoden e superklases
 * Per gradat PROFESOR, DOKTOR, PROFESOR_ASOCIAUR, pavarsisht viteve te punes aplikohet shtesa prej 15%.
 * Per gradat e tjera aplikohet shtese prej 10% vetem ne varesi te viteve te punes
 * @return true ose false kur nuk plotesohet kriteri i viteve te punes
 */
@Override
public boolean rishikoPaga() {
	switch (grada) {
	case DOKTOR,
	     PROFESOR_ASOCIUAR,
	     PROFESOR : 
	    	 this.setPaga(paga*1.5);
	return true;
default:
	 return super.rishikoPaga();
	
	}
		
}

}
