package com.raghu.springit.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Link {
	
	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private String title;
	@NonNull
	private String url;
	
	/*
	 * public Link() {}
	 * 
	 * public Long getId() { return id; }
	 * 
	 * public void setId(Long id) { this.id = id; }
	 * 
	 * public String getTitle() { return title; }
	 * 
	 * public void setTitle(String title) { this.title = title; }
	 * 
	 * public String getUrl() { return url; }
	 * 
	 * public void setUrl(String url) { this.url = url; }
	 * 
	 * @Override public String toString() { return "Link {" + "id="+ id +
	 * ", title='" + title + '\''+ '}'; }
	 * 
	 * 
	 * @Override public boolean equals(Object obj) { if(this == obj) return true;
	 * if(obj == null || getClass() != obj.getClass()) return false; Link link =
	 * (Link) obj; return Objects.equals(id, link.id) && Objects.equals(title,
	 * link.title); }
	 * 
	 * @Override public int hashCode() { return Objects.hash(id, title); }
	 */

}
