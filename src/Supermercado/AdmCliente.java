package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class AdmCliente {
	private List <Cliente> lstCliente;
	
	//CONSTRUCTOR
	public AdmCliente() {
		this.lstCliente = new ArrayList <Cliente>();
	}
	
	public boolean agregarCliente(String cliente, long dni, String direccion) {

		boolean bandera=false;
		
		if(lstCliente.size() == 0 ) {
			Cliente clien = new Cliente(0, cliente, dni, direccion);
			bandera=lstCliente.add(clien);
		}else {
			int maxId = lstCliente.get(lstCliente.size()-1).getIdCliente()+1;
			Cliente clien = new Cliente(maxId, cliente, dni, direccion);
			bandera = lstCliente.add(clien);
		}
		
		return bandera;
	}
	
	public Cliente traerCliente(int idCliente) {
		int i=0;
		boolean bandera=false;
		
		while(i < lstCliente.size() && bandera == false) {
			if(lstCliente.get(i).getIdCliente() == idCliente) {
				bandera=true;
				i--;
			}
			i++;
		}
		if(bandera == false) {
			return null;
		}
		return lstCliente.get(i);
	}
	
	public boolean eliminarCliente(int idCliente) {
		Cliente cliente_a_eliminar=traerCliente(idCliente);
		
		if(cliente_a_eliminar == null) {
			return false;
		}else {
			lstCliente.remove(cliente_a_eliminar);
			return true;
		}
	}


	
}
