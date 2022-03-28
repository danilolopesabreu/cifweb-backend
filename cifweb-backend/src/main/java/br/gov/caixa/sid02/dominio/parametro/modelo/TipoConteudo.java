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
 * TipoConteudo
 */
@Entity
@Table(name = "D02TB206_TIPO_CONTEUDO")
public class TipoConteudo implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	private byte nuTipoConteudo;
	private char coConteudo;
	private String noTipoConteudo;
	private Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros = new HashSet<CifSrvcoPrpreFrmro>(0);

	public TipoConteudo() {
	}

	public TipoConteudo(byte nuTipoConteudo, char coConteudo, String noTipoConteudo) {
		this.nuTipoConteudo = nuTipoConteudo;
		this.coConteudo = coConteudo;
		this.noTipoConteudo = noTipoConteudo;
	}

	public TipoConteudo(byte nuTipoConteudo, char coConteudo, String noTipoConteudo,
			Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros) {
		this.nuTipoConteudo = nuTipoConteudo;
		this.coConteudo = coConteudo;
		this.noTipoConteudo = noTipoConteudo;
		this.cifSrvcoPrpreFrmros = cifSrvcoPrpreFrmros;
	}

	@Id

	@Column(name = "NU_TIPO_CONTEUDO", unique = true, nullable = false, precision = 2, scale = 0)
	public byte getNuTipoConteudo() {
		return this.nuTipoConteudo;
	}

	public void setNuTipoConteudo(byte nuTipoConteudo) {
		this.nuTipoConteudo = nuTipoConteudo;
	}

	@Column(name = "CO_CONTEUDO", nullable = false, length = 1)
	public char getCoConteudo() {
		return this.coConteudo;
	}

	public void setCoConteudo(char coConteudo) {
		this.coConteudo = coConteudo;
	}

	@Column(name = "NO_TIPO_CONTEUDO", nullable = false, length = 30)
	public String getNoTipoConteudo() {
		return this.noTipoConteudo;
	}

	public void setNoTipoConteudo(String noTipoConteudo) {
		this.noTipoConteudo = noTipoConteudo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoConteudo")
	public Set<CifSrvcoPrpreFrmro> getCifSrvcoPrpreFrmros() {
		return this.cifSrvcoPrpreFrmros;
	}

	public void setCifSrvcoPrpreFrmros(Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros) {
		this.cifSrvcoPrpreFrmros = cifSrvcoPrpreFrmros;
	}

}
