package Supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class admCarrito {
	private List <Carrito> lstCarrito;
		
	//CONSTRUCTOR
	public admCarrito() {
		this.lstCarrito = new ArrayList<Carrito>();
	}
	
	public boolean agregarCarrito(LocalDate fecha, LocalTime hora, Cliente cliente) {
		boolean bandera=false;
		if(lstCarrito.size()==0) {
			Carrito newCarrito = new Carrito(0, fecha, hora, cliente);
			bandera=lstCarrito.add(newCarrito);
		}else {
			int idMax = lstCarrito.get(lstCarrito.size()-1).getIdCarrito()+1;
			Carrito newCarrito = new Carrito(idMax, fecha, hora, cliente);
			bandera=lstCarrito.add(newCarrito);
		}
		
		return bandera;
	}
	
	public Carrito traerCarrito(int idCarrito) {
		boolean bandera=false;
		int i=0;
		
		while(i < lstCarrito.size() && bandera == false) {
			if(lstCarrito.get(i).getIdCarrito() == idCarrito) {
				bandera=true;
			}else {
				i++;
			}
			
		}
		return  (bandera == true) ? lstCarrito.get(i) : null;
	}
	
	public boolean eliminarCarrito(int idCarrito) {
		boolean bandera=false;
		Carrito carrito_a_eliminar=traerCarrito(idCarrito);
		
		if(carrito_a_eliminar != null) {
			lstCarrito.remove(carrito_a_eliminar);
			bandera=true;
		}
		
		return bandera;
	}
	
	
	
}
