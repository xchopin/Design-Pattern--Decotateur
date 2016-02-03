package cafe;

public class TestCafe {

	public static void main(String[] args) {
		Boisson b=new Deca();
		b=new BoissonChantilly(new BoissonChantilly(new BoissonCreme(b)));
		System.out.println(b);
	}

}
