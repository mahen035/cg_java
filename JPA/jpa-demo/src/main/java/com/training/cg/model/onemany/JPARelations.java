package com.training.cg.model.onemany;

import java.util.ArrayList;
import java.util.List;

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
		
		Employee1 emp1 = new Employee1();
		
		emp1.setEmp_name("Ronaldo");
		
		emp1.setEmp_salary(24000);
		
		emp1.setEmp_desg("VP");
				
		Employee1 emp2 = new Employee1();
		
		emp2.setEmp_name("Elvis");
		
		emp2.setEmp_salary(15000);
		
		emp2.setEmp_desg("Executive");
		
		Employee1 emp3 = new Employee1();
		
		emp3.setEmp_name("Rahul");
		
		emp3.setEmp_salary(5000);
		
		emp3.setEmp_desg("Manager");
		
		
		
		Employee1 emp4 = new Employee1();
		
		emp4.setEmp_name("Vikas");
		
		emp4.setEmp_salary(3000);
		
		emp4.setEmp_desg("Consultant");
		
		//Store employee objects
		entityMgr.persist(emp1);
		entityMgr.persist(emp2);
		entityMgr.persist(emp3);
		entityMgr.persist(emp4);
		
		List<Employee1> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		
		List<Employee1> empList1 = new ArrayList<>();
		empList1.add(emp3);
		empList1.add(emp4);
		
		Department1 dept1 = new Department1();
		
		emp1.setDept(dept1);
		dept1.setDept_name("Sales");
		dept1.setEmpList(empList);
		
		Department1 dept2 = new Department1();
		
		dept2.setDept_name("Accounts");
		dept2.setEmpList(empList1);
		emp2.setDept(dept2);
		emp3.setDept(dept2);
		//Store department in DB table
		entityMgr.persist(dept1);
		entityMgr.persist(dept2);
				
		entityMgr.getTransaction().commit();
		
		entityMgr.close();

	}

}
