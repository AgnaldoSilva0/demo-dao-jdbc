package aplication;

import java.util.Date;

import model_entities.Departamento;
import model_entities.Vendedor;

public class Program {

	public static void main(String[] args) {

		Departamento obj = new Departamento(1, "Livros");
		Vendedor vendedor = new Vendedor(21, "Bob", "Bob@gamil.com", new Date(), 3000.0, obj);
		System.out.println(vendedor);
		
	}

}
