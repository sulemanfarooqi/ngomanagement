package com.sulemanfarooqi.ngomanagement.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sulemanfarooqi.ngomanagement.entities.Donation;
import com.sulemanfarooqi.ngomanagement.exception.DonationNotFoundException;
import com.sulemanfarooqi.ngomanagement.repo.DonationRepo;

@Service
public class DonationService {

	private final DonationRepo donationRepo;
	
	
	@Autowired
	public DonationService(DonationRepo donationRepo) {
		this.donationRepo = donationRepo;
	}
	
	public Donation addDonation(Donation donation) {
		//donation.setEmail(UUID.randomUUID().toString()); - Maybe to add a random donation code
		return donationRepo.save(donation);
	}
	
	public List<Donation> findAllDonations() {
		return donationRepo.findAll();
	}
	
	public Donation updateDonation(Donation donation) {
		return donationRepo.save(donation);
	}
	
	//public Donation findDonationById(Long id) {
	//	return donationRepo.findDonationById(id);
	//}
	
	public Donation findDonationById(Long id) {
		return donationRepo.findDonationById(id)
				.orElseThrow(() -> new DonationNotFoundException("Donation by id" + id + " was not found"));
	}
	
	public void deleteDonation(Long id) {
		donationRepo.deleteDonationById(id);
	}
}
