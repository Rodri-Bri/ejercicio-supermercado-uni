package Supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private List <Producto> gondola; 
	private List <Carrito> carrito;
	private List <Cliente> clien;
	
	//CONSTRUCTOR
	public Supermercado() {
		this.gondola=new ArrayList <Producto>();
		this.carrito=new ArrayList <Carrito>();
		this.clien=new ArrayList <Cliente>();
	}




	//SETTERS AND GETTERS---------------------------------
	public List<Producto> getGondola() {
		return gondola;
	}


	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}
	
	public boolean agregarProducto(String producto, float precio) {
		if(gondola.size() == 0) {
			Producto product=new Producto(0, producto, precio);
			return gondola.add(product);
		}else {
			int maxID=gondola.size()-1;
			maxID=gondola.get(maxID).getIdProducto()+1;
			Producto product = new Producto(maxID, producto, precio);
			return gondola.add(product);
		}
	}
	
	
	public boolean agregarCliente(String cliente, long dni, String direccion) {
		if(clien.size() == 0) {
			Cliente client = new Cliente(0,cliente,dni,direccion);
			return clien.add(client);
		}else {
			int maxId=clien.size()-1;
			maxId=clien.get(maxId).getIdCliente()+1;
			Cliente client = new Cliente(maxId,cliente,dni,direccion);
			return clien.add(client);
		}
	}
	
	
	public boolean agregarCarrito(LocalDate fecha, LocalTime hora, Cliente cliente) {
		if(carrito.size() == 0) {
			Carrito carrit = new Carrito(0, fecha, hora, cliente);
			return carrito.add(carrit);
		}else {
			int maxId=carrito.size()-1;
			maxId=carrito.get(maxId).getIdCarrito()+1;
			Carrito carrit = new Carrito(maxId, fecha, hora, cliente);
			return carrito.add(carrit);
		}
	}
	
	
	public Producto traerProducto(int idProducto) {
		if(idProducto > gondola.size()) {
			 Producto producto = new Producto(-1,"Error", 0);
			 return producto;
		}
		for(int i=0;i<gondola.size();i++) {
			if(gondola.get(i).getIdProducto() == idProducto) {
				return gondola.get(i);
			}
		}
		 Producto producto = new Producto(-1,"Error", 0);
		 return producto;
	}
	
	public boolean traerProductos() {
		for(int i=0;i<gondola.size();i++) {
			System.out.println(gondola.get(i).getProducto());
		}
		return true;
	}
	
	
	public boolean modificarProducto(int idProducto, String producto, float precio) {
		
		if(idProducto > gondola.size() || idProducto < 0) {
			return false;
		}
		traerProducto(idProducto).setProducto(producto);
		traerProducto(idProducto).setPrecio(precio);
		
		return true;
	}
	
	public boolean eliminarProducto(int idProducto) {
		int i=0;
		while(idProducto != gondola.get(i).getIdProducto() || i > gondola.size()-1) {
			i++;
		}
		if( i > gondola.size()-1) {
			return false;
		}
		else {
			 gondola.remove(i);
			 return true;
			}
	}
	
	
	
	
	
}

