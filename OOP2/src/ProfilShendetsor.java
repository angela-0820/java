import java.util.Calendar;
import java.util.Date;

/**
 * Ndertojme nje klase qe ka te beje me profilin shendetsor te nje personi.
 */
public class ProfilShendetsor {
	private String emri; //emri p.sh Tom 
	private String mbiemri;// mbiemri p.sh Hardy  
	private Data dataLindjes;// nje objekt i klases Data
	private char gjinia; // M-male, F-female
	private double gjatesia;// per sistemin metrik(imperial) ne m(inch) p.sh 1.80
	private double pesha;// per sistemin metrik ne kg(pound) 
	private boolean sistemiMates = true;// true sistemi metrik, false sistemi imperial
	/**
	 * Konstruktori pa parametra qe nderton nje objekt default
	 */
  public ProfilShendetsor(){
	
  }
/**
 * Konstruktori me parametra qe nderton objektin me parametrat e specifikuara me poshte
 * @param emri emri i personit;
 * @param mbiemri mbiemri i personit;
 * @param dataLindjes data e lindjes se personit
 * @param gjinia gjinia e personit
 * @param pesha pesha e personit
 * @param gjatesia gjatesia e personit 
 * 
 */
   public ProfilShendetsor(String emri, String mbiemri, Data dataLindjes, char gjinia, double gjatesia, double pesha) {
	   this.emri=emri;
	   this.mbiemri=mbiemri;
	   this.dataLindjes=dataLindjes;
	   this.gjinia=gjinia;
	   this.gjatesia=gjatesia;
	   this.pesha=pesha;
	   
}
   /**
    * metoda get per vendosjen e emrit
    *  @return emri
    */
public String getEmri() {
	return emri;
}
/**
 * metoda set per vendosjen e emrit
 * @param emri
 */
public void setEmri(String emri) {
	this.emri = emri;
}
public String getMbiemri() {
	return mbiemri;
}
public void setMbiemri(String mbiemri) {
	this.mbiemri = mbiemri;
}
public Data getDataLindjes() {
	return dataLindjes;
}
public void setDataLindjes(Data dataLindjes) {
	this.dataLindjes = dataLindjes;
}
public char getGjinia() {
	return gjinia;
}
public void setGjinia(char gjinia) {
	this.gjinia = gjinia;
}
public double getGjatesia() {
	return gjatesia;
}
public void setGjatesia(double gjatesia) {
	this.gjatesia = gjatesia;
}
public double getPesha() {
	return pesha;
}
public void setPesha(double pesha) {
	this.pesha = pesha;
}
public int getMosha() {
	Calendar cal = Calendar.getInstance();
	cal.setTime(new Date());
	int year = cal.get(Calendar.YEAR);
	int mosha = cal.get(Calendar.MONTH);
	if(this.getDataLindjes().getMuaji()<mosha)
		return year -  this.getDataLindjes().getViti();
	else
		return year - this.getDataLindjes().getViti()-1;
}
public double getMaxRrahjet() {
return 200 - getMosha();
}
/*
 * Llogarit diapaznin e rrahjeve te zemres 50% - 85% te maksimumit te rrahjeve
 * @return diapazonin e synuar te rrahjeve p.sh 80 - 120
 */

public String getDiapazoniRrahjeve() {
	return String.format("%.0f - %.0f", 0.5*getMaxRrahjet(), 0.85*getMaxRrahjet());
}
/**
 * Llogarit BMI ne varesi te gjatesise, peshes dhe sistemit metrik 
 * @return
 */
public double getBMI() {
	return sistemiMates?getPesha()/(getGjatesia()*getGjatesia()):
		getPesha()*703/(getGjatesia()*getGjatesia());
	
}
/**
 * Printon tabelen e BMI si me poshte:
 * 
 * VLERAT e BMI:<br />
 * Nenpeshe: me pak se 18.5 <br />
 * Normal: mdis 18.5 dhe 24.9 <br />
 * Mbipeshe: midis 25 dhe 29.9 <br />
 * Obez: 30 ose me e lart <br />
 * 
 */
public static void  printoTabelenBMI() {
	System.out.println("VLERA BMI: ");
	System.out.println("Nenpeshe: me pak se 18.5"); 
	System.out.println("Normal: mdis 18.5 dhe 24.9");
	System.out.println("Mbipeshe: midis 25 dhe 29.9");
	System.out.println("Obez: 30 ose me e larte");
}

public void afishoProfil() {
	System.out.println("*****Profili Shendetsor*****");
	System.out.println("Emri: "+getEmri() + " "+getMbiemri());
	System.out.println(" Mosha: "+getMosha());
	System.out.println("Maksimumi i  rrahjeve te zemres: "+getMaxRrahjet());
	System.out.println("Diapazoni i synuar: "+ getDiapazoniRrahjeve());
	System.out.println("BMI: "+ getBMI());
	ProfilShendetsor.printoTabelenBMI();
	System.out.println();
}
}
