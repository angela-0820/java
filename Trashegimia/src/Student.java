/**
 * 
 * Klasa Student esht-nje nenklase e klases Person.
 * 
 * ENUM eshte shkurtim i enumerator dhe perdoret per te krijuar nje liste me konstante.
 * 
 * enum emri Enumerator {lista e konstanteve te ndara me presje}
 * @author Anxhela
 */

enum Status {VITIPARE, VITIDYTE, BACHELOR, MASTER}
public class Student extends Person   {

	private Status status;
	
public Student() {
	super();
}


/**
 * @param emer
 * @param adresa
 * @param nrTel
 * @param email
 */
public Student(String emer, String adresa, String nrTel, String email, Status status) {
	super(emer, adresa, nrTel, email);
	this.status= status;
}

/**
 * @return the status
 */
public Status getStatus() {
	return status;
}

/**
 * @param status the status to set
 */
public void setStatus(Status status) {
	this.status = status;
}
@Override 
public String toString() {
	return  super.toString() + String.format("Statusi %s", status.name()) ;
	}
}

