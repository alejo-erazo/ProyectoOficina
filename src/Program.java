
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ListaVentas listaVentas= new ListaVentas();
		BufferedReader bf;
		bf = new BufferedReader(new FileReader("ArchivoVentas.txt"));
		int cantTipoVentas = Integer.parseInt(bf.readLine());
		String[] datos;
		for (int i = 0; i < cantTipoVentas; i++) {
			datos = bf.readLine().split(",");
			String tipo = datos[0];
			float valor = Float.parseFloat (datos [1]);
			int llave = Integer.parseInt(datos [2]);
			
			Venta venta  = new Venta (tipo , valor);
			
			listaVentas.agregarVenta(llave, venta);
			
		}
		
		// lectura de datos de los asesores
		
		Oficina oficina = new Oficina ();
		String[] datos1;
		BufferedReader bf2;
		bf2 = new BufferedReader(new FileReader("ArchivoAsesores.txt"));
		int cantAsesores = Integer.parseInt(bf2.readLine());
		for (int i = 0; i < cantAsesores; i++) {
			
			datos1 = bf2.readLine().split(",");
			String nombre = datos1[0];
			
			int cantVentas = Integer.parseInt(datos1 [1]);
			Asesor asesor = new Asesor(nombre , cantVentas);
			for (int j = 0; j < cantVentas; j++) {
				datos1 = bf2.readLine().split(",");
				int llave = Integer.parseInt(datos1 [0]);
				Venta venta = listaVentas.tablaVentas.get(llave);
				asesor.listaVentas.add(venta);
				
				
			}
			
			asesor.calcularComisionAsesor();
			oficina.agregarAsesor(asesor);
		}
		
		// finaliza la lectura de datos
		
		oficina.mostrarVentasAsesor();
		
		System.out.println("La oficina pagara un total de " +oficina.calcularTotalPagoComisiones() + " en comisiones");
		
		System.out.println();
		
		//System.out.println(listaVentas.tablaVentas.get(2).tipo);
		
		oficina.buscarAsesor("juan");
		
		
	}

	
	
}
