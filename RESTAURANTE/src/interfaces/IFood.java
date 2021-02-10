package interfaces;

public class IFood {
	/**
	 * devuelve si la comida es apta para veganos.
	 * 
	 * @return True si es para veganos, False si no.
	 */
	public void isForVegans();
	/**
	 * Array de productos que almacena el id/nombres de aquellos productos con los 
     * que puede aplicarse un 10% de descuento.
     * 
     * @return ArrayList de Products.
	 */
	public List<Product> getBundlePack();
}
