package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.gov.caixa.sid02.dominio.formulario.modelo.RsrvaSocialSlndo;

/**
 * SaldoReservaSocial
 */
@Entity
@Table(name = "D02TB209_SALDO_RESERVA_SOCIAL")
public class SaldoReservaSocial implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private short nuTipoAtrzaSaldoRsrvaScl;
	private String ETipoAtrzaSaldoRsrvaScl;
	private Set<SaldoRsrvaSclCndo> saldoRsrvaSclCndos = new HashSet<SaldoRsrvaSclCndo>(0);
	private Set<RsrvaSocialSlndo> rsrvaSocialSlndos = new HashSet<RsrvaSocialSlndo>(0);

	public SaldoReservaSocial() {
	}

	public SaldoReservaSocial(short nuTipoAtrzaSaldoRsrvaScl) {
		this.nuTipoAtrzaSaldoRsrvaScl = nuTipoAtrzaSaldoRsrvaScl;
	}

	public SaldoReservaSocial(short nuTipoAtrzaSaldoRsrvaScl, String ETipoAtrzaSaldoRsrvaScl,
			Set<SaldoRsrvaSclCndo> saldoRsrvaSclCndos, Set<RsrvaSocialSlndo> rsrvaSocialSlndos) {
		this.nuTipoAtrzaSaldoRsrvaScl = nuTipoAtrzaSaldoRsrvaScl;
		this.ETipoAtrzaSaldoRsrvaScl = ETipoAtrzaSaldoRsrvaScl;
		this.saldoRsrvaSclCndos = saldoRsrvaSclCndos;
		this.rsrvaSocialSlndos = rsrvaSocialSlndos;
	}

	@Id

	@Column(name = "NU_TIPO_ATRZA_SALDO_RSRVA_SCL", unique = true, nullable = false, precision = 3, scale = 0)
	public short getNuTipoAtrzaSaldoRsrvaScl() {
		return this.nuTipoAtrzaSaldoRsrvaScl;
	}

	public void setNuTipoAtrzaSaldoRsrvaScl(short nuTipoAtrzaSaldoRsrvaScl) {
		this.nuTipoAtrzaSaldoRsrvaScl = nuTipoAtrzaSaldoRsrvaScl;
	}

	@Column(name = "DE_TIPO_ATRZA_SALDO_RSRVA_SCL", length = 30)
	public String getETipoAtrzaSaldoRsrvaScl() {
		return this.ETipoAtrzaSaldoRsrvaScl;
	}

	public void setETipoAtrzaSaldoRsrvaScl(String ETipoAtrzaSaldoRsrvaScl) {
		this.ETipoAtrzaSaldoRsrvaScl = ETipoAtrzaSaldoRsrvaScl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "saldoReservaSocial")
	public Set<SaldoRsrvaSclCndo> getSaldoRsrvaSclCndos() {
		return this.saldoRsrvaSclCndos;
	}

	public void setSaldoRsrvaSclCndos(Set<SaldoRsrvaSclCndo> saldoRsrvaSclCndos) {
		this.saldoRsrvaSclCndos = saldoRsrvaSclCndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "saldoReservaSocial")
	public Set<RsrvaSocialSlndo> getRsrvaSocialSlndos() {
		return this.rsrvaSocialSlndos;
	}

	public void setRsrvaSocialSlndos(Set<RsrvaSocialSlndo> rsrvaSocialSlndos) {
		this.rsrvaSocialSlndos = rsrvaSocialSlndos;
	}

}
