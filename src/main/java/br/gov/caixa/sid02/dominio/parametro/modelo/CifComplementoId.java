package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CifComplementoId
 */
@Embeddable
public class CifComplementoId implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private byte nuAcaoVinculador;
	private byte nuModoVinculador;
	private byte nuGrupoVinculador;
	private int nuSqnclCifSrvcoVinculador;
	private Date inicioVigencia;

	public CifComplementoId() {
	}

	public CifComplementoId(byte nuAcaoVinculador, byte nuModoVinculador, byte nuGrupoVinculador,
			int nuSqnclCifSrvcoVinculador, Date inicioVigencia) {
		this.nuAcaoVinculador = nuAcaoVinculador;
		this.nuModoVinculador = nuModoVinculador;
		this.nuGrupoVinculador = nuGrupoVinculador;
		this.nuSqnclCifSrvcoVinculador = nuSqnclCifSrvcoVinculador;
		this.inicioVigencia = inicioVigencia;
	}

	@Column(name = "NU_ACAO_VINCULADOR_200", nullable = false, precision = 2, scale = 0)
	public byte getNuAcaoVinculador() {
		return this.nuAcaoVinculador;
	}

	public void setNuAcaoVinculador(byte nuAcaoVinculador) {
		this.nuAcaoVinculador = nuAcaoVinculador;
	}

	@Column(name = "NU_MODO_VINCULADOR_200", nullable = false, precision = 2, scale = 0)
	public byte getNuModoVinculador() {
		return this.nuModoVinculador;
	}

	public void setNuModoVinculador(byte nuModoVinculador) {
		this.nuModoVinculador = nuModoVinculador;
	}

	@Column(name = "NU_GRUPO_VINCULADOR_200", nullable = false, precision = 2, scale = 0)
	public byte getNuGrupoVinculador() {
		return this.nuGrupoVinculador;
	}

	public void setNuGrupoVinculador(byte nuGrupoVinculador) {
		this.nuGrupoVinculador = nuGrupoVinculador;
	}

	@Column(name = "NU_SQNCL_CIF_SRVCO_VINCULADOR", nullable = false, precision = 9, scale = 0)
	public int getNuSqnclCifSrvcoVinculador() {
		return this.nuSqnclCifSrvcoVinculador;
	}

	public void setNuSqnclCifSrvcoVinculador(int nuSqnclCifSrvcoVinculador) {
		this.nuSqnclCifSrvcoVinculador = nuSqnclCifSrvcoVinculador;
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
				&& (this.getNuSqnclCifSrvcoVinculador() == castOther.getNuSqnclCifSrvcoVinculador())
				&& ((this.getInicioVigencia() == castOther.getInicioVigencia())
						|| (this.getInicioVigencia() != null && castOther.getInicioVigencia() != null
								&& this.getInicioVigencia().equals(castOther.getInicioVigencia())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNuAcaoVinculador();
		result = 37 * result + this.getNuModoVinculador();
		result = 37 * result + this.getNuGrupoVinculador();
		result = 37 * result + this.getNuSqnclCifSrvcoVinculador();
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
