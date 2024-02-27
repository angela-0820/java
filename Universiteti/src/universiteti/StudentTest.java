package universiteti;

public class StudentTest {

	public static void main(String[] args) {
		try {
			Student s100 = new Student (100, "Kloi Hoxha");
			s100.payFee(100.0);
			System.out.println(s100);
			s100.payFee(200.0);
			System.out.println(s100);
			Student s101 = new Student (100, "Kroi Toci");
			System.out.println(s101);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		catch(Exception e) {
			
			
			
			
			
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Programi vazhdon");
		}
	}

}
