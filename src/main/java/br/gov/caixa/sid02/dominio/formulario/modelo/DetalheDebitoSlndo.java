package br.gov.caixa.sid02.dominio.formulario.modelo;


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.gov.caixa.sid02.dominio.parametro.modelo.TipoDetalheDebito;

/**
 * DetalheDebitoSlndo
 */
@Entity
@Table(name = "D02TB255_DETALHE_DEBITO_SLNDO")
public class DetalheDebitoSlndo implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private DetalheDebitoSlndoId id;
	private TipoDetalheDebito tipoDetalheDebito;
	private SlctoManutencaoCif slctoManutencaoCif;
	private Date fimVigencia;
	private String coUsuario;

	public DetalheDebitoSlndo() {
	}

	public DetalheDebitoSlndo(DetalheDebitoSlndoId id, TipoDetalheDebito tipoDetalheDebito,
			SlctoManutencaoCif slctoManutencaoCif, String coUsuario) {
		this.id = id;
		this.tipoDetalheDebito = tipoDetalheDebito;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.coUsuario = coUsuario;
	}

	public DetalheDebitoSlndo(DetalheDebitoSlndoId id, TipoDetalheDebito tipoDetalheDebito,
			SlctoManutencaoCif slctoManutencaoCif, Date fimVigencia, String coUsuario) {
		this.id = id;
		this.tipoDetalheDebito = tipoDetalheDebito;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSqnclSlctoMntnoCif", column = @Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuTipoDetalheDebito", column = @Column(name = "NU_TIPO_DETALHE_DEBITO_211", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public DetalheDebitoSlndoId getId() {
		return this.id;
	}

	public void setId(DetalheDebitoSlndoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NU_TIPO_DETALHE_DEBITO_211", nullable = false, insertable = false, updatable = false)
	public TipoDetalheDebito getTipoDetalheDebito() {
		return this.tipoDetalheDebito;
	}

	public void setTipoDetalheDebito(TipoDetalheDebito tipoDetalheDebito) {
		this.tipoDetalheDebito = tipoDetalheDebito;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", referencedColumnName = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_SEQUENCIAL_CIF_SERVICO_200", referencedColumnName = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_ACAO_200", referencedColumnName = "NU_ACAO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_MODO_200", referencedColumnName = "NU_MODO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_GRUPO_200", referencedColumnName = "NU_GRUPO_200", nullable = false, insertable = false, updatable = false) })
	public SlctoManutencaoCif getSlctoManutencaoCif() {
		return this.slctoManutencaoCif;
	}

	public void setSlctoManutencaoCif(SlctoManutencaoCif slctoManutencaoCif) {
		this.slctoManutencaoCif = slctoManutencaoCif;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FIM_VIGENCIA", length = 7)
	public Date getFimVigencia() {
		return this.fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	@Column(name = "CO_USUARIO", nullable = false, length = 8)
	public String getCoUsuario() {
		return this.coUsuario;
	}

	public void setCoUsuario(String coUsuario) {
		this.coUsuario = coUsuario;
	}

}
