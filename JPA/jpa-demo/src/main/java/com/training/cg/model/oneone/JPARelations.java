package com.training.cg.model.oneone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPARelations {
	
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
		
		Department dept = new Department();
		
		dept.setDept_name("Marketing");
		
		//Store department in DB table
		entityMgr.persist(dept);
		
		//create Employee 
		
		Employee emp = new Employee();
		
		emp.setEmp_name("Messi");
		
		emp.setEmp_salary(12000);
		
		emp.setEmp_desg("Director");
		
		emp.setDepartment(dept);
		
		entityMgr.persist(emp);
		
		entityMgr.getTransaction().commit();
		
		entityMgr.close();

	}

}
