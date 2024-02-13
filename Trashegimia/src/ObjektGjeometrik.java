import java.util.Date;

public class ObjektGjeometrik {
	
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
}