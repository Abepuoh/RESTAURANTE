package Product;

import java.util.List;
/**
 * En esta clase guardaremos todos los datos
 * de los producto de los cuales heredan el resto.
 * @author Abepuoh
 *
 */
public abstract class Product implements IProduct {
	private final static int PASSWORD_COUNTER=0; //CHECK
	private int id;
	private String name;
	private double price;
	private boolean forCeliac;
	
	public Product() {
		this("Desconocido",00.00);
	}
	public Product( String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.id = PASSWORD_COUNTER++;
		this.forCeliac=false; //CHECK
	}
	public String getName() {
		return name;
	}
	// Podriamos quitarlo ya que a un producto no se le va a cambiar el nombre
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
	public boolean isForCeliac() {
		
		boolean result=false;
		if(this.forCeliac==true) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
	public abstract List <Product> getBundlePack();
	
	@Override
	  public boolean equals(Object o) {
	    boolean result = false;
	    if (this == o) {
	      result = true;
	    } else if (o instanceof Product) {
	      Product a = (Product) o;
	      String n = a.getName();
	      if (this.name.equals(n)) {
	        result = true;
	      }
	    }
	    return result;
	  }
	
	@Override
	public String toString() {
		return "Producto con id=" + id + ", nombre=" + name + ", precio=" + price + 
				", Es apto para celiacos =" + forCeliac;
	}	
}
