package br.com.express.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_sector database table.
 * 
 */
@Entity
@Table(name="tb_sector")
@NamedQuery(name="TbSector.findAll", query="SELECT t FROM TbSector t")
public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	private String description;

	private String name;

	//bi-directional many-to-one association to TbEmploye
	@OneToMany(mappedBy="tbSector")
	private List<Employe> tbEmployes;

	public Sector() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employe> getTbEmployes() {
		return this.tbEmployes;
	}

	public void setTbEmployes(List<Employe> tbEmployes) {
		this.tbEmployes = tbEmployes;
	}

	public Employe addTbEmploye(Employe tbEmploye) {
		getTbEmployes().add(tbEmploye);
		tbEmploye.setTbSector(this);

		return tbEmploye;
	}

	public Employe removeTbEmploye(Employe tbEmploye) {
		getTbEmployes().remove(tbEmploye);
		tbEmploye.setTbSector(null);

		return tbEmploye;
	}

}