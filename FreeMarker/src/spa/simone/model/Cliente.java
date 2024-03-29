package spa.simone.model;

/**
 * @author Simone Spaccarotella {s.spaccarotella@reply.it}
 * 
 */
public abstract class Cliente {

	private String nome = "___";
	private String viaSedeLegale = "___";
	private String cittāSedeLegale = "___";
	private String provinciaSedeLegale = "___";
	private String rappresentanteLegale = "___";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getViaSedeLegale() {
		return viaSedeLegale;
	}

	public void setViaSedeLegale(String viaSedeLegale) {
		this.viaSedeLegale = viaSedeLegale;
	}

	public String getCittāSedeLegale() {
		return cittāSedeLegale;
	}

	public void setCittāSedeLegale(String cittāSedeLegale) {
		this.cittāSedeLegale = cittāSedeLegale;
	}

	public String getProvinciaSedeLegale() {
		return provinciaSedeLegale;
	}

	public void setProvinciaSedeLegale(String provinciaSedeLegale) {
		this.provinciaSedeLegale = provinciaSedeLegale;
	}

	public String getRappresentanteLegale() {
		return rappresentanteLegale;
	}

	public void setRappresentanteLegale(String rappresentanteLegale) {
		this.rappresentanteLegale = rappresentanteLegale;
	}

}