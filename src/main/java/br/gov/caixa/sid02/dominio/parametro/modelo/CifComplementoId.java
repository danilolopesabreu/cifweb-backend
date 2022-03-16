package br.gov.caixa.sid02.dominio.parametro.modelo;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CifComplementoId
 */
@Embeddable
public class CifComplementoId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

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

	public static CifComplementoId of(CifServicoId cifServicoId) {
		CifComplementoId id = new CifComplementoId();
		id.setNuAcaoVinculador(cifServicoId.getNuAcao());
		id.setNuModoVinculador(cifServicoId.getNuModo());
		id.setNuGrupoVinculador(cifServicoId.getNuGrupo());
		id.setNuSqnclCifSrvcoVinculador(cifServicoId.getNuSequencialCifServico());
		return id;
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

	@Override
	public int hashCode() {
		return Objects.hash(inicioVigencia, nuAcaoVinculador, nuGrupoVinculador, nuModoVinculador,
				nuSqnclCifSrvcoVinculador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CifComplementoId other = (CifComplementoId) obj;
		return Objects.equals(inicioVigencia, other.inicioVigencia) && nuAcaoVinculador == other.nuAcaoVinculador
				&& nuGrupoVinculador == other.nuGrupoVinculador && nuModoVinculador == other.nuModoVinculador
				&& nuSqnclCifSrvcoVinculador == other.nuSqnclCifSrvcoVinculador;
	}

}
