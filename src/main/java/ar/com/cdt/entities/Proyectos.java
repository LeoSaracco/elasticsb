package ar.com.cdt.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "proyectos")
public class Proyectos {

	@Id
	private String id;

	@Field(type = FieldType.Text)
	private String descripcion;

	@Field(type = FieldType.Text)
	private String fechaInicio;

	@Field(type = FieldType.Text)
	private String fechaFin;

	@Field(type = FieldType.Text)
	private ArrayList<String> gestores;

	@Field(type = FieldType.Text)
	private ArrayList<String> empleados;

	@Field(type = FieldType.Text)
	private String observaciones;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public ArrayList<String> getGestores() {
		return gestores;
	}

	public void setGestores(ArrayList<String> gestores) {
		this.gestores = gestores;
	}

	public ArrayList<String> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<String> empleados) {
		this.empleados = empleados;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Proyectos [id=" + id + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", gestores=" + gestores + ", empleados=" + empleados + ", observaciones=" + observaciones
				+ "]";
	}
}