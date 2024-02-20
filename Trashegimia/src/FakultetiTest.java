
public class FakultetiTest {

	public static void main(String[] args) {
		Fakulteti dekani = new Fakulteti("Spirro Dushku", "Tirane",
				"35567654389","spirrodushku@gmail.com","Kati pare godina A", 
				170000, new Data(1,1,1990), 8, Grada.PROFESOR);
		System.out.println(dekani);
		dekani.rishikoPaga();     
		System.out.println(dekani); 
	}

}
