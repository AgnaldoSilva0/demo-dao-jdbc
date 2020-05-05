package model_dao;

import java.util.List;

import model_entities.Vendedor;

public interface VendedorDao {
	
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteById(Integer id);
	Vendedor findById(Integer id);
	List<Vendedor> findAll();

}
