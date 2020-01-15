package com.starlight.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tweet")
public class Tweet {
	@Id
	private Long id;
	private String content;
	private Long authorid;
	private String authorname;
	public Tweet() {
		super();
	}
	public Tweet(Long id, String content, Long authorid, String authorname) {
		this.id=id;this.content=content;this.authorid=authorid;this.authorname=authorname;
	}
	public Long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public Long getAuthorid() {
		return authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
}
