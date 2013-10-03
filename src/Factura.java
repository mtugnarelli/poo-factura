
class Factura {

	private double total;
	
	private int itemsTotales;
	
	private int unidadesTotales;
	
	/**
	 * post: la Factura queda inicializada sin items. 
	 */
	public Factura() {
		
		total = 0.0;
		itemsTotales = 0;
		unidadesTotales = 0;
	}
	
	/**
	 * post: devuelve el total acumulado por todos los items de la factura.
	 */
	public double calcularTotal() {
		
		return total;
	}
	
	/**
	 * pre : cantidad es mayor a 0, precio unitario es mayor a 0.0
	 * post: suma a la factura cantidad items con precioUnitario. 
	 */
	public void agregarItem(int cantidad, double precioUnitario) {
		
		if ((cantidad > 0) && (precioUnitario >= 0)) {
			
			total = total + (cantidad * precioUnitario);
			
			itemsTotales = itemsTotales + 1;
			unidadesTotales = unidadesTotales + cantidad;
		}
	}
	
	/**
	 * post: devuelve la cantidad de items que fueron agregados.
	 */
	public int contarItemsTotales() {
		
		return itemsTotales;
	}

	/**
	 * post: devuelve la cantidad total de unidades agregadas.
	 */
	public int contarUnidadesTotales() {
		
		return unidadesTotales;
	}
	
	/**
	 * pre : descuento está en el rango [0,100]
	 * post: aplica el descuento indicado sobre el total de la factura.
	 */
	public void aplicarDescuento(double descuento) { 
		
		if ((descuento >= 0) && (descuento <= 100)) {
			
			total = total - (descuento * total / 100);
		}
	}
}
