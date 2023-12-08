package com.Proy.dto;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cita_medica")
public class CitaDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "hora")
	private String hora;

	@Column(name = "paciente")
	private String paciente;

	@Column(name = "correo")
	private String correo;

	@Column(name = "agente")
	private String agente;

	@Column(name = "idmedico")
	private int idMedico;

	public CitaDTO() {
		super();
	}

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getAgente() {
		return agente;
	}

	public void setAgente(String agente) {
		this.agente = agente;
	}

	public CitaDTO(int id, String fecha, String hora, String paciente, String correo, String agente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.paciente = paciente;
		this.correo = correo;
		this.agente = agente;
	}

	@Override
	public String toString() {
		return "CitaDTO [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", correo="
				+ correo + ", agente=" + agente + ", idMedico=" + idMedico + "]";
	}

}