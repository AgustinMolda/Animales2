package Animales;

public class Guepardo extends Animal implements Depredador {

	private int edad;
	private int sexo;
	
	
	public Guepardo(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}
	
	public void dormir() {
		System.out.println("Roncando");
	}
	
	public String grunir() {
		return "GGGGRRRRRR";
	}
	
	public void reproducirce() {
		System.out.println("ha si si dame mas si si");
	}
	
	@Override
	public String toString() {
		return "Guepardo [edad=" + edad + ", sexo=" + sexo + "]";
	}

	public void acechar() {
		System.out.println("Achando");

	}

	public void atacar() {
		
		System.out.println("Zarpaso mordida zarpaso");

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

}
