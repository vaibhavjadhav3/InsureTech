package com.pokemonreview.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemonreview.api.models.Hospital;


public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
