package co.edu.uptc.restaurant.utiles;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("restaurant");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
	
	public static void main(String[] args) {
		EntityManager manager = EntityManagerUtil.getEntityManager();
		System.out.println("entity" + manager.getClass().getCanonicalName());
	}

}
