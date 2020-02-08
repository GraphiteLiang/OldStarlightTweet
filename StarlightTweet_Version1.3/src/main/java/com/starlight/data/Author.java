package com.starlight.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity// 说明这是一个和数据库表映射的实体类
@Table(name = "author")
public class Author {
	@Id
	private Long id;
	private String name;
	private String project;
	private Long icon;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "author")
	private List<Tweet> tweets;
	public Author() {
		super();
	}
	public Author(Long id, String name,String project, Long icon) {
		this.id=id;this.name=name;this.project=project;this.icon=icon;
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
	public Long getIcon() {
		return icon;
	}
}
