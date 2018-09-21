package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@Embeddable
public class VoteId implements Serializable {
	private static final long serialVersionUID = 5247805843178305182L;
	
	@JsonProperty
	@Column
	private String userId;
	
	@JsonProperty
	@Column
	private int postId;

	public VoteId() {
		super();
	}

	public VoteId(String userId, int postId) {
		super();
		this.userId = userId;
		this.postId = postId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + postId;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		VoteId other = (VoteId) obj;
		if (postId != other.postId)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VoteId [userId=" + userId + ", postId=" + postId + "]";
	}
}
