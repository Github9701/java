package com.employs.services;

import java.util.List;

import com.employs.entities.Employ;

public interface ServiceInterface {
	Employ saveEmploy(Employ employ);
	List<Employ> getAllEmploys();
	Employ getEmployById(int id);
	Employ updateEmploy(Employ employ, int id);
	void deleteEmployById(int id);

}
