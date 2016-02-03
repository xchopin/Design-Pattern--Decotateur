package logo;

public class Chapeau extends Accessoires {

	public Chapeau(Logo l) {
		super(l);
	}

	@Override
	public MyImage getLogo() {
		
		MyImage mi =img.getLogo();
		mi.paintOver("img/Chapeau.png", 280, 42);
		return mi;
	}

}
