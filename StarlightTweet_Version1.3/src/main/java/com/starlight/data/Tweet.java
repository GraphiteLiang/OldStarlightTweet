package com.starlight.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tweet")
public class Tweet {
	@Id
	private Long id;
	private String content;
	private String authorname;
	@ManyToOne
	@JoinColumn(name="authorid")
	private Author author;
	public Tweet() {
		super();
	}
	public Tweet(Long id, String content,Author author, String authorname) {
		this.id=id;this.content=content;this.author=author;this.authorname=authorname;
	}
	public Long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public Author getAuthor() {
		return author;
	}
	public String getAuthorname() {
		return authorname;
	}
	public Author getAuthorid() {
		return author;
	}
}
