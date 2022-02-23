package com.proyecto.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuentas")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCuenta;
	private double CuentaCredi;
	private double CuentaDebi;
	private double SaldoCuenta;
	private double SaldoCuentaNu;
	private double CantidadPrest;
	private Integer idDepo;
	private String PAutorizada;
	
	@ManyToOne
	private Usuario usuario;
	
	public Cuenta(){
		
	}
	
	
	
	public Cuenta(Integer id, double cuentaCredi, double cuentaDebi, double saldoCuenta, double saldoCuentaNu,
			double cantidadPrest, Integer idDepo, String pAutorizada, Usuario usuario) {
		super();
		this.idCuenta = id;
		CuentaCredi = cuentaCredi;
		CuentaDebi = cuentaDebi;
		SaldoCuenta = saldoCuenta;
		SaldoCuentaNu = saldoCuentaNu;
		CantidadPrest = cantidadPrest;
		this.idDepo = idDepo;
		PAutorizada = pAutorizada;
		this.usuario = usuario;
	}



	public Integer getId() {
		return idCuenta;
	}
	public void setId(Integer id) {
		this.idCuenta = id;
	}
	public double getCuentaCredi() {
		return CuentaCredi;
	}
	public void setCuentaCredi(double cuentaCredi) {
		CuentaCredi = cuentaCredi;
	}
	public double getCuentaDebi() {
		return CuentaDebi;
	}
	public void setCuentaDebi(double cuentaDebi) {
		CuentaDebi = cuentaDebi;
	}
	public double getSaldoCuenta() {
		return SaldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		SaldoCuenta = saldoCuenta;
	}
	public double getSaldoCuentaNu() {
		return SaldoCuentaNu;
	}
	public void setSaldoCuentaNu(double saldoCuentaNu) {
		SaldoCuentaNu = saldoCuentaNu;
	}
	public double getCantidadPrest() {
		return CantidadPrest;
	}
	public void setCantidadPrest(double cantidadPrest) {
		CantidadPrest = cantidadPrest;
	}
	public Integer getIdDepo() {
		return idDepo;
	}
	public void setIdDepo(Integer idDepo) {
		this.idDepo = idDepo;
	}
	public String getPAutorizada() {
		return PAutorizada;
	}
	public void setPAutorizada(String pAutorizada) {
		PAutorizada = pAutorizada;
	}
	
	
	@Override
	public String toString() {
		return "Cuenta [id=" + idCuenta + ", CuentaCredi=" + CuentaCredi + ", CuentaDebi=" + CuentaDebi + ", SaldoCuenta="
				+ SaldoCuenta + ", SaldoCuentaNu=" + SaldoCuentaNu + ", CantidadPrest=" + CantidadPrest + ", idDepo="
				+ idDepo + ", PAutorizada=" + PAutorizada + "]";
	}
	
	
	

}
