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

/**
 * CmptoFncneEspecial
 */
@Entity
@Table(name = "D02TB265_CMPTO_FNCNE_ESPECIAL")
public class CmptoFncneEspecial implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private CmptoFncneEspecialId id;
	private SlctoManutencaoCif slctoManutencaoCif;
	private char coAbrangencia;
	private Character coComportamento;
	private Date fimVigencia;
	private String coUsuario;

	public CmptoFncneEspecial() {
	}

	public CmptoFncneEspecial(CmptoFncneEspecialId id, SlctoManutencaoCif slctoManutencaoCif, char coAbrangencia,
			String coUsuario) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.coAbrangencia = coAbrangencia;
		this.coUsuario = coUsuario;
	}

	public CmptoFncneEspecial(CmptoFncneEspecialId id, SlctoManutencaoCif slctoManutencaoCif, char coAbrangencia,
			Character coComportamento, Date fimVigencia, String coUsuario) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.coAbrangencia = coAbrangencia;
		this.coComportamento = coComportamento;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuSqnclSlctoMntnoCif", column = @Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuFuncionalidadeEspecial", column = @Column(name = "NU_FUNCIONALIDADE_ESPECIAL_P21", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public CmptoFncneEspecialId getId() {
		return this.id;
	}

	public void setId(CmptoFncneEspecialId id) {
		this.id = id;
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

	@Column(name = "CO_ABRANGENCIA", nullable = false, length = 1)
	public char getCoAbrangencia() {
		return this.coAbrangencia;
	}

	public void setCoAbrangencia(char coAbrangencia) {
		this.coAbrangencia = coAbrangencia;
	}

	@Column(name = "CO_COMPORTAMENTO", length = 1)
	public Character getCoComportamento() {
		return this.coComportamento;
	}

	public void setCoComportamento(Character coComportamento) {
		this.coComportamento = coComportamento;
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
