package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@Entity
@Table(name="GROUPS")
public class Group {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="groupSequence")
	@SequenceGenerator(name="groupSequence", allocationSize=1, sequenceName="SQ_GROUP_PK")
	@Column
	@JsonProperty
	private int id;
	
	@Column
	@JsonProperty
	private String name;
	
	public Group() {
		super();
	}
	
	public Group(String name) {
		super();
		this.name = name;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Group other = (Group) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + "]";
	}
	
}
