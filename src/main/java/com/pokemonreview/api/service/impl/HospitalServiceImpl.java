package com.pokemonreview.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemonreview.api.models.Hospital;
import com.pokemonreview.api.repository.HospitalRepository;
import com.pokemonreview.api.service.HospitalService;



@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository hospitalrepo;

	@Override
	public Hospital saveHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		return hospitalrepo.save(hospital);
	}

	@Override
	public List<Hospital> getAllHospital() {
		// TODO Auto-generated method stub
		return hospitalrepo.findAll();
	}

	@Override
	public Hospital getHospitalById(Integer id) {
		// TODO Auto-generated method stub
		return hospitalrepo.findById(id).get();
	}

	@Override
	public void deleteHospital(Integer id) {
		// TODO Auto-generated method stub
		hospitalrepo.deleteById(id);
	}

	@Override
	public void editHospital(Hospital hospital2, Integer id) {
		// TODO Auto-generated method stub
		Hospital oldHospital = hospitalrepo.findById(id).get();
		oldHospital.setHospitalCity(hospital2.getHospitalCity());
		oldHospital.setHospitalName(hospital2.getHospitalName());

		hospitalrepo.save(oldHospital);

	}

}
