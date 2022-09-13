package Incaa;

public class Pelicula {
	private int idPelicula;
	private String pelicula;
	private Genero genero;
	
	
	//CONSTRUCTOR
	public Pelicula(int idPelicula,String pelicula,Genero genero) {
		this.idPelicula=idPelicula;
		this.pelicula=pelicula;
		this.genero=genero;
	}
	
	//GETTERS AND SETTERS
	public int getIdPelicula() {
		return idPelicula;
	}

	public String getPelicula() {
		return pelicula;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	
}
