package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.gov.caixa.sid02.dominio.formulario.modelo.TipoExtracaoSlndo;

/**
 * TipoExtracao
 */
@Entity
@Table(name = "D02TB207_TIPO_EXTRACAO")
public class TipoExtracao implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private short nuTipoExtracao;
	private char coTipoExtracao;
	private String noTipoExtracao;
	private Set<TipoExtracaoCndo> tipoExtracaoCndos = new HashSet<TipoExtracaoCndo>(0);
	private Set<TipoExtracaoSlndo> tipoExtracaoSlndos = new HashSet<TipoExtracaoSlndo>(0);

	public TipoExtracao() {
	}

	public TipoExtracao(short nuTipoExtracao, char coTipoExtracao, String noTipoExtracao) {
		this.nuTipoExtracao = nuTipoExtracao;
		this.coTipoExtracao = coTipoExtracao;
		this.noTipoExtracao = noTipoExtracao;
	}

	public TipoExtracao(short nuTipoExtracao, char coTipoExtracao, String noTipoExtracao,
			Set<TipoExtracaoCndo> tipoExtracaoCndos, Set<TipoExtracaoSlndo> tipoExtracaoSlndos) {
		this.nuTipoExtracao = nuTipoExtracao;
		this.coTipoExtracao = coTipoExtracao;
		this.noTipoExtracao = noTipoExtracao;
		this.tipoExtracaoCndos = tipoExtracaoCndos;
		this.tipoExtracaoSlndos = tipoExtracaoSlndos;
	}

	@Id

	@Column(name = "NU_TIPO_EXTRACAO", unique = true, nullable = false, precision = 3, scale = 0)
	public short getNuTipoExtracao() {
		return this.nuTipoExtracao;
	}

	public void setNuTipoExtracao(short nuTipoExtracao) {
		this.nuTipoExtracao = nuTipoExtracao;
	}

	@Column(name = "CO_TIPO_EXTRACAO", nullable = false, length = 1)
	public char getCoTipoExtracao() {
		return this.coTipoExtracao;
	}

	public void setCoTipoExtracao(char coTipoExtracao) {
		this.coTipoExtracao = coTipoExtracao;
	}

	@Column(name = "NO_TIPO_EXTRACAO", nullable = false, length = 30)
	public String getNoTipoExtracao() {
		return this.noTipoExtracao;
	}

	public void setNoTipoExtracao(String noTipoExtracao) {
		this.noTipoExtracao = noTipoExtracao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoExtracao")
	public Set<TipoExtracaoCndo> getTipoExtracaoCndos() {
		return this.tipoExtracaoCndos;
	}

	public void setTipoExtracaoCndos(Set<TipoExtracaoCndo> tipoExtracaoCndos) {
		this.tipoExtracaoCndos = tipoExtracaoCndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoExtracao")
	public Set<TipoExtracaoSlndo> getTipoExtracaoSlndos() {
		return this.tipoExtracaoSlndos;
	}

	public void setTipoExtracaoSlndos(Set<TipoExtracaoSlndo> tipoExtracaoSlndos) {
		this.tipoExtracaoSlndos = tipoExtracaoSlndos;
	}

}
