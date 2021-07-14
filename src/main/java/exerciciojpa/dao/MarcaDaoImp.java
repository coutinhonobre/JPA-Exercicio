package exerciciojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import exerciciojpa.entities.Marca;

public class MarcaDaoImp implements MarcaDao {
	
	EntityManager entityManager;
	
	public MarcaDaoImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void insert(Marca obj) {
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.getTransaction().commit();
	}

	public void update(Marca obj) {
		entityManager.getTransaction().begin();
		entityManager.merge(obj);
		entityManager.getTransaction().commit();
		
	}

	public void deleteByid(Integer id) {
		entityManager.getTransaction().begin();
		entityManager.remove(this.findByid(id));
		entityManager.getTransaction().commit();
	}

	public Marca findByid(Integer id) {
		return entityManager.find(Marca.class, id);
	}

	public List<Marca> findAll() {
		Query query = entityManager.createQuery("SELECT m FROM Marca m");
		List<Marca> marcas = query.getResultList();
		return marcas;
	}

}
