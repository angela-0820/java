/**
 *Klasa rreth zgjeron klasen Objekt Gjeometrik, pasi nje rreth eshte-nje objekt gjeometrik.
 *Rrethi ka fushen, rrezja e tipit double me vlere default 1.0.
 *Ka metodat getPerimeter(), getSiperfaqe(), toString()
 *Perimetri = 2 * pi * rrezja
 *Siperfaqja = pi * rrezja * rrezja
 *@author Anxhela
 */
public class Rreth  extends ObjektGjeometrik{
     private double rrezja = 1.0;
	/**
	 * 
	 */
	public Rreth() {
		super();
		System.out.println("Konstruktori pa parametra i klases Rreth");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param rrezja
	 * @param ngjyra
	 * @param ngjyrosur
	 */
	public Rreth(String ngjyra, boolean ngjyrosur, double rrezja) {
		super(ngjyra, ngjyrosur);
		System.out.println("Konstruktori me parametra i klases Rreth");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the rrezja
	 */
	public double getRrezja() {
		return rrezja;
	}

	/**
	 * @param rrezja the rrezja to set
	 */
	public void setRrezja(double rrezja) {
		this.rrezja = rrezja;
	}
	public double getPerimeter() {
		return 2 * Math.PI * rrezja;
	}
	public double getSiperfaqja() {
	return	Math.PI * rrezja * rrezja; 
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub          
		return  String.format("Rrethi me rreze %.2f\n", rrezja) 
				+ super.toString();
	} 
	
	

}
