package exerciciojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import exerciciojpa.entities.Modelo;

public class ModeloDaoImp implements ModeloDao {
	
	EntityManager entityManager;
	
	public ModeloDaoImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void insert(Modelo obj) {
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.getTransaction().commit();
	}

	public void update(Modelo obj) {
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.getTransaction().commit();
		
	}

	public void deleteByid(Integer id) {
		entityManager.getTransaction().begin();
		entityManager.remove(this.findByid(id));
		entityManager.getTransaction().commit();
	}

	public Modelo findByid(Integer id) {
		return entityManager.find(Modelo.class, id);
	}

	public List<Modelo> findAll() {
		Query query = entityManager.createQuery("SELECT m FROM modelo m");
		return query.getResultList();
	}

}
