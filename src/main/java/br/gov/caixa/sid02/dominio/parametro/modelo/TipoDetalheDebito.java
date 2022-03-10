package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.gov.caixa.sid02.dominio.formulario.modelo.DetalheDebitoSlndo;

/**
 * TipoDetalheDebito
 */
@Entity
@Table(name = "D02TB211_TIPO_DETALHE_DEBITO")
public class TipoDetalheDebito implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private short nuTipoDetalheDebito;
	private String ETipoDetalheDebito;
	private Set<DetalheDebitoCndo> detalheDebitoCndos = new HashSet<DetalheDebitoCndo>(0);
	private Set<DetalheDebitoSlndo> detalheDebitoSlndos = new HashSet<DetalheDebitoSlndo>(0);

	public TipoDetalheDebito() {
	}

	public TipoDetalheDebito(short nuTipoDetalheDebito) {
		this.nuTipoDetalheDebito = nuTipoDetalheDebito;
	}

	public TipoDetalheDebito(short nuTipoDetalheDebito, String ETipoDetalheDebito,
			Set<DetalheDebitoCndo> detalheDebitoCndos, Set<DetalheDebitoSlndo> detalheDebitoSlndos) {
		this.nuTipoDetalheDebito = nuTipoDetalheDebito;
		this.ETipoDetalheDebito = ETipoDetalheDebito;
		this.detalheDebitoCndos = detalheDebitoCndos;
		this.detalheDebitoSlndos = detalheDebitoSlndos;
	}

	@Id

	@Column(name = "NU_TIPO_DETALHE_DEBITO", unique = true, nullable = false, precision = 3, scale = 0)
	public short getNuTipoDetalheDebito() {
		return this.nuTipoDetalheDebito;
	}

	public void setNuTipoDetalheDebito(short nuTipoDetalheDebito) {
		this.nuTipoDetalheDebito = nuTipoDetalheDebito;
	}

	@Column(name = "DE_TIPO_DETALHE_DEBITO", length = 30)
	public String getETipoDetalheDebito() {
		return this.ETipoDetalheDebito;
	}

	public void setETipoDetalheDebito(String ETipoDetalheDebito) {
		this.ETipoDetalheDebito = ETipoDetalheDebito;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoDetalheDebito")
	public Set<DetalheDebitoCndo> getDetalheDebitoCndos() {
		return this.detalheDebitoCndos;
	}

	public void setDetalheDebitoCndos(Set<DetalheDebitoCndo> detalheDebitoCndos) {
		this.detalheDebitoCndos = detalheDebitoCndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoDetalheDebito")
	public Set<DetalheDebitoSlndo> getDetalheDebitoSlndos() {
		return this.detalheDebitoSlndos;
	}

	public void setDetalheDebitoSlndos(Set<DetalheDebitoSlndo> detalheDebitoSlndos) {
		this.detalheDebitoSlndos = detalheDebitoSlndos;
	}

}
