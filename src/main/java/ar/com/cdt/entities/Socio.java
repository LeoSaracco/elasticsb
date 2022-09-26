package ar.com.cdt.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "socios")
public class Socio {

	@Id
	private long id;

	@Field(type = FieldType.Text)
	private String nombreCompleto;
	private String ic;
	private String plan;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombreCompleto=" + nombreCompleto + ", ic=" + ic + ", plan=" + plan + "]";
	}
}