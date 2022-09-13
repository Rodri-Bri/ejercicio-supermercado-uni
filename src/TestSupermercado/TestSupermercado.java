package TestSupermercado;

import java.time.LocalDate;
import java.time.LocalTime;

import Supermercado.*;

public class TestSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermercado supermercado = new Supermercado();
		
		supermercado.agregarProducto("Pepsi", 180);
		supermercado.agregarProducto("Coca cola", 220);
		supermercado.agregarProducto("Formis", 120);
		supermercado.agregarProducto("Chocolinas", 160);
		supermercado.agregarProducto("Papa", 150);
		supermercado.agregarProducto("Tortitas", 140);
		
		System.out.println(supermercado.traerProductos());
		System.out.println("ELIMINAR--------------------");
		System.out.println(supermercado.eliminarProducto(1));
		System.out.println("ELIMINADO--------------------");
		System.out.println(supermercado.traerProductos());
		System.out.println("TRAER--------------------");
		System.out.println(supermercado.traerProducto(1).getIdProducto());
		/*
		System.out.println(supermercado.traerProducto(0).getProducto());
		System.out.println(supermercado.traerProducto(1).getProducto());
		System.out.println(supermercado.traerProducto(2).getProducto());
		System.out.println(supermercado.traerProducto(3).getProducto());
		System.out.println(supermercado.traerProducto(4).getProducto());
		System.out.println(supermercado.traerProducto(5).getProducto());
		*/
		/*
		System.out.println(supermercado.traerProducto(0).getIdProducto());
		System.out.println(supermercado.traerProducto(1).getIdProducto());
		System.out.println(supermercado.traerProducto(2).getIdProducto());
		System.out.println(supermercado.traerProducto(3).getIdProducto());
		System.out.println(supermercado.traerProducto(4).getIdProducto());
		System.out.println(supermercado.traerProducto(5).getIdProducto());
		System.out.println(supermercado.traerProducto(6).getIdProducto());
	*/
		
		LocalDate localDate=null;
		LocalTime localTime=null;
		
		
		System.out.println("----------CREAR CARRITO-------------");
		Cliente cliente =new Cliente(0,"Rodrigo",43390009,"La rioja");
		Carrito carrito = new Carrito(0,localDate,localTime,cliente);
		
		System.out.println("--------Agregar item carrito-------------------");
		System.out.println(carrito.agregarItem( supermercado.traerProducto(0),1));;
		carrito.agregarItem( supermercado.traerProducto(1),1);
		carrito.agregarItem( supermercado.traerProducto(2),3);
		carrito.agregarItem( supermercado.traerProducto(3),1);
		carrito.agregarItem( supermercado.traerProducto(4),1);
		carrito.agregarItem( supermercado.traerProducto(5),1);
		
		System.out.println("----------MOSTRAR CARRITO-------------");
		System.out.println(carrito.traerItem(0));
		System.out.println(carrito.traerItem(1));
		System.out.println(carrito.traerItem(2));
		System.out.println(carrito.traerItem(3));
		System.out.println(carrito.traerItem(4));
		System.out.println(carrito.traerItem(5));
		
		System.out.println("-----------ELIMINAR PRODUCTO-----------");
		System.out.println(carrito.eliminarItem(supermercado.traerProducto(2), 3));
		
		System.out.println("----------MOSTRAR CARRITO-------------");
		System.out.println(carrito.traerItem(0));
		System.out.println(carrito.traerItem(1));
		System.out.println(carrito.traerItem(2));
		System.out.println(carrito.traerItem(3));
		System.out.println(carrito.traerItem(4));
		System.out.println(carrito.traerItem(5));
		
		
		System.out.println(carrito.calcularTotal());
		
	}

}
