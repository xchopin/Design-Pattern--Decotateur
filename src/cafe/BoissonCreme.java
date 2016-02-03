package cafe;

/**
 * classe permettant l'ajout de creme a une boisson
 * @author Xavier
 *
 */
public class BoissonCreme extends DecorateurIngredient {

	/**
	 * constructeur
	 * @param b boisson a decorer
	 */
	public BoissonCreme(Boisson b) {
		super(0.55, " Creme", b);
	}

}
