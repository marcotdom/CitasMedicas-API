package com.Proy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Proy.dto.CitaDTO;
import com.Proy.repository.ICitasMedicasRepositorio;

@Service
public class CitasMedicasService implements ICitasMedicasService{
	
	@Autowired
	private ICitasMedicasRepositorio citasMedicasRepositorio;
	
	public CitasMedicasService() {
		super();
	}
	
	public CitasMedicasService(ICitasMedicasRepositorio citasMedicasRepositorio) {
		super();
		this.citasMedicasRepositorio = citasMedicasRepositorio;
	}



	@Override
	public List<CitaDTO> obtenerCitas(int idMedico,String fecha) {
		// TODO Auto-generated method stub
		return this.citasMedicasRepositorio.findfindBy(idMedico,fecha);
	}
	
	@Override
	public CitaDTO guardarCita(CitaDTO cita) {
		return this.citasMedicasRepositorio.save(cita);
	}

}
