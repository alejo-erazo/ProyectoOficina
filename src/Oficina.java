import java.util.PriorityQueue;

public class Oficina {
	
	PriorityQueue<Asesor> colaAsesores = new PriorityQueue<Asesor>();
	
	public void agregarAsesor(Asesor asesor) {
		colaAsesores.add(asesor);
	}
	
	// metodo para calcular el total que va a pagar la empresa en bonificaciones
	
	public float calcularTotalPagoComisiones () {
		float pagoComisiones = 0;
		for (Asesor asesor : colaAsesores)	{
			pagoComisiones=pagoComisiones + asesor.totalcomision ;
		}	
		 return pagoComisiones;
	}
	
	//metodo para imprimir las ventas que lleva cada asesor
	
	public void mostrarVentasAsesor () {
		float pagoComisiones = 0;
		
		//con este ciclo ingreso al primer nivel que son los asesores y recorro esa cola de asesores
		
		for (Asesor asesor : colaAsesores)	{
			System.out.println("El asesor "+ asesor.nombre + " presenta las siguientes ventas: " );
			
			//con este ciclo anidado ingreso a un segundo nivel dentro de cada asesor para recorrer 
			//la lista de ventas de cada asesor e imprimirlas
			
			for (Venta listaVentas  : asesor.listaVentas)	{
				System.out.println(listaVentas.tipo );	
				
			}
			System.out.println("");
			System.out.println("Recibira de comision por la ventas un total de: " +  asesor.totalcomision);
			System.out.println("");
			System.out.println("");
		}
	}
	
	//metodo para buscar informacion de un asesor en particular
	
		public void buscarAsesor (String nombre) {
			
			for (Asesor asesor : colaAsesores)	{
					if (asesor.nombre.equals(nombre)) {
						System.out.println("El asesor " + asesor.nombre + " presenta una comision total de " + asesor.totalcomision);
						for (Venta listaVentas  : asesor.listaVentas)	{
							System.out.println(listaVentas.tipo );				
						}
						return;
					}
				}
				
				System.out.println("El asesor buscado no existe");
			
			}	
	
}
