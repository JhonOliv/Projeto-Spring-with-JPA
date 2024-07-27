package edu.dio.projetojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.dio.projetojpa.model.*;
import edu.dio.projetojpa.repository.*;

@Component
public class StartedApp implements CommandLineRunner{
	@Autowired
	private UserRepository repository;

	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User usuario = new User();
		
		usuario.setNome("Jhonatan");
		usuario.setPassword("dio1234");
		usuario.setUserName("jsilva");
		repository.save(usuario);
		
		for (User u : repository.findAll()) {
			System.out.println(u);
		}
	}

}
