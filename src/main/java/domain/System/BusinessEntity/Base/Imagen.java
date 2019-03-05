package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the imagen database table.
 * 
 */
@Entity
@Table(name="imagen")
@NamedQuery(name="Imagen.findAll", query="SELECT i FROM Imagen i")
public class Imagen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idimagen;

	private Timestamp createdate;

	@Column(name="DESCRIPTION")
	private String description;

	private int idclothing;

	private int idusercreate;

	@Lob
	private byte[] imagendata;

	private String position4d;

	@Column(name="STATUS")
	private byte status;

	private Timestamp updatedate;

	private String url;

	public Imagen() {
	}

	public int getIdimagen() {
		return this.idimagen;
	}

	public void setIdimagen(int idimagen) {
		this.idimagen = idimagen;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdclothing() {
		return this.idclothing;
	}

	public void setIdclothing(int idclothing) {
		this.idclothing = idclothing;
	}

	public int getIdusercreate() {
		return this.idusercreate;
	}

	public void setIdusercreate(int idusercreate) {
		this.idusercreate = idusercreate;
	}

	public byte[] getImagendata() {
		return this.imagendata;
	}

	public void setImagendata(byte[] imagendata) {
		this.imagendata = imagendata;
	}

	public String getPosition4d() {
		return this.position4d;
	}

	public void setPosition4d(String position4d) {
		this.position4d = position4d;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}