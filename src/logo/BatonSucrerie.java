package logo;

public class BatonSucrerie extends Accessoires {

	public BatonSucrerie(Logo l) {
		super(l);
	}

	@Override
	public MyImage getLogo() {
		MyImage mi=img.getLogo();
		mi.paintOver("img/Candy.png", 441, 202);
		return mi;
	}

}
