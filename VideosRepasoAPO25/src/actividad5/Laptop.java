package actividad5;

public class Laptop {

private String fabricante;
private int ram;
private int disco;
private String procesador;
private int pulgadas;
private String tactil;


double peso; 
String color;
 
public Laptop(){
	
	fabricante = "Asus" ;
	ram = 16;
	disco = 512;
	procesador = "Core i7";
	pulgadas = 17;
	tactil = "Si";


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
	
	public String dimeProcesador() {
		return "Esta Laptop tiene un procesador" + procesador;
	}
	
	public void estableceProcesador() {
		procesador = "core i7";
	}
	
	public String dimeTactil() {
		return "Esta laptop " + tactil + " tiene tactil";
	}
	
	public void estableceTactil() {
	 tactil = "si";
	}
	
	public String dimeFabricante() {
		return "Esta laptop fue fabricada por "+ fabricante ;
	}
	
	public void estableceFabricante() {
	 fabricante = "Asus";
	}
	
	public String dimeRam() {
		return "Esta laptop tiene "+ ram + "Gb de memoria ram";
	}
	
	public void estableceRam() {
	 ram = 16;
	}
	public String dimeDisco() {
		return "Esta laptop tiene " + disco + "Gb de espacio de almacenamiento";
	}
	
	public void estableceDisco() {
	 disco = 512;
	}
}
