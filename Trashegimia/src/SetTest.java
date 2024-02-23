import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
Set<Integer> s = new HashSet<>();
s.add(1);
if(s.contains(1)) {
	throw new IllegalArgumentException("Id ekzistuese!");
}
System.out.println(s.toString());
	}

}
