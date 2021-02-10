package interfaces;
/**
 * Muestra el menu principal de interaccion con el cliente
 * @author Miguel Angel	
 *
 */
public class IMainMenuController {
	/**
	 * Crea un nuevo pedido.
	 */
	public void newOrder();
	/**
	 * Cambia el pedido del cliente.
	 */
	public void changeOrder(Cliente c);
	/**
	 * Cambia el pedido con LocalDate.	
	 */
	public void change(LocalDate d);
	/**
	 * Cambia el pedido.
	 */
	public void changeOrder(Cliente c,LocalDate d);
	/**
	 * Borra un pedido del cliente.
	 */
	public void deleteOrder(Cliente c);
	/**
	 * Borra un pedido con LocalDate.
	 */
	public void deleteOrder(LocalDate d);
	/**
	 * Borra un pedido.
	 */
	public void deleteOrder(Cliente c,LocalDate d);
	/**
	 * Muestra el dinero que hemos gastado hoy.
	 */
	public void cashToday();
	/**
	 *  Muestra el dinero que hemos gastado esta semana.
	 */
	public void cashThisMonth();
	/**
	 *  Muestra el dinero que hemos gastado este mes.
	 */
	public void cashTotal();
	/**
	 *  Muestra los pedidos no pagados.
	 */
	public void viewOrdesrNotPaid();
	/**
	 * 
	 */
	public void viewOrdersPendingDelivered();
	/**
	 * 
	 */
	public void saveAllAndClose();
}
