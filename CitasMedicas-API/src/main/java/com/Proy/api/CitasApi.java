package com.Proy.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Proy.dto.CitaDTO;
import com.Proy.service.CitasMedicasService;

@RestController
public class CitasApi {

	@Autowired
	private CitasMedicasService service;

	// EndPoint para consultar las citas medicas a traves
	// del medico [idMedico] y del dia [fecha]
	@RequestMapping(value = "/citasApi/{idMedico}/{fecha}", method = RequestMethod.GET)
	public List<CitaDTO> getAll2(@PathVariable int idMedico, @PathVariable String fecha) {
		return service.obtenerCitas(idMedico, fecha);
	}

	// EndPoint para almacenar las citas medicas
	@RequestMapping(value = "/citasApi/", method = RequestMethod.POST)
	public ResponseEntity<CitaDTO> postCita(@RequestBody CitaDTO nuevaCita) {
		CitaDTO cita;
		try {
			cita = service.guardarCita(nuevaCita);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(cita, HttpStatus.CREATED);

	}

}
