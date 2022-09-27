package Animales;

public class AnimalsFactory {
	
	public static Depredador crearDepredador(String dep) {
		Depredador d = null;
			switch(dep) {
			case "guepardo":
				d = new Guepardo("Felino");
			default:
				System.out.println("No se pudo crear nada");
				
			}
		
		
		return d;
		
		
	}
}
