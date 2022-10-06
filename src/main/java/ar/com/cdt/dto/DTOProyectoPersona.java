package ar.com.cdt.dto;

public class DTOProyectoPersona {

	private String descripcion;

	private String inicio;

	private String fin;

	private Boolean facturable;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio.replace("/", "-");
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin.replace("/", "-");
	}

	public Boolean getFacturable() {
		return facturable;
	}

	public void setFacturable(Boolean facturable) {
		this.facturable = facturable;
	}

	@Override
	public String toString() {
		return "DTOProyectoPersona [descripcion=" + descripcion + ", inicio=" + inicio + ", fin=" + fin
				+ ", facturable=" + facturable + "]";
	}
}