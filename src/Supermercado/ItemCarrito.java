package Supermercado;

public class ItemCarrito {
	private int idItem;
	private Producto producto;
	private int cantidad;
	
	
	//CONSTRUCTOR
	public ItemCarrito(int idItem, Producto producto, int cantidad){
		this.idItem=idItem;
		this.producto=producto;
		this.cantidad=cantidad;
	}

	//SETTERS AND GETTERS---------------------------------
	public int getIdItem() {
		return idItem;
	}

	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	//METODOS----------------------------------------------
	public float calcularSubTotal() {
		return cantidad*producto.getPrecio();
	}
	
	
}
