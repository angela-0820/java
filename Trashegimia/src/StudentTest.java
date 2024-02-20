
public class StudentTest {

	public static void main(String[] args) {
		Student  anisa = new Student ("Anisa Sula", "Tirana e Re", "0698787943", " anisa.sula@gmail.com", Status.BACHELOR);
		anisa.setStatus(Status.VITIDYTE);
		if(anisa.getStatus() == Status.VITIDYTE)
		{
			System.out.println("Anisa eshte ne vit te dyte");
		}
		System.out.println(anisa);

	}

}
