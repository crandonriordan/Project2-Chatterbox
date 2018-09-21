package com.revature.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Vote {

	// @Id
	// @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="voteSequence")
	// @SequenceGenerator(name="voteSequence", allocationSize=1, sequenceName="SQ_VOTE_PK")
	
	@EmbeddedId
	// @Column
	@JsonProperty
	private VoteId id;
	
	

	
	public Vote() {
		super();
	}
	
	public Vote(VoteId id) {
		this.id = id;
	}


	public VoteId getId() {
		return id;
	}

	public void setId(VoteId id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Vote other = (Vote) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Vote [id=" + id + "]";
	}

	
}
