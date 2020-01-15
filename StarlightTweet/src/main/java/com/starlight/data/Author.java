package com.starlight.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity// 说明这是一个和数据库表映射的实体类
@Table(name = "author")
public class Author {
	@Id
	private Long id;
	private String name;
	private String project;
	public Author() {
		super();
	}
	public Author(Long id, String name,String project) {
		this.id=id;this.name=name;this.project=project;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getProject() {
		return project;
	}
}
