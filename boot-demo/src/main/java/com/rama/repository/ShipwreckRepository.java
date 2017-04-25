package com.rama.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rama.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
