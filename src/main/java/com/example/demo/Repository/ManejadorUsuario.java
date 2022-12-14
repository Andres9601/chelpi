package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Usuario;


@Repository
public interface ManejadorUsuario extends JpaRepository<Usuario, String> {
	
	Optional<Usuario> findOneByEmail(String email);
}
