package ar.edu.ies6.punto04.model;

import java.time.LocalDate;

import ar.edu.ies6.punto01.model.Producto;


public class Compra {
   private String codigo;
   private LocalDate fechaDeCompra;
   private int cantidad;
   private Producto productos;
   
 //constructores   
   public Compra() {
	// TODO Auto-generated constructor stub
   	   
}

    public Compra(String codigo, LocalDate fechaDeCompra, int cantidad, Producto productos) {
	super();
	this.codigo = codigo;
	this.fechaDeCompra = fechaDeCompra;
	this.cantidad = cantidad;
	this.productos = productos;
}
//metodos accesores
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(LocalDate fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProductos() {
		return productos;
	}

	public void setProductos(Producto productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Compra [codigo=" + codigo + ", fechaDeCompra=" + fechaDeCompra + ", cantidad=" + cantidad
				+ ", productos=" + productos + "]";
	}
	
//metodo para imprimir el recibo
	public void imprimirRecibo() {
		double precioTotal = productos.getPrecioUnitario() * cantidad;
		System.out.println("Código de su compra " + codigo);
		System.out.println("Fecha de la compra " + fechaDeCompra);
		System.out.println("Producto comprado " + productos.getDescripcion());
		System.out.println("Unidades compradas " + cantidad);
		System.out.println("Precio del producto " + productos.getPrecioUnitario());
		System.out.println("Precio total de la compra " + precioTotal);	
		
	}			
		
	}

