package exerciciojpa.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exerciciojpa.dao.MarcaDaoImp;
import exerciciojpa.entities.Marca;

public class Application {

	public static void main(String[] args) {
			
		System.out.println("\n*** Versão 1 - Inicial ***");
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exerciciojpa");
		EntityManager em = emf.createEntityManager();
			
//		em.getTransaction().begin();
//			
//		Marca marca = new Marca("BMW 2");
//		Marca marca2 = new Marca("VW");
//			
//			
//		em.persist(marca);
//		em.persist(marca);
//		em.getTransaction().commit();
		
		
		MarcaDaoImp marcaDao = new MarcaDaoImp(em);
		
//		Marca bmw = new Marca("BMW");
//		marcaDao.insert(new Marca("BMW"));
//		marcaDao.insert(new Marca("VW"));
		
		for (Marca m : marcaDao.findAll()) {
			System.out.println(m.getNome());
		}
		
		System.out.println("\n-=-=-=\n");
		//marcaDao.deleteByid(11);
		
		Marca marcaUpdate = marcaDao.findByid(4);
		marcaUpdate.setNome("GM");
		marcaDao.update(marcaUpdate);
		System.out.println("\n-=-=-=\n");
		
		
		for (Marca m : marcaDao.findAll()) {
			System.out.println(m.getNome());
		}
		
		
	}
}
