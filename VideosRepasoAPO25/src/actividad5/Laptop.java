package actividad5;

public class Laptop {

 String fabricante;
private int ram;
private int disco;
private String procesador;
private int pulgadas;
private Boolean tactil;


double peso; 
String color;
 
public Laptop(){
	
	fabricante = "Asus" ;
	ram = 16;
	disco = 512;
	procesador = "Core i7";
	pulgadas = 17;
	tactil = true;


}
	public String dimePulgadas() { //GETTER
		
		return "Esta Laptop tiene " + pulgadas +" pulgadas.";
		
	}
	
	public void estableceColor() { //SETTER
		
		color = "Rojo";
	}
	public String  dimeColor() {
		return "Esta Laptop tiene color " + color + ".";
		
	}
	public void establecePeso() {
		peso = 1.13;
	}
	public String dimePeso() {
		return "Esta Laptop pesa " + peso + " Kg.";
	}
}
