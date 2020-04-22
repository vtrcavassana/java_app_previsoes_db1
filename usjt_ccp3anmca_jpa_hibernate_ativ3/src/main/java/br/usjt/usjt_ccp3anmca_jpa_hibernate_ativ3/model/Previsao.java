package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_previsao")
public class Previsao {
	@Id
	@GeneratedValue
	private Long id;
	@Column (nullable=false, length=5)
	private String umidade;
	@Column (nullable=false, length=5)
	private String TempMin;
	@Column (nullable=false, length=5)
	private String TempMax;
	
	@OneToOne (optional = false)
	private Semana perfil;
	public Semana getPerfil() {
		return perfil;
	}
	public void setPerfil(Semana perfil) {
		this.perfil = perfil;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUmidade() {
		return umidade;
	}
	public void setUmidade(String umidade) {
		this.umidade = umidade;
	}
	public String getTempMin() {
		return TempMin;
	}
	public void setTempMin(String TempMin) {
		this.TempMin = TempMin;
	}
	public String getTempMax() {
		return TempMax;
	}
	public void setTempMax(String TempMax) {
		this.TempMax = TempMax;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Previsao other = (Previsao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;}}
