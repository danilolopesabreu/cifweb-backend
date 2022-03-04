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
 * TipoPrpreFrmro
 */
@Entity
@Table(name = "D02TB205_TIPO_PRPRE_FRMRO")
public class TipoPrpreFrmro implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private short nuTipoPropriedadeFormulario;
	private String noTipoPropriedadeFormulario;
	private Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros = new HashSet<CifSrvcoPrpreFrmro>(0);

	public TipoPrpreFrmro() {
	}

	public TipoPrpreFrmro(short nuTipoPropriedadeFormulario, String noTipoPropriedadeFormulario) {
		this.nuTipoPropriedadeFormulario = nuTipoPropriedadeFormulario;
		this.noTipoPropriedadeFormulario = noTipoPropriedadeFormulario;
	}

	public TipoPrpreFrmro(short nuTipoPropriedadeFormulario, String noTipoPropriedadeFormulario,
			Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros) {
		this.nuTipoPropriedadeFormulario = nuTipoPropriedadeFormulario;
		this.noTipoPropriedadeFormulario = noTipoPropriedadeFormulario;
		this.cifSrvcoPrpreFrmros = cifSrvcoPrpreFrmros;
	}

	@Id

	@Column(name = "NU_TIPO_PROPRIEDADE_FORMULARIO", unique = true, nullable = false, precision = 3, scale = 0)
	public short getNuTipoPropriedadeFormulario() {
		return this.nuTipoPropriedadeFormulario;
	}

	public void setNuTipoPropriedadeFormulario(short nuTipoPropriedadeFormulario) {
		this.nuTipoPropriedadeFormulario = nuTipoPropriedadeFormulario;
	}

	@Column(name = "NO_TIPO_PROPRIEDADE_FORMULARIO", nullable = false, length = 30)
	public String getNoTipoPropriedadeFormulario() {
		return this.noTipoPropriedadeFormulario;
	}

	public void setNoTipoPropriedadeFormulario(String noTipoPropriedadeFormulario) {
		this.noTipoPropriedadeFormulario = noTipoPropriedadeFormulario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoPrpreFrmro")
	public Set<CifSrvcoPrpreFrmro> getCifSrvcoPrpreFrmros() {
		return this.cifSrvcoPrpreFrmros;
	}

	public void setCifSrvcoPrpreFrmros(Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros) {
		this.cifSrvcoPrpreFrmros = cifSrvcoPrpreFrmros;
	}

}
