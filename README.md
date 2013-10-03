UNTreF - Algoritmos y Programación 1

# Práctica de Encapsulamiento - Factura

### Enunciado

Implementar la clase `Factura`.

### Interfaz:

```java

class Factura {

	/**
	 * post: la Factura queda inicializada sin items. 
	 */
	public Factura()
	
	/**
	 * post: devuelve el total acumulado por todos los items de la factura.
	 */
	public double calcularTotal()
	
	/**
	 * pre : cantidad es mayor a 0, precio unitario es mayor a 0.0
	 * post: suma a la factura cantidad items con precioUnitario. 
	 */
	public void agregarItem(int cantidad, double precioUnitario)
	
	/**
	 * post: devuelve la cantidad de items que fueron agregados.
	 */
	public int contarItemsTotales()

	/**
	 * post: devuelve la cantidad total de unidades agregadas.
	 */
	public int contarUnidadesTotales()
	
	/**
	 * pre : descuento está en el rango [0,100]
	 * post: aplica el descuento indicado sobre el total de la factura.
	 */
	public void aplicarDescuento(double descuento)
}

```

### Solución

`Factura.java` [ver](../master/src/Factura.java)

