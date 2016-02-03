package cafe;

/**
 * Classe orrespondant a une boisson deca
 * @author Xavier
 *
 */
public class Deca extends Boisson {
	
	public Deca() {
		description=" Deca";
	}

	/**
	 * @return prix de la boisson
	 */
	@Override
	public double cout() {
		return 1.00;
	}

}
