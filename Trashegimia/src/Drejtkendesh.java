/**
 * Klasa drejtkendesh zgjeron klasen Objekt Gjeometrik.
 * Drejtkendeshi eshte-nje objekt gjeomtrik. Drejtkendeshi ka dy fusha: brinja1 dhe brinja2.
 * Perimetri = 2*(brinja1+brinja2)
 * Siperfaqja = brinja1*brinja2
 * @author Anxhela
 */
		
public class Drejtkendesh extends ObjektGjeometrik{
	protected double brinja1=1.0;
	protected double brinja2=2.0;
	
	public Drejtkendesh() {
		super();
		System.out.println("Konstruktori pa parametra i klases Drejtkendesh");
	}

	/**
	 * @param brinja1
	 * @param brinja2
	 * @param ngjyra
	 * @param ngjyrosur
	 */
	public Drejtkendesh(String ngjyra, boolean ngjyrosur,double brinja1, double brinja2) {
		super(ngjyra, ngjyrosur);
		System.out.println("Konstruktori me parametra i klases Drejtkendesh");
		this.brinja1=brinja1;
		this.brinja2=brinja2;
		
		


	}

	/**
	 * @return the brinja1
	 */
	public double getBrinja1() {
		return brinja1;
	}

	/**
	 * @param brinja1 the brinja1 to set
	 */
	public void setBrinja1(double brinja1) {
		this.brinja1 = brinja1;
	}

	/**
	 * @return the brinja2
	 */
	public double getBrinja2() {
		return brinja2;
	}

	/**
	 * @param brinja2 the brinja2 to set
	 */
	public void setBrinja2(double brinja2) {
		this.brinja2 = brinja2;
	}
	public double getPerimeter() {
		return 2*(brinja1+brinja2);
	}
	public double getSiperfaqja() {
	return	brinja1*brinja2;
	}
	@Override
	public String toString() {
		     
		return  String.format("Drejtkendeshi me brinje %.2f dhe brinje %.2f\n", brinja1,  brinja2)+super.toString();
	} 
	

}
