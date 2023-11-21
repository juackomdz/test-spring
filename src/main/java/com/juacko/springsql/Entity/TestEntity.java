package com.juacko.springsql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Entidad")
public class TestEntity {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "NOMBRE_COMPLETO")
	private String nombreCompleto;
	
	@Column(name = "RUT")
	private int rut;

	public int getRut() {
		return rut;
	}

	public void setRun(int rut) {
		this.rut = rut;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
