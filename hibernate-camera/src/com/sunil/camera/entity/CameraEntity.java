package com.sunil.camera.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera")

public class CameraEntity implements Serializable {
	@Column(name = "c_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_brand")
	private String brand;
	@Column(name = "c_weight")
	private int weight;
	@Column(name = "c_pixel")
	private int pixel;
	@Column(name = "c_flash")
	private boolean flash;
	@Column(name = "c_hd")
	private boolean hd;
	@Column(name = "c_lens")
	private boolean lens;

	public CameraEntity() {
		// TODO Auto-generated constructor stub
	}

	public CameraEntity(String name, String brand, int weight, int pixel, boolean flash, boolean hd, boolean lens) {
		super();
		this.name = name;
		this.brand = brand;
		this.weight = weight;
		this.pixel = pixel;
		this.flash = flash;
		this.hd = hd;
		this.lens = lens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CameraEntity other = (CameraEntity) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CameraEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", weight=" + weight + ", pixel="
				+ pixel + ", flash=" + flash + ", hd=" + hd + ", lens=" + lens + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	public boolean isFlash() {
		return flash;
	}

	public void setFlash(boolean flash) {
		this.flash = flash;
	}

	public boolean isHd() {
		return hd;
	}

	public void setHd(boolean hd) {
		this.hd = hd;
	}

	public boolean isLens() {
		return lens;
	}

	public void setLens(boolean lens) {
		this.lens = lens;
	}

}
