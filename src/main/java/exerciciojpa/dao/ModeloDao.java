package exerciciojpa.dao;

import java.util.List;

import exerciciojpa.entities.Modelo;

public interface ModeloDao {
	
	void insert(Modelo obj);
	void update(Modelo obj);
	void deleteByid(Integer id);
	Modelo findByid(Integer id);
	List<Modelo> findAll();

}
