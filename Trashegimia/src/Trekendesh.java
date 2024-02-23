/**
 *Klasa trekendesh zgjeron klasen Objekt Gjeometrik, pasi nje rreth eshte-nje objekt gjeometrik.
 *Trekendeshi ka fushen, brinjaA, brinjaB dhe brinjaC te tipit double me vlere default 1.0.
 *Ka metodat getPerimeter(), getSiperfaqe(), toString()
 *Perimetri = brinjaA + brinjaB + brinjaC
 *Siperfaqja = ( hp* (hp - brinjaA)*(hp - brinjaB)*(hp - brinjaC))
 *@author Anxhela
 */
public class Trekendesh extends ObjektGjeometrik {
	
	private double brinjaA = 1.0;
	private double brinjaB = 1.0;
	private double brinjaC = 1.0;
	
	/**
	 * Kontruktori pa parametra
	 */
	public Trekendesh() {
		super ();
		System.out.println("Konstruktori pa parametra i klases Trekendesh");
	}
	/**
	 * @param ngjyra
	 * @param ngjyrosur
	 * @param brinjaA
	 * @param brinjaB
	 * @param brinjaC
	 * @throws IllegalArgumentException  kur njera nga brinjet eshte negative
	 */
	public Trekendesh(String ngjyra, boolean ngjyrosur,double brinjaA, double brinjaB, double brinjaC) {
		super(ngjyra, ngjyrosur);
		System.out.println("Konstruktori me parametra i klases Trekendesh");


		
		
		
		
	this.brinjaA = brinjaA;
	this.brinjaB = brinjaB;
	this.brinjaC = brinjaC;
	}
	         
	/**
	 * @return the brinjA
	 */
	public double getBrinjaA() {
		return brinjaA;
	}
	
	/**
	 * @param brinjA the brinjA to set
	 */
	public void setBrinjaA(double brinjaA) {
		this.brinjaA = brinjaA;
	}
	/**
	 * @return the brinjaB
	 */
	public double getBrinjaB() {
		return brinjaB;
	}
	/**
	 * @param brinjB the brinjaB to set
	 */
	public void setBrinjaB(double brinjaB) {
		this.brinjaB = brinjaB;
	}
	/**
	 * @return the brinjaC
	 */
	public double getBrinjaC() {
		return brinjaC;
	}
	/**
	 * @param brinjaC the brinjaC to set
	 */
	public void setBrinjaC(double brinjaC) {
		this.brinjaC = brinjaC;
	}
	/**
	 * Llogarit perimetrin e treknedeshit
	 * @return brinjaA + brinjaB + brinjaC;
	 */
@Override
public double getPerimeter() {
	return brinjaA + brinjaB + brinjaC;
	
}
/**
 * Llogarit siperfaqen e trekendeshit sipas formules se Heronit
 * @return siperfaqen e trekendeshit
 */
@Override
public double getSiperfaqe() {
	double hp = getPerimeter()/2.0; // hp eshte gjysem perimetri
	return Math.sqrt( hp* (hp - brinjaA)*(hp - brinjaB)*(hp - brinjaC));
}
@Override
public String toString() {
	// TODO Auto-generated method stub          
	return  String.format("Trekendesh me brinje %.2f, %.2f,%.2f\n", brinjaA, brinjaB, brinjaC) 
			+ super.toString();
} 
}

	
	


