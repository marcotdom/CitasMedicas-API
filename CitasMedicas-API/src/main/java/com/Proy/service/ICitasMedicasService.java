package com.Proy.service;

import java.util.List;

import com.Proy.dto.CitaDTO;

public interface ICitasMedicasService {
	
	public List<CitaDTO> obtenerCitas(int idMedico,String fecha);
	
	public CitaDTO guardarCita(CitaDTO cita);

}
