package com.mattmoldovan.loginandreg.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mattmoldovan.loginandreg.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findByEmail(String email);
}
