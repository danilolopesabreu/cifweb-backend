package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoVinculo
 */
@Entity
@Table(name = "D02TB204_TIPO_VINCULO")
public class TipoVinculo implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private byte nuTipoVinculo;
	private String noTipoVinculo;
	private String coTipoVinculo;
	private Set<CifComplemento> cifComplementos = new HashSet<CifComplemento>(0);

	public TipoVinculo() {
	}

	public TipoVinculo(byte nuTipoVinculo, String noTipoVinculo, String coTipoVinculo) {
		this.nuTipoVinculo = nuTipoVinculo;
		this.noTipoVinculo = noTipoVinculo;
		this.coTipoVinculo = coTipoVinculo;
	}

	public TipoVinculo(byte nuTipoVinculo, String noTipoVinculo, String coTipoVinculo,
			Set<CifComplemento> cifComplementos) {
		this.nuTipoVinculo = nuTipoVinculo;
		this.noTipoVinculo = noTipoVinculo;
		this.coTipoVinculo = coTipoVinculo;
		this.cifComplementos = cifComplementos;
	}

	@Id

	@Column(name = "NU_TIPO_VINCULO", unique = true, nullable = false, precision = 2, scale = 0)
	public byte getNuTipoVinculo() {
		return this.nuTipoVinculo;
	}

	public void setNuTipoVinculo(byte nuTipoVinculo) {
		this.nuTipoVinculo = nuTipoVinculo;
	}

	@Column(name = "NO_TIPO_VINCULO", nullable = false, length = 30)
	public String getNoTipoVinculo() {
		return this.noTipoVinculo;
	}

	public void setNoTipoVinculo(String noTipoVinculo) {
		this.noTipoVinculo = noTipoVinculo;
	}

	@Column(name = "CO_TIPO_VINCULO", nullable = false, length = 1)
	public String getCoTipoVinculo() {
		return this.coTipoVinculo;
	}

	public void setCoTipoVinculo(String coTipoVinculo) {
		this.coTipoVinculo = coTipoVinculo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoVinculo")
	public Set<CifComplemento> getCifComplementos() {
		return this.cifComplementos;
	}

	public void setCifComplementos(Set<CifComplemento> cifComplementos) {
		this.cifComplementos = cifComplementos;
	}

}
