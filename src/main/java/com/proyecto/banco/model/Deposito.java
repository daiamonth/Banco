package com.proyecto.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "deposito")
public class Deposito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDepo;
	private Integer idCuenta;
	private double Cantidad;
	private double CuentaCredi;
	private double CuentaDebi;
	
	@ManyToOne
	private Cuenta cuenta;
	
	
	public Deposito(Integer id, Integer idCuenta, double cantidad, double cuentaCredi, double cuentaDebi) {
		super();
		this.idDepo = id;
		this.idCuenta = idCuenta;
		Cantidad = cantidad;
		CuentaCredi = cuentaCredi;
		CuentaDebi = cuentaDebi;
	}

	public Deposito() {
		
	}

	public Integer getId() {
		return idDepo;
	}

	public void setId(Integer id) {
		this.idDepo = id;
	}

	public Integer getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	public double getCantidad() {
		return Cantidad;
	}

	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
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

	@Override
	public String toString() {
		return "Deposito [id=" + idDepo + ", idCuenta=" + idCuenta + ", Cantidad=" + Cantidad + ", CuentaCredi="
				+ CuentaCredi + ", CuentaDebi=" + CuentaDebi + "]";
	}
	
	

}
