package ar.edu.ies6.punto01.model;

import ar.edu.ies6.punto01.util.Categoria;
import ar.edu.ies6.punto01.util.Origen;

public class Producto {
	 String codigo;
	   String descripcion;
	   Double precioUnitario;
	   Origen origenFabricacion;
	   Categoria categoría;
//constructores	
	   public Producto() {
		// TODO Auto-generated constructor stub
	}
	public Producto(String codigo, String descripcion, Double precioUnitario, Origen origenFabricacion,
			Categoria categoría) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origenFabricacion = origenFabricacion;
		this.categoría = categoría;
	}
//metodos accesores
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Origen getOrigenFabricacion() {
		return origenFabricacion;
	}
	public void setOrigenFabricacion(Origen origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}
	public Categoria getCategoría() {
		return categoría;
	}
	public void setCategoría(Categoria categoría) {
		this.categoría = categoría;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", origenFabricacion=" + origenFabricacion + ", categoría=" + categoría + "]";
	}   
}
