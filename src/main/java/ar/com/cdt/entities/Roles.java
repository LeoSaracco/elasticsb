package ar.com.cdt.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "roles")
public class Roles {

	@Id
	private String id;

	@Field(type = FieldType.Text)
	private String descripcion;

	@Field(type = FieldType.Text)
	private ArrayList<String> skills;

	@Field(type = FieldType.Text)
	private String senority;

	@Field(type = FieldType.Text)
	private String nivel;

	@Field(type = FieldType.Boolean)
	private Boolean requerido;

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

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Boolean getRequerido() {
		return requerido;
	}

	public void setRequerido(Boolean requerido) {
		this.requerido = requerido;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", descripcion=" + descripcion + ", skills=" + skills + ", senority=" + senority
				+ ", nivel=" + nivel + ", requerido=" + requerido + ", observaciones=" + observaciones + "]";
	}
}