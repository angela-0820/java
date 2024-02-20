
public class PunjonesTest {

	public static void main(String[] args) {
		Punjones angela = new Punjones();
		angela.setEmer("Angela Smith");
		angela.setAdresa("Liqeni i Thate");
		angela.setNrTel("355696873567");
		angela.setEmail("angelasmith.gmail.com");
		angela.setZyra("Lab 1");
		angela.setPaga(100000.0);
		angela.setDataPunesimit(new Data(23,03,2016));
		angela.rishikoPaga();
		System.out.println(angela);

	}

}
