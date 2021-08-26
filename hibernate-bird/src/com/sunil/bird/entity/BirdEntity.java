package com.sunil.bird.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sunil.bird.constants.BirdType;

@Entity
@Table(name = "bird")
public class BirdEntity implements Serializable {

	@Column(name = "b_id")
	@Id
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_noOfWings")
	private int noOfWings;
	@Column(name = "b_feathers")
	private boolean feathers;
	@Column(name = "b_type")
	private BirdType type;
	@Column(name = "b_noOfClaws")
	private int noOfClaws;
	@Column(name = "b_featherQuill")
	private boolean featherQuill;
	@Column(name = "b_beak")
	private String beak;
	@Column(name = "b_swim")
	private boolean swim;

	public BirdEntity() {
		// TODO Auto-generated constructor stub
	}

	public BirdEntity(int id, String name, String color, int noOfWings, boolean feathers, BirdType type, int noOfClaws,
			boolean featherQuill, String beak, boolean swim) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.noOfWings = noOfWings;
		this.feathers = feathers;
		this.type = type;
		this.noOfClaws = noOfClaws;
		this.featherQuill = featherQuill;
		this.beak = beak;
		this.swim = swim;
	}

	@Override
	public String toString() {
		return "BirdDTO [id=" + id + ", name=" + name + ", color=" + color + ", noOfWings=" + noOfWings + ", feathers="
				+ feathers + ", type=" + type + ", noOfClaws=" + noOfClaws + ", featherQuill=" + featherQuill
				+ ", beak=" + beak + ", swim=" + swim + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		BirdEntity other = (BirdEntity) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWings() {
		return noOfWings;
	}

	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public BirdType getType() {
		return type;
	}

	public void setType(BirdType type) {
		this.type = type;
	}

	public int getNoOfClaws() {
		return noOfClaws;
	}

	public void setNoOfClaws(int noOfClaws) {
		this.noOfClaws = noOfClaws;
	}

	public boolean isFeatherQuill() {
		return featherQuill;
	}

	public void setFeatherQuill(boolean featherQuill) {
		this.featherQuill = featherQuill;
	}

	public String getBeak() {
		return beak;
	}

	public void setBeak(String beak) {
		this.beak = beak;
	}

	public boolean isSwim() {
		return swim;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}

}
