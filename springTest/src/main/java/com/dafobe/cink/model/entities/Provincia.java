package com.dafobe.cink.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provincias")
public class Provincia {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private String code;
  @Column
  private String provincia;
	public String getCodProv() {
		return code;
	}
	public void setCodProv(String codProv) {
		this.code = codProv;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
