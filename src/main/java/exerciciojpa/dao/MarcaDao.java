package exerciciojpa.dao;

import java.util.List;
import exerciciojpa.entities.Marca;

public interface MarcaDao {
	
	void insert(Marca obj);
	void update(Marca obj);
	void deleteByid(Integer id);
	Marca findByid(Integer id);
	List<Marca> findAll();
	
}
