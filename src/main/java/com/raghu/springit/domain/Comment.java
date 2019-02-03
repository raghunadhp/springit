package com.raghu.springit.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	private String body;
	
	//Link
	@ManyToOne
	private Link link;
	
	
	/*
	 * public Comment() {}
	 * 
	 * public Long getId() { return id; }
	 * 
	 * public void setId(Long id) { this.id = id; }
	 * 
	 * public String getBody() { return body; }
	 * 
	 * public void setBody(String body) { this.body = body; }
	 * 
	 * 
	 * @Override public String toString() { return "Comment { "+ "id : "+ id +
	 * ", body : '"+ body + '}'; }
	 * 
	 * 
	 * @Override public boolean equals(Object obj) { if(this == obj) return true;
	 * if(null == obj || getClass() != obj.getClass()) return false; Comment comment
	 * = (Comment) obj; return Objects.equals(id, comment.id) &&
	 * Objects.equals(body, comment.body); }
	 * 
	 * @Override public int hashCode() { return Objects.hash(id, body); }
	 */
}
