package aplication;

import java.util.Date;

import model_dao.DaoFactory;
import model_dao.VendedorDao;
import model_entities.Departamento;
import model_entities.Vendedor;

public class Program {

	public static void main(String[] args) {

		Departamento obj = new Departamento(1, "Livros");
		Vendedor vendedor = new Vendedor(21, "Bob", "Bob@gamil.com", new Date(), 3000.0, obj);
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println(vendedor);
		
		
	}

}
