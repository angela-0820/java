
public class TestData {

	public static void main(String[] args) {
		Data today = new Data(30, 1, 2024);
		today.afishoDaten();
		Data nodate = new Data();
		nodate.afishoDaten();
		Data error = new Data(29,2,2027);
		error.afishoDaten();
				
		
		

	}

}
