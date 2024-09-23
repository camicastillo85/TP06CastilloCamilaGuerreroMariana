package ar.edu.ies6.punto04;

import java.time.LocalDate;

import ar.edu.ies6.punto01.model.Producto;
import ar.edu.ies6.punto01.util.Categoria;
import ar.edu.ies6.punto01.util.Origen;
import ar.edu.ies6.punto04.model.Compra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//array de 10 productos
Producto[] productos = new Producto[10];
        productos[0] = new Producto("2abc","Celular A51",314887.92,Origen.CHINA,Categoria.TELEFONIA);
        productos[1] = new Producto("2","Televisor",482387.92,Origen.BRASIL,Categoria.ELECTROHOGAR);
        productos[2] = new Producto("12","Cocina",22387.62,Origen.ARGENTINA,Categoria.ELECTROHOGAR);
        productos[3] = new Producto("3","Destornillador",52387.20,Origen.URUGUAY,Categoria.HERRAMIENTAS);
        productos[4] = new Producto("4","Juego de mesa y sillas",679587.99,Origen.BRASIL,Categoria.ELECTROHOGAR);
        productos[5] = new Producto("5","Tablet",32387.92,Origen.ARGENTINA,Categoria.ELECTROHOGAR);
        productos[6] = new Producto("6","Licuadora",82387.52,Origen.CHINA,Categoria.ELECTROHOGAR);
        productos[7] = new Producto("7","Tenaza",42347.35,Origen.URUGUAY,Categoria.HERRAMIENTAS);
        productos[8] = new Producto("8","Computadora",890543.99,Origen.URUGUAY,Categoria.INFORMATICA);
        productos[9] = new Producto("9","Mouse",22382.5,Origen.BRASIL,Categoria.INFORMATICA);
       
//array para compras
Compra[] compras = new Compra[3];
        compras[0] = new Compra("compra01",LocalDate.now(),1,productos[0]);  
		compras[1] = new Compra("compra02",LocalDate.now(),2,productos[9]);
		compras[2] = new Compra("compra03",LocalDate.now(),1,productos[1]);

//mostrar las compras con metodo de imprimirRecibo
		for (Compra compra : compras) {
		compra.imprimirRecibo();	
		
		}	
		
		}

}
