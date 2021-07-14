package exerciciojpa.application;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exerciciojpa.dao.MarcaDaoImp;
import exerciciojpa.entities.Marca;
import exerciciojpa.view.TelaPrincipal;

public class Application {

	public static void main(String[] args) {
			
		Scanner console = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exerciciojpa");
		EntityManager em = emf.createEntityManager();
        try {
        	console = TelaPrincipal.menuPrincipal(console, em);
	    }
		catch(Exception e)	{
			System.out.println("Erro: " + e);
		}
		finally {
			em.close();
			emf.close();
		}
		
		
	}
}
