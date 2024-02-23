
public class TestObjektGjeometrik {

	public static void main(String[] args) {
		//sorry meqe klasat eshte abstrakte nuk mund te krijojme nje objekt konkret nga suoer klasat
		ObjektGjeometrik o = new Trekendesh("kuqe", true, 3,4,5);
		o.setNgjyra("jeshile");
		System.out.println(o.toString());

	}

}
