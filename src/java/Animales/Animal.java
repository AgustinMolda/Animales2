package Animales;

public class Animal {
protected String tipo;

public Animal(String tipo) {
	super();
	this.tipo = tipo;
}

public void comer() {
	System.out.println("Comiendo");
}

public void respirar() {
	System.out.println("Respirando");
}

}
