/**
 * Objekt Gjeometrik r = new Rreth();
 * 
 * Variabli r eshte nje objekt reference dhe ka si tip te deklaruar ObjektGjeoetrik dhe si tip aktual ka klasen Rreth.
 * Variabli r quhet varibel polimorf
 * r.toString() do therritet metoda e tipit aktual qe eshte ajo e klases Rreth
 * 
 * Operatori instanceOf perdoret ne java per te treguar nese nje objekt i perket nje klase te caktuar.
 * 
 * o intance of Rreth kthen vleren true nese o eshte nje objekt konkret i klases Rreth
 * dhe false perndryshe.
 * @author Anxhela
 */
public class TestPolimorfizem {

	public static void main(String[] args) {
     ObjektGjeometrik r = new Rreth();
     r.setNgjyra("Gri");
     System.out.println(r.toString());
     ObjektGjeometrik o; // variabel shumeformesh
     o = new Trekendesh("kuqe", true, 3.0, 4.0, 5.0);
     System.out.println(o);
     o = new Drejtkendesh("blue", false, 3.5, 2.7);
     System.out.println(o);
     ObjektGjeometrik[] lista = new ObjektGjeometrik[5];
     lista[0] = new Rreth ("verdhe", false, 3.4);
     lista[1] = new Trekendesh("blue", true, 3.0,4.0,6.0);
     lista[2] = o;
     lista[3] = new Katrori("white", false, 10.0);
     lista[4] = new Drejtkendesh();
     printSiperfaqe(lista);
    		 
	}
public static void printSiperfaqe(ObjektGjeometrik[] lista) {
	for(ObjektGjeometrik o:lista) {
		String emri = "";
		if(o instanceof Rreth) emri = " e rrethit ";
		else if (o instanceof Trekendesh) emri = "e trekendeshit";
		else if (o instanceof Drejtkendesh) emri = "e drejtkendeshit";
		else if (o instanceof Katrori) emri = "e katrorit";
		else {
			System.out.println("Objekt gjeometrik i panjohur");
			return;
		}
		System.out.println("Siperfaqja "+ emri + " = " + o.getSiperfaqe());
		
		
		System.out.println("Siperfaqja = "+ o.getSiperfaqe());
	}

}
}
