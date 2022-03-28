package br.gov.caixa.sid02.dominio.parametro.modelo;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CifCoreografiaId
 */
@Embeddable
public class CifCoreografiaId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;
	private int nuSequencialCifServico;
	private short nuFaixa;
	private int nuCoreografia;
	private int nuPacote;
	private Date inicioVigencia;

	public CifCoreografiaId() {
	}

	public CifCoreografiaId(byte nuAcao, byte nuModo, byte nuGrupo, int nuSequencialCifServico, short nuFaixa,
			int nuCoreografia, int nuPacote, Date inicioVigencia) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuFaixa = nuFaixa;
		this.nuCoreografia = nuCoreografia;
		this.nuPacote = nuPacote;
		this.inicioVigencia = inicioVigencia;
	}

	@Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)
	public byte getNuAcao() {
		return this.nuAcao;
	}

	public void setNuAcao(byte nuAcao) {
		this.nuAcao = nuAcao;
	}

	@Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)
	public byte getNuModo() {
		return this.nuModo;
	}

	public void setNuModo(byte nuModo) {
		this.nuModo = nuModo;
	}

	@Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)
	public byte getNuGrupo() {
		return this.nuGrupo;
	}

	public void setNuGrupo(byte nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	@Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)
	public int getNuSequencialCifServico() {
		return this.nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	@Column(name = "NU_FAIXA", nullable = false, precision = 4, scale = 0)
	public short getNuFaixa() {
		return this.nuFaixa;
	}

	public void setNuFaixa(short nuFaixa) {
		this.nuFaixa = nuFaixa;
	}

	@Column(name = "NU_COREOGRAFIA", nullable = false, precision = 5, scale = 0)
	public int getNuCoreografia() {
		return this.nuCoreografia;
	}

	public void setNuCoreografia(int nuCoreografia) {
		this.nuCoreografia = nuCoreografia;
	}

	@Column(name = "NU_PACOTE", nullable = false, precision = 5, scale = 0)
	public int getNuPacote() {
		return this.nuPacote;
	}

	public void setNuPacote(int nuPacote) {
		this.nuPacote = nuPacote;
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
		return Objects.hash(inicioVigencia, nuAcao, nuCoreografia, nuFaixa, nuGrupo, nuModo, nuPacote,
				nuSequencialCifServico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CifCoreografiaId other = (CifCoreografiaId) obj;
		return Objects.equals(inicioVigencia, other.inicioVigencia) && nuAcao == other.nuAcao
				&& nuCoreografia == other.nuCoreografia && nuFaixa == other.nuFaixa && nuGrupo == other.nuGrupo
				&& nuModo == other.nuModo && nuPacote == other.nuPacote
				&& nuSequencialCifServico == other.nuSequencialCifServico;
	}

}
