import java.util.Hashtable;

public class ListaVentas {
	
	Hashtable<Integer, Venta> tablaVentas = new Hashtable<Integer, Venta> ();
	
	public void agregarVenta (int llave, Venta valor) {
		tablaVentas.put(llave, valor);
		
		
	}


	}


