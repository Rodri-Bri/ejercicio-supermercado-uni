package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class AdmProducto {
	private List <Producto> lstProducto;
	//CONSTRUCTOR
	public AdmProducto() {
		this.lstProducto = new ArrayList <Producto>(); 
	}
	
	
	public boolean agregarProducto(String producto, float precio) {
		boolean bandera=false;
		
		if(lstProducto.size()==0) {
			Producto product = new Producto(0, producto, precio);
			bandera=lstProducto.add(product);
		}else {
			int maxId=lstProducto.get(lstProducto.size()-1).getIdProducto()+1;
			Producto product = new Producto(maxId, producto, precio);
			bandera=lstProducto.add(product);
		}
		
		return bandera;
	}
	
	public Producto traerProducto(int idProducto) throws Exception {
		int n=0;
		boolean bandera=false;
		
		while(n < lstProducto.size() && bandera == false) {
			if(lstProducto.get(n).getIdProducto() == idProducto) {
				bandera = true;
				n--;
			}
			n++;
		}
		if(bandera == false) throw new Exception("EL ID NO SE ENCONTRO EN LA LISTA DE PRODUCTOS");
		return lstProducto.get(n);
	}
	
	
	
	
	public boolean eliminarProducto(int idProducto) throws Exception {
		Producto producto=traerProducto(idProducto);
		return lstProducto.remove(producto);
	}


	
	
}
