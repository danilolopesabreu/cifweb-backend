package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CifComplementoId
 */
@Embeddable
public class CifComplementoId implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private short nuAcaoVinculador;
	private short nuModoVinculador;
	private short nuGrupoVinculador;
	private int nuSqnclCifSrvcoVnclr;
	private Date inicioVigencia;

	public CifComplementoId() {
	}

	public CifComplementoId(short nuAcaoVinculador, short nuModoVinculador, short nuGrupoVinculador,
			int nuSqnclCifSrvcoVnclr, Date inicioVigencia) {
		this.nuAcaoVinculador = nuAcaoVinculador;
		this.nuModoVinculador = nuModoVinculador;
		this.nuGrupoVinculador = nuGrupoVinculador;
		this.nuSqnclCifSrvcoVnclr = nuSqnclCifSrvcoVnclr;
		this.inicioVigencia = inicioVigencia;
	}

	@Column(name = "NU_ACAO_VINCULADOR_200", nullable = false, precision = 3, scale = 0)
	public short getNuAcaoVinculador() {
		return this.nuAcaoVinculador;
	}

	public void setNuAcaoVinculador(short nuAcaoVinculador) {
		this.nuAcaoVinculador = nuAcaoVinculador;
	}

	@Column(name = "NU_MODO_VINCULADOR_200", nullable = false, precision = 3, scale = 0)
	public short getNuModoVinculador() {
		return this.nuModoVinculador;
	}

	public void setNuModoVinculador(short nuModoVinculador) {
		this.nuModoVinculador = nuModoVinculador;
	}

	@Column(name = "NU_GRUPO_VINCULADOR_200", nullable = false, precision = 3, scale = 0)
	public short getNuGrupoVinculador() {
		return this.nuGrupoVinculador;
	}

	public void setNuGrupoVinculador(short nuGrupoVinculador) {
		this.nuGrupoVinculador = nuGrupoVinculador;
	}

	@Column(name = "NU_SQNCL_CIF_SRVCO_VNCLR_200", nullable = false, precision = 9, scale = 0)
	public int getNuSqnclCifSrvcoVnclr() {
		return this.nuSqnclCifSrvcoVnclr;
	}

	public void setNuSqnclCifSrvcoVnclr(int nuSqnclCifSrvcoVnclr) {
		this.nuSqnclCifSrvcoVnclr = nuSqnclCifSrvcoVnclr;
	}

	@Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)
	public Date getInicioVigencia() {
		return this.inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CifComplementoId))
			return false;
		CifComplementoId castOther = (CifComplementoId) other;

		return (this.getNuAcaoVinculador() == castOther.getNuAcaoVinculador())
				&& (this.getNuModoVinculador() == castOther.getNuModoVinculador())
				&& (this.getNuGrupoVinculador() == castOther.getNuGrupoVinculador())
				&& (this.getNuSqnclCifSrvcoVnclr() == castOther.getNuSqnclCifSrvcoVnclr())
				&& ((this.getInicioVigencia() == castOther.getInicioVigencia())
						|| (this.getInicioVigencia() != null && castOther.getInicioVigencia() != null
								&& this.getInicioVigencia().equals(castOther.getInicioVigencia())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNuAcaoVinculador();
		result = 37 * result + this.getNuModoVinculador();
		result = 37 * result + this.getNuGrupoVinculador();
		result = 37 * result + this.getNuSqnclCifSrvcoVnclr();
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
