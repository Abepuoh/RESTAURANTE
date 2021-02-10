package interfaces;

public class IOrderMenuController {
	/**
	 * 
	 * @param p
	 */
	public void addProduct(Product p);
	/**
	 * Edita una linea
	 */
	public void editLine();
	
	public void removeLine(int id);
	public void setAdress();
	public void savePaid();
	public void saveNotPaid();
	
}
