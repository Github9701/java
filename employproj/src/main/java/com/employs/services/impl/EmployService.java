package com.employs.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.employs.entities.Employ;
import com.employs.repos.EmployRepository;
import com.employs.services.ServiceInterface;


@org.springframework.stereotype.Service
public class EmployService implements ServiceInterface {
	
	@Autowired
	EmployRepository emprepo;

	@Override
	public Employ saveEmploy(Employ employ) {
		return emprepo.save(employ);
	}

	@Override
	public List<Employ> getAllEmploys() {
		return emprepo.findAll();
	}

	@Override
	public Employ getEmployById(int id) {
		Optional<Employ> employe = emprepo.findById(id);
		if (employe.isPresent()) {
			return employe.get();
		}else {
			throw new RuntimeException();
		}	
	}

	@Override
	public Employ updateEmploy(Employ employ, int id) {
		Employ existingEmploy = emprepo.findById(id).orElseThrow(()-> new RuntimeException());
		existingEmploy.setFname(employ.getFname());
		existingEmploy.setLname(employ.getLname());
		existingEmploy.setEmail(employ.getEmail());
		emprepo.save(existingEmploy);
		return existingEmploy;
	}

	@Override
	public void deleteEmployById(int id) {
		emprepo.findById(id).orElseThrow(()-> new RuntimeException());
		emprepo.deleteById(id);

	}

}
