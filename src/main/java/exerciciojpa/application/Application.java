package exerciciojpa.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exerciciojpa.entities.Marca;

public class Application {

	public static void main(String[] args) {
			
		System.out.println("\n*** Versão 1 - Inicial ***");
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exerciciojpa");
		EntityManager em = emf.createEntityManager();
			
		em.getTransaction().begin();
			
		Marca marca = new Marca("BMW");
			
			
		em.persist(marca);
		em.getTransaction().commit();
		
	}
}
