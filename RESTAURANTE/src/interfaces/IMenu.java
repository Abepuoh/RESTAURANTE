package interfaces;

public class IMenu {
	/**
	 * Menu de incio para el usuario. 
	 *
	 */
	public void welcomeMenu();
	/**
	 * Menu de elección para el usuario.
	 */
	public void chooseMenu();
	/**
	 * Registra a un cliente
	 * 
	 * @return Cliente nuevo.
	 */
	public void registerClient();
	/**
	 * Elimina todos los datos del cliente y lo borra.
	 */
	public void deleteClient();
	/**
	 * Cambia datos del cliente.
	 */
	public void updateClient();
	/**
	 * Busca a un cliente
	 * 
	 * @return Devuelve el cliente que has buscado
	 */
	public List<Cliente> searchClient();
	/**
	 * Muestra las bebidas.
	 */
	public void showDrinks();
	/**
	 * Muestra los platos.
	 */
	public void ShowDishes();
	/**
	 * Show the available combos.
	 */
	public void ShowCombos();
}
