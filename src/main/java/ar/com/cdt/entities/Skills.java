package ar.com.cdt.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "skills")
public class Skills {

	@Id
	private String id;

	@Field(type = FieldType.Text)
	private String descripcion;

	@Field(type = FieldType.Text)
	private String observacion;

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

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", descripcion=" + descripcion + ", observacion=" + observacion + "]";
	}
}