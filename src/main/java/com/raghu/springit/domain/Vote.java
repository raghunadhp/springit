package com.raghu.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Vote {
	
	@Id
	@GeneratedValue
	private Long id;
	private int vote;
	
	//user
	// link
	
	/*
	 * public Vote() {}
	 * 
	 * public Long getId() { return id; }
	 * 
	 * public void setId(Long id) { this.id = id; }
	 * 
	 * public int getVote() { return vote; }
	 * 
	 * public void setVote(int vote) { this.vote = vote; }
	 * 
	 * 
	 * @Override public String toString() { return "Vote { "+ "id : "+ id +
	 * ", vote : '"+ vote + '}'; }
	 */
}
