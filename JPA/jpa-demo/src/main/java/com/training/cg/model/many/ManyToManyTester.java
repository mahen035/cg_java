package com.training.cg.model.many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToManyTester {
	
	private static final EntityManagerFactory emFactoryObj;
	
	private static final String PERSISTENCE_UNIT_NAME = "JPADemo";
	
	static {
		
		emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	public static EntityManager getEntityManager() {
		return emFactoryObj.createEntityManager();
	}

	public static void main(String[] args) {
		
		EntityManager  entityMgr = getEntityManager();
		
		entityMgr.getTransaction().begin();
		
		Clas clas1 = new Clas(0, "1st", null);
		Clas clas2 = new Clas(0, "2nd", null);
		Clas clas3 = new Clas(0, "3rd", null);
		
		entityMgr.persist(clas1);
		entityMgr.persist(clas2);
		entityMgr.persist(clas3);
		
		Set<Clas> clasSet1 = new HashSet<Clas>();
		clasSet1.add(clas1);
		clasSet1.add(clas2);
		clasSet1.add(clas3);
		
		Set<Clas> clasSet2 = new HashSet<Clas>();
		clasSet2.add(clas2);
		clasSet2.add(clas3);
		clasSet2.add(clas1);
		
		Teacher teacher1 = new Teacher(0, "Rohan", "JAVA", clasSet1);
		
		Teacher teacher2 = new Teacher(0, "Gopal", "C++", clasSet2);

		entityMgr.persist(teacher1);
		entityMgr.persist(teacher2);
		
		entityMgr.getTransaction().commit();
		
		entityMgr.close();

	}

}
