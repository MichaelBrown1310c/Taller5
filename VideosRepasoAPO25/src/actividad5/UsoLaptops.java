package actividad5;

public class UsoLaptops {

	public static void main(String[] args) {
		
		
	Laptop Asus = new Laptop();
	
	Asus.estableceColor();
	System.out.println(Asus.dimeColor());
	
	Asus.establecePeso();
	System.out.println(Asus.dimePeso());
	
	System.out.println(Asus.dimeFabricante());
	
	Asus.estableceProcesador();
	System.out.println(Asus.dimeProcesador());
	
	Asus.estableceTactil();
	System.out.println(Asus.dimeTactil());
	
	Asus.estableceFabricante();

	System.out.println(Asus.dimeFabricante());
	
	Asus.estableceRam();
	System.out.println(Asus.dimeRam());
	
	Asus.estableceDisco();
	System.out.println(Asus.dimeDisco());

	
	
	
	}

}
