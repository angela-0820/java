/**
 * @author Anxhela
 */
public class Person {
	
  protected String emer;
  protected String adresa;
  protected String nrTel;
  protected String email;
  
  /**
   * Konstruktori default pa parametra
   */
  public Person() {
	  
  }

/**
 * Konstruktori me parametra i klases Person 
 * @param emer
 * @param adresa
 * @param nrTel
 * @param email
 */
public Person(String emer, String adresa, String nrTel, String email) {
	this.emer = emer;
	this.adresa = adresa;
	this.nrTel = nrTel;
	this.email = email;
}

/**
 * @return the emer
 */
public String getEmer() {
	return emer;
}

/**
 * @param emer the emer to set
 */
public void setEmer(String emer) {
	this.emer = emer;
}

/**
 * @return the adresa
 */
public String getAdresa() {
	return adresa;
}

/**
 * @param adresa the adresa to set
 */
public void setAdresa(String adresa) {
	this.adresa = adresa;
}

/**
 * @return the nrTel
 */
public String getNrTel() {
	return nrTel;
}

/**
 * @param nrTel the nrTel to set
 */
public void setNrTel(String nrTel) {
	this.nrTel = nrTel;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	
	return String.format("Emer: %s\nAdresa: %s\nNrTel: %s\nE-mail: %s\n", emer, adresa, nrTel, email );
}
  
}
