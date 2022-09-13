package Supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import Incaa.Pelicula;

public class Carrito {
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private Cliente cliente;
	private List <ItemCarrito> lstItem;
	
	//CONSTRUCTOR
	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora,Cliente cliente) {
		this.idCarrito=idCarrito;
		this.fecha=fecha;
		this.hora=hora;
		this.lstItem=new ArrayList <ItemCarrito>();
		this.cliente=cliente;
	}

	
	//SETTERS AND GETTERS-------------------------------------------
	public int getIdCarrito() {
		return idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getLstItem() {
		return lstItem;
	}


	public void setLstItem(List<ItemCarrito> lstItem) {
		this.lstItem = lstItem;
	}


	public boolean agregarItem(Producto producto, int cantidad) {
		if(lstItem.size() ==0) {
			ItemCarrito itemCarrito=new ItemCarrito(0,producto,cantidad);
			return lstItem.add(itemCarrito);
		}else {
			for(int i=0;i<lstItem.size();i++) {
				if(equals(producto,i)) {
					int cantidadAnterior=lstItem.get(i).getCantidad();
					lstItem.get(i).setCantidad(cantidad+cantidadAnterior);
					return true;
				}
			}
				int maxId=lstItem.size()-1;
				maxId=lstItem.get(maxId).getIdItem()+1;
				ItemCarrito itemCarrito = new ItemCarrito(maxId, producto, cantidad);
				return lstItem.add(itemCarrito);
			
			
		}
	}
	
	public String traerItem(int idProducto) {
		for(int i=0;i<lstItem.size();i++) {
			if(idProducto == lstItem.get(i).getIdItem()) {
				return lstItem.get(i).getProducto().getProducto();
			}
		}
		return "error";
	}
	
	
	public boolean eliminarItem (Producto producto, int cantidad) {
		for(int i=0;i<lstItem.size();i++) {
			if(equals(producto,i)) {
				if(lstItem.get(i).getCantidad() <= cantidad) {
					lstItem.remove(i);
					return true;
				}else{
					int cantidadAnterior=lstItem.get(i).getCantidad();
					lstItem.get(i).setCantidad(cantidadAnterior-cantidad);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean equals(Producto producto,int pos) {
		return (producto.getIdProducto() == lstItem.get(pos).getProducto().getIdProducto());
	}
	
	public float calcularTotal() {
		float total=0;
		for(int i=0;i<lstItem.size();i++) {
			total=total+lstItem.get(i).calcularSubTotal();
		}
		return total;
	}
}



