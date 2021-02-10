package interfaces;

public class IDrink {
	/**
	 * devuelve si la bebida es alcoholica o no.
	 * 
	 * @return True si alcoholica, False si no.
	 */
	public void isAlcoholic();
	/**
	 * Array de productos que almacena el nombre/id de aquellos productos con los 
	 * que puede aplicarse un 10% de descuento.
	 * 
	 * @return ArrayList de Product.
	 */
	public List<Product> getBundlePack();
}
