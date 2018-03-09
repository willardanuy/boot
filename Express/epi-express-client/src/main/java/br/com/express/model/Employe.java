package br.com.express.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_employe database table.
 * 
 */
@Entity
@Table(name="tb_employe")
@NamedQuery(name="TbEmploye.findAll", query="SELECT t FROM TbEmploye t")
public class Employe implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmployePK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="birth_date")
	private Date birthDate;

	private String email;

	private String employecol;

	@Column(name="external_id")
	private String externalId;

	@Lob
	private byte[] fingerprint;

	private String name;

	private String phone;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="register_date")
	private Date registerDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_date")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to TbOccupation
	@ManyToOne
	@JoinColumn(name="occupation_id")
	private Occupation tbOccupation;

	//bi-directional many-to-one association to TbSector
	@ManyToOne
	@JoinColumn(name="sector_id")
	private Sector tbSector;

	public Employe() {
	}

	public EmployePK getId() {
		return this.id;
	}

	public void setId(EmployePK id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployecol() {
		return this.employecol;
	}

	public void setEmployecol(String employecol) {
		this.employecol = employecol;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public byte[] getFingerprint() {
		return this.fingerprint;
	}

	public void setFingerprint(byte[] fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Occupation getTbOccupation() {
		return this.tbOccupation;
	}

	public void setTbOccupation(Occupation tbOccupation) {
		this.tbOccupation = tbOccupation;
	}

	public Sector getTbSector() {
		return this.tbSector;
	}

	public void setTbSector(Sector tbSector) {
		this.tbSector = tbSector;
	}

}