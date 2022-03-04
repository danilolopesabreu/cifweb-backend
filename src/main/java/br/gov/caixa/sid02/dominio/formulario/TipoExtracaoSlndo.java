package br.gov.caixa.sid02.dominio.formulario;


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

import br.gov.caixa.sid02.dominio.parametro.modelo.TipoExtracao;

/**
 * TipoExtracaoSlndo
 */
@Entity
@Table(name = "D02TB253_TIPO_EXTRACAO_SLNDO")
public class TipoExtracaoSlndo implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private TipoExtracaoSlndoId id;
	private TipoExtracao tipoExtracao;
	private SlctoManutencaoCif slctoManutencaoCif;
	private Date fimVigencia;
	private String coUsuario;

	public TipoExtracaoSlndo() {
	}

	public TipoExtracaoSlndo(TipoExtracaoSlndoId id, TipoExtracao tipoExtracao, SlctoManutencaoCif slctoManutencaoCif,
			String coUsuario) {
		this.id = id;
		this.tipoExtracao = tipoExtracao;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.coUsuario = coUsuario;
	}

	public TipoExtracaoSlndo(TipoExtracaoSlndoId id, TipoExtracao tipoExtracao, SlctoManutencaoCif slctoManutencaoCif,
			Date fimVigencia, String coUsuario) {
		this.id = id;
		this.tipoExtracao = tipoExtracao;
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
			@AttributeOverride(name = "nuTipoExtracao", column = @Column(name = "NU_TIPO_EXTRACAO_207", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public TipoExtracaoSlndoId getId() {
		return this.id;
	}

	public void setId(TipoExtracaoSlndoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NU_TIPO_EXTRACAO_207", nullable = false, insertable = false, updatable = false)
	public TipoExtracao getTipoExtracao() {
		return this.tipoExtracao;
	}

	public void setTipoExtracao(TipoExtracao tipoExtracao) {
		this.tipoExtracao = tipoExtracao;
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
