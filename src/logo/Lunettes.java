package logo;

public class Lunettes extends Accessoires {

	public Lunettes(Logo l) {
		super(l);
	}

	@Override
	public MyImage getLogo() {
		MyImage mi=img.getLogo();
		mi.paintOver("img/Sunglasses.png", 255, 76);
		return mi;
	}

}
