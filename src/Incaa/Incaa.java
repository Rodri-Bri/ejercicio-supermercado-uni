package Incaa;

import java.util.ArrayList;
import java.util.List;

import Supermercado.ItemCarrito;

public class Incaa {
	private List <Pelicula> catalogo;
	
	//CONSTRUCTOR
	public Incaa() {
		this.catalogo = new ArrayList <Pelicula>();
	}
	
	//SETTERS AND GETTERS
	public List <Pelicula> getCatalogo() {
		return catalogo;
	}


	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	
	public boolean agregarPelicula(String pelicula,Genero genero) {
		if(catalogo.size()==0) {
			Pelicula peli=new Pelicula(0,pelicula,genero);
			catalogo.add(peli);
			return true;
		}else if(catalogo.size() > 0){
			int idProx=catalogo.size();
			Pelicula peli=new Pelicula(idProx,pelicula,genero);
			catalogo.add(peli);
			return true;
		}else {
			return false;
		}
	}
	
	
	public Pelicula traerPelicula(int idPelicula) {
		int i=0;
		
		if(idPelicula < 0 || idPelicula > catalogo.size()) {
			Genero genero=new Genero (-1,"error");
			Pelicula pelicula = new Pelicula(-1,"error",genero);
			return pelicula;
		}
		while(catalogo.get(i).getIdPelicula() != idPelicula && i < catalogo.size()) {
			i++;
			
		}
		
		return catalogo.get(i);
	}
	
	
	
	public List<Pelicula> traerPelicula(String partePelicula){
		List <Pelicula> encontrados = new ArrayList <Pelicula>();
			for(int i=0;i<catalogo.size();i++) {
				if(catalogo.get(i).getPelicula().contains(partePelicula)) {
					encontrados.add(catalogo.get(i));
				}
			}
			//Pelicula peli = new Pelicula(-1,"error");
			return encontrados;
	}
	
	
	public void modificarPelicula(int idPelicula,String pelicula) {
		boolean booleano=false;
		int pos=-1;
		for(int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i).getIdPelicula() == idPelicula) {
				booleano=true;
				pos=i;
			}
		}
		
		if(booleano == true) {
			catalogo.get(pos).setPelicula(pelicula);
		}else{
			System.out.println("error");
		}
	}
	
	public boolean eliminarPelicula (int idPelicula) {
		if(idPelicula > catalogo.size() || idPelicula < 0) {
			return false;
		}else {
			catalogo.remove(idPelicula);
			return true;
		}
	}
	
	//SOBRECARGAR
	public List<Pelicula> traerPelicula(Genero genero){
		List <Pelicula> encontrados = new ArrayList <Pelicula>();
			for(int i=0;i<catalogo.size();i++) {
				if(catalogo.get(i).getGenero().getGenero().contains(genero.getGenero())) {
					encontrados.add(catalogo.get(i));
				}
			}
			//Pelicula peli = new Pelicula(-1,"error");
			return encontrados;
	}
	
	
}
