package edu.dio.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.dio.projetojpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer	>  {

}
