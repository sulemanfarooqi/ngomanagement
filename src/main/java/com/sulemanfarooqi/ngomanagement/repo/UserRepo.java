package com.sulemanfarooqi.ngomanagement.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sulemanfarooqi.ngomanagement.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {

	void deleteUserById(Long id);

	//User findUserById(Long id);
	Optional<User> findUserById(Long id);

}
