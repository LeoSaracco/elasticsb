package ar.com.cdt.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import ar.com.cdt.dto.DTOProyectoPersona;

@Document(indexName = "persona")
public class Persona {

	@Id
	private String id;

	@Field(type = FieldType.Text)
	private String nombre;

	@Field(type = FieldType.Text)
	private String apellido;

	@Field(type = FieldType.Text)
	private String dni;

	@Field(type = FieldType.Text)
	private String fechaIngreso;

	@Field(type = FieldType.Text)
	private String numeroLegajo;

	@Field(type = FieldType.Text)
	private String fotoLegajo;

	@Field(type = FieldType.Text)
	private String telefono;

	@Field(type = FieldType.Text)
	private String telefonoSecundario;

	@Field(type = FieldType.Text)
	private String email;

	@Field(type = FieldType.Text)
	private String nacionalidad;

	@Field(type = FieldType.Text)
	private ArrayList<String> rol;

	@Field(type = FieldType.Text)
	private ArrayList<DTOProyectoPersona> proyectos;

	@Field(type = FieldType.Text)
	private ArrayList<String> skills;

	@Field(type = FieldType.Text)
	private String senority;

	@Field(type = FieldType.Boolean)
	private Boolean gestor;

	@Field(type = FieldType.Text)
	private String porcentajeContractual;

	@Field(type = FieldType.Text)
	private String porcentajeReal;

	@Field(type = FieldType.Text)
	private String horasMensualesPorContrato;

	@Field(type = FieldType.Text)
	private String horasReales;

	@Field(type = FieldType.Text)
	private String disponibilidad;

	@Field(type = FieldType.Text)
	private String empresa;
	
	@Field(type = FieldType.Text)
	private String observaciones;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(String numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public String getFotoLegajo() {
		return fotoLegajo;
	}

	public void setFotoLegajo(String fotoLegajo) {
		this.fotoLegajo = fotoLegajo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefonoSecundario() {
		return telefonoSecundario;
	}

	public void setTelefonoSecundario(String telefonoSecundario) {
		this.telefonoSecundario = telefonoSecundario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public ArrayList<String> getRol() {
		return rol;
	}

	public void setRol(ArrayList<String> rol) {
		this.rol = rol;
	}

	public ArrayList<DTOProyectoPersona> getProyectos() {
		return proyectos;
	}

	public void setProyectos(ArrayList<DTOProyectoPersona> proyectos) {
		this.proyectos = proyectos;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public String getSenority() {
		return senority;
	}

	public void setSenority(String senority) {
		this.senority = senority;
	}

	public Boolean getGestor() {
		return gestor;
	}

	public void setGestor(Boolean gestor) {
		this.gestor = gestor;
	}

	public String getPorcentajeContractual() {
		return porcentajeContractual;
	}

	public void setPorcentajeContractual(String porcentajeContractual) {
		this.porcentajeContractual = porcentajeContractual;
	}

	public String getPorcentajeReal() {
		return porcentajeReal;
	}

	public void setPorcentajeReal(String porcentajeReal) {
		this.porcentajeReal = porcentajeReal;
	}

	public String getHorasMensualesPorContrato() {
		return horasMensualesPorContrato;
	}

	public void setHorasMensualesPorContrato(String horasMensualesPorContrato) {
		this.horasMensualesPorContrato = horasMensualesPorContrato;
	}

	public String getHorasReales() {
		return horasReales;
	}

	public void setHorasReales(String horasReales) {
		this.horasReales = horasReales;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaIngreso=" + fechaIngreso + ", numeroLegajo=" + numeroLegajo + ", fotoLegajo=" + fotoLegajo
				+ ", telefono=" + telefono + ", telefonoSecundario=" + telefonoSecundario + ", email=" + email
				+ ", nacionalidad=" + nacionalidad + ", rol=" + rol + ", proyectos=" + proyectos + ", skills=" + skills
				+ ", senority=" + senority + ", gestor=" + gestor + ", porcentajeContractual=" + porcentajeContractual
				+ ", porcentajeReal=" + porcentajeReal + ", horasMensualesPorContrato=" + horasMensualesPorContrato
				+ ", horasReales=" + horasReales + ", disponibilidad=" + disponibilidad + ", empresa=" + empresa
				+ ", observaciones=" + observaciones + "]";
	}
}