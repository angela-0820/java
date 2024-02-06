
public class PunjonesTestOne {

	public static void main(String[] args) {
		Punjones p1 = new Punjones();
        p1.setEmri("Agim");
        p1.setMbiemri("Bardhi");
        p1.setPagaMujore(60000);
        Punjones p2 = new Punjones("Denis","Hoxha",95000);
        Punjones lista[] = new Punjones[5];
        lista[0] = p1;
        lista[1] = p2;
        lista[2] = new Punjones("Sotir", "Prifti", 10000);
        lista[3] = new Punjones("Sonila", "Veshi", 20000);
        lista[4] = new Punjones("Linda", "Prifti", 90000);
        lista[1].setPaga13(true);
        lista[4].setPaga13(true);
        System.out.println("***********Lista e punjonesve*********");
        System.out.println("     Numri total i punjonesve = "+Punjones.getNrPunjones());
        System.out.println("     Emri     "   +"  Mbiemri"  +"   PagaVjetore");
        
        //menyra for each e bredhjes se nje tabele
        for(Punjones p:lista)
        	Punjones.afishoPunjones(p);
        
       // for(int i=0;i<lista.length;i++) {
        	//Punjones.afishoPunjones(lista[i]);
        }
	}


