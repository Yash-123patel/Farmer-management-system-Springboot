package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Integer>{

	public List<Farmer> findByNameLike(String name);
}
