package exerciciojpa.dao;

import java.util.List;
import exerciciojpa.entities.Automovel;

public interface AutomovelDao {
	
	void insert(Automovel obj);
	void update(Automovel obj);
	void deleteByid(Integer id);
	Automovel findByid(Integer id);
	List<Automovel> findAll();

}
