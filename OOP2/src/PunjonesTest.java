
public class PunjonesTest {

	public static void main(String[] args) {
         Punjones p1 = new Punjones();
         p1.setEmri("Agim");
         p1.setMbiemri("Bardhi");
         p1.setPagaMujore(60000);
        System.out.println("Paga vjetore eshte "+ p1.getPagaMujore()*12);
        
        Punjones p2 = new Punjones("Denis","Hoxha",95000);
       System.out.println("Paga vjetore eshte "+ p2.getPagaMujore()*12);
       
       //rritja e pages mujore per punjonesi p1 prej 10%
       p1.setPagaMujore(p1.getPagaMujore()*1.1);
       System.out.println("Paga vjetore eshte "+ p1.getPagaMujore()*12);
       
       //rritja e pages mujore per punjonesi p2 prej 5%
       p2.setPagaMujore(p2.getPagaMujore()*1.05);
       System.out.println("Paga vjetore eshte "+ p2.getPagaMujore()*12);
       
       
     //  int t[] = new int [5]
       
       Punjones lista[] = new Punjones[5];
       lista[0] = p1;
       lista[1] = p2;
       lista[2] = new Punjones("Sotir", "Prifti", 10000);
       lista[3] = new Punjones("Sonila", "Veshi", 20000);
       lista[4] = new Punjones("Linda", "Prifti", 90000);
       
       //Krijojme nje raport me listen e punjonesve te tipit
       //Emer Mbiemer Paga Vjetore
       System.out.println("***********Lista e punjonesve*********");
       System.out.println("     Emri     "   +"  Mbiemri"  +"   PagaVjetore");
       for(int i=0; i < lista.length; i++) {
    	   System.out.printf
    	           ("%9s%14s%14.2f\n",
    			   lista[i].getEmri(),
    			   lista[i].getMbiemri(),
    			   lista[i].getPagaMujore()*12
    			   );
    	   
    	  
       }
       
       
       		
       
         }
         

}
