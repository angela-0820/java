/**
 * Klasa Punonjes modelon nje punonjes te nje kompanie.
 * @author Anxhela
 * @version 1.0
 * @
 */
public class Punjones {
	private String Emri;           // Emri i punonjesit
	private String Mbiemri;        // Mbiemri i punjonesit
	private double pagaMujore;     //Paga mujore e punjonesit
	private boolean paga13 = false ;        // Paga e 13 e punjonesit
	private  static int nrPunjones = 0;
	
	
	public Punjones() {
		nrPunjones++;
		
		
	}
	/**
	 * Nderton nje objekt te klases Punjones me parametrat e specifikuar me poshte.
	 * Nese pagaMujore eshte negative, vlera default 0 do te vendoset.
	 * 
	 * @param emri Emri i punjonesit
	 * @param mbiemri Mbiemri i punjonesit
	 * @param pagaMujore Paga mujore e punjonesit
	 */
	public Punjones(String emri, String mbiemri, double pagaMujore) {
		setEmri(emri);
		setMbiemri(mbiemri);
		if (pagaMujore > 0) setPagaMujore(pagaMujore);
		nrPunjones++;
		
	}
	/**
	 * Metoda Get per emrin e punjonesit
	 * @return emri i punjonesit
	 */

	public String getEmri() {
		return Emri;
		/**
		 * Metoda Set per fushen emrin
		 * @param vendos emrin e punjonesit
		 */
	}
	public void setEmri(String emri) {
		Emri = emri;
	}
	/**
	 * Metoda Get per mbiemrin e punjonesit
	 * @return mbiemri i punjonesit
	 */
	public String getMbiemri() {
		return Mbiemri;
	}
	/**
	 * Metoda Set per fushen mbiemrin
	 * @param vendos mbiemrin e punjonesit
	 */
	public void setMbiemri(String mbiemri) {
		Mbiemri = mbiemri;
	}
	/**
	 * Metoda Get per pagen e punjonesit
	 * @return pagen i punjonesit
	 */
	public double getPagaMujore() {
		return pagaMujore;
	}
	/**
	 * Metoda Set per fushen pagaMujore
	 * @param vendos pagen mujore te punjonesit
	 */
	public void setPagaMujore(double pagaMujore) {
		this.pagaMujore = pagaMujore;	
		}
	
	public boolean getPaga13() {
		return paga13;
	}
	public void setPaga13(boolean paga13) {
		this.paga13 = paga13;
	}
	/**
	 * Llogarit pagen vjetore ne baze te pages mujore
	 * @return 12 pagat plus pagen e 13 nese fusha paga13 eshte true.
	 */
	public double getPagaVjetore() {
			return getPaga13()?getPagaMujore()*13:getPagaMujore()*12;
	}
	public  static int getNrPunjones() {
		return nrPunjones;
		}
	
	public static void afishoPunjones(Punjones punjones) {
		if(punjones!=null)
		 System.out.printf("%9s%14s%14.2f\n",
		   punjones.getEmri(),
		   punjones.getMbiemri(),
		   punjones.getPagaMujore()*12
		   );
		
		
		}
	}
	


