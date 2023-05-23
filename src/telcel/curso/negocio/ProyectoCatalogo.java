package telcel.curso.negocio;

import telcel.curso.abstractas.*;
import telcel.curso.clases.*;
import java.util.Date;

public class ProyectoCatalogo {

	public static void main(String[] args) {
		Producto[] productos = new Producto[4];
		Electronico[] electronico = new Electronico[3];
		Date fecha = new Date();
		
		Producto libro = new Libro(50, fecha, "Tony Robins", "Habitos Atomicos", "Planeta");
		Producto libro2 = new Libro(150, fecha, "Oso Trava", "Haz lo que importa", "Propia");
		
		Producto comic = new Comics(55, fecha, "Tony Stark", "Iron Man", "Espanol", "Hulk");
		Producto comic2 = new Comics(14, fecha, "Jose Bolaños", "Cantarito en Hawuaii", "Sin", "Cantarito");
		
		 
		Electronico iphone1 = new Iphone("Apple", "Negro", "Iphone 14");
		Electronico iphone2 = new Iphone("Samsung", "Blanco", "S20");
		
		Electronico tvLcd = new TvLcd("LG", 50);
		
		productos[0] = libro;
		productos[1] = libro2;
		productos[2] = comic;
		productos[3] = comic2;
		
		electronico[0] = iphone1;
		electronico[1] = iphone2;
		electronico[2] = tvLcd;
		
		for (Producto item: productos) {
			System.out.println(" =========================== " + item.getClass().getSimpleName() + " =========================== ");			
			System.out.println("Precio: " + item.getPrecio());
			if(item instanceof Libro) {
				System.out.println(((Libro) item).getPrecio());
				System.out.println(((Libro) item).getAutor());
				System.out.println(((Libro) item).getEditora());
				System.out.println(((Libro) item).getTitulo());
				System.out.println(((Libro) item).getFechaPublicacion());
			}
			
			if(item instanceof Comics) {
				System.out.println(((Comics) item).getAutor());
				System.out.println(((Comics) item).getEditora());
				System.out.println(((Comics) item).getTitulo());
				System.out.println(((Comics) item).getFechaPublicacion());
				System.out.println(((Comics) item).getPrecio());
			}
		}
		
		for (Electronico items: electronico) {
			System.out.println(" =========================== " + items.getClass().getSimpleName() + " =========================== ");			
			if(items instanceof Iphone) {
				System.out.println(((Iphone) items).getFabricante());
				System.out.println(((Iphone) items).getColor());
				System.out.println(((Iphone) items).getModelo());
				System.out.println(((Iphone) items).getPrecio());				
			}
			if(items instanceof TvLcd) {
				System.out.println(((TvLcd) items).getFabricante());
				System.out.println(((TvLcd) items).getPulgada());						
			}
		}
		

	}

}
