/**
 * Klasa katrori zgjeron klasen Drejtkendesh.
 * Katror eshte-nje drejtkendesh. Drejtkendeshi ka 1 fushe brinje.
 * Perimetri = 4 * brinja
 * Siperfaqja = brinja*brinja
 * @author Anxhela
 */
		
public class Katrori extends Drejtkendesh {
	
	public Katrori() {
	setBrinja1(1.0);
	setBrinja2(1.0);	

}


/**
 * @param ngjyra
 * @param ngjyrosur
 * @param brinja1
 * @param brinja2
 */
public Katrori(String ngjyra, boolean ngjyrosur, double brinja) {
	super(ngjyra, ngjyrosur, brinja, brinja);
	System.out.println("Konstruktori me parametra i klases Katrori");
	
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


public double getPerimeter() {
	return 4*brinja1;
}
public double getSiperfaqja() {
return	brinja1*brinja1;
}
@Override
public String toString() {
	     ObjektGjeometrik o1 = (ObjektGjeometrik)this;
	     
	return  String.format("Katrori me brinje %.2f\n", this.getBrinja1());
	
} 
}

