package com.Proy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Proy.dto.CitaDTO;

public interface ICitasMedicasRepositorio extends JpaRepository<CitaDTO, Long>{
	
	public final String consultaCitas = "SELECT id,idMedico,fecha,paciente,correo,agente,DATE_FORMAT(hora, \"%H:%i\") as hora "
			+ "from citasmedicas.cita_medica WHERE idMedico = ?1 AND DATE_FORMAT(fecha, \"%d-%m-%Y\") = ?2";
	
	
	@Query(nativeQuery = true,
    value = consultaCitas)
    public List<CitaDTO> findfindBy(int idMedico,String fecha);

}
