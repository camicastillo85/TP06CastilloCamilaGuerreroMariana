package ar.edu.ies6.punto01;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ies6.punto01.model.Producto;
import ar.edu.ies6.punto01.util.Categoria;
import ar.edu.ies6.punto01.util.Origen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Almacen de dato temporario
	//vector de tipo lista	
		
	List<Producto> almacenDeProductos = new ArrayList<Producto>();
		almacenDeProductos.add(new Producto("1abc","Celular",4887.92,Origen.CHINA,Categoria.TELEFONIA));
		almacenDeProductos.add(new Producto("2abc","Heladera",125320.9,Origen.BRASIL,Categoria.ELECTROHOGAR));
		almacenDeProductos.add(new Producto("3abc","Tablet",25766.8,Origen.URUGUAY,Categoria.INFORMATICA));
		almacenDeProductos.add(new Producto("4abc","Martillo",10000.9,Origen.ARGENTINA,Categoria.HERRAMIENTAS));
		System.out.println("Productos disponibles: " + almacenDeProductos);
		}
}
