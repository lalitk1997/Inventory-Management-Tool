package com.inventory.util;
import javax.persistence.*;

public class EMUtil {
	private static EntityManagerFactory emf;
	static{
		emf=Persistence.createEntityManagerFactory("inventoryUnit");
	}
	public static EntityManager provideEntityManager(){	
		EntityManager em= emf.createEntityManager();
		return em;
	}
}
