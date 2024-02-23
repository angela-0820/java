/**
 * Kur nje klase deklarohet abstrakte abstrakte, kjo klase nuk mund te inicializohet.
 * Per kete arsye tek klasa TestObjektGjeometrik do merrni disa gabime.
 * Klasa abstrakte mund te kene konstruktore qe mund te perdoren nga nenklasat.
 * Dhe mund te kene metoda konkrete qe mund te perdoren nga nenklasat.
 * Klasat abstrakte mund te permbajne metoda abstrakte me ane te fjales kyce abstract.
 * Metodat abstrakte deklarohen pa trupin e metodes dhe duhet te implemetohen nga nenklasat.
 * 
 * Nje klase klase qe permban nje metode abstrakte duhet te deklarohet abstrakte.
 */
import java.util.Date;

public abstract class ObjektGjeometrik {
	
protected String ngjyra;
protected boolean ngjyrosur;
protected Date dataKrijimit;
/**
 * Konstrukori default
 */
public	ObjektGjeometrik() {
	System.out.println("Konstruktori pa parametra i klases ObjektGjeometrik");
	this.dataKrijimit = new Date();
}

/**
 * @param ngjyra
 * @param ngjyros
 * @param dataKrijimit
 */
public ObjektGjeometrik(String ngjyra, boolean ngjyrosur) {
	this();// therritet konstruktori default
	System.out.println("Konstruktori me parametra i klases ObjektGjeometrik");
	this.ngjyra = ngjyra;
	this.ngjyrosur = ngjyrosur;
	
}
/**
 * @return the ngjyra
 */
public String getNgjyra() {
	return ngjyra;
}
/**
 * @param ngjyra the ngjyra to set
 */
public void setNgjyra(String ngjyra) {
	this.ngjyra = ngjyra;
}
/**
 * @return the ngjyros
 */
public boolean isNgjyrosur() {
	return ngjyrosur;
}
/**
 * @param ngjyros the ngjyros to set
 */
public void setNgjyrosur(boolean ngjyrosur) {
	this.ngjyrosur = ngjyrosur;
}
/**
 * @return the dataKrijimit
 */
public Date getDataKrijimit() {
	return dataKrijimit;
}
@Override
public String toString() {
	return String.format("Krijuar me %s\nNgjyra %s\nNgjyrosur %s",
			getDataKrijimit(), getNgjyra(), isNgjyrosur());


}
/**
 * duhet te kete nje implementim konkret tek nneklasat , duhet bere override
 */
public abstract double getSiperfaqe();
/**
 * duhet te kete nje implementim konkret tek nneklasat , duhet bere override
 */
public abstract double getPerimeter();

}