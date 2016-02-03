package logo;

public class Smiley extends Accessoires {

	public Smiley(Logo l) {
		super(l);
	}

	@Override
	public MyImage getLogo() {
		MyImage mi=img.getLogo();
		mi.paintOver("img/Smiley.png", 260, 210);
		return mi;
	}

}
