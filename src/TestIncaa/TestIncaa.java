package TestIncaa;
import Incaa.Incaa;
import Incaa.Genero;
import Incaa.Pelicula;
public class TestIncaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Incaa incaa=new Incaa();
		
		Genero Terror=new Genero(0,"Terror");
		Genero Accion=new Genero(1,"Accion");
		Genero Misterio=new Genero(2,"Misterio");
		
		
		incaa.agregarPelicula("Dragon ball",Accion);
		incaa.agregarPelicula("Bakugan",Misterio);
		incaa.agregarPelicula("Pokemon",Terror);
		incaa.agregarPelicula("Beyblade",Accion);
		incaa.agregarPelicula("Naruto",Accion);
		incaa.agregarPelicula("Dragon Ball Super",Accion);
		
		/*
		System.out.println(incaa.traerPelicula(0).getPelicula());
		System.out.println(incaa.traerPelicula(1).getPelicula());
		System.out.println(incaa.traerPelicula(2).getPelicula());
		System.out.println(incaa.traerPelicula(3).getPelicula());
		System.out.println(incaa.traerPelicula(4).getPelicula());
		
		System.out.println(incaa.traerPelicula(0).getIdPelicula());
		System.out.println(incaa.traerPelicula(1).getIdPelicula());
		System.out.println(incaa.traerPelicula(2).getIdPelicula());
		System.out.println(incaa.traerPelicula(3).getIdPelicula());
		System.out.println(incaa.traerPelicula(4).getIdPelicula());
		
		System.out.println(incaa.traerPelicula(5).getPelicula());
		System.out.println(incaa.traerPelicula(-3).getPelicula());
	
		
		
		
		
		System.out.println(incaa.traerPelicula("Dragon").get(1).getPelicula());
		
		incaa.modificarPelicula(2, "Power Rangers");
		
		System.out.println(incaa.eliminarPelicula(1));
		System.out.println(incaa.traerPelicula(0).getPelicula() +" "+ incaa.traerPelicula(0).getGenero().getGenero());
		
		//System.out.println(incaa.traerPelicula(1).getPelicula());
		System.out.println(incaa.traerPelicula(2).getPelicula() +" "+ incaa.traerPelicula(2).getGenero().getGenero());
		System.out.println(incaa.traerPelicula(3).getPelicula() +" "+ incaa.traerPelicula(3).getGenero().getGenero());
		System.out.println(incaa.traerPelicula(4).getPelicula() +" "+ incaa.traerPelicula(4).getGenero().getGenero());
		System.out.println(incaa.traerPelicula(5).getPelicula() +" "+ incaa.traerPelicula(5).getGenero().getGenero());
			*/
		
		System.out.println(incaa.traerPelicula(Accion).get(0).getPelicula());
		System.out.println(incaa.traerPelicula(Accion).get(1).getPelicula());
		System.out.println(incaa.traerPelicula(Accion).get(2).getPelicula());
		System.out.println(incaa.traerPelicula(Accion).get(3).getPelicula());
		
		System.out.println(incaa.traerPelicula(Terror).get(0).getPelicula());
	}

}
