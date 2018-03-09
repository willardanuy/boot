package br.com.express.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_epi database table.
 * 
 */
@Entity
@Table(name="tb_epi")
@NamedQuery(name="TbEpi.findAll", query="SELECT t FROM TbEpi t")
public class Epi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	private String barcode;

	private String ca;

	private String description;

	@Column(name="external_id")
	private String externalId;

	private String name;

	private byte status;

	@Temporal(TemporalType.TIMESTAMP)
	private Date validate;

	public Epi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getCa() {
		return this.ca;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Date getValidate() {
		return this.validate;
	}

	public void setValidate(Date validate) {
		this.validate = validate;
	}

}