package com.employs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employs.entities.Employ;
@Repository
public interface EmployRepository extends JpaRepository<Employ, Integer> {
	

}
