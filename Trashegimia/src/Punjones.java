import java.util.Calendar;
import java.util.Date;

/**
 * Klasa Punjones eshte-nje nenklase e klases Person. 
 * @author Anxhela
 */
public  class Punjones extends Person {
	
	protected String zyra;
	protected double paga;
	protected Data dataPunesimit;
	final static public int MOSHAPENSIONIT = 65;
	
public   Punjones() {
	super();
}

/**
 * @param zyra
 * @param paga
 * @param dataPunesimit
 */
public Punjones(String emer, String adresa, String nrTel, String email, String zyra, double paga, Data dataPunesimit) {
	super(emer, adresa, nrTel, email);
	this.zyra = zyra;
	setPaga(paga);
	this.dataPunesimit = dataPunesimit;
}

/**
 * @return the zyra
 */
public String getZyra() {
	return zyra;
}

/**
 * @param zyra the zyra to set
 */
public void setZyra(String zyra) {
	this.zyra = zyra;
}

/**
 * @return the paga
 */
public double getPaga() {
	return paga;
}

/**
 * @param paga the paga to set
 */
public void setPaga(double paga) {
	if(paga >= 0)
	this.paga = paga;
}

/**
 * @return the dataPunesimit
 */
public Data getDataPunesimit() {
	return dataPunesimit;
}

/**
 * @param dataPunesimit the dataPunesimit to set
 */
public void setDataPunesimit(Data dataPunesimit) {
	this.dataPunesimit = dataPunesimit;
}

@Override
public String toString() {
	
	return super.toString()
			+
			String.format("Zyra: %s\nPaga: %.2f\nData e punesimit: %s\nVite pune: %d\n",
					zyra, paga, dataPunesimit.toString(),getVitetPunesimit());
}
/**
 * ,Metoda llogarit dhe kthen vitet e punes
 * @return vitet e punes se nje punetori
 */
public int getVitetPunesimit() {
	Calendar cal = Calendar.getInstance();
	cal.setTime(new Date());
	int year = cal.get(Calendar.YEAR);
	int mosha = cal.get(Calendar.MONTH);
	if(this.getDataPunesimit().getMuaji()<mosha)
		return year -  this.getDataPunesimit().getViti();
	else
		return year - this.getDataPunesimit().getViti()-1;	
}
/**
 * Metoda rishikon pagen ne varesi te vjetersise(me e madhe sesa 5 vite)
 * @return true nese punjonesi ploteson kushtet
 */
public boolean rishikoPaga() {
	if(getVitetPunesimit() < 5) return false;
	this.setPaga(paga*1.1);
	return true;
}
}

 


