package com.pokemonreview.api.service;

import java.util.List;

import com.pokemonreview.api.models.Hospital;


public interface HospitalService {

	public Hospital saveHospital(Hospital hospital);

	public List<Hospital> getAllHospital();

	public Hospital getHospitalById(Integer id);

	public void deleteHospital(Integer id);

	public void editHospital(Hospital hospital2, Integer id);

}
