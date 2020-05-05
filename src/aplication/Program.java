package aplication;

import model_dao.DaoFactory;
import model_dao.VendedorDao;
import model_entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		Vendedor vendedor = vendedorDao.findById(4);
		
		System.out.println(vendedor);
		
		
	}

}
