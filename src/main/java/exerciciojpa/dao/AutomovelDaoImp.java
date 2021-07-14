package exerciciojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import exerciciojpa.entities.Automovel;

public class AutomovelDaoImp implements AutomovelDao {
	
	EntityManager entityManager;
	
	public AutomovelDaoImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void insert(Automovel obj) {
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.getTransaction().commit();
	}

	public void update(Automovel obj) {
		entityManager.getTransaction().begin();
		entityManager.merge(obj);
		entityManager.getTransaction().commit();
		
	}

	public void deleteByid(Integer id) {
		entityManager.getTransaction().begin();
		entityManager.remove(this.findByid(id));
		entityManager.getTransaction().commit();
	}

	public Automovel findByid(Integer id) {
		return entityManager.find(Automovel.class, id);
	}

	public List<Automovel> findAll() {
		Query query = entityManager.createQuery("SELECT m FROM automovel m");
		return query.getResultList();
	}

}
