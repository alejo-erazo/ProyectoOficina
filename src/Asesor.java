import java.util.ArrayList;

public class Asesor implements Comparable<Asesor> {
	
	
	public String nombre;
	
	public float totalcomision;
	
	public int cantVentas;
	
	ArrayList <Venta> listaVentas = new ArrayList <Venta>();
	
		public Asesor(String nombre, int cantVentas) {
		super();
		this.nombre = nombre;
		this.cantVentas = cantVentas;
	}

		//metodo para calcular cuanta comision va a recibir cada asesor 
		
	public void calcularComisionAsesor () {
		float Comision = 0;
		for (Venta venta : listaVentas)	{
			Comision = Comision +venta.valor ;
		}	
		
		totalcomision = Comision;
	}
		
	@Override
	public int compareTo(Asesor otroAsesor) {
	
		return otroAsesor.cantVentas - this.cantVentas;
	}
		
	}
	


