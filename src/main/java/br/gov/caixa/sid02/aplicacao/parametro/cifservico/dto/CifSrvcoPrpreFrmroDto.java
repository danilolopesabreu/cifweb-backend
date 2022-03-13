package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CifSrvcoPrpreFrmroDto {

	private TipoPrpreFrmroDto tipoPrpreFrmro;
	private TipoConteudoDto tipoConteudo;
	private char icObrigatorio;
	private char icHabilitado;
	private Date inicioVigencia;
	private Date fimVigencia;
	private String coUsuario;
	private Set<SistemaConteudoDto> sistemaConteudos = new HashSet<SistemaConteudoDto>(0);
	private Set<CanalConteudoDto> canalConteudos = new HashSet<CanalConteudoDto>(0);
	private Set<SaldoRsrvaSclCndoDto> saldoRsrvaSclCndos = new HashSet<SaldoRsrvaSclCndoDto>(0);
	private Set<DetalheDebitoCndoDto> detalheDebitoCndos = new HashSet<DetalheDebitoCndoDto>(0);
	private Set<FncneEspecialCndoDto> fncneEspecialCndos = new HashSet<FncneEspecialCndoDto>(0);
	private Set<PrpreFrmroSnlSaldoDto> prpreFrmroSnlSaldos = new HashSet<PrpreFrmroSnlSaldoDto>(0);
	private Set<TipoExtracaoCndoDto> tipoExtracaoCndos = new HashSet<TipoExtracaoCndoDto>(0);
	private Set<ClassificacaoCndoDto> classificacaoCndos = new HashSet<ClassificacaoCndoDto>(0);
	private Set<PrioridadeConteudoDto> prioridadeConteudos = new HashSet<PrioridadeConteudoDto>(0);

	public TipoPrpreFrmroDto getTipoPrpreFrmro() {
		return tipoPrpreFrmro;
	}

	public void setTipoPrpreFrmro(TipoPrpreFrmroDto tipoPrpreFrmro) {
		this.tipoPrpreFrmro = tipoPrpreFrmro;
	}

	public TipoConteudoDto getTipoConteudo() {
		return tipoConteudo;
	}

	public void setTipoConteudo(TipoConteudoDto tipoConteudo) {
		this.tipoConteudo = tipoConteudo;
	}

	public char getIcObrigatorio() {
		return icObrigatorio;
	}

	public void setIcObrigatorio(char icObrigatorio) {
		this.icObrigatorio = icObrigatorio;
	}

	public char getIcHabilitado() {
		return icHabilitado;
	}

	public void setIcHabilitado(char icHabilitado) {
		this.icHabilitado = icHabilitado;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Date getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public String getCoUsuario() {
		return coUsuario;
	}

	public void setCoUsuario(String coUsuario) {
		this.coUsuario = coUsuario;
	}

	public Set<SistemaConteudoDto> getSistemaConteudos() {
		return sistemaConteudos;
	}

	public void setSistemaConteudos(Set<SistemaConteudoDto> sistemaConteudos) {
		this.sistemaConteudos = sistemaConteudos;
	}

	public Set<CanalConteudoDto> getCanalConteudos() {
		return canalConteudos;
	}

	public void setCanalConteudos(Set<CanalConteudoDto> canalConteudos) {
		this.canalConteudos = canalConteudos;
	}

	public Set<SaldoRsrvaSclCndoDto> getSaldoRsrvaSclCndos() {
		return saldoRsrvaSclCndos;
	}

	public void setSaldoRsrvaSclCndos(Set<SaldoRsrvaSclCndoDto> saldoRsrvaSclCndos) {
		this.saldoRsrvaSclCndos = saldoRsrvaSclCndos;
	}

	public Set<DetalheDebitoCndoDto> getDetalheDebitoCndos() {
		return detalheDebitoCndos;
	}

	public void setDetalheDebitoCndos(Set<DetalheDebitoCndoDto> detalheDebitoCndos) {
		this.detalheDebitoCndos = detalheDebitoCndos;
	}

	public Set<FncneEspecialCndoDto> getFncneEspecialCndos() {
		return fncneEspecialCndos;
	}

	public void setFncneEspecialCndos(Set<FncneEspecialCndoDto> fncneEspecialCndos) {
		this.fncneEspecialCndos = fncneEspecialCndos;
	}

	public Set<PrpreFrmroSnlSaldoDto> getPrpreFrmroSnlSaldos() {
		return prpreFrmroSnlSaldos;
	}

	public void setPrpreFrmroSnlSaldos(Set<PrpreFrmroSnlSaldoDto> prpreFrmroSnlSaldos) {
		this.prpreFrmroSnlSaldos = prpreFrmroSnlSaldos;
	}

	public Set<TipoExtracaoCndoDto> getTipoExtracaoCndos() {
		return tipoExtracaoCndos;
	}

	public void setTipoExtracaoCndos(Set<TipoExtracaoCndoDto> tipoExtracaoCndos) {
		this.tipoExtracaoCndos = tipoExtracaoCndos;
	}

	public Set<ClassificacaoCndoDto> getClassificacaoCndos() {
		return classificacaoCndos;
	}

	public void setClassificacaoCndos(Set<ClassificacaoCndoDto> classificacaoCndos) {
		this.classificacaoCndos = classificacaoCndos;
	}

	public Set<PrioridadeConteudoDto> getPrioridadeConteudos() {
		return prioridadeConteudos;
	}

	public void setPrioridadeConteudos(Set<PrioridadeConteudoDto> prioridadeConteudos) {
		this.prioridadeConteudos = prioridadeConteudos;
	}

}
