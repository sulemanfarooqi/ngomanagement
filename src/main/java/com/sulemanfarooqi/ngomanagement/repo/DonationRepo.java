package com.sulemanfarooqi.ngomanagement.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sulemanfarooqi.ngomanagement.entities.Donation;
import com.sulemanfarooqi.ngomanagement.entities.User;

public interface DonationRepo extends JpaRepository<Donation, Long>{

	void deleteDonationById(Long id);

	//User findUserById(Long id);
	Optional<Donation> findDonationById(Long id);
}
