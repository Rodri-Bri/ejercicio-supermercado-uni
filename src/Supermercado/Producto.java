package Supermercado;

import java.util.Objects;

public class Producto {
	private int idProducto;
	private String producto;
	private float precio;
	
	//CONSTRUCTOR
	public Producto(int idProducto, String producto, float precio) {
		this.idProducto=idProducto;
		this.producto=producto;
		this.precio=precio;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(idProducto);
	}


	public boolean equals(Producto producto) {
		return this.idProducto == producto.idProducto;
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", producto=" + producto + ", precio=" + precio + "]";
	}


	//SETTERS AND GETTERS---------------------------------
	public int getIdProducto() {
		return idProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
}
