package logo;

public abstract class Accessoires implements Logo  {
	
	protected Logo img;

	public Accessoires(Logo l) {
		img=l;
	}
	
	public double getPrix() {
		return (1+img.getPrix());
	}

}
