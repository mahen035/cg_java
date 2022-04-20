package com.training.springdatarest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.training.springdatarest.model.User;

@RepositoryRestResource(path="players")
public interface UserRepository extends JpaRepository<User,Long>{
	
	 List<User> findByLastName(@Param("lastName") String lastName);
	 
	 @Transactional
	 @Modifying
	 @Query("delete from User u where u.lastName= :lastName")
	 void deleteByLastName(@Param("lastName") String lastName);
}
